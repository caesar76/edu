package com;

public class Exam01 {
	public static void main(String[] args){
		int n = 100;
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
	}
}
