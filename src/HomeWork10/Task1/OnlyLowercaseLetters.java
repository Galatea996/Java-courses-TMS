package HomeWork10.Task1;

import HomeWork10.Task1.GeneralNumberDoc;

public class OnlyLowercaseLetters extends GeneralNumberDoc {

    @Override
    public void sendMessage() {
        super.sendMessage();
        System.out.println("\n******* Letters in the format yyy/yyy/y/y in lower case: *******");
    }

    public void lettresLower() {
        StringBuilder lettersMin = new StringBuilder();
        for (int i = 0; i < stringNumberDoc.length(); i++) {
            char character = stringNumberDoc.charAt(i);
            if (Character.isLetter(character)) {
                char lowerLetters = Character.toLowerCase(character);
                lettersMin.append(lowerLetters);
            }
        }
            lettersMin.insert(3, '/');
            lettersMin.insert(7, '/');
            lettersMin.insert(9, '/');
           System.out.println( "Letters: " + lettersMin + "\n");
        }
    }


