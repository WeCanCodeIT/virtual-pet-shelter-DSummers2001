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
    // cage cleanliness
    public void cleanKennel(){
        for (Map.Entry<Integer, Pets> entry : petsIn.entrySet()) {
            int key = entry.getKey();
            Pets pet = entry.getValue();

            if (pet.getCage() < 10.0){
                System.out.println("You cleaned kennel number: " + key);
                pet.changeCage(+4.0);
            } else {
                System.out.println(key + " is already clean");
            }
        }
    }
    
    // display all pets in the shelter
    public void shelterPets(){
        if (!petsIn.isEmpty()){
            System.out.println("Pets in the shelter with kennel number");
        }
        for (Map.Entry<Integer, Pets> entry : petsIn.entrySet()){
            int key = entry.getKey();
            Pets pet = entry.getValue();

            System.out.println("Kennel number: " + key + " Name: " + pet.getName() + " Description: " + pet.getDescription() + " Kennel cleanliness: " + pet.getCage());
            System.out.println("Thirst: " + pet.getThirst() + " Hunger: " + pet.getHunger() + " Boredom: " + pet.getBoredom() + "\n");
        }
    }
    // select a certain pet
    // display selected pets information

}
