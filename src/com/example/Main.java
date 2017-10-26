package com.example;

public class Main {

//    You are climbing a stair case. It takes n steps to reach to the top.
//
//    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//
//    Note: Given n will be a positive integer.

    public static void main(String[] args) {
        int n = 44;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        int count = 1;
        int num1 = 0;
        int num2 = 0;
        int temp = 0;
        if (n == 1 || n == 2 || n == 3) {
            return n;
        }
        while (count < n) {
            if (count == 1) {
                num1 = 1;
            }
            if (count == 2) {
                num2 = 2;
            }
            if(count > 2){
                temp = num2;
                num2 = num1 + num2;
                num1 = temp;
            }
            count++;
        }
        return num1+num2;
    }
}
