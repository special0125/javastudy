package ex14_interface;

public class MainClass {
	public static void main(String[] args) {
		
		Zoo zoo = new Zoo(5);
		
		zoo.addAnimal(new Lion());
		zoo.addAnimal(new Eagle());
		zoo.addAnimal(new Shark());
		
		zoo.info();
	}
	
}
