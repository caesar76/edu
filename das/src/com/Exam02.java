package com;

import java.util.Scanner;

public class Exam02 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input Number >>>");
		
		String inputString = sc.nextLine();
		int inputNum = sc.nextInt();
		
		System.out.println("String = '"+inputString+"'");
		System.out.println("Number = '"+inputNum+"'");
		
		sc.close();
	}
}
