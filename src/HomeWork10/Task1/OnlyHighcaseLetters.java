package HomeWork10.Task1;

import HomeWork10.Task1.GeneralNumberDoc;

public class OnlyHighcaseLetters extends GeneralNumberDoc {

    @Override
    public void sendMessage() {
        super.sendMessage();
        System.out.println("******* Letters in the format yyy/yyy/y/y in high case: *******");
    }
    public void lettersHigh() {
        StringBuilder lettersMax = new StringBuilder();
        for (int i = 0; i < stringNumberDoc.length(); i++) {
            char character = stringNumberDoc.charAt(i);
            if (Character.isLetter(character)) {
                char highLetters = Character.toUpperCase(character);
                lettersMax.append(highLetters);
            }
        }
        lettersMax.insert(3, '/');
        lettersMax.insert(7, '/');
        lettersMax.insert(9, '/');
        System.out.println("Letters :" + lettersMax + "\n");
    }
}

