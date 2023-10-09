package HomeWork4;
/*
Создайте массив целых чисел. Удалите все вхождения заданного
числа из массива. Пусть число задается с консоли (класс Scanner).
Если такого числа нет - выведите сообщения об этом.
В результате должен быть новый массив без указанного числа.
 */
import java.util.Arrays;
import java.util.Scanner;
public class RemoveRumbersFromArrayOptionTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scan.nextInt();
        int[] arr = new int[]{1, 2, 5, 7, 6, 33, 888, 6666, 555, 23, 7};
        int[] newarr = null;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == num) {
                newarr = new int[arr.length - 1];
                int a;
                for (a = 1; a < i; a++) {
                    newarr[a] = arr[a];
                }
                System.arraycopy(arr, i + 1, newarr, i, arr.length - 1 - i);
                break;
            }
        }
            System.out.println(Arrays.toString(newarr));

        }
    }

