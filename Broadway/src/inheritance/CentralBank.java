package inheritance;

public class CentralBank {

	protected String getBankName() {
		return "Central Bank";
	}

	protected int getInterestRate() {
		return 0;
	}

	public void moneyExRate() {
		System.out.println("$1 = Rs.111");
		System.out.println("Ic100 = Rs.160");
		System.out.println("Yen10 = 10.5");
	}
}
