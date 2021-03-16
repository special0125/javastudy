package quiz06;

public class Customer {
	
	// field
	private int customerBread;
	private int customerMoney;

	// constructor
	public Customer(int customerMoney) {
		this.customerMoney = customerMoney;
	}
	
	
	// method
	
	// buy
	public void buy(Bakery bakery, int money) {
		// bakery에서 판매한 빵과잔돈을 받으면 됩니다.
		BreadAndChange bnc = bakery.sell(money);
		// 구매처리
		customerBread += (bnc.getBread());
		customerMoney += (bnc.getChange());
		customerMoney -= money;
		
		System.out.println("빵 " + customerBread + "개, 남은돈 " + customerMoney + "원");
		
	}
		
	
	
}
