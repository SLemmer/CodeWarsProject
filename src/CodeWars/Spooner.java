package CodeWars;

// A spooner is a set of two words where you switch the first letter of each word.
public class Spooner {
    public static String spoonerize(String words) {

        //Split word into an array using regex for a space
        String[] splitWords = words.split("\\s");

        //Assign array to tow new words
        String wordOne = splitWords[0];
        String wordTwo = splitWords[1];

        //Take off first letter using the substring method
        String ordOne = wordOne.substring(1);
        String ordTwo = wordTwo.substring(1);

        //identify the char at the begging of each word
        char firstLetterOne = wordOne.charAt(0);
        char firstLetterTwo = wordTwo.charAt(0);

        // turn the char back into string before putting it all back together
        String spoonerWord = Character.toString(firstLetterTwo) + ordOne +" " + Character.toString(firstLetterOne) + ordTwo;

        return spoonerWord;
    }
}
