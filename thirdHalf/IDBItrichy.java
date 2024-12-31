package thirdHalf;

public class IDBItrichy extends IDBIbank {

	@Override
	public void aadharmandatory(boolean a) {
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		IDBItrichy idbi = new IDBItrichy();
		idbi.aadharMandatory();
		idbi.aadharmandatory(true);
		boolean panMandatory = idbi.panMandatory();
		System.out.println(panMandatory);
		int upilimit2 = idbi.UPILimit;
		System.out.println(upilimit2);
	}

}
