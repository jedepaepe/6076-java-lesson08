package com.example.lesson08;

public class DemoSum {
    public static void main(String[] args) {
        int[] list = { 1, 10, 2 };
        int sum = sum(list);
        System.out.println(sum);
    }

    public static int sum(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; ++i) {
            result += array[i];
        }
        return result;
    }
}
