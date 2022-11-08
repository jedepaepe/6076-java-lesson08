package com.example.lesson08;

public class DemoMaximum3 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int maximum = max(a, b);
        System.out.println(maximum);
    }

    private static int max(int a, int b) {
        int result;
        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        return result;
    }
}
