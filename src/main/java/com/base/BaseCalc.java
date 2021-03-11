package com.base;

public class BaseCalc {
    private int add(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    private double divide(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        System.out.println(new BaseCalc().divide(5, 2));
    }
}
