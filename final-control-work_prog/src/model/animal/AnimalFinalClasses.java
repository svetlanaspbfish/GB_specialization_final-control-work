package model.animal;

public enum AnimalFinalClasses {
    cat("Кошка"),
    dog("Собака"),
    humster("Хомяк"),
    horse("Лошадь"),
    camel("Верблюд"),
    donkey("Осел");
    private String displayName;

    AnimalFinalClasses(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

//    public String toString()
//    {
//       return getDisplayName();
//    }
}
