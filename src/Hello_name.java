import java.util.Scanner;
public class Hello_name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inter a name: ");
        String name = scanner.nextLine();
        System.out.print("Hello: " + name);
    }
}