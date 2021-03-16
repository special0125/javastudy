package quiz08;

public class MainClass {
	public static void main(String[] args) {
		
		Producer producer = new Producer();
		
		Singer singer1 = new Singer("alice", 3);
		Singer singer2 = new Singer("emily", 5);
		
		producer.produce(singer1, new Song("a","a"));
		producer.produce(singer1, new Song("b","b"));
		producer.produce(singer1, new Song("c","c"));

		producer.produce(singer2, new Song("d","d"));
		producer.produce(singer2, new Song("e","e"));
		producer.produce(singer2, new Song("f","f"));
		producer.produce(singer2, new Song("g","g"));
		producer.produce(singer2, new Song("h","h"));

		singer1.info();
		singer2.info();
		
		
		
	}
}
