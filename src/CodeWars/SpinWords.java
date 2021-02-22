package CodeWars;

public class SpinWords {

    public static String spinWords(String sentence) {

        //In a String senstence, reverse the order of the letters of all words 5 or more characters

        //Use .split to split the sentence into an array using regex \\s (a space)
        String[] wordsInSentence = sentence.split("\\s");

        String spunSentence="";
        String trimSpunSentence="";


        //use the StringBuilder and an if statement to only spin wrods five or more chacters
        for (String word:wordsInSentence){
            StringBuilder sb = new StringBuilder(word);
            if(word.length()>4){
                sb.reverse();
            }
            spunSentence += sb.toString()+" ";
            trimSpunSentence = spunSentence.trim();
        }

        return trimSpunSentence;
    }
}
