package HomeWork6.Task3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int[] a = {20, 50, 100};
        int[] b = {10, 5, 10};
        int sum = 0;
        int secondsum = 0;
        for (int i = 0; i < 5; i++) {
            secondsum = secondsum + a[0];
            b[0]--;
        }
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i] * b[i];

        }
        System.out.println(secondsum);
        System.out.println(sum);
        b[0]= b[0] + scanner.nextInt();
        System.out.println(b[0]);

        if(secondsum%10==0){
            if(secondsum<sum){
                if(secondsum>0){
                    
                }
            }
        }

       /* for (int i = 0; i < a.length; i++) {
            sum = sum + a[i] * b[i];
        }*/
    }
}

