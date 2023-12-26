package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int point = s.nextInt();
		if(point>=60) {
			System.out.println("합격입니다.");
		}
		
		s.close();
		System.out.println("프로그램 종료");
	}

}
