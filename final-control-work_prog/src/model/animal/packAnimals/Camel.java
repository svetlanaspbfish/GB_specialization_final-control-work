package model.animal.packAnimals;

import model.animal.Animal;
import model.animal.PackAnimal;

import java.util.Date;

public class Camel extends PackAnimal {
    public Camel(String name, Date birthday, String capacity) {
        super(name, birthday, capacity);
    }
    public Camel(Animal animal) {
        super(animal);
    }
}