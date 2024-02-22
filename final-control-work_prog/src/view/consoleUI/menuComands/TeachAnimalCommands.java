package view.consoleUI.menuComands;

import view.ConsoleUI;

public class TeachAnimalCommands extends Comand {
    public TeachAnimalCommands( ConsoleUI consoleUI )
    {
        super("обучить животное новым командам", consoleUI );
    }
    @Override
    public void execute() {
        consoleUI.teachAnimalCommands();
    }
}