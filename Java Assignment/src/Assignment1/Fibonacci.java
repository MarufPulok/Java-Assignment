package Assignment1;

import java.util.Scanner;

public class Fibonacci {

    static int a = 0, b = 1, c;

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("This Program Generates Fibonacci Series of N length");
        System.out.print("Enter N:");
        number = input.nextInt();
        System.out.print(a + " " + b);
        Fibonacci ob = new Fibonacci();
        ob.printFib(number-2);
    }

    void printFib(int i) {
        if (i >= 1) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
            printFib(i - 1);
        }

    }
}
