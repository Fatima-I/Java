package PetCenter;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();
        PetManagement manage = new PetManagement();
        //traditional pets
        pets.add(new traditionalPets(TypesTraditional.DOG, "jack","retriever","6 months", "black", "Male", "healthy", AdoptionStatus.AVAILABLE,true));
        pets.add(new traditionalPets(TypesTraditional.CAT, "willow","ragdoll","1 year", "Russian blue", "Female", "down's syndrome", AdoptionStatus.AVAILABLE,false));
        pets.add(new traditionalPets(TypesTraditional.BIRD, "patrick","king parrot","8 months", "white", "Male", "healthy", AdoptionStatus.UNAVAILABLE,true));
        //exotic pets
        pets.add(new exoticPets(TypesExotic.SNAKE, "lizzy","rock python","8 yrs", "Skin brown", "Male", "healthy", AdoptionStatus.AVAILABLE,"dry habitat"));
        pets.add(new exoticPets(TypesExotic.TARANTULA, "mallow","tarantula hawk","1yr", "black", "Male", "healthy", AdoptionStatus.AVAILABLE,"tropical habitat"));
        pets.add(new exoticPets(TypesExotic.LIZARD, "stinky","monitor","6 months", "blue", "Female", "healthy", AdoptionStatus.AVAILABLE,"temperate habitat"));

       /* Menu m1 = new Menu();
        Menu.displayMainMenu();
        m1.getUserChoice();*/

        // manage.Display(ArrayList<Pet>);
        GenericPets<Pet> genericPets = new GenericPets<>();
        genericPets.displayPetDetails();


    }
}