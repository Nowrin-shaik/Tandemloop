package com.tandemloop.programs;

import java.util.*;
public class Program_1 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a num1:");
	double a=sc.nextDouble();
	System.out.println("Enter a num2:");
	double b=sc.nextDouble();
	sc.nextLine();
	
	System.out.println("Enter type of operation to be performed(Addition, Subtraction, Multiplication, Division):");
	String typeOfOperation=sc.nextLine();
	
	double result;
	
	switch(typeOfOperation) {
	case "Addition":
		result=a+b;
		System.out.println(a + " + " + b + " = " + result);
		break;
	case "Subtraction":
		result=a-b;
		System.out.println(a + " - " + b + " = " + result);
		break;
	case "Multiplication":
		result=a*b;
		System.out.println(a + " * " + b + " = " + result);
		break;
	case "Division":
		if(b!=0) {
		result=a/b;
		System.out.println(a + " / " + b + " = " + result);
		} else {
			System.out.println("Division by zero is not allowed!");
		}
		break;
	default:
		System.out.println("Invalid operator!");
	}
	sc.close();
	}
	
}
