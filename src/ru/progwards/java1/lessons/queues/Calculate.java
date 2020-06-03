package ru.progwards.java1.lessons.queues;

public class Calculate {
    public static double calculation1(){
        StackCalc pr1= new StackCalc();
        pr1.push(2.2);
        pr1.push(3);
        pr1.push(12.1);
        pr1.add();
        pr1.mul();
        return pr1.pop();
    }
    public static double calculation2(){
        StackCalc pr2 = new StackCalc();

        pr2.push(737.22);
        pr2.push(24);
        pr2.add();
        pr2.push(55.6);
        pr2.push(12.1);
        pr2.sub();
        pr2.div();
        pr2.push(19);
        pr2.push(3.33);
        pr2.sub();
        pr2.push(13.001);
        pr2.push(9.2);
        pr2.sub();
        pr2.push(2);
        pr2.mul();
        pr2.push(87);
        pr2.add();
        pr2.mul();
        pr2.add();
        return pr2.pop();
    }

    public static void main(String[] args) {
        System.out.println(calculation1());
        System.out.println(calculation2());
    }
}
