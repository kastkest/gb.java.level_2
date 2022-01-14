package ru.gb.hw3;

import java.util.HashMap;

public class PhoneBook extends HashMap {

    public String add(String telNumber, String lastName) {
        return (String) put(telNumber, lastName);
    }

    public void get(String lastName, PhoneBook phoneBook) {
        System.out.println("По фамилии " + lastName + " в телефонной книге есть следующие номера:");
        for (Object telNumber : phoneBook.keySet()) {
            if (lastName == phoneBook.get(telNumber)) {
                System.out.println(telNumber);
            }
        }
    }
}

class Go {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("135", "Иванов");
        phoneBook.add("495", "Иванов");
        phoneBook.add("999", "Сидоров");
        phoneBook.add("734", "Ефремова");
        phoneBook.add("234", "Сидоров");

        System.out.println(phoneBook);
        phoneBook.get("Сидоров", phoneBook);
    }
}

