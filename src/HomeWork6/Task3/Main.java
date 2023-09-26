package HomeWork6.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DisBankomat atm = new DisBankomat();
        int sum = atm.addingMoney();
        boolean x = atm.isWithdrawMoney(sum, scan.nextInt());
        System.out.println(x);
        int b = atm.withdrawMoney(x, sum, scan.nextInt());
        System.out.println(b);
    }
}
