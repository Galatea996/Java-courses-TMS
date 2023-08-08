package HomeWork3;

public class Fibonachi {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = a + b;
        System.out.print(a + " " + b + " ");
        while (c < 10){
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }
}
