package HomeWork10.Task1;

public class FourDigits extends GeneralNumberDoc {


    public void sendMessage() {
    System.out.println("******* The first two blocks with numbers: *******");
}
    public void twoBlocks() {
        String firstTwoBlock = stringNumberDoc.substring(0, 4);
        String secondTwoBlock = stringNumberDoc.substring(9, 13);
        System.out.print("First: " + firstTwoBlock + " " + "Second: " + secondTwoBlock + "\n");
    }


}


