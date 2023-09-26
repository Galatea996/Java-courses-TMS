package HomeWork6.Task1;

public class Program {
    public static void main(String[] args) {
        CreditCar cart1 = new CreditCar();
        cart1.numberAccaunt = 1;
        cart1.summCurrent = 50.30;

        CreditCar cart2 = new CreditCar();
        cart2.numberAccaunt = 2;
        cart2.summCurrent = 25.00;

        CreditCar cart3 = new CreditCar();
        cart3.numberAccaunt = 3;
        cart3.summCurrent = 100.20;

        cart1.addSumm(30.20);
        cart2.addSumm(100.23);
        cart3.addSumm(10.50);

        cart1.showInformation();
        cart2.showInformation();
        cart3.showInformation();


    }
}
