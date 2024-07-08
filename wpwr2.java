package javabasava.functions;
import java.util.Scanner;

public class wpwr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("mul result is:" + add(a, b));
    }

    public static int add(int num1, int num2) {
        return num1 * num2;
    }
}

