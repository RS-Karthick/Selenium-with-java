package firstHalf;

public class Constructor 
{
	int a;
	String name;
	Constructor(int b,String d)
	{
		this.a=b;
		this.name=d;
	}
	public void display()
	{
		System.out.println(a + " " + name);
	}
	public static void main(String[] args) 
	{
		Constructor cn = new Constructor(10,"karthick");
		cn.display();
		Constructor cn1 = new Constructor(20,"karthick Rs");
		cn1.display();
	}
}
