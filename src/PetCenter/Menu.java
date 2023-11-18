package PetCenter;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Menu {

    Scanner input = new Scanner(System.in);

    static void displayMainMenu() {
        System.out.println("------------------PET WELFARE AND ADOPTION CENTER------------------");
        System.out.println("\nHi ! Hope that you are doing well. Let us know what you are here for");
        System.out.println("\nPress A to Adopt a pet");
        System.out.println("Press S to Surrender a pet");
        System.out.println("Press D to donate for organization");
    }

    void getUserChoice() {
        String option = "";
        System.out.println("\nEnter your choice");
//        try
//        {
            option = input.next();
//        }
//        catch (IllegalArgumentException e) {
//            System.out.println("Please enter an alphabet to proceed");
//            input.next();
//        }
        if(option.equals("A"))    // (OR   Objects.equals(option, "A"))
        {
            System.out.println("Adoption");
        }
    }
}
