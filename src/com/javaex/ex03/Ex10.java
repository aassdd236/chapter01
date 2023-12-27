package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		int month=s.nextInt();
		
		switch(month) {
		case 2:
			System.out.println("28일 입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일 입니다.");
			break;
		default:
			System.out.println("31일 입니다.");
			break;		
		}
		s.close();
	}

}
