package ru.gb.hw1;

public class Treadmill extends Obstacle {
    private int distance;

    public Treadmill(int distance) {

        this.distance = distance;

    }

    public boolean isOvercome(int distanceOfRun) {
        return distanceOfRun > distance;
    }

    public void info(int distanceOfRun) {
        if (distanceOfRun > distance) {
            System.out.println("Успешно пробежал.");
        } else {
            System.out.println("Не смог пробежать.");
        }
    }


}
