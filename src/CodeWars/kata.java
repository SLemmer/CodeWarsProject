package CodeWars;

import java.util.Arrays;
import java.io.*;



public class kata
{
    public static String reverseWords(String original)
    {

        String inReverse = "";
        String trimInReverse = "";
        // this splits a string into an array with the delimiter being white spaces \\s
        String wordsInString[] = original.split("\\s");

        //this is the edge case incase it is all white spaces
        if(original.matches("\\s*")){
            trimInReverse = original;
        } else {
            // for each word in string, create a string builder.  sb reverse the order of the letters in the arracy
            for (String word:wordsInString){
                StringBuilder sb = new StringBuilder(word);
                sb.reverse();
                inReverse += sb.toString()+" ";
                trimInReverse = inReverse.trim(); // necessary because the previous line leaves a trailing white space that fails
            }
        }

        return trimInReverse;
    }
}
