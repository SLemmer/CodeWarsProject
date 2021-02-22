package CodeWars;


import java.util.Scanner;
import java.util.*;

public class CodeWars {

    public static void main (String[]args) {

        boolean running = true;

        while(running) {
            System.out.println("Please make selection for the CodeWars project you would like to see in action!");
            System.out.println("A - Check to see if a word is an Isogram.");
            System.out.println("B - Input a sentence and see an output with the words spelled backwards.");
            System.out.println("C - Enter a number of days rental to determine total cost of renting a car.");
            System.out.println("D - input an array of numbers to figure out the stanton number.");
            System.out.println("E - Input two words to see them spoonerized.");
            System.out.println("F - Input a STRING of numbers to find out the highest and the lowest.");
            System.out.println("G - Enter a sentence and all words with 5 or more characters will be spelled backwards.");


            Scanner in = new Scanner (System.in);
            String choice = in.nextLine();

       /*This triggers a method that checks to see if a word is an "Isogram," that is, no letters repeat in the word.
       Will return a boolean as to weather the input word is an Isogram.
        */

            if(choice.equalsIgnoreCase("A")) {
                System.out.println("Codewars #1 - Isogram: ");
                System.out.println("What word would you like to check?");
                String isogramCandidate = in.nextLine();

                //String isogramCandidate = "Monthly";
                System.out.println("Is the word '" + isogramCandidate + "' an Isogram?  " + Isogram.isIsogram(isogramCandidate));


                System.out.println();
            } else if (choice.equalsIgnoreCase("B")) {
        /*  The following takes in a string and returns the string with all of the individual words with reversed.
        word order is the same, but the letter order of each word is reverse.

        The name of the class is ReverseWordSpelling

         */
                System.out.println("Codewars #2 - ReverseWordSpelling: ");
                System.out.println("What sentence would you like to see the word spelled backwards?");

                String stringForward = in.nextLine();
                System.out.println("Here is how your sentence looks with the spelling of each word backwards");
                System.out.println(ReverseWordSpelling.reverseWords(stringForward));
            }else if (choice.equalsIgnoreCase("C")) {
        /* Simple cost calculator that has discounts for total numbers of days rents

         */
                System.out.println();
                System.out.println("Codewars #3 - CostCalculator: ");
                System.out.println("How many days will you be renting the car?");
                int d = in.nextInt();
                System.out.println("If you rent the car for " + d +" days");
                System.out.println("The total cost of rental will be " +CostCalulator.rentalCarCost(d));

            } else if (choice.equalsIgnoreCase("D")){

                System.out.println();
                System.out.println("Codewars #4 - Stanton Number: ");
                int[]arr={1,3,1,4,5,1,2,3,4,5,1,1,3,1,4,6,6,2,3,5,6};
                System.out.println("The stanton number of the input array is:");
                System.out.println("Stanton = "+Stanton.stantonMeasure(arr));

            } else if (choice.equalsIgnoreCase("E")){
                System.out.println();
                System.out.println("Codewars #5 - Spooner: ");
                System.out.println("What two words would you like spoonerized?");
                String words = in.nextLine();
                System.out.println("The Spooner of "+words+" is:");
                System.out.println(Spooner.spoonerize(words));

            } else if (choice.equalsIgnoreCase("F")){

                System.out.println();
                System.out.println("Codewars #6 - Highest and Lowest: ");
                System.out.println("Please enter a series of digits and I will tell you the high and low!");
                String numbersInString =in.nextLine();
                System.out.println("The highest and lowest numbers in this STRING are:");
                System.out.println(HighestAndLowest.highAndLow(numbersInString));
            } else if (choice.equalsIgnoreCase("G")){
                System.out.println();
                System.out.println("Codewars #7 - Spinwords: ");
                System.out.println("Provide a sentence and all words five or more letters will be spelled backwards!");
                String sentence =in.nextLine();
                System.out.println(SpinWords.spinWords(sentence));


            }



            else {
                System.out.println("Choice not found!");
            }
                System.out.println("Try another? enter Y");
                String again = in.nextLine();
                if (again.equalsIgnoreCase("Y")){
                    running = true;

                } else {
                    running = false;
                }

        }
        System.out.println("Goodbye!");
    }
}
