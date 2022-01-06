package ru.gb.hw2;

import java.util.Scanner;

public class App {
    private static final int SIZE = 4;

    public static void main(String[] args) {
        App app = new App();
        try {
           app.sumOfArray(app.createArray());
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public String[][] createArray() {
        String[][] a = new String[SIZE][SIZE];
        System.out.println("Заполните квадратный массив размерностью: " + SIZE);
        Scanner scanner = new Scanner(System.in);
        String line;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                line = scanner.nextLine();
                a[i][j] = line;
            }
        }
        return a;
    }

    public void sumOfArray(String[][] array) {
        int sum = 0;
        int newArray = 0;
        System.out.println("Массив, преобразованный в числовой:");
        if (array.length != SIZE) {
            throw new MyArraySizeException(SIZE);
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    newArray = Integer.parseInt(array[i][j].trim());
                    System.out.print(newArray + " ");
                    sum += newArray;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, e);
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Сумма всех чисел в массиве: " + sum);
    }

}
