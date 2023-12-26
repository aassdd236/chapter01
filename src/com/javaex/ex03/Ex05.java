package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int time=s.nextInt();
		int money = 0;
		
		if(time<=8) {
			money=time*10000;
		}else if(time>8) {
			money=80000+(time-8)*15000;
		}
		System.out.println("임금은 "+money+"원 입니다.");
		s.close();

	}

}
