package view.consoleUI;

import view.ConsoleUI;
import view.consoleUI.menuComands.*;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<Comand> options;
    public Menu ( ConsoleUI consoleUI )
    {
        options = new ArrayList<>();
        // Добавляем команды
        options.add( new AddNewAnimal( consoleUI ));
        options.add( new MoveAnimalInRightClass( consoleUI ));
        options.add( new ShowAnimalCommands( consoleUI ));
        options.add( new TeachAnimalCommands( consoleUI ));
        options.add( new Finish( consoleUI ));
    }

    public String menu()
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Меню:\n");
        for ( int i = 0; i < options.size(); i++ )
        {
            stringBuilder.append(i+1);
            stringBuilder.append(". ");
            stringBuilder.append( options.get(i).getDescription() );
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public boolean checkChosenInput( int chosenOptionNum )
    {
        return chosenOptionNum > 0 && chosenOptionNum <= options.size();
    }

    public void execute(int numOption) {
        Comand chosenOption = options.get( --numOption );
        chosenOption.execute();
    }
}
