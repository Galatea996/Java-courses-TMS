package HomeWork6.Task3;

import java.util.Scanner;

public class Nam50 {
    Scanner scan = new Scanner(System.in);
    int value50;
    int sev50;

    int sum50;
    public Nam50(){
        value50 = 50;
        System.out.print("Введите кол купюр (наминал 50): ");
        sev50 = scan.nextInt();

    }

    public int put50(){
        sum50 = value50 * sev50;
        return sum50;
    }
}
