package Java_2023_03_10;

public class AccountEx {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(10000);
		System.out.println("예금액:" + account.getBalance());
		try {
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			String messge = e.getMessage();
			System.out.println(messge);
		}
	}
}
