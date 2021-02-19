package CodeWars;

public class isogram {

    public static boolean  isIsogram(String str) {
    // test to see if a word is an isogram, that is, it doesn't return repeat any letter regradless of case

    int stringLength = str.length();
    //To turn the cord into an array of type char

    char[] chars = str.toCharArray();

    //imbedded loop to get the letters in each word to iterate over the other letter sin teh word

    for (int i =0; i < stringLength; i++) {

        for (int j = i +1; j < stringLength; j++) {

            //Since we want to be case insensitive, needed to turn all the letters to upper case for repeats
            //if any letter repeats itself in a word return false (not an Isogram), else true

            if (Character.toUpperCase(chars[i])==Character.toUpperCase(chars[j])){
                return false;
            }
        }
    } return true;
}
}
