package model.animal;

import java.util.Date;

public class PackAnimal extends Animal {
    private String capacity;

    public PackAnimal(String name, Date birthday, String capacity) {
        super(name, birthday);
        this.capacity = capacity;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}