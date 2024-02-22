package view.consoleUI;

import model.animal.AnimalFinalClasses;
import view.ConsoleUI;
import view.consoleUI.menuComands.*;

import java.util.ArrayList;
import java.util.List;

public class MenuSelectionFromEnum {
    List options;
    String title;
    public MenuSelectionFromEnum ( ConsoleUI consoleUI, List sourseOptions, String title )
    {
        options = sourseOptions;
        this.title = title;
    }

    public String menu()
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(title);
        stringBuilder.append("\n");

        if ( options.isEmpty() )
        {
            stringBuilder.append("Выбирать не из чего. Введите что угодно, чтобы продолжить.");
        }
        else
        {
            for ( int i = 0; i < options.size(); i++ )
            {
                stringBuilder.append( options.get(i) );
                stringBuilder.append(". ");
                if ( options.get(i) instanceof AnimalFinalClasses)
                {
                    stringBuilder.append( ((AnimalFinalClasses) options.get(i)).getDisplayName() );
                }
                stringBuilder.append("\n");
            }
        }

        return stringBuilder.toString();
    }

    public boolean checkChosenInput( String chosenOptionNum )
    {
        for ( int i = 0; i < options.size(); i++ )
        {
            if ( chosenOptionNum.equals( options.get(i).toString() ) ) return true;
        }
        return false;
    }

    public int execute(int numOption) {
        return --numOption;
    }
}
