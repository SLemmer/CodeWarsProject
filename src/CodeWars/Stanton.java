package CodeWars;

public class Stanton {
/*stanton measure follows this rule:
  the Stanton measure of an array is computed as follows: count the number of 1s in the array.
  Let this count be n. The Stanton measure is the number of times that n appears in the array.
  */

    public static int stantonMeasure(int[] arr) {

        int oneCount = 0;
        int xCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                oneCount++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oneCount) {
                xCount++;
            }
        }
        return xCount;
    }
}