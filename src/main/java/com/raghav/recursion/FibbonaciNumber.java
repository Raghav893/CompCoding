package com.raghav.recursion;



public class FibbonaciNumber {
    public static int series(int n ){
        //BASE CASE
        if (n == 0) {return 0;}
        if (n==1){return 1;}
        //RECURSIVE CALL
        return series(n-1)+series(n-2);

    }
    public static void main(String[] args) {
        System.out.println(series(4));
    }
}
