package virtual.pet.shelter;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int select;
        Scanner userInput = new Scanner(System.in);
        System.out.println("We welcome you to our pet shelter and look forward to working with you!");
        Shelter shelter = new Shelter();
        String petName = userInput.nextLine();
        String petDescription = userInput.nextLine();
        Pets pet = new Pets(petName, petDescription);

        do {
            System.out.println("What would you like to do!");
            System.out.println("[0] Intake a new pet");
            System.out.println("[1] Give a pet up for adoption");
            System.out.println("[2] Feed all pets");
            System.out.println("[3] Give water to all pets");
            System.out.println("[4] Play with a specific pet");
            System.out.println("[5] Clean a pets kennel");
            System.out.println("[6] Quit :( ");

            select = userInput.nextInt();
            userInput.nextLine();

            if ((pet.getHunger() < 0) || (pet.getThirst() < 0)){
                System.out.println("A pet has died :( ");
                break;
            }

            pet.selfPreservation();
            
            switch (select) {
                case 0:
                    intakePet(userInput, shelter);
                    break;
                case 1:
                    petAdoption(shelter, userInput);
                    break;
                case 2:
                    pet.changeHunger(+10);
                    break;
                case 3:
                    pet.changeThirst(+10);
                    break;
                case 4:
                    shelter.selectedPet(select);
                    pet.changeBoredom(+10);
                    showPetsCurrentNeeds(pet);
                    break;
                case 5:
                    shelter.cleanKennel();
                    break;
                case 6:
                    System.exit(select);
                    break;
                default:
                System.out.println("Invalid input enter a number 1-6");
                    break;
            }

            pet.tick();
        } while (select != 6);

        userInput.close();
    }

    private static void showPetsCurrentNeeds(Pets pet){
        System.out.println("Hunger: " + pet.getHunger());
        System.out.println("Thirst: " + pet.getThirst());
        System.out.println("Boredom: " + pet.getBoredom());
        System.out.println("Kennel Cleanliness: " + pet.getCage());
    }

    public static void intakePet(Scanner scanner, Shelter shelter){
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Description: ");
        String description = scanner.nextLine();

        System.out.println("Enter kennel number: ");
        int kennelNum = scanner.nextInt();
        scanner.nextLine();

        shelter.intakePet(kennelNum, name, description);
    }

    public static void petAdoption(Shelter shelter, Scanner scanner){
        System.out.println("Enter kennel number: ");
        int kennelNum = scanner.nextInt();
        scanner.nextLine();
        shelter.petAdoption(kennelNum);
    }

}
