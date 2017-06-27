package com.hanbit.algorithm.calculator;

import java.util.Scanner;

public class Calculator{
	public static void main(String[] args){
		System.out.print("계산기 입니다..\n");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first Integer..\n");
		int num1=s.nextInt();
		System.out.print("Enter second Integer..\n");
		int num2=s.nextInt();
		System.out.print("Select Opcode..\n 1.+ 2.- 3.* 4./ \n");
		int opcode=s.nextInt();
		double result=0;
		if(opcode==1){
			result=num1+num2;
		}else if(opcode==2){
			if(num1>num2){
			result=num1-num2;
			}else{
			result=num2-num1;
			}
		}else if(opcode==3){
			result=num1*num2;
		}else if(opcode==4){
			if(num1<num2){
			result=num1%num2/100;
			}else{
			result=(num1/num2) + (num1%num2)/100.00;
			}
		}
		
		System.out.print("result : "+result);
			
	}
}