package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int point=s.nextInt();
		char grade;
		
		if(point>=90) {
			grade='A';
		}else if(point>=80&&point<90) {
			grade='B';
		}else if(point>=70&&point<80) {
			grade='C';
		}else if(point>=60&&point<70) {
			grade='D';
		}else {
			grade='F';
		}
		System.out.println(grade+"등급");
		s.close();

	}

}
