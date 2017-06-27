package com.hanbit.algorithm.application;

import java.util.Scanner;
public class Bmi{
		public static void main(String[] args){
			System.out.print("당신의 몸무게를 입력하세요\n");
			Scanner s = new Scanner(System.in);
			double weight = s.nextDouble();
			System.out.print("당신의 키를 입력하세요\n");
			double height = s.nextDouble();
			
			double height2 = height/100;
			
			double bmi = weight/height2/height2;
			
			String result = "";
			
			if(bmi-18.5<0){
				result = "저체중";
			}else if(bmi-24.9<0){
				result = "정상";
			}else if(bmi-29.9<0){
				result = "과체중";
			}else{
				result = "비만";
			}
			System.out.print("당신의 체질량지수는 " + bmi + "입니다..\n");
			System.out.print("당신은 " + result + "입니다 ..\n");
			System.out.print(String.format("당신은 %s 입니다 \n", result ));
		}
}