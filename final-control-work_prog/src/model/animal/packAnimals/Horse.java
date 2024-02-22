package model.animal.packAnimals;

import model.animal.Animal;
import model.animal.PackAnimal;

import java.util.Date;

public class Horse extends PackAnimal {
    public Horse(String name, Date birthday, String capacity) {
        super(name, birthday, capacity);
    }
    public Horse(Animal animal) {
        super(animal);
    }
}