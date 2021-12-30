package ru.gb.hw2;

public class App {
    public static void main(String[] args) {

    fillArray(createArray());

    }

    static int[] createArray (){
        int[] a = new int[20];
        return a;
    }

    static int[] fillArray (int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random()*9+1);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        return a;
    }
}
