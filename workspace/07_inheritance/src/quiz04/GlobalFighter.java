package quiz04;

// attack() : 10% 확률로 한 방에 KO 시킬 수 있습니다.
public class GlobalFighter extends Fighter {

	// field
	
	// constructor
	public GlobalFighter(String name) {
		super(name, (int)(Math.random() * 100) + 50,(int)(Math.random() * 10) + 1);
	}
		
	// method
	@Override
	public void attack(Fighter fighter) {
		if(Math.random() < 0.1) { // 10% 확률
			fighter.setEnergy(0);
			System.out.println(fighter.getName() + " KO!");
		}else {
			fighter.setEnergy(fighter.getEnergy() - this.getPower());
			System.out.println("공격: " + this.getName() + "[" + fighter.getName() + " 남은 에너지: " + fighter.getEnergy() + "]");
		}
	}
}
