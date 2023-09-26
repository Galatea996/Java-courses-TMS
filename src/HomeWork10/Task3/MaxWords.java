package HomeWork10.Task3;

public class MaxWords {
    public static void maxLengthInString(String strokaMax){
        String [] wordsMax = strokaMax.split(" ");
        int maxLeng = wordsMax[0].length();
        for (String wordlongest : wordsMax)
            if(wordlongest.length() > maxLeng) {
                maxLeng = wordlongest.length();
            }
        for (String wordLongest : wordsMax) {
            if(wordLongest.length() == maxLeng){
                System.out.println("The longest word: " + wordLongest);
            }
        }
    }
}
