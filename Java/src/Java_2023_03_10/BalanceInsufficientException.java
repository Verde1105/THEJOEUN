package Java_2023_03_10;

public class BalanceInsufficientException extends Exception{
	public BalanceInsufficientException( ) {}
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
