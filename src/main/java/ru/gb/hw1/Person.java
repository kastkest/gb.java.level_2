package ru.gb.hw1;

public interface Person extends Runnable, Jumpable{
    @Override
    void jump(Obstacle obstacle);

    @Override
    void run(Obstacle obstacle);
}
