package com.example.lesson08;

public class ExPrintlnN {
    public static void main(String[] args) {
        String string;
        int nr;
        if (args.length == 2) {
            string = args[0];
            nr = Integer.parseInt(args[1]);
        } else {
            // facile pour tester
            string = "hello world";
            nr = 4;
        }
        printlnN(string, nr);
    }

    private static void printlnN(String string, int nr) {
        for (int i = 0; i < nr; ++i) {
            System.out.println(string);
        }
    }
}
