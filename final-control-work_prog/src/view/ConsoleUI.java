package view;

import Presenter.Presenter;
import model.animal.Animal;
import model.animal.AnimalFinalClasses;
import view.consoleUI.Menu;
import view.consoleUI.MenuSelectionFromArray;
import view.consoleUI.MenuSelectionFromEnum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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

        // Некоторые тестовые данные
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        try {
            date = dateFormat.parse("2011-12-10");
        } catch (ParseException e) {
        }
        presenter.addNewAnimal( "Лили", date );
        presenter.addNewAnimal( "Мили", date );
        presenter.addNewAnimal( "Сили", date );

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
                System.out.println("Ошибка выбора опции меню. Попробуйте ещё раз.");
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
        System.out.println("Вы выбрали добавление нового животного");
        System.out.println("Введите имя животного:");
        String name = scanner.nextLine();
        System.out.println("Введите дату рождения животного (гггг-мм-дд):");
        String birthDateStr = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date birthDate = dateFormat.parse( birthDateStr );
            presenter.addNewAnimal( name, birthDate );
            System.out.println("Животное добавлено. Можете сделать что-то ещё.");
        } catch ( ParseException e ) {
            System.out.println("Дата введена неверно. Вы будете перенаправлены обратно в главное меню.");
        }
    }

    public void moveAnimalToRightClass()
    {
        System.out.println("Вы выбрали определение животного в правильный класс.");
        List<Animal> arrOptions = presenter.getAnimals();
        MenuSelectionFromArray submenu = new MenuSelectionFromArray( this, arrOptions, "Выберите животное, которое хотите определить в класс:");
        System.out.println( submenu.menu() );

        String line = scanner.nextLine();
        if ( checkTextCorrectForInt( line ) )
        {
            int numOption = Integer.parseInt( line );
            if ( submenu.checkChosenInput( numOption ) )
            {
                int chosenAminalIndex = --numOption;

                List<AnimalFinalClasses> arrOptionsClasses = presenter.getAnimalFinalClasses();
                MenuSelectionFromEnum submenuClasses = new MenuSelectionFromEnum( this, arrOptionsClasses, "Выберите класс, в которых хотите определить животное:");
                System.out.println( submenuClasses.menu() );

                line = scanner.nextLine();

                if ( submenuClasses.checkChosenInput(line) )
                {
                    String chosenAnimalClass = line;
                    presenter.moveAnimalToRightClass( chosenAminalIndex, chosenAnimalClass );

                    System.out.println("Класс животного переопределен.");
                    Class textClass = presenter.getAnimals().get( chosenAminalIndex ).getClass();
                    System.out.println("Класс животного теперь: " + textClass );
                }
                else
                {
                    System.out.println("Ошибка выбора. Вы будете возвращены в главное меню.");
                }
            }
            else
            {
                System.out.println("Ошибка выбора. Вы будете возвращены в главное меню.");
            }
        }
    }

    public void showAnimalCommands()
    {
        System.out.println("Вы выбрали просмотр команд, которые выполняет животное.");
        List<Animal> arrOptions = presenter.getAnimals();
        MenuSelectionFromArray submenu = new MenuSelectionFromArray( this, arrOptions, "Выберите животное, команды которого хотите посмотреть:");
        System.out.println( submenu.menu() );

        String line = scanner.nextLine();
        if ( checkTextCorrectForInt( line ) )
        {
            int numOption = Integer.parseInt( line );
            if ( submenu.checkChosenInput( numOption ) )
            {
                int chosenAminalIndex = --numOption;
                ArrayList<String> commands = presenter.getAnimalCommands( chosenAminalIndex );
                if ( commands.isEmpty() )
                {
                    System.out.println("Животное не знает команд.");
                }
                else
                {
                    for (String command : commands) {
                        System.out.println("- " + command);
                    }
                }
            }
            else
            {
                System.out.println("Ошибка выбора. Вы будете возвращены в главное меню.");
            }
        }

    }

    public void teachAnimalCommands()
    {
        presenter.teachAnimalCommands();
    }
}
