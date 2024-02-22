package model.animal.packAnimals;

import model.animal.Animal;
import model.animal.PackAnimal;

import java.util.Date;

public class Donkey extends PackAnimal {
    public Donkey(String name, Date birthday, String capacity) {
        super(name, birthday, capacity);
    }
    public Donkey(Animal animal) {
        super(animal);
    }
}
