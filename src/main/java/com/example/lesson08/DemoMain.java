package com.example.lesson08;

public class DemoMain {
    public static void main(String[] args) {
        if (args.length == 2) {
            double x = Double.parseDouble(args[0]);
            double y = Double.parseDouble(args[1]);
            double somme = x + y;
            System.out.println(x + " + " + y + " = " + somme);
        } else {
            System.out.println("Veuillez donner deux nombres en argument");
        }
    }
}
