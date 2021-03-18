package quiz03;

public class MainClass {
	public static void main(String[] args) {
		
		// 월급쟁이
		SalaryMan staff1 = new SalaryMan("james", 300);
		// 월급쟁이
		SalaryMan staff4 = new SalaryMan("brown", 300);
		
		// 판매직
		SalesMan staff2 = new SalesMan("alice", 100);
		staff2.setSalesAmount(2000);
		
		// 알바
		Alba staff3 = new Alba("david");
		staff3.setPayPerHour(1);
		staff3.setTime(200);
		
		// 회사
		Company company = new Company(10);
		company.hireStaff(staff1);
		company.hireStaff(staff2);
		company.hireStaff(staff3);
		company.hireStaff(staff4);
		company.staffInfo();
		
	}
}
