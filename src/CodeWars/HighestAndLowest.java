package CodeWars;
import java.util.*;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {

        //Sprint String into String Array using Regex \\s

        String[] numStringArray = numbers.split("\\s");

        //Initialize an int array of the same length
        int[] numIntArray = new int[numStringArray.length];

        //use parseint to place the strings into the int array
        for(int i= 0; i < numStringArray.length; i++){
            numIntArray[i]=Integer.parseInt(numStringArray[i]);

        }
        //determine max and min using a loop
        int max = numIntArray[0];
        int min = numIntArray[0];

        for(int j = 0; j < numIntArray.length; j++) {
            if (numIntArray[j]> max){
                max = numIntArray[j];
            } else if (numIntArray[j] < min){
                min = numIntArray[j];
            }
        }
        String maxMin = (String.valueOf(max))+" "+(String.valueOf(min));

        //System.out.println(Arrays.toString(numIntArray));
        //System.out.println(max+ " "+ min);

        return maxMin;
    }
}