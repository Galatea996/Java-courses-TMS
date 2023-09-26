package HomeWork10.Task2;

public class Secuance extends GeneralNumberDoc {

    /**
     * Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
     */
    public static void sequenceAbc(String valAbc) throws SequenceAbcException {
        System.out.println("******* The result of checking the sequence for the content of 'abc': *******");
        retVal = stringNumberDoc.regionMatches(5, valAbc, 0, 3);
//        System.out.println("Result: " + retVal + "\n");
        throw new SequenceAbcException("No matches");
    }

    /**
     * Проверить начинается ли номер документа с последовательности 555.
     */
    public static void sequenceNum(int valNum) throws SequenceNumException{
        System.out.println("******* The result of checking the sequence for the content of '555': *******");
        retVal = stringNumberDoc.regionMatches(0, String.valueOf(valNum), 0, 3);
//        System.out.println("Result: " + retVal + "\n");
        throw new  SequenceNumException("No matches");
    }

    /**
     * Проверить заканчивается ли номер документа на последовательность 1a2b.
     */
    public static void sequenceStr(String valStr)throws SequenceStrException {
        System.out.println("******* The result of checking the sequence for the content of '1a2b': *******");
        retVal = stringNumberDoc.regionMatches(18, valStr, 0, 4);
//      System.out.println("Result: " + retVal + "\n");
        throw new SequenceStrException("No matches");
    }

}


