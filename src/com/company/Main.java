package com.company;

public class Main {
    public static void main(String[] args) {
	// write your code here
        System.out.println("Answer is: " + hasEqualSum(1, -1, 0));
    }

    public static boolean hasEqualSum(int num1, int num2, int num3){
        boolean result;
        if(num1 + num2 == num3){
            result= true;
        }
        else{
            result= false;
        }
        return result;
    }
}
