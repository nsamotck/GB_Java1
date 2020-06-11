package ru.gb.lesson6;

public class Main {
    public static void main(String[] args) {

        System.out.println("==================================================");
        // CAT TEST ===========================================================
        Cat kuzia = new Cat("Kuzia", "grey", 2);
        kuzia.run(200);
        kuzia.run(201);
        kuzia.swim(100);
        kuzia.jump(2);
        kuzia.jump(2.1);

        System.out.println("==================================================");
        // ORDINARY DOG TEST ===========================================================
        Dog barbos = new Dog("Barbos", "black", 2);
        barbos.run(500);
        barbos.run(501);
        barbos.swim(10);
        barbos.swim(11);
        barbos.jump(0.4);
        barbos.jump(0.5);

        System.out.println("==================================================");
        // POWERFUL DOG TEST ===========================================================
        Dog barsik = new Dog("Barsik", "brown", 3, 1000, 20, 1);
        barsik.run(1000);
        barsik.run(1001);
        barsik.swim(20);
        barsik.swim(21);
        barsik.jump(1);
        barsik.jump(1.1);

        System.out.println("==================================================");
        // HORSE TEST ===========================================================
        Horse zorka = new Horse("Zorka", "ginger", 5);
        zorka.run(1500);
        zorka.run(1501);
        zorka.swim(100);
        zorka.swim(101);
        zorka.jump(3);
        zorka.jump(3.1);

        System.out.println("==================================================");
        // BIRD TEST ===========================================================
        Bird kesha = new Bird("Kesha", "green", 3);
        kesha.run(5);
        kesha.run(6);
        kesha.swim(100);
        kesha.jump(0.1);
        kesha.jump(0.2);

        System.out.println("==================================================");
        // ZOO
        Animal[] zoo = {kuzia, barbos, zorka, kesha, barsik};
        System.out.println("Amount of animals in zoo: " + zoo.length);

        System.out.println("==================================================");
        amountOfAnimalsByTypes(zoo);

    }

    public static void amountOfAnimalsByTypes(Animal[] animals) {
        int amountOfCats = 0;
        int amountOfDogs = 0;
        int amountOfHorses = 0;
        int amountOfBirds = 0;

        for (Animal a : animals) {
            if (a instanceof Cat) {
                amountOfCats++;
            } else if (a instanceof Dog) {
                amountOfDogs++;
            } else if (a instanceof Horse) {
                amountOfHorses++;
            } else if (a instanceof Bird) {
                amountOfBirds++;
            }
        }
        System.out.println(
                "Amount of cats: " + amountOfCats + "\n" +
                        "Amount of dogs: " + amountOfDogs + "\n" +
                        "Amount of Horses: " + amountOfHorses + "\n" +
                        "Amount of Birds: " + amountOfBirds);
    }
}
