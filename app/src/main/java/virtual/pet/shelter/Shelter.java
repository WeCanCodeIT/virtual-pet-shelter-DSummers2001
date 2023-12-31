package virtual.pet.shelter;

import java.util.HashMap;
import java.util.Map;

public class Shelter {
    // create a map
    private Map<Integer, Pets> petsIn = new HashMap<>();
    private Map<Integer, Pets> adoptedPets = new HashMap<>();

    // take in a pet
    public void intakePet(int kennelNum, String name, String description) {
        Pets newPetIn = new Pets(name, description);
        petsIn.put(kennelNum, newPetIn);
    }

    // adopt a pet
    public void petAdoption(int kennelNum){
        adoptedPets.put(kennelNum, petsIn.get(kennelNum));
        petsIn.remove(kennelNum);
    }

    public void feedPets(){
        for (Map.Entry<Integer, Pets> entry : petsIn.entrySet()) {
            Pets pet = entry.getValue();
            pet.changeHunger(+10);
        }
    }

    public void waterPets(){
        for (Map.Entry<Integer, Pets> entry : petsIn.entrySet()) {
            Pets pet = entry.getValue();
            pet.changeThirst(+10);
        }
    }

    public void tickPets(){
        for (Map.Entry<Integer, Pets> entry : petsIn.entrySet()) {
            Pets pet = entry.getValue();
            pet.tick();
        }
    }

    public void selfPreservation(){
        for (Map.Entry<Integer, Pets> entry : petsIn.entrySet()) {
            Pets pet = entry.getValue();
            pet.selfPreservation();
        }
    }

    public void petDeath(){
        for (Map.Entry<Integer, Pets> entry : petsIn.entrySet()){
            int key = entry.getKey();
            Pets pet = entry.getValue();

            if (pet.getHunger() < 0 || pet.getThirst() < 0){
                System.out.println("A pet has died");
                petsIn.remove(key);
            }
        }
    }

    // cage cleanliness
    public void cleanKennel(){
        for (Map.Entry<Integer, Pets> entry : petsIn.entrySet()) {
            Pets pet = entry.getValue();
            pet.changeCage(+5.0);
            }
        }
    
    // display pet names with descriptions only
    public void petNameDescription(){
        for (Map.Entry<Integer, Pets> entry : petsIn.entrySet()){
            int key = entry.getKey();
            Pets pet = entry.getValue();

            System.out.println("Kennel number: " + key + " " + pet.getName() + " - " + pet.getDescription());
        }
    }
    
    // display all pets in the shelter
    public void shelterPets(){
        if (!petsIn.isEmpty()){
            System.out.println("Status of pets in the shelter:\n");
        }
        for (Map.Entry<Integer, Pets> entry : petsIn.entrySet()){
            int key = entry.getKey();
            Pets pet = entry.getValue();

            System.out.println("Kennel number: " + key + " Name: " + pet.getName() + " Description: " + pet.getDescription());
            System.out.println("Thirst: " + pet.getThirst() + " Hunger: " + pet.getHunger() + " Boredom: " + pet.getBoredom() + " Kennel cleanliness: " + pet.getCage() + "\n");
        }
    }

    // select a certain pet
    public Pets selectedPet(int kennelNum){
        return petsIn.get(kennelNum);
    }


}
