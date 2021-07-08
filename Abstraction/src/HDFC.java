
public class HDFC extends Bank implements BankContract, AccountOpening{

	@Override
	public void deposit(int accountNumber, int amount) {
		// TODO Auto-generated method stub
		System.out.println("Deposit form HDFC...");
	}

	@Override
	public void withdraw(int accountNumber, int amount) {
		// TODO Auto-generated method stub
		System.out.println("Withdraw from HDFC...");
	}
	
	
	public void openPPFAccount() {
		System.out.println("PPF account opened");
	}


}
