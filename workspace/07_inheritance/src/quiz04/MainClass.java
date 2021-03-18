package quiz04;

public class MainClass {
	
	Fighter fighter1 = new KoreanFighter("정찬성");  // 에너지, 공격력은 랜덤 생성
	Fighter fighter2 = new GlobalFighter("에드가");  // 에너지, 공격력은 랜덤 생성
	
	// 선빵 결정
	boolean myTurn = Math.random() < 0.5;
	
	do {
		if (myTurn) {
			fighter1.attack(fighter2);  // fighter1의 공격
			}else {
				fighter2.attack(fighter1);
			}
	}while (fighter1과 fighter2가 모두 살아있으면)
	
	
}
