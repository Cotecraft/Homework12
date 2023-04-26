public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void printAnswer (int year) {
        if (year % 4 ==0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Год високосный");
        }else{
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

    public static void printDistance (int distance) {
        if (distance <= 20) {
            System.out.println("Доставка будет в течение суток");
        }else if (distance > 20 && distance <= 60) {
            System.out.println("Доставка будет в течение 2 суток");
        } else if (distance > 60 && distance <= 100) {
            System.out.println("Доставка будет в течение 3 суток");
        }else{
            System.out.println("Доставки нет");
        }
    }

    public static void task3() {
        System.out.println("");
        System.out.println("Задание 3");
        int distance = 56;
        printDistance(distance);
    }
}