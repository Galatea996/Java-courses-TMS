package HomeWork4;
/*
Создайте массив целых чисел. Удалите все вхождения заданного
числа из массива. Пусть число задается с консоли (класс Scanner).
Если такого числа нет - выведите сообщения об этом.
В результате должен быть новый массив без указанного числа.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class RemoveRumbersFromArrayOptionOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = scan.nextInt();
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(100);
        arr.add(58);
        arr.add(66);
        arr.add(4);
        arr.remove(num);

        System.out.println(arr);
   }

}
