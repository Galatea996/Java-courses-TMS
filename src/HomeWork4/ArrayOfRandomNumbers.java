package HomeWork4;
/*Создайте и заполните массив случайным числами и выведете
максимальное, минимальное и среднее значение. Для генерации случайного
числа используйте метод Math.random(). Пусть будет возможность создавать
массив произвольного размера. Пусть размер массива вводится с консоли.
 */
import java.util.Scanner;
import java.lang.Math;
public class ArrayOfRandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        int min = Integer.MAX_VALUE;
        int max = arr[0];
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 11);
            System.out.print(arr[i] + " ");
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(" ");
        System.out.print("Min " + min);
        System.out.println(" ");
        System.out.print("Max " + max);

        for (int num : arr){
            sum += num;
        }
        double everage = sum / arr.length;
        System.out.println(" ");
        System.out.println("Everage " + everage);

    }
}

