package ru.gb.hw1;

public class Robot implements Person {
    private String name;
    private int distanceOfRun;
    private int heightOfJump;
    private boolean canContinue = true;

    public Robot(String name, int distanceOfRun, int heightOfJump) {
        this.name = name;
        this.distanceOfRun = distanceOfRun;
        this.heightOfJump = heightOfJump;
    }

    public String getName() {
        return name;
    }


    @Override
    public void jump(Obstacle obstacle) {
        if (obstacle instanceof Wall && canContinue) {
            System.out.println(getName() + " прыгнул.");
            if (((Wall) obstacle).isOvercome(heightOfJump)) {
                obstacle.info(heightOfJump);
            } else {
                canContinue = false;
                obstacle.info(heightOfJump);
                System.out.println("Не может продолжать.");
            }
        }
    }

    @Override
    public void run(Obstacle obstacle) {
        if (obstacle instanceof Treadmill && canContinue) {
            System.out.println(getName() + " побежал.");
            if (((Treadmill) obstacle).isOvercome(distanceOfRun)) {
                obstacle.info(distanceOfRun);
            } else {
                canContinue = false;
                obstacle.info(distanceOfRun);
                System.out.println("Не может продолжать.");
            }
        }
    }
}
