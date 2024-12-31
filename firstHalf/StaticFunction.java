package firstHalf;

public class StaticFunction 
{

	public void eat()
	{
		System.out.println("Eat");
	}
	public static void sleep()
	{
		System.out.println("Sleep");
	}
	public static void main(String[] args) 
	{
		StaticFunction sf = new StaticFunction();
		sf.eat();
		sleep();
	}
}
