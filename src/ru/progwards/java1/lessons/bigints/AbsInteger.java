package ru.progwards.java1.lessons.bigints;

public abstract class AbsInteger {
  abstract public int value();

  //сумма двух чисел разных типов
  static AbsInteger add(AbsInteger num1, AbsInteger num2) {
    int result = num1.value() + num2.value();
    if (-128 < result && result < 127) {
      ByteInteger res = new ByteInteger((byte) result);
      return res;
    } else if (-32768 < result && result < 32767) {
      ShortInteger res = new ShortInteger((short) result);
      return res;
    } else {
      IntInteger res = new IntInteger(result);
      return res;
    }
  }

  public static void main(String[] args) {
    AbsInteger num1 = new ByteInteger((byte) 120);
    AbsInteger num2 = new ShortInteger((short) 32700);
    System.out.println(AbsInteger.add(num1,num2));
  }
}

