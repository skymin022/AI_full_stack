package Day08.Ex06_UesrException;

public class Bank {

	public static void main(String[] args) {
		Account account = new Account();
		
		// 10000원 입금
		account.deposit(10000);
		
		// 20000원 출금
		try {
			account.withdraw(20000);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
