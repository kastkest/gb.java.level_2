package ru.gb.hw2;

public class MyArrayDataException extends RuntimeException{

    public MyArrayDataException(int i, int j, Throwable cause) {
        super("Неверный символ в " + i + " строке, "  + j + "-го столбца.", cause);
    }


}
