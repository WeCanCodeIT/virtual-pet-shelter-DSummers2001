import java.util.Scanner;

package virtual.pet.shelter;

public class App {
    public static void main(String[] args) {
        int select;

        Scanner userInput = new Scanner(System.in);
        System.out.println("We welcome you to our pet shelter and look forward to working with you!");
        
        // code for virtual pet

        // instructions
        shelterMenu();

        do {
            System.out.println("What would you like to do!");
            System.out.println("[0] Intake a new pet");
            System.out.println("[1] Give a pet up for adoption");
            System.out.println("[2] Feed all pets");
            System.out.println("[3] Give water to all pets");
            System.out.println("[4] Play with a specific pet");
            System.out.println("[5] Clean a pets kennel");
            System.out.println("[6] ");
            System.out.println("[7] Quit :( ");

            select = userInput.nextInt();

            if ((dog.getHunger() < -4) || (dog.getThirst() < -4)){
                System.out.println("A pet has died :( ");
                break;
            }
            
            if (select == 7){
                continue;
            } 
            else if (select == 0){
                if (pets in the shelter > 9){
                    System.out.println("You have to many pets in the shelter");
                    continue;
                }
                System.out.println("You have took in a new pet");
            }
            else if ( select == 1){
                if (dog.getHunger() > 10){
                    System.out.println(dogName + " isn't hungry right now.");
                    showDogCurrentNeeds(dog);
                    continue;
                }
                System.out.println(dogName + " Loved that treat and wags his tail happily!");
                dog.changeHunger(+2);
                dog.changeEnergy(+2);
                dog.changeAttention(+1);
                dog.changeThirst(-1);
                dog.changeBladder(-1);
                showDogCurrentNeeds(dog);
            }
            else if (select == 2){
                if (dog.getThirst() > 10){
                    System.out.println(dogName + " does'nt want any water right now");
                    showDogCurrentNeeds(dog);
                    continue;
                }
                System.out.println(dogName + " really enjoyed that water and thanks you with a happy bark!");
                dog.changeThirst(+2);
                dog.changeBladder(-1);
                showDogCurrentNeeds(dog);
            }
            else if (select == 3){
                if (dog.getAttention() > 10){
                    System.out.println(dogName + " does'nt want to play right now.");
                    showDogCurrentNeeds(dog);
                    continue;
                }
                dog.changeAttention(+3);
                dog.changeEnergy(-1);
                dog.changeHunger(-1);
                dog.changeThirst(-1);
                showDogCurrentNeeds(dog);
            }
            else if (select == 4){
                if (dog.getBladder() > 10){
                    System.out.println(dogName + " does'nt need to go to the bathroom yet.");
                    showDogCurrentNeeds(dog);
                    continue;
                }
                System.out.println(dogName + " is really happy you let him out to use the bathroom!");
                dog.changeBladder(+2);
                dog.changeHygiene(-1);
                showDogCurrentNeeds(dog);
            }
            else if (select == 5){
                if (dog.getEnergy() > 10){
                    System.out.println("Rest is not needed for " + dogName + " right now.");
                    showDogCurrentNeeds(dog);
                    continue;
                }
                System.out.println(dogName + " Enjoyed his nap a lot and is wagging his tail happily!");
                dog.changeEnergy(+2);
                dog.changeHunger(-1);
                dog.changeThirst(-1);
                dog.changeBladder(-1);
                showDogCurrentNeeds(dog);
            }
            else if (select == 6){
                if (dog.getHygiene() > 10){
                    System.out.println("Your " + dogName + " still has a clean and shiny coat!");
                    showDogCurrentNeeds(dog);
                    continue;
                }
                System.out.println(dogName + " Enjoyed his grooming a lot is jumping in excitement");
                dog.changeHygiene(+2);
                dog.changeEnergy(-1);
                showDogCurrentNeeds(dog);
            } else {
                System.out.println("You need to choose a proper input please try again.");
            }

            dog.tick();
        } while (select != 7);

        userInput.close();
    }

    private static void showDogCurrentNeeds(VirtualPet dog){
        System.out.println("Hunger: " + dog.getHunger());
        System.out.println("Thirst: " + dog.getThirst());
        System.out.println("Attention: " + dog.getAttention());
        System.out.println("Bladder: " + dog.getBladder());
        System.out.println("Energy: " + dog.getEnergy());
        System.out.println("Hygiene: " + dog.getHygiene());
    }

    public static void shelterMenu() {
        System.out.println("");
    }
}
