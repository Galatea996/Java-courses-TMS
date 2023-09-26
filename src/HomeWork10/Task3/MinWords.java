package HomeWork10.Task3;

public class MinWords {
    public static void minLengthInString(String strokaMax){
        String [] words = strokaMax.split(" ");
        int minLeng = words[0].length();
        for (String wordShorts :words)
            if(wordShorts.length() < minLeng) {
                minLeng = wordShorts.length();
            }
        for (String wordShorts : words) {
            if(wordShorts.length() == minLeng){
                System.out.println("The shortest word: " + wordShorts);
            }
        }
    }
}
