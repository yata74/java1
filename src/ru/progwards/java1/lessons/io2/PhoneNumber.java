package ru.progwards.java1.lessons.io2;

public class PhoneNumber {

    public static class InvalidException extends RuntimeException{
        public String number="";
        public InvalidException(String number){
            super("Неправильно набран номер: ");
            this.number = number;
        }
        @Override
        public String getMessage(){
            return super.getMessage()+ number;
        }
    }

        // возвращаю номер в формате
        public static String format(String phone) {
            String phone1 = "";
            char[] cifra = phone.toCharArray();
            for (int i = 0; i < cifra.length; i++) {
                if (Character.isDigit(cifra[i])) {
                    phone1 += cifra[i];
                }
            }
            String phone2="";
            char[] mass = phone1.toCharArray();
            if (mass[0] == '8' || mass[0] == '7') {
                for (int i = 1; i < mass.length; i++) {
                    phone2 += mass[i];
                }
            }

            if (phone2.length() != 10) {
                throw new InvalidException(phone);
                //    return ("Не правильно набран номер " + phone);
            } else {

                return ("+7(" + phone2.substring(0, 3) + ")" + phone2.substring(3, 6) + "-" + phone2.substring(6, 8) + phone2.substring(8));
            }
        }

        public static void main(String[] args) {
            try {
                System.out.println(format("7(187)806-77-0811"));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }




