package javaexperiment.test;

public class TestFibonacci {

    public static void main(String[] args) {
        System.out.println(getFibonacci(8));
        System.out.println(getFibonacci(7));
    }
    public static int getFibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int a = 1;
        int b = 1;
        int res = a + b;

        for (int i = 3; i <= n; i++) {
            res = a + b;
            a = b;
            b = res;
        }
        return res;
    }

}
