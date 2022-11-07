package com.example.lesson08;

public class DemoMaximum1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
