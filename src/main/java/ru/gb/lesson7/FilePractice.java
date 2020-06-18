package ru.gb.lesson7;

import java.io.*;
import java.util.Scanner;

public class FilePractice {

    public static void main(String[] args) {

        /*1. Создать 2 текстовых файла, примерно по 50-100 символов в каждом (особого значения не имеет);*/
        try {
            FileInputStream file1 = new FileInputStream("part1.txt");
            FileInputStream file2 = new FileInputStream("part2.txt");
            FileInputStream[] files = {file1, file2};
            spliceFiles(files);

            FileInputStream resultFile = new FileInputStream("result.txt");
            System.out.println(isWordPresent(resultFile, "java"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*2. Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго в новый файл.*/

    public static void spliceFiles(FileInputStream[] files) {

        StringBuilder sb = new StringBuilder();

        try {
            PrintStream ps = new PrintStream("result.txt");
            for (FileInputStream fis : files) {
                Scanner sc = new Scanner(fis);
                while (sc.hasNextLine()) {
                    sb.append(sc.nextLine() + "\n");
                }
                sc.close();
            }
            ps.print(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*3. * Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле (работаем только с латиницей).*/

    public static boolean isWordPresent(FileInputStream file, String word) {
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            if (sc.next().toLowerCase().equals(word.toLowerCase())) { // Недоработано - не учитываются знаки препинания в поиске
                return true;
            }
        }
        return false;
    }
}

