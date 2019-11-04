package com.biz.hello;

public class HelloEx_02 {

	/*
	 * main()method
	 * 이클립스 도구에서 (Run, Ctrl + F11)을 눌러서
	 * 어떤 명령문들의 실행을 시켜볼수 있도록 만든 기본 method
	 * 
	 */
	public static void main(String[] args) {
 
		// view() 명령문은 자바에 없는 명령문이다.
		
		// (2번이상 할때는 따로 문자열을 만들어서 해야한다)
		
		// 이 클래스에 내가 만든 view() 명령을 5번 실행하라
		// 이 클래스에 내가 만든 view() method를 5번 호출하라(책으로 볼때는 이 문장이 맞다)
		view();
		view();
		view();
		view();
		view();

	}

	public static void view() {
		System.out.println("우리나라 만세");
		System.out.println("우리나라 만세");
		System.out.println("Republic of Korea");
	}
	
	
}
