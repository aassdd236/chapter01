package com.javaex.ex05;

public class Ex09 {

	//String args=new String[3]; < 자바가 해 줌
	public static void main(String[] args) {
		
		for(int i=0; i<args.length; i++){
			System.out.println(i + "번째 값: " + args[i]);
		}

		if(args[0].equals("-h")) {
			System.out.println("[-h]: 도움말");
			System.out.println("[-v]: 버전정보");
			System.out.println("[-m]: 만든사람");
		}else if(args[0].equals("-v")) {
			System.out.println("버전 1.1");
		}else if(args[0].equals("-m")) {
			System.out.println("만든 사람: 이예슬");
		}else{
			System.out.println("옵션 확인");
		}

	}

}
