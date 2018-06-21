package com;

import java.util.Scanner;

public class Exam04 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input Number >>>");
		int n = sc.nextInt();
		int[] data = new int[n];
		
		int sum = 0 ;
		int max = Integer.MIN_VALUE;

		for(int i = 0 ; i< n; i++){
			System.out.print("data ["+i+"] : ");
			data[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < n ; i++){
			if(max < data[i]){
				max = data[i];
			}
			
			sum += data[i];
		}
		
		System.out.println("sum : "+sum);
		System.out.println("max : "+max);
		
		sc.close();
				
	}
}
