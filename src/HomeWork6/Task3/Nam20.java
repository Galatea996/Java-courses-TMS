package HomeWork6.Task3;

import java.util.Scanner;

public class Nam20 {
    Scanner scan = new Scanner(System.in);

    int value20;
    int sev20;
    int sum20;
    public Nam20(){
        value20 = 20;
        System.out.print("Введите кол купюр (наминал 20): ");
        sev20 = scan.nextInt();
    }

    public int put20(){
        sum20 = value20 * sev20;
        return sum20;
    }
}
