package firstHalf;

import java.security.DomainCombiner;

public class StaticVariable 
{
	int x;
	static int y;
	public void increment()
	{
		x++;
		y++;
		System.out.println("Non-static : " +x +" " + "Static : " +y);
	}
	public static void main(String[] args) {
		StaticVariable sv = new StaticVariable();
		sv.increment();
		sv.increment();
		
		StaticVariable sv1 = new StaticVariable();
		sv1.increment();
		sv1.increment();
		
		StaticVariable sv2 = new StaticVariable();
		sv2.increment();
		sv2.increment();
		
		//static fun calling
		StaticFunction.sleep();
		StaticFunction sf1 = new StaticFunction();
		sf1.eat();
	}
}
