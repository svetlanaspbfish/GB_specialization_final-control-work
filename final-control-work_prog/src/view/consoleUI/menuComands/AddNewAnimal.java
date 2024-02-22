package view.consoleUI.menuComands;

import model.Counter;
import view.ConsoleUI;

public class AddNewAnimal extends Comand {
    public AddNewAnimal( ConsoleUI consoleUI )
    {
        super("Завести новое животное.", consoleUI );
    }
    @Override
    public void execute() {
        // Раз в задании написано "при нажатие “Завести новое животное”", то логически каунтер здесь.
        try (Counter counter = new Counter()) {
            counter.add();
            System.out.println("Count: " + counter.getCount());
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        consoleUI.addNewAnimal();
    }
}
