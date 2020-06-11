package ru.gb.lesson6;

public class Cat extends Animal {

    String animalType;

    public Cat(String name, String color, int age) {
        super(name, color, age);
        animalType = "Cat";
    }

    @Override
    public void run(int distance) {
        int maxDistance = 200;
        if (distance > maxDistance) {
            System.out.println(animalType + " " + name + " can't run at distance more than " + maxDistance + " meters!");
        } else {
            System.out.println(animalType + " " + name + " runs at distance: " + distance + " meter(s)");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(animalType + "s can't swim!");
    }

    @Override
    public void jump(double height) {
        double maxHeight = 2;
        if (height > maxHeight) {
            System.out.println(animalType + " " + name + " can't jump more than " + maxHeight + " meters high!");
        } else {
            System.out.println(animalType + " " + name + " jumps " + height + " meter(s) high");
        }
    }
}
