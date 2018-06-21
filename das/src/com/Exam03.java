package com;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input Number >>>");
		
		int n = sc.nextInt();
		
		int[] data = new int[n];
		
		for(int i=0; i< n ; i++){
			System.out.print("data ["+i+"] : ");
			data[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n ; i++){
			System.out.print(data[i] + " ");
		}
		
		System.out.println();
		
		int temp = data[n-1];
		for(int i = n-1 ; i >= 1 ;i--){
			data[i] = data[i-1];
		}
		data[0] = temp;
		
		for(int i = 0; i < n ; i++){
			System.out.print(data[i] + " ");
		}
		
		System.out.println();
		
		sc.close();
	}
}
