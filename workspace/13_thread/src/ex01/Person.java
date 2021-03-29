package ex01;

public class Person extends Thread{

	// field
	private String name;

	// constructor
	public Person(String name) {
		super();
		this.name = name;
	}
	
	// method
	public void eat() {
			System.out.println(name + "이(가) 먹는 중입니다.");
	}

	@Override
	public void run() { // 스레드가 동작시키는 메소드
		for(int i = 0; i < 3; i++) {
			eat();
		}
	}
}
