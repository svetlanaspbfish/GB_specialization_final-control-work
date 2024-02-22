package view;

import Presenter.Presenter;
import view.consoleUI.Menu;

import java.util.Scanner;

public class ConsoleUI implements View  {

    private boolean work;
    Menu menu;
    Scanner scanner;
    Presenter presenter;
    public ConsoleUI()
    {
        menu = new Menu( this );
        scanner = new Scanner( System.in );
        presenter = new Presenter( this );
        work = true;
    }

    @Override
    public void start() {
        System.out.println("Программа \"Реестр домашних животных\".\n");
        while ( work )
        {
            System.out.println( menu.menu() );
            execute();
        }
    }

    private void execute() {
        String line = scanner.nextLine();
        if ( checkTextCorrectForInt( line ) )
        {
            int numOption = Integer.parseInt( line );
            if ( checkChosenInput( numOption ) )
            {
                menu.execute( numOption );
            }
            else
            {
                System.out.println("Ошибка выбора опции меню. Попробуйте ещё раз");
            }
        }
    }

    private boolean checkTextCorrectForInt( String text )
    {
        return text.matches("[0-9]+");
    }

    private boolean checkChosenInput(int numOption) {
        return menu.checkChosenInput( numOption );
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println( answer );
    }

    @Override
    public void finish() {
        work = false;
        System.out.println("До свидания.");
    }

    public void addNewAnimal()
    {
        presenter.addNewAnimal();
    }

    public void moveAnimalToRightClass()
    {
        presenter.moveAnimalToRightClass();
    }

    public void showAnimalCommands()
    {
        presenter.showAnimalCommands();
    }

    public void teachAnimalCommands()
    {
        presenter.showAnimalCommands();
    }
}
