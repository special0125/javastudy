package quiz07;

public class MainClass {
	public static void main(String[] args) {
		
		Game game = new Game(2);	// plater가 2명
		game.setPlayers();	// player 세팅
		game.play();	// game시작
		
	}
}
