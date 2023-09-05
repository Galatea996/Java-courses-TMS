package HomeWork6.Task3;

import java.util.Scanner;

public class Nam100 {
    Scanner scan = new Scanner(System.in);
    int value100;
    int sev100;

    int sum100;

    public Nam100(){
        value100 = 100;
        System.out.print("Введите кол купюр (наминал 100): ");
        sev100 = scan.nextInt();
    }

    public int put100(){
        sum100 = value100 * sev100;
        return sum100;
    }

}
