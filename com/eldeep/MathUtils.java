package com.eldeep;


public class MathUtils {
    public static double average(int a, int b) {
       double result = (a+b);
       System.out.println(result/2);
        return result/2;
    }

    public static void main(String[] args) {
        System.out.println(average(2,1));
    }
}