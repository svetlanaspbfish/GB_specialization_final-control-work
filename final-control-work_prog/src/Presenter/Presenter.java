package Presenter;

import model.AnimalRegistry;
import model.animal.Animal;
import model.animal.AnimalFinalClasses;
import view.View;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Presenter {
    AnimalRegistry registry;
    View view;
    public Presenter(View view)
    {
        this.view = view;
        registry = new AnimalRegistry();
    }

    public void addNewAnimal( String name, Date birthDateStr )
    {
        registry.addNewAnimal( name, birthDateStr );
    }

    public void moveAnimalToRightClass( int chosenAminalIndex, String chosenAnimalClass  )
    {
        registry.moveAnimalToRightClass( chosenAminalIndex, chosenAnimalClass );
    }

    public ArrayList<String> getAnimalCommands(int chosenAminalIndex )
    {
       return registry.getAnimalCommands( chosenAminalIndex );
    }

    public void teachAnimalCommands()
    {
        registry.teachAnimalCommands();
    }

    public List<Animal> getAnimals()
    {
        return registry.getAnimals();
    }

    public List<AnimalFinalClasses> getAnimalFinalClasses()
    {
        return registry.getAnimalFinalClasses();
    }

}
