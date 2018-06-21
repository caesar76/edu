package com;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args){
		
		System.out.println("Input Number >>>");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean isPrime;
		for(int i = 2 ; i <= n ; i++){
			isPrime = true;
			for(int j = 2 ; j*j <= i; j++){
				if(i % j == 0){
					isPrime = false;
					break;
				}
			}
			
			if(isPrime){
				System.out.print(i+ " ");
			}
		}
		
		sc.close();
	}
}
