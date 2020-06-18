package ru.gb.lesson6;

public abstract class Animal {

    public String name;
    public String color;
    public int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public abstract void jump(double height);
}
