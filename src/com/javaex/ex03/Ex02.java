package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("점수: ");
		int point = s.nextInt();
		
		if(point>=60) {
			System.out.println("합격입니다.");
		}
		else {
			System.out.println("불합격입니다");
		}
		
		s.close();

	}

}
