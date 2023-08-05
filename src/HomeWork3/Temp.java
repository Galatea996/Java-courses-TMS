/*
Для введенного числа t (температура на улице) вывести
Если t>–5, то вывести «Тепло».
Если –5>= t > –20, то вывести «Нормально».
Если –20>= t, то вывести «Холодно».
 */

import java.util.Scanner;
public class Temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input temp: ");
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("Warm");
        } else if (-5 >= t && t > -20) {
            System.out.println("Normal");
        } else if (-20 >= t){
            System.out.println("Cold");
        }
    }
}
