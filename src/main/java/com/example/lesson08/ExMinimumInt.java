package com.example.lesson08;

public class ExMinimumInt {
    public static void main(String[] args) {
        double a, b;
        if (args.length == 2) {
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[1]);
        }
        else {
            // pour faciliter le test
            a = 16.3;
            b = 19.2;
        }

        System.out.println(minimum(a, b));
    }

    private static double minimum(double a, double b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}
