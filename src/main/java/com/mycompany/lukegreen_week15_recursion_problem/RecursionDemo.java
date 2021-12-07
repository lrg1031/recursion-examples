package com.mycompany.lukegreen_week15_recursion_problem;

public class RecursionDemo {
    
    static void countDown(int num) {
    
        if(num != 0) {
            System.out.println("in-pass-num = " + num);
            countDown(num-1);
            System.out.println("re-pass-num = " + num);
        }
        
    }
    
    static int getSum(int num) {
    if(num != 0)
        return num+getSum(num-1);
    else
        return 0;
    }
    
    static int theSum(int num) {
    if(num >= 0)
        return 1+getSum(num-5);
    else
        return 0;
    }
    
    static int ok = 1;
    static int factorial(int n) {
        if(n != 0) {
            ok = ok * n;
            return factorial(n - 1);
        }
        else 
            return ok;
    }
    
    static int gcd(int x, int y) {
        
        if(x == y) {
            return y;
        }
        else if(x > y) {
            return gcd(x-y, y);
        }
        else {
            return gcd(x, y-x);
        }
        
    }
    
    public static void main(String[] args) {
        countDown(10);
        System.out.println(getSum(3));
        System.out.println(factorial(10));
        System.out.println(gcd(16, 12));
    }
    
}
