/*
. По введенному номеру определить цвет радуги (1 –
красный, 4 – зеленый и т. д.).
 */

import  java.util.Scanner;
public class Rainbow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input color rainbow: ");
        int r = scanner.nextInt();
        switch (r) {
            case 1:
                System.out.println("Color- read");
                break;
            case 2:
                System.out.println("Color- orange");
                break;
            case 3:
                System.out.println("Color- yellow");
                break;
            case 4:
                System.out.println("Color- green");
                break;
            case 5:
                System.out.println("Color- blue");
                break;
            case 6:
                System.out.println("Color- bluish");
                break;
            case 7:
                System.out.println("Color- purple");
                break;
            default:
                System.out.println("There is no such color with number: " + r + " !!" );
        }
    }
}
