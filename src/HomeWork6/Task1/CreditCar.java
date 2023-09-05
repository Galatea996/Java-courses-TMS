package HomeWork6.Task1;

public class CreditCar {
    int numberAccaunt;
    double summCurrent;
    public void addSumm(double mySumm) {
        summCurrent = summCurrent + mySumm;
    }
    public void takeOff(double takeSumm){
        summCurrent = summCurrent - takeSumm;
    }
    public void showInformation(){
        System.out.println("Number accounts: " + numberAccaunt);
        System.out.println("Current sum: " + summCurrent);
    }
}
