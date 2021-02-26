package absctraction;

public abstract class Bank {
	protected abstract String getBankName();

	protected abstract int getInterestRate();

	public void moneyExRate() {
		System.out.println("$1 = Rs.111");
		System.out.println("Ic100 = Rs.160");
		System.out.println("Yen10 = 10.5");
	}

}
