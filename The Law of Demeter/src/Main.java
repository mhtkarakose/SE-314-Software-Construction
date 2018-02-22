
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer bnk = new Customer();
		BankAccount account = new BankAccount();
		bnk.setFirstName("mehmet");
		bnk.setLastName("karakose");
		account.addMoney(2);
		bnk.setMyBankAccount(account);
		
		Paperboy boy = new Paperboy();
		bnk.buy(boy.getPayment());

	}

}
