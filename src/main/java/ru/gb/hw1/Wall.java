package ru.gb.hw1;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {

        this.height = height;
    }

    public boolean isOvercome(int jumpHeight) {
        return jumpHeight > height;
    }

    public void info(int jumpHeight) {
        if (jumpHeight > height) {
            System.out.println("Успешно перепрыгнул.");
        } else {
            System.out.println("Не смог перепрыгнуть.");
        }
    }

}
