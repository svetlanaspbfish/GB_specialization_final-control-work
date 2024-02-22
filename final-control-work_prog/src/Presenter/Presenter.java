package Presenter;

import model.AnimalRegistry;
import view.View;

public class Presenter {
    AnimalRegistry registry;
    View view;
    public Presenter(View view)
    {
        this.view = view;
        registry = new AnimalRegistry();
    }

    public void addNewAnimal()
    {
        registry.addNewAnimal();
    }

    public void moveAnimalToRightClass()
    {
        registry.moveAnimalToRightClass();
    }

    public void showAnimalCommands()
    {
        registry.showAnimalCommands();
    }

    public void teachAnimalCommands()
    {
        registry.teachAnimalCommands();
    }


}
