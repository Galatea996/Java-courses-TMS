package HomeWork4;
/*
ЭТО Я ЕГО МОДИФИЦИРУЮ!!!
Создайте массив целых чисел. Напишете программу, которая
выводит сообщение о том, входит ли заданное число в массив или нет.
Пусть число для поиска задается с консоли (класс Scanner).
 */
import java.util.Scanner;
public class CreateAnArrayTwo {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 9, 55, 88, 458, 747, 3, 6};
        Scanner scan = new Scanner(System.in);
        System.out.println("Input numder for check array: ");
        int num = scan.nextInt();

        for (int a : arr) {
            if (arr.equals(a)) {
                System.out.println("Yes");
                return;
            } else {
                System.out.println("No");
                return;
            }
        }
    }
}
