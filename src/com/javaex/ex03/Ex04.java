package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("근무시간: ");
		int time=s.nextInt();
		int money = 0;

		if(time<=8) {
			money=10000*time;
		}else if(time>8) {
			money=12000*time;
		}
		System.out.println("임금은 "+money+"원입니다");
		
		s.close();

	}

}
