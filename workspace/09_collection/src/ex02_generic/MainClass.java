package ex02_generic;

public class MainClass {
	public static void main(String[] args) {
		
		Box<String, Integer> box1 = new Box<String, Integer>();
		box1.setItem1("james");
		box1.setItme2(90);
		System.out.println(box1.getItem1() + ", " + box1.getItme2());
		
		Box<String, Pet> box2 = new Box<>();
		box2.setItem1("앨리스");
		box2.setItme2(new Pet("댕댕이", 2));
		System.out.println(box2.getItem1() + ", " + box2.getItme2());
		
		
		
		
		
	}
}
