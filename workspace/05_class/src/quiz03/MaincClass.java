package quiz03;

public class MaincClass {
	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.set("james", 50, 60, 70);	// 인수 : 이름, 국어, 영어, 수학
		System.out.println("평균 : " + s.getAverage());
		System.out.println(s.getPass());	// 평균 60이상이면 "합격", 나머지 "불합격"
		
	}
}
