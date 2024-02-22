package view.consoleUI;

import view.ConsoleUI;
import view.consoleUI.menuComands.*;

import java.util.ArrayList;
import java.util.List;

public class MenuSelectionFromArray {
    List options;
    String title;
    public MenuSelectionFromArray ( ConsoleUI consoleUI, List sourseOptions, String title )
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
                stringBuilder.append(i+1);
                stringBuilder.append(". ");
                stringBuilder.append( options.get(i).toString() );
                stringBuilder.append("\n");
            }
        }

        return stringBuilder.toString();
    }

    public boolean checkChosenInput( int chosenOptionNum )
    {
        return chosenOptionNum > 0 && chosenOptionNum <= options.size();
    }

    public int execute(int numOption) {
        return --numOption;
    }
}
