package ru.gb.lesson6;

public class Dog extends Animal {

    String animalType;
    int maxRunDistance;
    int maxSwimDistance;
    double maxJumpHeight;

    public Dog(String name, String color, int age) {
        super(name, color, age);
        animalType = "Dog";
        maxRunDistance = 500;
        maxSwimDistance = 10;
        maxJumpHeight = 0.4;
    }

    public Dog(String name, String color, int age, int maxRunDistance, int maxSwimDistance, double maxJumpHeight) {
        super(name, color, age);
        animalType = "Dog";
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpHeight = maxJumpHeight;

    }

    @Override
    public void run(int distance) {
        if (distance > maxRunDistance) {
            System.out.println(animalType + " " + name + " can't run at distance more than " + maxRunDistance + " meters!");
        } else {
            System.out.println(animalType + " " + name + " runs at distance: " + distance + " meter(s)");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance > maxSwimDistance) {
            System.out.println(animalType + " " + name + " can't swim at distance more than " + maxSwimDistance + " meters!");
        } else {
            System.out.println(animalType + " " + name + " swims at distance: " + distance + " meter(s)");
        }
    }

    @Override
    public void jump(double height) {
        if (height > maxJumpHeight) {
            System.out.println(animalType + " " + name + " can't jump more than " + maxJumpHeight + " meters high!");
        } else {
            System.out.println(animalType + " " + name + " jumps " + height + " meter(s) high");
        }
    }
}
