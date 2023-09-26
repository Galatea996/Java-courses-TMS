package HomeWork10.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to find the maximum and minimum word in a sentence: ");
        String storkaForFindingMinAndMaxWords = scanner.nextLine();
        MinWords.minLengthInString(storkaForFindingMinAndMaxWords);
        MaxWords.maxLengthInString(storkaForFindingMinAndMaxWords);


    }
}
