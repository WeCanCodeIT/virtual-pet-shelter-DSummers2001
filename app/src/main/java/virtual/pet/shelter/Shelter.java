package virtual.pet.shelter;

import java.util.HashMap;
import java.util.Map;

public class Shelter {
    // create a map
    private Map<Integer, Pets> PetsIn = new HashMap<>();
    private Map<Integer, Pets> adoptedPets = new HashMap<>();
    // take in a pet
    public void intakePet(int kennelNum, String name, String description) {
        Pets newPetIn = new Pets(name, description);
        PetsIn.put(kennelNum, newPetIn);
    }
    // adopt a pet
    public void petAdoption(int kennelNum){
        adoptedPets.put(kennelNum, PetsIn.get(kennelNum));
        PetsIn.remove(kennelNum);
    }
    // cage cleanliness
    
    // display all pets in the shelter
    public void shelterPets(){
        for (Map.Entry<Integer, Pets> entry : PetsIn.entrySet()){

        }
    }
    // select a certain pet

    // display selected pets information
}
