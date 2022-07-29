package com.bridgelabz.generics;

public class MainClass {
    public static void main(String[] args) {

        MaxValue floatMax = new MaxValue();
        System.out.println("Test case 1");
        floatMax.maxValue(2.3F,5.0F,3.3F);
        System.out.println("Test case 2");
        floatMax.maxValue(1.0F,8.9F,4.0F);
        System.out.println("Test case 3");
        floatMax.maxValue(7.0F,1.5F,8.0F);

    }
}

