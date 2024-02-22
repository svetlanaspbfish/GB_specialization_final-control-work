package view.consoleUI.menuComands;

import view.ConsoleUI;

public class AddNewAnimal extends Comand {
    public AddNewAnimal( ConsoleUI consoleUI )
    {
        super("Завести новое животное.", consoleUI );
    }
    @Override
    public void execute() {
        consoleUI.addNewAnimal();
    }
}
