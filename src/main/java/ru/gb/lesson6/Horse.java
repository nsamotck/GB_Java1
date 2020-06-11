package ru.gb.lesson6;

public class Horse extends Animal {

    String animalType;

    public Horse(String name, String color, int age) {
        super(name, color, age);
        animalType = "Horse";
    }

    @Override
    public void run(int distance) {
        int maxDistance = 1500;
        if (distance > maxDistance) {
            System.out.println(animalType + " " + name + " can't run at distance more than " + maxDistance + " meters!");
        } else {
            System.out.println(animalType + " " + name + " runs at distance: " + distance + " meter(s)");
        }
    }

    @Override
    public void swim(int distance) {
        int maxDistance = 100;
        if (distance > maxDistance) {
            System.out.println(animalType + " " + name + " can't swim at distance more than " + maxDistance + " meters!");
        } else {
            System.out.println(animalType + " " + name + " swims at distance: " + distance + " meter(s)");
        }
    }

    @Override
    public void jump(double height) {
        double maxHeight = 3;
        if (height > maxHeight) {
            System.out.println(animalType + " " + name + " can't jump more than " + maxHeight + " meters high!");
        } else {
            System.out.println(animalType + " " + name + " jumps " + height + " meter(s) high");
        }
    }
}
