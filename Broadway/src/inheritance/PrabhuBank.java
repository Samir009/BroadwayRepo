package inheritance;

public class PrabhuBank extends CentralBank {
	@Override
	protected String getBankName() {
		return "Prabhu Bank";
	}

	@Override
	protected int getInterestRate() {
		return 10;
	}
}
