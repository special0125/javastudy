package ex03_exception_method;

public class MainClass {
	public static void main(String[] args) {
		
		try {
			int a = 2 / 0;
		}catch (ArithmeticException e) {
			// e에는 무엇이 포함되어 있는지 확인해 봅시다.
			System.out.println("예외메시지: " + e.getMessage());
			e.printStackTrace();  // 개발자가 넣어 두는 코드
		}
		
	}
}
