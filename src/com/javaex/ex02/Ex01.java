package com.javaex.ex02;

public class Ex01 {
	public static void main(String[] args) {
		
		int i=12345;
		String str="안녕하세요";
		String name="이예슬";
		String hello="hello";
		double d=3.14;
		char c='한';
		String s="한";
		
		System.out.println(i);
		System.out.println(12345);
		
		System.out.println(str);
		System.out.println("안녕하세요");
		
		System.out.print(name);
		System.out.println(str);
		
		System.out.println("---------------");
		System.out.print("안녕");
		System.out.println("하세요");
		
		System.out.println("---------------");
		System.out.println(hello + hello);
		System.out.println(name+" 님 "+hello);
		
		System.out.println(i+i);
		System.out.println(d+d);
		System.out.println(i+d);
		System.out.println(c+c);
		System.out.println(s+s);
		
		System.out.println(name+i+d);
		System.out.println("안녕\"하\"세요");
		System.out.println("안녕\\하\\세요");
	}
}
