package ru.progwards.java1.lessons.test;

import java.util.Scanner;

public class Test4 {
    public static void scanLines() {
        String i;
        Scanner scanner = new Scanner(System.in);
        for (i = ""; i != "/stop";) {
        String str = scanner.nextLine();
                if (str.contains("/stop") == true) {
                    i = "/stop";
                    break;
                }
                if (str.contains("Привет") == true) {
                    System.out.println("Здравствуйте");

                } else if (str.contains("как дела") == true) {
                    System.out.println("Хорошо");

                } else
                    System.out.println(str);
            }
        }


    public static void main(String[] args) {
        scanLines();
    }

                        }
