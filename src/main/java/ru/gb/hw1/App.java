package ru.gb.hw1;

public class App {
    public static void main(String[] args) {
        createParticipants();
        createObstacles();
        go(createParticipants(), createObstacles());
    }


    private static Person[] createParticipants() {
        Person[] persons = new Person[3];
        persons[0] = new Human("Иван", 100, 2);
        persons[1] = new Cat("Мурзик", 50, 1);
        persons[2] = new Robot("Дэниэль", 150, 4);
        return persons;
    }

    private static Obstacle[] createObstacles() {
        Treadmill treadmill = new Treadmill(70);
        Wall wall = new Wall(2);

        Obstacle[] obstacles = new Obstacle[2];
        obstacles[0] = treadmill;
        obstacles[1] = wall;
        return obstacles;
    }

    private static void go(Person[] persons, Obstacle[] obstacles) {
        for (int i = 0; i < persons.length; i++) {
            System.out.println();
            for (int j = 0; j < obstacles.length; j++) {
                persons[i].run(obstacles[j]);
                persons[i].jump(obstacles[j]);
            }
        }
    }
}

