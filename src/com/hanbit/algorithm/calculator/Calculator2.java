package com.hanbit.algorithm.calculator;

import java.util.Scanner;
public class Calculator2{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first number \n");
		int num1=s.nextInt();
		System.out.print("Enter second number \n");
		int num2=s.nextInt();
		System.out.print("Enter opcode\n");
		String opcode=s.next();
		int result=0;
		if(opcode.equals("+")){
			result=num1+num2;
		}else if(opcode.equals("-")){
			result=num1-num2;
		}else if(opcode.equals("*")){
			result=num1*num2;
		}else{
			result=num1/num2;
		}
		
		System.out.print(String.format("결과값은   %d  %s  %d  =  %d \n", num1,opcode,num2,result));
	}
}