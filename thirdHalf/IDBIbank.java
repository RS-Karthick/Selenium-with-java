package thirdHalf;

public abstract class IDBIbank implements RBIinterface {

	@Override
	public void aadharMandatory() {
System.out.println("Aadhar verified");
		
	}

	@Override
	public boolean panMandatory() {
	return true;
	}

}

