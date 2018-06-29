package com;

import java.util.Scanner;

public class Exam02 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input Number >>>");
		
		String inputString = sc.nextLine();
		//int inputNum = sc.nextInt();
		
		System.out.println("String = '"+inputString+"'");
		//System.out.println("Number = '"+inputNum+"'");
		
		Exam02 ex = new Exam02();
		//String maskTelNo = ex.getMaskTelNo(inputString);
		
		String maskEmailAddr = ex.getMaskEmailAddr(inputString);
		System.out.println(maskEmailAddr);
		
		sc.close();
	}
	
	
	public String getMaskEmailAddr(String inputString){
		StringBuffer maskEmailAddr = new StringBuffer();

		int idx = inputString.indexOf("@");
		
		if(idx > 0){
			String strEmail = inputString.substring(0,idx);
			
			if(strEmail.length() > 2){
				maskEmailAddr.append(inputString.substring(0,2));
				
				for(int i = 0 ; i < strEmail.length()-2;i++ ){
					maskEmailAddr.append("*");
				}
			}else{
				maskEmailAddr.append(strEmail);
			}
			
			maskEmailAddr.append(inputString.substring(idx));
		}else{
			maskEmailAddr.append(inputString);
		}
		
		
		return maskEmailAddr.toString();		
	}
	
	public String getMaskTelNo(String inputString){
		String toTelNo1 = "";
		String toTelNo2 = "";
		String toTelNo3 = "";
		int iTel = inputString.indexOf("-");
		if(iTel > 0){
			toTelNo1 = inputString.substring(0,iTel+1);
		}
		System.out.println(" 1 : "+toTelNo1);
		int iTel2 = inputString.indexOf("-",iTel+1);		
		if(iTel2 > 0)
		{
			toTelNo2 = inputString.substring(iTel+1,iTel2);
			if(toTelNo2.length() > 2){
				toTelNo2 = inputString.substring(iTel+1,iTel2-2)+"**-";
			}else{
				toTelNo2 = inputString.substring(iTel+1,iTel2+1);
			}
			
			toTelNo3 = inputString.substring(iTel2+1);
			if(toTelNo3.length() > 2){
				toTelNo3 = inputString.substring(iTel2+1,inputString.length()-2)+"**";
			}
		}		
		System.out.println(" 2 : "+toTelNo2);		
		System.out.println(" 3 : "+toTelNo3);
		System.out.println(toTelNo1+toTelNo2+toTelNo3);
		
		return toTelNo1+toTelNo2+toTelNo3;
	}
}
