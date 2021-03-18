package quiz04;

public abstract class Fighter {
	
	// field
	private String name;
	private boolean isAlive;  // energy가 0이면 false
	private int energy; // 에너지 (1 ~ 100)
	private int power; // 공격력 (1 ~ 10)

	// constructor
	public Fighter(String name, int energy, int power) {
		super();
		this.name = name;
		this.energy = energy;
		this.power = power;
		this.isAlive = true;
	}
	
	// method 
	public abstract void attack(Fighter fighter);
	
	
}
