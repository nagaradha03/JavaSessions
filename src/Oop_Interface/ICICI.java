package Oop_Interface;

public class ICICI implements RBI{

	@Override
	public void account() {
		System.out.println("Icici accounts");
		
	}

	@Override
	public void loans() {
		System.out.println("Icici loans");
		
	}

	@Override
	public void creditCards() {
		System.out.println("Icici credit cards");
		
	}

	@Override
	public void investments() {
		System.out.println("Icici investments");
		
	}
	public void savingsAccount() {
		System.out.println("Icici savingsAccount");
	}

}
