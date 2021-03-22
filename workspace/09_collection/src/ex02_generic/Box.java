package ex02_generic;

// 제네릭의 일반화 타입은 관례상 "영문대문자"를 사용합니다.

public class Box<T, U> {

	// field
	private T item1;
	private U itme2;

	// methdo
	public T getItem1() {
		return item1;
	}
	public void setItem1(T item1) {
		this.item1 = item1;
	}
	public U getItme2() {
		return itme2;
	}
	public void setItme2(U itme2) {
		this.itme2 = itme2;
	}
	
	
	
}
