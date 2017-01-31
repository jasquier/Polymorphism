package io.zipcoder.pets;

import java.util.Scanner;

/**
 * @author John A. Squier
 * @author Michael Wolfe
 * A main class that Michael Wolfe will implement.
 */
public class Main
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        // get number of pets user has
        System.out.print(promptForNumberOfPets());
        int numberOfPets = getNumberOfPetsUserHas();

        // create an array to store user input
        Pet[] userPets = new Pet[numberOfPets];
        //String[] userInput = new String[numberOfPets*2]; // original implementation

        for ( int i = 0; i < numberOfPets; i++ )
        {
            System.out.print(promptForTypeOfPetUserHas());

            switch ( getTypeOfPetUserHas().toLowerCase() )
            {
                case "dog":
                    userPets[i] = new Dog();
                    break;
                case "cat":
                    userPets[i] = new Cat();
                    break;
                case "goat":
                    userPets[i] = new Goat();
                    break;

                // unknown pet types are dogs
                default:
                    userPets[i] = new Dog();
            }

            System.out.print(promptForNameOfPetUserHas());
            userPets[i].setName(getNameOfPetUserHas());
        }

        // print out pets
        for ( int i = 0; i < numberOfPets; i++ )
        {
            System.out.println(userPets[i].toString());
        }

    }

    public static String promptForNumberOfPets()
    {
        return "How many pets do you have?:";
    }

    public static String promptForTypeOfPetUserHas()
    {
        return "What kind of animal is this pet?:";
    }

    public static String promptForNameOfPetUserHas()
    {
        return "What is the name of this pet?:";
    }

    public static int getNumberOfPetsUserHas()
    {
        int x = kb.nextInt();
        kb.nextLine();
        return x;
    }

    public static String getTypeOfPetUserHas()
    {
        return kb.nextLine();
    }

    public static String getNameOfPetUserHas()
    {
        return kb.nextLine();
    }
}
