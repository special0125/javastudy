package quiz01;

public class Gun extends Weapon implements Runnable{

	
	// field
	private String model;
	private int bullet;
	
	// constructor
	public Gun(String name, int bullet) {
		super();
		this.model = name;
		this.bullet = bullet;
	}
	
	// method
	@Override
	public void run() {
		for(int i = 0; i < bullet; i++) {
		shoot(i);
		}
	}
	public void shoot(int n) {
		if(bullet == 0) {
			System.out.println("헛빵!");
			return;
		}
		System.out.println(model + " " + (n+1) + "발 쐈다.");
	}


}
