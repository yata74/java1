package ru.progwards.java1.lessons.bitsworld;

public class Binary {
    private static byte num;

    public Binary(byte num){
        this.num = num;
    }
    public static byte Dig(byte num) {
        switch (num) {
            case 0xA:
                return 10;
            case 0xB:
                return 11;
            case 0xC:
                return 12;
            case 0xD:
                return 13;
            case 0xE:
                return 14;
            case 0xF:
                return 15;
            default:
                return num;
        }
    }

    public  String toString() {

      Integer a1 = Dig(num) & 0b11111111;
      String res = "";
      for (int i=0; i<8; i++){
          byte x = 0b00000001;
          x &= a1;
          if (x==0b00000001) {
              res = 1 + res;
          }else res = 0 + res;
          a1 >>= 1;
      }
      return res;
    }


    public static void main(String[] args) {
        Binary bin = new Binary((byte) -128);
        String str = bin.toString();
        System.out.println(str);
    }
}
