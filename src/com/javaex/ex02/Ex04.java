package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("이름을 입력해 주세요.");
		System.out.print("이름: ");
		String name=s.nextLine();
		System.out.println("나이를 입력해 주세요.");
		System.out.print("나이: ");
		int age=s.nextInt();
		System.out.println("키를 입력해 주세요.");
		System.out.print("키: ");
		double hei=s.nextDouble();
		System.out.println("당신의 이름은 "+name+" 나이는 " + age+" 키는 "+hei+"입니다.");
		
		s.close();
				

	}

}
