package com.bridgelabz.generics;

public class MainClass {
    public static void main(String[] args) {

        MaxValue stringMax = new MaxValue();
        System.out.println("Test case 1");
        stringMax.maxValue("Apple","Peach","Banana");
        System.out.println("Test case 2");
        stringMax.maxValue("Peach","Banana","Apple");
        System.out.println("Test case 3");
        stringMax.maxValue("Banana","Apple","Peach");

    }
}

