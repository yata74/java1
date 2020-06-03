package ru.progwards.java1.lessons.queues;

import java.util.Comparator;
import java.util.PriorityQueue;

public class OrderQueue {
    Comparator<Order> comparator = new Comparator<Order>() {
        @Override
        public int compare(Order o1, Order o2) {
            return (Integer.compare(o1.getNum(), o2.getNum()));
        }
    };
    PriorityQueue<Order> odin = new PriorityQueue<>(comparator);
    PriorityQueue<Order> dwa = new PriorityQueue<>(comparator);
    PriorityQueue<Order> tree = new PriorityQueue<>(comparator);

    //добавление в соответствующий стек
    public void add(Order order) {
        if (order.getSum() <= 10000) {
            tree.offer(order);
        } else if (order.getSum() <= 20000) {
            dwa.offer(order);
        } else if (order.getSum() > 20000) {
            odin.offer(order);
        }
    }

    //извлечение заказа
    public Order get() {

        while (odin.peek() != null) {
            return odin.poll();
        }
        while (dwa.peek() != null) {
            return dwa.poll();
        }
        while (tree.peek() != null) {
            return tree.poll();
        }
        return tree.poll();
    }

    public static void main(String[] args) {
        OrderQueue ob = new OrderQueue();
        Order a8 = new Order(3123);
        Order a4 = new Order(1231);
        Order a1 = new Order(123);
        Order a9 = new Order(4123);
        Order a3 = new Order(156);
        Order a5 = new Order(1232);
        Order a6 = new Order(1233);
        Order a7 = new Order(2123);
        Order a2 = new Order(134);
        ob.add(a1);
        ob.add(a2);
        ob.add(a3);
        ob.add(a4);
        ob.add(a5);
        ob.add(a6);
        ob.add(a7);
        ob.add(a8);
        ob.add(a9);
        for (int j = 0; j < 9; j++) {
            System.out.println(ob.get());
        }
    }
}









