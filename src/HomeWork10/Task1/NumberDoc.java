package HomeWork10.Task1;

public class NumberDoc extends GeneralNumberDoc{

    @Override
    public void sendMessage() {
        System.out.println("\n******* Changed letter blocks to ***: *******");
    }

    public void replacingThreeLettersInBlocks(){
        System.out.println(stringNumberDoc.replaceAll("[TmCKvm]", "*"));

    }
}

