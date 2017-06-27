package com.hanbit.algorithm.member;

import java.util.Scanner;
public class SSN{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("주민등록번호를 입력해주세요\n");
		String ssn=s.next();
		char ch = ssn.charAt(7);
		System.out.print("당신의 이름을 입력해주세요\n");
		String name=s.next();
		
		String birth = ssn.substring(0,2);
		System.out.print("birth : "+ birth);
		int age = 0;
		
		
		if(Integer.parseInt(birth)>=17){
			age = 2017-Integer.parseInt(birth)-1900+1;
		}else{
			age = 2017-Integer.parseInt(birth)-2000+1;
		}
			
		
		
		
		String gender = "";
		switch(ch){
			case '1' : case '3' :
				gender = "남자"; 
				break;
			case '2' : case '4' :
				gender = "여자";
				break;
			case '5' : case '6' :
				gender = "외국인";
				break;
			default :
				gender = "기타";
				break;
			}
			
		System.out.print(String.format("이름 : %s / 나이 : %s / 성별 : %s ", name, age, gender ));
	}
}