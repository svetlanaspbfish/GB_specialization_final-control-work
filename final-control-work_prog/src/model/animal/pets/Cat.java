package model.animal.pets;

import model.animal.Animal;
import model.animal.Pet;

import java.util.Date;

public class Cat extends Pet {
    public Cat(String name, Date birthday, String color) {
        super(name, birthday, color);
    }
    public Cat(Animal animal) {
        super(animal);
    }
}