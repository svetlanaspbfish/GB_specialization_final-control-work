package view.consoleUI.menuComands;

import view.ConsoleUI;

public abstract class Comand {
    String description;
    ConsoleUI consoleUI;

    public Comand( String description, ConsoleUI consoleUI )
    {
        this.description = description;
        this.consoleUI = consoleUI;
    }

    public abstract void execute();

    public String getDescription() {
        return description;
    }
}