package ru.gb.hw2;

public class MyArraySizeException extends RuntimeException{


    public MyArraySizeException(int size) {
        super(String.format("Массив имеет размерность отличную от %dx%d", size, size));
    }
}
