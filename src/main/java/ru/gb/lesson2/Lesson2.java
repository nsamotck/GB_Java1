package ru.gb.lesson2;


import java.util.Arrays;

public class Lesson2 {

    public static void main(String[] args) {

        int[] binaryArray = {0, 1, 1, 0, 1, 0, 0, 0, 1, 1};
        System.out.println("Original array: " + Arrays.toString(binaryArray));
        revertArray(binaryArray);
        System.out.println("Reverted array: " + Arrays.toString(binaryArray));
        revertArrayWithIf(binaryArray);
        System.out.println("Reverted back: " + Arrays.toString(binaryArray));

        System.out.println();

        int[] integerArray = new int[8];
        System.out.println("Empty integerArray:" + Arrays.toString(integerArray));
        integerArray = fillArray(integerArray);
        System.out.println("Filled integerArray:" + Arrays.toString(integerArray));

        System.out.println();

        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Original: " + Arrays.toString(array));
        multipleByTwoIfLessThan6(array);
        System.out.println("Result: " + Arrays.toString(array));

        System.out.println();

        int[][] tableArray = new int[5][5];
        System.out.println("Before filling diagonals:");
        printTwoDimArray(tableArray);
        fillDiagonalsWithOnes(tableArray);
        System.out.println("After filling diagonals:");
        printTwoDimArray(tableArray);

        System.out.println();

        int[] arrForMinMaxMethod = {1, 3, 2, 4, 5, 8, 6, 7, 9, 0};
        findMinAndMax(arrForMinMaxMethod);

        System.out.println();

        int[] arrToFindBalance = {0, 1, 2, 2, 1, 0};
        System.out.println("The array is balanced: " + checkBalance(arrToFindBalance));

        System.out.println();

        int[] arrayToShift = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arrayToShift));
        int shiftValue = 2;
        arrayShift(arrayToShift, shiftValue);

    }

    /*1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
    private static void revertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] ^ 1; //Придумал вариант без условия. Вариант с условием - ниже
        }
    }

    private static void revertArrayWithIf(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;
        }
    }

    /*2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;*/
    private static int[] fillArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) { //можно задать i = 0 и в цикле будет arr[i] = i * 3
            arr[i] = arr[i - 1] + 3;
        }
        return arr;
    }

    /*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;*/
    private static void multipleByTwoIfLessThan6(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    /*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;*/
    private static void fillDiagonalsWithOnes(int[][] arr) {
        int j = arr.length;
        for (int i = 0; i < arr.length; i++) {
            j--;
            arr[i][i] = 1;
            if (j == i) continue;
            arr[i][j] = 1;
        }
    }

    private static void printTwoDimArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);*/
    private static void findMinAndMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("min = " + min + ", " + "max = " + max);
    }

    /*6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
    checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.*/
    private static boolean checkBalance(int[] arr) {
        boolean isBalanced;
        int firstValue = 0;
        int secondValue;
        for (int i = 0; i < arr.length; i++) {
            firstValue += arr[i];
            secondValue = 0;
            for (int j = i + 1; j < arr.length; j++) {
                secondValue += arr[j];
            }
            isBalanced = firstValue == secondValue;
            if (isBalanced) return true;
        }
        return false;
    }

    /*7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
    при этом метод должен сместить все элементы массива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.*/

    private static void arrayShift(int[] arr, int shiftValue) {
        if (Math.abs(shiftValue) == arr.length || Math.abs(shiftValue) % arr.length == 0 || shiftValue == 0) return;

        int boundaryIndex = searchForBoundaryIndex(arr, shiftValue);
        System.out.println("Boundary index: " + boundaryIndex);

        int[] newArray1 = new int[boundaryIndex];
        int[] newArray2 = new int[arr.length - boundaryIndex];
        System.out.println(Arrays.toString(newArray1));
        System.out.println(Arrays.toString(newArray2));

        for (int i = 0; i < newArray1.length; i++) {
            newArray1[i] = arr[boundaryIndex + 1 + i];
        }
        System.out.println(Arrays.toString(newArray1));

        for (int i = 0; i < newArray2.length; i++) {
            newArray2[i] = arr[i];
        }
        System.out.println(Arrays.toString(newArray2));
    }

    private static int searchForBoundaryIndex(int[] arr, int shiftValue) {

        int boundaryIndex;
        int lastIndex = arr.length - 1;

        if (shiftValue > 0) {
            while (shiftValue != 0) {
                lastIndex++;
                if (lastIndex > arr.length - 1) lastIndex = 0;
                shiftValue--;
            }
        } else {
            while (shiftValue != 0) {
                lastIndex--;
                if (lastIndex < 0) lastIndex = arr.length - 1;
                shiftValue++;
            }
        }
        boundaryIndex = lastIndex + 1;
        return boundaryIndex;
    }
}