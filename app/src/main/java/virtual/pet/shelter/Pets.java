package virtual.pet.shelter;

public class Pets {
    String name;
    String description;
    int thirst = 100;
    int hunger = 100;
    int boredom = 100;
    double cage = 10.0;


    public Pets(String name, String description) {
        this.name = name;
        this.description = description;
        this.thirst = 100;
        this.hunger = 100;
        this.boredom = 100;
        this.cage = 10.0;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public int getThirst() {
        return thirst;
    }


    public void setThirst(int thirst) {
        this.thirst = thirst;
    }


    public int getHunger() {
        return hunger;
    }


    public void setHunger(int hunger) {
        this.hunger = hunger;
    }


    public int getBoredom() {
        return boredom;
    }


    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }


    public double getCage() {
        return cage;
    }


    public void setCage(double cage) {
        this.cage = cage;
    }

}