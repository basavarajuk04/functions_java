package javabasava.functions;
import java.util.Scanner;

public class sequence2 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        number = sc.nextInt();

        number = add(number, 2);
        number = subtract(number, 1);
        number = multiply(number, 3);
        number = divide(number, 2);

        System.out.println("Final Result: " + number);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("Division by zero");
        }
    }
}

