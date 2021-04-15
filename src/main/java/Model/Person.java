package Model;

public class Person {
    private String name;
    private int level;
    private String rank;


    // Persons constructors

    public Person(String name, int level, String rank ) {
        this.name = name;
        this.level = level;
        this.rank = rank;

    }


    //  Getters

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }


    public String getRank() {
        return rank;
    }

}

