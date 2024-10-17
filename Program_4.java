package com.tandemloop.programs;

public class Program_4 {
	public static void main(String[] args) {
		int[] input= {1,2,8,9,12,46,76,82,15,20,30};
		int[] count=new int[9];
		
		for(int num:input) {
			for(int i=1;i<=9;i++) {
				if(num%i==0) {
					count[i-1]++;
				}
			}
		}
		System.out.print("{");
		for(int i=0;i<count.length;i++) {
			System.out.print((i+1)+":"+count[i]);
			if(i<count.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("}");
	}

}
