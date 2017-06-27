package com.hanbit.algorithm.grade;

import java.util.Scanner;
class GradeReport2{
	public static void main(String[] args){
			Scanner s = new Scanner(System.in);
			//name, kor, eng, math
			//total, avg
			//홍길동 : B
			String name="", result="", ment="";
			int kor=0, eng=0, math=0, total=0, avg=0 ;
			
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
			
			
			
			switch(avg/10){
				case 9 :
				case 10 :
					result="A";
					ment=" A학점입니다. 장학금 대상입니다 !"; 
					break;
				case 8 :
					result="B";
					ment="B학점입니다. 3학점이수 성공!";
					break;
				case 7 :
					result="C";
					ment="C학점입니다. 2학점 이수 성공!"; 
					break;
				case 6 :
					result="D";
					ment="D학점입니다. 1학점 이수 성공!";
					break;
				case 5 :
					result="E";
					ment="E학점입니다. ";
				default :
					result="F";
					ment="학사경고 !"; 
					break;
			}
			
			System.out.print("*****************************\n");
			System.out.print("이름     총점     평균   등급\n");
			System.out.print("-------------------------------\n");
			System.out.print(String.format("|%s| |%d|    |%d|   |%s|\n", name, total, avg, result));
			System.out.print("*****************************\n");
			System.out.print(ment);
			
	}
	
}