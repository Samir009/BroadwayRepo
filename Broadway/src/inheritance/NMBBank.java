package inheritance;

public class NMBBank extends CentralBank {
	@Override
	protected String getBankName() {
		return "NMB Bank";
	}

	@Override
	protected int getInterestRate() {
		return 8;
	}
}
