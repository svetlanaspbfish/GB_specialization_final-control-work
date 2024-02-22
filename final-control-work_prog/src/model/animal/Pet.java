package model.animal;

import java.util.Date;

public class Pet extends Animal {
    private String color;

    public Pet(String name, Date birthday, String color) {
        super(name, birthday);
        this.color = color;
    }

    public Pet(Animal animal) {
        super(animal);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}