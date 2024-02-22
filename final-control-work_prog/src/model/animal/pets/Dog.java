package model.animal.pets;

import model.animal.Animal;
import model.animal.Pet;

import java.util.Date;

public class Dog extends Pet {
    public Dog(String name, Date birthday, String color) {
        super(name, birthday, color);
    }
    public Dog(Animal animal) {
        super(animal);
    }
}