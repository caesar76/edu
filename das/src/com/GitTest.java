package com;

public class GitTest {
	
	public static void main(String[] args){
		System.out.println("Git Start");
		
		for(int i = 1 ; i <=100 ; i++){
			System.out.print(i + "ÀÇ ¾à¼ö :");
			
			for(int j = 1 ; j <= i ; j++){
				if(i % j == 0){
					System.out.print(j +",");
				}
			}
			System.out.println();
		}
	}
}
