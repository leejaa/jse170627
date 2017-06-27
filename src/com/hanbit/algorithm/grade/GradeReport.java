package com.hanbit.algorithm.grade;

import java.util.Scanner;
class GradeReport{
	public static void main(String[] args){
			Scanner s = new Scanner(System.in);
			//name, kor, eng, math
			//total, avg
			//홍길동 : B
			String name="", result="";
			int kor=0, eng=0, math=0, total=0, avg=0;
			
			System.out.print("이름을 입력해주세요\n");
			name=s.next();
			System.out.print("국어점수를 입력해주세요\n");
			kor=s.nextInt();
			System.out.print("영어점수를 입력해주세요\n");
			eng=s.nextInt();
			System.out.print("수학점수를 입력해주세요\n");
			math=s.nextInt();
			total=kor+eng+math;
			avg=total/3;
			
			if(avg>=90){
				result="A";
			}else if(avg>=80){
				result="B";
			}else if(avg>=70){
				result="C";
			}else if(avg>=60){
				result="D";
			}else{
				result="F";
			}
			
			System.out.print("*****************************\n");
			System.out.print("이름     총점     평균   등급\n");
			System.out.print("-------------------------------\n");
			System.out.print(String.format("|%s| |%d|    |%d|   |%s|\n", name, total, avg, result));
			System.out.print("*****************************\n");
			
	}
	
}