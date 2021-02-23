package com.mindtree.SimpleCalculator;

import java.util.Scanner;

public class Calculator {

	public static int addition(int a,int b) {
		int c=a+b;
		return c;
	}
	public static int subtraction(int a,int b) {
		int c=a-b;
		return c;
	}
    public static void main( String[] args )
    {
    	
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter firstNumber");
        int firstNumber=sc.nextInt();
        System.out.println("Enter secondNumber");
        int secondNumber=sc.nextInt();
        int sum=addition(firstNumber,secondNumber);
        int diff=subtraction(firstNumber,secondNumber);
        
        System.out.println("Sum is: "+sum);
        System.out.println("Difference is "+diff);
        
    }

}
