package quiz04;

public class Gun {
	
	// filed
	private String model;
	private int bullet;
	private final int FULL_BULLET = 6;
	
	
	// constructor
	public Gun(String model, int bullet) {
		this.model = model;
		this.bullet = bullet;
	}
	
	// method
	public void shoot() {
		if(bullet > 0) {
			bullet--;
			System.out.println("빵야! " + bullet + "발 남았다.");
		}else {
			System.out.println("헛빵!");
		}
	}
	public void reload(int bullet) {
		if(this.bullet + bullet <= FULL_BULLET) {
			this.bullet += bullet;
			System.out.println(bullet + "발이 장전되었다. 현재 " + this.bullet + "발");
		}else {
			int realBullet = FULL_BULLET - this.bullet;
			this.bullet = FULL_BULLET;
			System.out.println(realBullet + "발이 장전되었다. 현재 " + this.bullet + "발");
		}
	}
	public void info() {
		System.out.print(model + "에 " + this.bullet + "발 남았다.");
	}

	
	
}
