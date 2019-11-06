package com.biz.hello1;

/*
 * AddClass 이름으로 클래스를 선언하고
 * 그 클래스 내부에 add() 라는 이름으로 method를 선언한 것
 */
public class AddClass {
	
	/*
	 * 그냥 호출만 하면
	 * 대한민국... REPLUBIC
	 */
public static void main(String[] args) {
	//현재 클래스를 에 선언된 add() 메서드를
	// 호출하는 방법
	// add();
	
	// addClass에 선언된 add() 메서드를 호출하고 싶다
	// addclass.add 이렇게는 안된다
	// 다른 클래스에 잇는 메서드를 원칙적으로
	// 직접 호출이 안된다
	
	// 1. 클래스를 객체선언하고  초기화를 해주어야 한다
	// 클래스를 객체로 선언하고 초기화 하는 것을
	// 클래스의 인스턴스를 만든다라고 한다
	
	//클래스를 객체로 선언한다
	//클래스(class)
	// 객체(object)
	AddClass addClass; //선언
	
	// addClass를 사용해서 뭔가 일을 수행하기 위한 준비
    addClass = new AddClass(); // 초기화, 생성
    // addClass
    addClass.add();
}
	public void add() {
		System.out.println("대한민국만세");
		System.out.println("우리나라만세");
		System.out.println("REPUBLIC OF KOREA");
	}
	/*
	 * 2개의 정수형 값을 주입받고
	 * 그냥 무시하고
	 * console에 30+40은 70입니다 라고 출력
	 */
	public void add(int n1, int n2) {
		System.out.println("30+40은 70입니다");
	}
	
	/* 두개의 문자열형 값을 주입받고
	* 그냥 무시하고
	* 30+40의 계산값을
	* 호출한 곳으로 return(되돌려준다)
	* ==> 호출한 곳에서는 return 값을 int형 변수에
	*저장 해두고 사용할 수 있다
	*/
	public int add(String s1, String s2) {
		return 30+40;
	}
	
	
	
	
	
	
	
	
	
	
	
}
