package virtual.pet.shelter;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int select;
        Scanner userInput = new Scanner(System.in);
        System.out.println("We welcome you to our pet shelter and look forward to working with you!");
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
                System.out.println("Invalid input enter a number 1-6");
                    break;
            }

        } while (select != 6);

        userInput.close();
    }

    public static void menu(){
        System.out.println("What would you like to do!");
        System.out.println("[0] Intake a new pet");
        System.out.println("[1] Give a pet up for adoption");
        System.out.println("[2] Feed all pets");
        System.out.println("[3] Give water to all pets");
        System.out.println("[4] Play with a specific pet");
        System.out.println("[5] Clean a pets kennel");
        System.out.println("[6] Quit :( ");
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
