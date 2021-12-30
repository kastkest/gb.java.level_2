package ru.gb.hw2;

public class App {
    public static void main(String[] args) {

        fillArray(createArray());

    }

    static int[][] createArray() {
        int[][] a = new int[4][4];
        return a;
    }

    static int[][] fillArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = (int) (Math.random() * 9 + 1);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return a;
    }
}
