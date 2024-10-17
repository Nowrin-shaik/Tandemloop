package com.tandemloop.programs;

import java.util.*;
public class Program_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Input:");
		int a=sc.nextInt();
		for(int i=0;i<a;i++) {
			int number=2*i+1;
			System.out.print(number);
			if(i<a-1) {
				System.out.print(",");
			}
		}
		sc.close();
	}

}
