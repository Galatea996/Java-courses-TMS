package HomeWork10.Task1;

/*
1. Написать программу со следующим функционалом:
На вход передать строку (будем считать, что это номер документа).
Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.
- Вывести на экран в одну строку два первых блока по 4 цифры.
- Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
- Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
- Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
- Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
- Проверить начинается ли номер документа с последовательности 555.
- Проверить заканчивается ли номер документа на последовательность 1a2b.
Все эти методы реализовать в отдельном классе в статических методах,
которые на вход (входным параметром) будут принимать вводимую на вход
программы строку.
 */

public class Main {
    public static void main(String[] args) {

/**    Вывести на экран в одну строку два первых блока по 4 цифры */
        FourDigits theFirstTwoBlocksOfFourDigits = new FourDigits();
        theFirstTwoBlocksOfFourDigits.sendMessage();
        theFirstTwoBlocksOfFourDigits.twoBlocks();

/**    Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *). */
        NumberDoc blocksOfThreeLettersAreReplacedWithSymbols = new NumberDoc();
        blocksOfThreeLettersAreReplacedWithSymbols.sendMessage();
        blocksOfThreeLettersAreReplacedWithSymbols.replacingThreeLettersInBlocks();

/**    Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре. */
        OnlyLowercaseLetters generousLettersLower = new OnlyLowercaseLetters();
        generousLettersLower.sendMessage();
        generousLettersLower.lettresLower();

/**    Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder). */
        OnlyHighcaseLetters generousLettersHigh = new OnlyHighcaseLetters();
        generousLettersHigh.sendMessage();
        generousLettersHigh.lettersHigh();

/**   Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
      Проверить начинается ли номер документа с последовательности 555.
      Проверить заканчивается ли номер документа на последовательность 1a2b. */
        LastThreeMetodsSequence absTestSequence = new LastThreeMetodsSequence();
        absTestSequence.sendMessage();
        LastThreeMetodsSequence.sequenceAbc("abc");
        LastThreeMetodsSequence.sequenceNum(555);
        LastThreeMetodsSequence.sequenceStr("1a2b");

    }

}
