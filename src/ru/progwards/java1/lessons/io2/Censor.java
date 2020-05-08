package ru.progwards.java1.lessons.io2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;


public class Censor {

    public static class CensorException extends RuntimeException{
        public String fileName="";
        public CensorException(String fileName){
            super(" Неправильное имя файла");
            this.fileName = fileName;
        }
        @Override
    public String getMessage(){
            return (fileName == null ? "" : "\""+fileName+"\"") + super.getMessage();
        }
    }

    public static void censorFile(String inoutFileName, String[] obscene) {
        try (RandomAccessFile file = new RandomAccessFile(inoutFileName, "rw")) {
                long pos = 0L;
                while (pos < file.length()) {
                    file.seek(pos);         // встаем на позицию
                    char buk = (char) file.read();//читаем байт
                    pos=file.getFilePointer();
                    for (int i = 0; i < obscene.length; i++) {
                        char[] say = obscene[i].toCharArray();   //из слова-исключения делам массив
                        int z = 0;
                        if (buk == (say[0])) {   //сравниваем первые буквы.
                            z = 1;   //счетчик совпавших букв
                            for (int j = 1; j < say.length; j++) {
                                char buk1 = (char) file.readByte();
                                if (buk1 == say[j]) {  //сравниваем остальные буквы
                                    z += 1;
                                }
                            }
                            if (z == say.length) {  //есть ли совпадение
                                file.seek(pos-1);
                                for (int y = 0; y < z; y++) {
                                    file.write('*'); //меняем на звездочки

                                }
                                pos = pos + z-1;
                                break;
                            }
                        }
                    }

                }

        } catch (FileNotFoundException e) {
            throw new CensorException(inoutFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        public static void main(String[] args) {
            try {
                String[] obscene = {"Java", "Oracle", "Sun", "Microsystems"};
                censorFile("text2.txt", obscene);
            } catch (RuntimeException e) {
                System.out.println(e);
            }
        }
}