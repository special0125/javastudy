package quiz01;

public class Alba extends Staff {
	
	// field
	private int payPerHour;
	private int times;
	
	// constructor
	public Alba(String name) {
		super(name);
	}

	// method
	public int getPayPerHour() {
		return payPerHour;
	}
	public void setPayPerHour(int payPerHour) {
		this.payPerHour = payPerHour;
	}
	public int getTime() {
		return times;
	}
	public void setTime(int times) {
		this.times = times;
	}
	
	public int getPay() {
		return payPerHour * times;
	}
	
	
	
	
}
