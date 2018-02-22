
public class Customer {
	
	private String firstName;
	private String lastName;
	private BankAccount myBankAccount;
	
	void buy(float value) {
		BankAccount bankAc = getBankAccount();
		if(bankAc.getTotalMoney() >= value) {
			bankAc.subtractMoney(value);
			System.out.println("satın aldım");
		}else {
			System.out.println("come back later");
			
		}
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public BankAccount getBankAccount() {
		// TODO Auto-generated method stub
		return myBankAccount;
	}

	public void setMyBankAccount(BankAccount myBankAccount) {
		this.myBankAccount = myBankAccount;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", myBankAccount=" + myBankAccount + "]";
	}

}
