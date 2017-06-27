package com.hanbit.algorithm.matrix;

public class MrSmith{
	public static void main(String[] args){
		
		
		String[][] mtx={
			{"Good Morning","Good Afternoon","Good Evening","Good Bye"},
			{"Mr.","Mrs.","Miss","My"},
			{"Smith","Alex","John","James"}
			};
			System.out.print(mtx[0][2]+"\t"+mtx[1][2]+"\t"+mtx[2][1]+"\n");
			
		int[][] mtx2=new int[5][5];
		
		for(int i=0;i<mtx2.length;i++){
			for(int j=0;j<mtx2[i].length;j++){
				System.out.print("["+i+","+j+"]");
				}
			System.out.print("\n");
		}
	}
}