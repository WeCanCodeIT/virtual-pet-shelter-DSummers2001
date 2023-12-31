package virtual.pet.shelter;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int select;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to my pet shelter and i look forward to working with you!");
        Shelter shelter = new Shelter();

        do {

            shelter.shelterPets();
            menu();
            select = userInput.nextInt();
            userInput.nextLine();

            shelter.petDeath();
            shelter.selfPreservation();
            
            switch (select) {
                case 0:
                    shelter.tickPets();
                    intakePet(userInput, shelter);
                    break;
                case 1:
                    petAdoption(shelter, userInput);
                    shelter.tickPets();
                    break;
                case 2:
                    shelter.feedPets();
                    shelter.tickPets();
                    break;
                case 3:
                    shelter.waterPets();
                    shelter.tickPets();
                    break;
                case 4:
                    selectPet(userInput, shelter);
                    shelter.tickPets();
                    break;
                case 5:
                    shelter.cleanKennel();
                    shelter.tickPets();
                    break;
                case 6:
                    System.exit(select);
                    break;
                default:
                System.out.println("\nInvalid input enter a number 1-6\n");
                    break;
            }

        } while (select != 6);

        userInput.close();
    }

    public static void menu(){
        System.out.println("What would you like to do!\n");
        System.out.println("[0] Intake a new pet");
        System.out.println("[1] Give a pet up for adoption");
        System.out.println("[2] Feed all pets");
        System.out.println("[3] Give water to all pets");
        System.out.println("[4] Play with a specific pet");
        System.out.println("[5] Clean a pets kennel");
        System.out.println("[6] Quit :( ");
    }

    public static void intakePet(Scanner scanner, Shelter shelter){
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Description: ");
        String description = scanner.nextLine();

        System.out.print("Enter kennel number: ");
        int kennelNum = scanner.nextInt();
        scanner.nextLine();

        shelter.intakePet(kennelNum, name, description);
    }

    public static void petAdoption(Shelter shelter, Scanner scanner){
        System.out.print("Enter kennel number: ");
        int kennelNum = scanner.nextInt();
        scanner.nextLine();
        shelter.petAdoption(kennelNum);
    }

    public static void selectPet(Scanner scanner, Shelter shelter){
        shelter.petNameDescription();
        System.out.print("\nEnter kennel number to play with a pet: ");
        int kennelNum = scanner.nextInt();
        shelter.selectedPet(kennelNum);
        Pets pet = shelter.selectedPet(kennelNum);

        System.out.println("\nYou played with him/her! they are very happy\n");
        pet.changeBoredom(+10);
    }

}
