package ex11_abstract;

public class MainClass {
	public static void main(String[] args) {
		
		Staff staff = new SalaryMan("alice", 300);
		staff.info();
		
		// staff의 getPay()는 어떻게 호출할 수 있나요?
		// staff.getPay();
		// 1. Staff클래스에 getPay() 추가합니다.
		//    -> 모든 Staff은 getPay()를 가져야 하므로 이 방법으로 해결합니다.
		// 2. SalaryMan 클래스로 캐스팅합니다.
		System.out.println(staff.getPay());
		
	}
	
}
