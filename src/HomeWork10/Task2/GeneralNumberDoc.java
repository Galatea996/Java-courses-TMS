package HomeWork10.Task2;

public class GeneralNumberDoc {

    public static String stringNumberDoc = "6996-TmC-2023-Kmv-1a2b";
    public static boolean retVal = true;

/**    Вывести на экран в одну строку два первых блока по 4 цифры */
    public static void twoBlocks() {
        System.out.println("******* The first two blocks with numbers: *******");
        String firstTwoBlock = stringNumberDoc.substring(0, 4);
        String secondTwoBlock = stringNumberDoc.substring(9, 13);
        System.out.print("First: " + firstTwoBlock + " " + "Second: " + secondTwoBlock + "\n");
    }

/**   Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *). */
    public static void replacingThreeLettersInBlocks() {
        System.out.println("\n******* Changed letter blocks to '***': *******");
        System.out.println(stringNumberDoc.replaceAll("[TmCKvm]", "*"));
        System.out.println();
    }

/**   Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).*/
    public static void lettersHigh() {
        System.out.println("******* Letters in the format yyy/yyy/y/y in high case: *******");
        StringBuilder lettersMax = new StringBuilder();
        for (int i = 0; i < stringNumberDoc.length(); i++) {
            char character = stringNumberDoc.charAt(i);
            if (Character.isLetter(character)) {
                char highLetters = Character.toUpperCase(character);
                lettersMax.append(highLetters);
            }
        }
        lettersMax.insert(3, '/')
                .insert(7, '/')
                .insert(9, '/');
        System.out.println("Letters :" + lettersMax + "\n");
    }

/**    Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре. */
    public static void lettresLower() {
        System.out.println("******* Letters in the format yyy/yyy/y/y in lower case:*******");
        StringBuilder lettersMin = new StringBuilder();
        for (int i = 0; i < stringNumberDoc.length(); i++) {
            char character = stringNumberDoc.charAt(i);
            if (Character.isLetter(character)) {
                char lowerLetters = Character.toLowerCase(character);
                lettersMin.append(lowerLetters);
            }
        }
        lettersMin.insert(3, '/').
                insert(7, '/').
                insert(9, '/');
        System.out.println("Letters: " + lettersMin + "\n");
    }
}
