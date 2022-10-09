package com.scott.calculator;

public class myCalculator {

    public myCalculator() {

    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public int division(int num1, int num2) {
        return num1 / num2;
    }

    public double division(double num1, double num2) {
        return num1 / num2;
    }

    public int modulo(int num1, int num2) {
        return num1 % num2;
    }

    public double modulo(double num1, double num2) {
        return num1 % num2;
    }

    public static void main(String[] args) {
        myCalculator myCalculator = new myCalculator();
        System.out.println(myCalculator.add(5,7));
        System.out.println(myCalculator.add(5.0,7));
        System.out.println(myCalculator.subtract(45,11));
        System.out.println(myCalculator.subtract(45.0,11.0));
        System.out.println(myCalculator.multiply(5,5));
        System.out.println(myCalculator.multiply(5.0,5.5));
        System.out.println(myCalculator.division(5,5));
        System.out.println(myCalculator.division(5.0,5.0));
        System.out.println(myCalculator.modulo(6,5));
        System.out.println(myCalculator.modulo(6.0,5.0));
        System.out.println(myCalculator.multiply(22,5));

    }
}