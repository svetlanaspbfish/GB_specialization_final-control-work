package model.animal;

import java.util.ArrayList;
import java.util.Date;

public class Animal {
    private String name;
    private Date birthday;
    private ArrayList<String> commands;

    public Animal(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
        this.commands = new ArrayList<>();
    }

    public Animal( Animal animal ) {
        this.name = animal.getName();
        this.birthday = animal.getBirthday();
        this.commands = animal.getCommands();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public ArrayList<String> getCommands() {
        return commands;
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    public void removeCommand(String command) {
        commands.remove(command);
    }

    public String toString()
    {
        return name;
    }
}
