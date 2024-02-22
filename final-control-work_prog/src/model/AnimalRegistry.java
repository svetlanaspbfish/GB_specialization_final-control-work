package model;

import java.util.Arrays;

import model.animal.Animal;
import model.animal.AnimalFinalClasses;
import model.animal.packAnimals.Camel;
import model.animal.packAnimals.Donkey;
import model.animal.packAnimals.Horse;
import model.animal.pets.Cat;
import model.animal.pets.Dog;
import model.animal.pets.Hamster;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnimalRegistry {
    private List<Animal> animals;
    private List<AnimalFinalClasses> animalClasses;

    public AnimalRegistry()
    {
        animals = new ArrayList<>();
        animalClasses = Arrays.asList( AnimalFinalClasses.values() );
    }

    public void addNewAnimal( String name, Date birthDateStr ) {
        Animal newAnimal = new Animal( name, birthDateStr );
        animals.add( newAnimal );
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<AnimalFinalClasses> getAnimalFinalClasses()
    {
        return animalClasses;
    }

    public void moveAnimalToRightClass( int chosenAminalIndex, String chosenAnimalClass ) {
        Animal oldTypeAnimal = animals.get( chosenAminalIndex );
        try {
            AnimalFinalClasses animalCorrectClass = AnimalFinalClasses.valueOf( chosenAnimalClass );

            switch ( animalCorrectClass ) {
                case cat:
                    animals.set( chosenAminalIndex, new Cat( oldTypeAnimal ) );
                    break;
                case dog:
                    animals.set( chosenAminalIndex, new Dog( oldTypeAnimal ) );
                    break;
                case humster:
                    animals.set( chosenAminalIndex, new Hamster( oldTypeAnimal ) );
                    break;
                case horse:
                    animals.set( chosenAminalIndex, new Horse( oldTypeAnimal ) );
                    break;
                case camel:
                    animals.set( chosenAminalIndex, new Camel( oldTypeAnimal ) );
                    break;
                case donkey:
                    animals.set( chosenAminalIndex, new Donkey( oldTypeAnimal ) );
                    break;
            }
        } catch (IllegalArgumentException e) {
            // Ошибка не обрабатывается, т.к. на валидность это значение проверялось до передачи сюда.
        }
    }

    public ArrayList<String> getAnimalCommands( int chosenAminalIndex ) {
        return animals.get( chosenAminalIndex ).getCommands();
    }

    public void teachAnimalCommands() {
        //
    }
}
