package thirdHalf;

public interface RBIinterface {
	int UPILimit = 100000;

	public void aadharMandatory();

	public boolean panMandatory();

	static void bikeLoan() {
		System.out.println("Bike Loan");	
	}
	default void carLoan( ) {
		System.out.println("Car Loan");
	}
	
	public void aadharmandatory(boolean a);
}