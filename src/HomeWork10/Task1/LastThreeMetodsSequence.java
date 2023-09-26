package HomeWork10.Task1;

public class LastThreeMetodsSequence extends GeneralNumberDoc{

//    @Override
//    public void sendMessage() {
//        super.sendMessage();
//        System.out.println("The result of checking for a match 'abs': ");
//    }

    public static void sequenceAbc(String valAbc){
        System.out.println("******* The result of checking the sequence for the content of 'abs': *******");
        retVal = stringNumberDoc.regionMatches(0, valAbc, 0, 21);
        System.out.println("Result: " + retVal + "\n");
    }

//    Проверить начинается ли номер документа с последовательности 555.
    public static void sequenceNum(int valNum){
        System.out.println("******* The result of checking the sequence for the content of '555': *******");
        retVal = stringNumberDoc.regionMatches(0, String.valueOf(valNum), 0, 4);
        System.out.println("Result: " + retVal + "\n");
    }

//    Проверить заканчивается ли номер документа на последовательность 1a2b.
    public static void sequenceStr(String valStr){
        System.out.println("******* The result of checking the sequence for the content of '1a2b': *******");
        retVal = stringNumberDoc.regionMatches(18, valStr, 0,4);
        System.out.println("Result: " + retVal + "\n");
    }

}
