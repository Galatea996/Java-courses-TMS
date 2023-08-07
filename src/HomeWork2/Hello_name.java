package HomeWork2;

import java.util.Scanner;
public class Hello_name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        System.out.print("How old a you? ");
        int age = scanner.nextInt();
        System.out.print("HomeWork2.Hello " + name + " age " + age);
    }
}
