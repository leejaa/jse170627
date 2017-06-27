package com.hanbit.algorithm.sequence;

import java.util.Scanner;
public class Engine{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("메뉴를 골라주세요\n");
		String menu=s.next();
		while(true){
			System.out.print("0.종료 1.시작\n");
			switch(menu){
				case "0":
					System.out.print("시스템 종료!!");
				return;
				case "1":
					System.out.print("시스템 시작!!");
				break;
			}
		}
	}
}