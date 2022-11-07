package com.example.lesson08;

public class ExMaximumDouble {
    public static void main(String[] args) {
        double a, b;
        if (args.length == 2) {
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[1]);
        }
        else {
            // pour faciliter le test (pas besoin d'aller dans configuration ...)
            a = 16.3;
            b = 19.2;
        }

        System.out.println(maximum(a, b));
    }

    private static double maximum(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
