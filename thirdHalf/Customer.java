package thirdHalf;

public class Customer {
	public static void main(String[] args) {
		//	RBIinterface RBI = new Icici();
		//	int upilimit = RBI.UPILimit;
		//	System.out.println(upilimit);

		//	System.out.println(RBI.UPILimit);
		//	System.out.println(Icici.UPILimit);

		//	RBI.aadharMandatory();
		//	boolean panMandatory = RBI.panMandatory();
		//	System.out.println(panMandatory);

		//	System.out.println("Pan : " +RBI.panMandatory());

		Icici bank = new Icici();
		bank.aadharMandatory();
		bank.zeroInterestLoan();
		System.out.println("UPI limit : "+Icici.UPILimit);
		System.out.println("Pan Verified : "+bank.panMandatory());
		
		bank.carLoan();
		RBIinterface.bikeLoan();
		bank.aadharmandatory(true);



	}
}
