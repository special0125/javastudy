package ex07_exception_class;

@SuppressWarnings("serial")
public class DepositException extends Exception {

	public DepositException(String message) {
		super(message);
	}
}
