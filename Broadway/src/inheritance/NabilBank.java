package inheritance;

public class NabilBank extends CentralBank {
	@Override
	protected String getBankName() {
		return "Nabil";
	}

	@Override
	protected int getInterestRate() {
		return 9;
	}
}
