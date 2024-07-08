package javabasava.functions;
public class sequence1 {
    static int val;

    public static int add(int num) {
        val = val + num;
        return val;
    }

    public static int sub(int num) {
        val = val - num;
        return val;
    }

    public static void main(String[] args) {
        System.out.println(add(10));
        System.out.println(sub(5));
    }
}