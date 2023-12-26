package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("점수 입력: ");
		int point=s.nextInt();
		
		if(point>0) {
			System.out.println("양수");
		}else if(point<0) {
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
		
		s.close();
	}

}
