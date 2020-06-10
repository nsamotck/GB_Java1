package ru.gb.lesson5;

public class Main {
    public static void main(String[] args) {

        Employee ivan = new Employee("Ivanov Ivan Ivanovich", "developer", "ivanov@company.com", "043", 70000, 25);
        Employee igor = new Employee("Petrov Igor Nokolaevich", "developer", "petrov@company.com", "045", 120000, 30);
        Employee irina = new Employee("Sinitsina Irina Valerievna", "tester", "sinitsina@company.com", "077", 80000, 27);
        Employee egor = new Employee("Zavialov Egor Sergeevich", "tester", "zavialov@company.com", "083", 100000, 45);
        Employee anna = new Employee("Privalova Anna Petrovna", "scrum master", "privalova@company.com", "035", 120000, 41);

        //ivan.showInfo();

        Employee[] employees = {ivan, igor, irina, egor, anna};

        System.out.println("INFO ABOUT EMPLOYEES WHOSE AGE IS MORE THAN 40");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].showInfo();
            }
        }
    }
}
