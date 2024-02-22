package view.consoleUI.menuComands;

import view.ConsoleUI;

public class Finish extends Comand {
    public Finish( ConsoleUI consoleUI )
    {
        super("Выйти.", consoleUI );
    }
    @Override
    public void execute() {
        consoleUI.finish();
    }
}