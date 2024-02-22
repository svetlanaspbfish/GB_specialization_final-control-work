package view.consoleUI.menuComands;

import view.ConsoleUI;

public class ShowAnimalCommands extends Comand {
    public ShowAnimalCommands( ConsoleUI consoleUI )
    {
        super("Увидеть список команд, которое выполняет животное.", consoleUI );
    }
    @Override
    public void execute() {
        consoleUI.showAnimalCommands();
    }
}
