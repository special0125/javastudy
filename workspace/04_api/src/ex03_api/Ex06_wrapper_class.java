package ex03_api;
/*
 * wrapper class
 * 1. primitive type -> reference type 변경해주는 클래스입니다.
 * 2. 변수 -> 객체 변경해주는 클래스입니다.
 * 3. 종류
 *    1) int     -> Integer
 *    2) long    -> Long
 *    3) double  -> Double
 *    4) char    -> Character
 *    5) boolean -> Boolean
 * 4. 용어
 *    1) Auto Boxing   : primitive 값 -> reference 객체
 *    2) Auto UnBoxing : reference 객체 -> primitive 값
 * 
 */
public class Ex06_wrapper_class {
	public static void main(String[] args) {
		
		Integer a = new Integer(10);
		Integer b = new Integer("20");
		Integer c = 30;	// AutoBoxing
		
		int total = a + b + c;	// AutoUnBoxing
		System.out.println(total);
	}
}
