package ru.progwards.java1.lessons.test;

import java.util.Calendar;
import java.util.Date;

public class Test161 {
    Date createDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(1986,1,28,0,0,0);
        return (calendar.getTime());
        }
}
