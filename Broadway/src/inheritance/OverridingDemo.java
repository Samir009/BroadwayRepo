package inheritance;

public class OverridingDemo {
	public static void main(String[] args) {
		System.out.println("=================================================");
		PrabhuBank pb = new PrabhuBank(); // static or early binding of object
		System.out.println("Bank name: " + pb.getBankName());
		System.out.println("Interest rate: " + pb.getInterestRate());
		pb.moneyExRate();

		System.out.println();
		System.out.println("=================================================");
		NMBBank nmbBank = new NMBBank();
		System.out.println("Bank name: " + nmbBank.getBankName());
		System.out.println("Interest rate: " + nmbBank.getInterestRate());
		nmbBank.moneyExRate();

		// up-casting
		// child ko object lai parent ma pani halna pauxau
		System.out.println();
		System.out.println("=================================================");
		CentralBank b = new PrabhuBank();

		OverridingDemo ov = new OverridingDemo();
		ov.displayBankInfo(b);

	}

	// dynamic or late binding of object
	void displayBankInfo(CentralBank b) {
		System.out.println("Bank name: " + b.getBankName());
		System.out.println("Interest rate: " + b.getInterestRate());
		b.moneyExRate();
	}
}
