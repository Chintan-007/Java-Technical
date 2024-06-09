package bankactivities;

public class BankTransactions implements Bank {
	
	@Override
	public void deposite(Account acc, int amt) {
		acc.setBal(acc.getBal()+amt);
	}

	@Override
	public void withdraw(Account acc, int amt) {
		acc.setBal(acc.getBal()-amt);
	}
}
