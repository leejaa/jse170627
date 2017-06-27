package com.hanbit.algorithm.calculator;

import java.util.Scanner;
public class TaxCalculator{
	public static void main(String[] args){
		
		double TAX_RATE = 0.097;
		Scanner s = new Scanner(System.in);
		System.out.print("이름을 입력해주세요\n");
		String name = s.next();
		System.out.print("연봉을 입력해주세요\n");
		int money = s.nextInt();
		
		System.out.print(String.format("%s 님께서 납부하실 세금은 %d 원 입니다\n", name, Math.round(money*TAX_RATE)));
	}
}