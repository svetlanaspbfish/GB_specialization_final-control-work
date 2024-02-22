package model;

import model.animal.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalRegistry {
    private static List<Animal> animals = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void addNewAnimal() {
        System.out.println("Введите имя животного:");
        String name = scanner.next();
        System.out.println("Введите дату рождения животного (гггг-мм-дд):");
        String birthDateStr = scanner.next();
        // Здесь добавить логику для создания объекта и добавления его в список.
    }

    public static void moveAnimalToRightClass() {
        //
    }

    public static void showAnimalCommands() {
        //
    }

    public static void teachAnimalCommands() {
        //
    }
}
