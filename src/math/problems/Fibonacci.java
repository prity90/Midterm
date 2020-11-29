package math.problems;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

     int a = 0, b=1, c=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the number we want up to: ");
        int num = sc.nextInt();

        while (a<=num){
            a = b+c;
            if (a>=num)
                break;
            System.out.println(a);
            b=c;
            c=a;

        }
    }
}
