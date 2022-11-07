package com.example.lesson08;

public class ExMaximumIntArray {
    public static void main(String[] args) {
        int[] array;
        if (args.length > 0) {
            array = new int[args.length];
            for (int i = 0; i < args.length; ++i) {
                array[i] = Integer.parseInt(args[i]);
            }
        } else {
            // facilite le test (pas besoin de edit configuration ...)
            array = new int[] { 1, 5, 6 };
        }

        System.out.println(maximum(array));
    }

    private static int maximum(int[] array) {
        int result = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (array[i] > result) {
                result = array[i];
            }
        }
        return result;
    }
}
