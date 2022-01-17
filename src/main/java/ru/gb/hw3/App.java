package ru.gb.hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.createList());
        System.out.println();
        System.out.println(app.findUniqueNames(app.createList()));
    }

    public ArrayList createList() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Василий");
        names.add("Максим");
        names.add("Александр");
        names.add("Константин");
        names.add("Игорь");
        names.add("Никита");
        names.add("Артём");
        names.add("Роман");
        names.add("Павел");
        names.add("Михаил");
        names.add("Максим");
        names.add("Антон");
        names.add("Василий");
        names.add("Игорь");
        names.add("Никита");
        return names;
    }

    public HashSet findUniqueNames (ArrayList<String> names){
        HashSet<String> uniqueNames = new HashSet<>();
        for (String name : names) {
            if (uniqueNames.add(name))
                System.out.printf("Имя %s встретилось %d раза.\n", name, Collections.frequency(names, name));
        }
        System.out.println();
        return uniqueNames;
    }
}

