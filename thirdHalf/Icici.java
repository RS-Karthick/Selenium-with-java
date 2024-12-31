package thirdHalf;

public class Icici implements RBIinterface {

	public void zeroInterestLoan() {
		System.out.println("You have eligible to Zero interest Loan");
	}
	@Override
	public void aadharMandatory() {
		System.out.println(" Aadhar verified");
	}

	@Override
	public boolean panMandatory() {
		return true;


	}
	@Override
	public void aadharmandatory(boolean a) {
		System.out.println("Aahar is correct : " +a);
		
	}

}
