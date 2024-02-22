package view.consoleUI.menuComands;

import view.ConsoleUI;

public class MoveAnimalInRightClass extends Comand{
    public MoveAnimalInRightClass( ConsoleUI consoleUI )
    {
        super("Определять животное в правильный класс.", consoleUI );
    }
    @Override
    public void execute() {
        consoleUI.moveAnimalToRightClass();
    }
}
