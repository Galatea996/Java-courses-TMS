package HomeWork6.Task2;

public class Computer {
    public static void main(String[] args) {

        ComputerDescriptions comp = new ComputerDescriptions(5525.6, "RFG5");
        comp.ram = new RAM();
        comp.hdd = new HDD();

        comp.showInformation();
         ComputerDescriptions comp2 = new ComputerDescriptions(5225.36, "458HH", "FFGt8", 5, "Fyyy", 548, "Внешний");


comp2.showInformation();
    }
}


