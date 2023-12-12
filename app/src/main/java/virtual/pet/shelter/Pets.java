package virtual.pet.shelter;

public class Pets {
    String name;
    String description;
    int thirst = 50;
    int hunger = 50;
    int boredom = 50;
    double cage = 10.0;


    public Pets(String name, String description) {
        this.name = name;
        this.description = description;
        this.thirst = 50;
        this.hunger = 50;
        this.boredom = 50;
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

    // methods to change values
    public void changeHunger(int hunger){
        this.hunger += hunger;
    }

    public void changeThirst(int thirst){
        this.thirst += thirst;
    }

    public void changeBoredom(int boredom){
        this.boredom += boredom;
    }

    public void changeCage(double cage){
        this.cage += cage;
    }

    public void tick(){
        this.hunger -= 5;
        this.thirst -= 5;
        this.boredom -= 8;
        this.cage -= 1.0;
    }

    public void selfPreservation(){
        if ((this.hunger <= 10) && (this.hunger <= this.thirst)){
            this.hunger += 5;
        } else {
            this.thirst += 5;
        }
    }

}