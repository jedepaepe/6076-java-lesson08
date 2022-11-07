package com.example.lesson08;

public class ExMinimumInt {
    public static void main(String[] args) {
        int a, b;
        if (args.length == 2) {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        }
        else {
            // pour faciliter le test
            a = 16;
            b = 19;
        }

        System.out.println(minimum(a, b));
    }

    private static int minimum(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}
