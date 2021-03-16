package ex02_loop;

import java.util.Scanner;

/*
 * 5. 10000원 모두 사용하기
 * 현재 10000원이 있습니다.
 * 결제금액 >>> 5000
 * 현재 5000원이 있습니다.
 * 결제금액 >>> -100
 * -100원은 결제할 수 없습니다.
 * 현재 5000원이 있습니다.
 * 결제금액 >>> 10000
 * 5000원이 부족합니다.
 * 현재 5000원이 있습니다.
 * 결제금액 >>> 5000
 * 현재 0원이 있습니다.
 * 
 */
public class Quiz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int wallet = 10000;
		int money;
		while(wallet > 0) {
			System.out.println("현재 "+ wallet + "원이 있습니다.");
			System.out.print("결제금액 >>> ");
			money = sc.nextInt();
			if(wallet < money) {
				System.out.println((money-wallet) + "원이 부족합니다.");
				continue;
			}else if(money <= 0) {
				System.out.println(money + "원은 결제할 수 없습니다.");
				continue;
			}
			wallet -= money;
			if(wallet == 0) {
				System.out.println("현재 " + wallet + "원이 있습니다.");
			}
		}
		
		
		
		
	}
}
