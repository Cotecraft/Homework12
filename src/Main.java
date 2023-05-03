import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void printAnswer(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Год високосный");
        } else {
            System.out.println(year + " Год не високосный");
        }
    }


    public static void task1() {
        System.out.println("");
        System.out.println("Задание 1");

        int year = 2021;
        printAnswer(year);
    }

    public static void printModel(int modelOs, int modelYear) {
        if (modelOs == 0) {
            System.out.println("У становите версию приложения для iOS по ссылке");
            if (modelOs == 0 || modelYear == 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (modelOs == 1 || modelYear > 2015)
                System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("");
        System.out.println("Задание 2");

        int modelOs = 1;
        int modelYear = 2017;
        printModel(modelOs, modelYear);
    }

    public static int getDays(int distance) {
        int days = 0;
        if (distance <= 20) {
            days = 1;
        } else if (distance > 20 && distance <= 60) {
            days = 2;
        } else if (distance > 60 && distance <= 100) {
            days = 3;
        }
        return days;

    }

}
