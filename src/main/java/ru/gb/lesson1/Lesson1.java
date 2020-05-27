package ru.gb.lesson1;

public class Lesson1 {

    public static void main(String[] args) {

        System.out.println(getResult(5, 4, 5, 5));

        System.out.println(checkRange(1, 19)); //вернёт true

        checkPositiveOrNegative(0);

        System.out.println(isNegativeNumber(-1));

        helloMessage("Nick");

        leapYear(2020);
    }

    //Задание №3
    public static int getResult(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    //Задание №4
    public static boolean checkRange(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else return false;
    }

    //Задание №5
    public static void checkPositiveOrNegative(int value) {
        if (value < 0) {
            System.out.println("Число отрицательное");
        } else System.out.println("Число положительное");
    }

    //Задание №6
    public static boolean isNegativeNumber(int number) {
        if (number < 0) return true;
        else return false;
    }

    //Задание №7
    public static void helloMessage(String name) {
        System.out.println("Hello, " + name + "!");
    }

    //Задание №8
    public static void leapYear(int year) {
        if ((year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високостным");
        } else System.out.println(year + " год не являеся високостным");
    }
}