package com.example.lesson08;

public class DemoMaximum2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int maximum;
        if (a > b) {
            maximum = a;
        } else {
            maximum = b;
        }
        System.out.println(maximum);
    }
}
