package model.animal.pets;

import model.animal.Animal;
import model.animal.Pet;

import java.util.Date;

public class Hamster extends Pet {
    public Hamster(String name, Date birthday, String color) {
        super(name, birthday, color);
    }
    public Hamster(Animal animal) {
        super(animal);
    }
}