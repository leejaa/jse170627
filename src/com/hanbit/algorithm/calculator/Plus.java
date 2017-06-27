package com.hanbit.algorithm.calculator;

import java.util.Scanner;

public class Plus{
	public static void main(String[] args){
		System.out.println("계산기 입니다..");

		Scanner s = new Scanner(System.in);
		//String name = s.next();
		//double dollar = s.nextDouble();
		System.out.println("첫번째 숫자를 입력해주세요");
		int a=s.nextInt();
		System.out.println("두번째 숫자를 입력해주세요");
		int b=s.nextInt();
		int c = a+b;
		double d = (double)a/b*100;
		double d2 = Math.round(d);
		double d3 = d2/100.00;
	
		int e = 0;
		if(a>b){
			e = a-b;
		}else{
			e = b-a;	
		}
		
		
	
		System.out.println("두 숫자의 합은 " + c + "입니다");
		System.out.println("두 숫자의 곱은 " + a*b + "입니다");
		System.out.println("두 숫자를 나눈값은 " + d3 + "입니다");
		System.out.println("두 숫자를 A 값은 " + e + "입니다");
		
		
	}
}