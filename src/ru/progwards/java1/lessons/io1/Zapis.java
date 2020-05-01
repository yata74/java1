package ru.progwards.java1.lessons.io1;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Zapis {
    public static void main(String[] args) throws Exception {
        try {
          //  запись
            FileWriter fileWriter = new FileWriter("text1.txt",true);
            fileWriter.write("Ночь, улица, фонарь, аптека,\n");
            fileWriter.write("Бессмысленный и тусклый свет.\n");
            fileWriter.write("Живи еще хоть четверть века -\n");
            fileWriter.write("Все будет так. Исхода нет.\n");
            fileWriter.write("\n");
            fileWriter.write("Умрешь - начнешь опять сначала\n");
            fileWriter.write("И повторится все, как встарь:\n");
            fileWriter.write("Ночь, ледяная рябь канала,\n");
            fileWriter.write("Аптека, улица, фонарь.\n");
            fileWriter.write("\n");
            fileWriter.write("Александр Блок.\n");
            fileWriter.close();
            // чтение
              FileReader fileReader = new FileReader("text1.txt");
              Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNextLine()){
                String str = scanner.nextLine();
                char mass[] = str.toCharArray();
                for (int i=0;i<mass.length;i++){
                    System.out.println(mass[i]);
                }
 //               simvol = fileReader.read();
  //              System.out.println(simvol);
            }
            fileReader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
