package math.problems;

import java.util.Scanner;

public class Fibonacci {

    /*
    Write a method that will print or return at least 40 Fibonacci numbers

      0,1,1,2,3,5,8,13
     */

    public static void main(String[] args) {
        int num, first_num=0, next_num = 1;

        System.out.println("Enter the number to print fibonacci series: ");
        Scanner stdin = new Scanner(System.in);
        num = stdin.nextInt();
        System.out.println("The fibonacci series are: " );
        System.out.print(first_num + " " + next_num);
        for(int i = 1; i<=num-2;i++){
            int sum = first_num + next_num;
            first_num = next_num;
            next_num = sum;

            System.out.print(" " + sum);
        }


    }


}
