package ex01;

/*
	스레드 (thread)
	1. 자바의 세부작업 단위입니다.
	2. 생성 방법 (택일)
	   1) Thread 클래스를 상속 받습니다. (extends Thread)
	   2) Runnable 인터페이스를 구현합니다. (implements Runnable)
	3. 기본 규칙
	   1) run() 메소드 : 스레드의 작업을 작성하는 메소드입니다. 오버라이드 해서 사용합니다.
	   2) start() 메소드 : 스레드를 실행하는 메소드입니다. run() 메소드를 호출하지 않습니다.
*/

public class MainClass {
	public static void main(String[] args) {
		
		Person p1 = new Person("자두");
		Person p2 = new Person("스폰지밥");
		Person p3 = new Person("브레드");
		
		// 스레드는 JVM에 의해서 스케쥴링 되기 때문에 
		// 코드작성 순서대로 동작하지 않을 수 있습니다.
		
		p1.start();  //  자동으로 p1의 run() 메소드를 실행합니다.
		p2.start();
		p3.start();
		
		System.out.println("모든 식사가 끝났습니다.");
	}
}
