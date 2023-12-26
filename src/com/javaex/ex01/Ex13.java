package com.javaex.ex01;

public class Ex13 {
	public static void main(String[] args){
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println("-------------");
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		int a=5;
		int b=7;
		
		System.out.println(a>b && a<b);
		System.out.println(a>b && a>b);
		System.out.println(a>b || a<b);
		System.out.println(a>b && a<b || a<b);
		
		System.out.println(!(a<b));
		
	}
}
