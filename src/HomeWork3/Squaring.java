package HomeWork3;
/*
Составьте программу, выводящую на экран квадраты чисел
от 10 до 20 включительно.
 */
public class Squaring {
    public static void main(String[] args) {
        for (int i = 10; i <= 20; i++) {
       System.out.println("Число " + i + " в квадрате равно " + (int) Math.pow(i, 2));
        }
    }
}
