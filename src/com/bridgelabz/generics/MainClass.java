package com.bridgelabz.generics;

public class MainClass {
    public static void main(String[] args) {

        MaxValue intmax = new MaxValue();
        System.out.println("Test case 1");
        intmax.maxValue(1,2,3);
        System.out.println("Test case 2");
        intmax.maxValue(5,6,4);
        System.out.println("Test case 3");
        intmax.maxValue(7,10,8);

    }
}

