package quiz02;

public class Calculator {

	// method
	// 1. 결과타입 : 결과값이 없다. (void)
	// 2. 메소드명 : addtion
	// 3. 매개변수 : 전달되는 2개의 int값이 있다.
	// 4. 역할 : 전달된 인수의 합계 결과를 아래와 같은 형식으로 보여줍니다.
	//    1 + 2 = 3
	
	void addtion(int n1, int n2) {
		System.out.println(n1 + "+" + n2 + "=" + (n1+n2));
	}

	// 1. 결과타입 : 결과값의 타입이 int입니다.
	// 2. 메소드명 : subtraction
	// 3. 매개변수 : 전달되는 2개의 int 값이 있다.
	// 4. 역할 : 전달된 인수의 뺄셈 결과를 반환합니다. 항상 큰 수에서 작은 수를 뺍니다.
	
	int subtraction(int n1, int n2) {
		int sub = (n1 >= n2) ? n1 - n2 : n2 - n1;
		return sub;
	}
	
}
