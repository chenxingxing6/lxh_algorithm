package com.demo.month4;

/**
 * created by lanxinghua@2dfire.com on 2020/4/28
 * 阶乘
 */
public class FactorialTest {

    public static void main(String[] args) {
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
    }

    public static int factorial(int n){
        if (n <= 1){
            return n;
        }
        int subResult = factorial(n -1);
        return subResult * n;
    }
}
