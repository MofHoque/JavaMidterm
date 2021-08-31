package math.problems;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import java.util.Scanner;

public class Factorial {

    /*
     Write a method to return the Factorial of any given number using Recursion as well as Iteration

     Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = stdin.nextInt();

        int factorial = fact(num);

        System.out.println("Factorial of entered number: " + factorial);

    }
    static int fact(int n)
    {   int output;
        if(n==1){
            return 1;
        }
        output = fact(n-1)*n;
        return output;
    }
}
