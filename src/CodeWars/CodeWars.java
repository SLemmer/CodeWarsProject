package CodeWars;

public class CodeWars {

    public static void main (String[]args){

       /*This triggers a method that checks to see if a word is an "Isogram," that is, no letters repeat in the word.
       Will return a boolean as to weather the input word is an Isogram.
        */
        System.out.println("Codewars #1 - Isogram: ");
        String isogramCandidate = "Monthly";
        System.out.println("Is the word '" + isogramCandidate+ "' an Isogram?  " + Isogram.isIsogram(isogramCandidate));


        System.out.println();
        /*  The following takes in a string and returns the string with all of the individual words with reversed.
        word order is the same, but the letter order of each word is reverse.

        The name of the class is ReverseWordSpelling

         */
        System.out.println("Codewars #2 - ReverseWordSpelling: ");
        String stringForward = "The Rain In SPain falls Mainly on the plane";
        System.out.println("The sentence to be written backwards is:");
        System.out.println(stringForward);
        System.out.println(ReverseWordSpelling.reverseWords(stringForward));

        /* Simple cost calculator that has discounts for total numbers of days rents

         */
        System.out.println();
        System.out.println("Codewars #3 - CostCalculator: ");
        int d = 10; // # of days of rental
        System.out.println("If you rent the car for " + d +" days");
        System.out.println("The total cost of rental will be " +CostCalulator.rentalCarCost(d));

        System.out.println();
        System.out.println("Codewars #4 - Stanton Number: ");
        int[] arr ={1,3,1,4,5,1,2,3,4,5,1,1,3,1,4,6,6,2,3,5,6};
        System.out.println("The stanton number of the input array is:");
        System.out.println("Stanton = " + Stanton.stantonMeasure(arr));

        System.out.println();
        System.out.println("Codewars #5 - Spooner: ");
        String words ="Hucky Buddy";
        System.out.println("The Spooner of " + words + " is:");
        System.out.println(Spooner.spoonerize(words));

        System.out.println();
        System.out.println("Codewars #6 - Highest and Lowest: ");
        String numbersInString ="98 2 4 0 -3 58 1 8 4 52";
        System.out.println("The highest and lowest numbers in this STRING are:");
        System.out.println(HighestAndLowest.highAndLow(numbersInString));

    }
}
