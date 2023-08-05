/*
Написать программу для вывода названия поры года по
номеру месяца. При решении используйте оператор if-else-if.
 */

import java.util.Scanner;

public class MonthOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number month: ");
        int month = scanner.nextInt();
      //int month = 30;
      // зима - 12, 1, 2
      // весна - 3, 4, 5
      // лето - 6, 7, 8
      // осень - 9, 10, 11
      if (month == 12 || month == 1 || month == 2) {
          System.out.println("Winter");
      } else if (month == 3 || month == 4 || month == 5) {
          System.out.println("Spring");
      } else if (month == 6 || month == 7 || month == 8) {
          System.out.println("Summer");
      } else if (month == 9 || month == 10 || month == 11) {
          System.out.println("Autumn");
      } else {
          System.out.println("Month entered incorrectly!!");
        }
    }
}
