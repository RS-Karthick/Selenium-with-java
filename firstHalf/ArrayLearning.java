package firstHalf;

import java.util.Arrays;

public class ArrayLearning 
{
	public static void main(String[] args) 
	{

		String fruit[] = {"Orange","Apple","Banana","Pomegranate","Graps"};
		System.out.println(fruit.length);
		System.out.println(fruit[fruit.length-1]);
		//		String a = fruit[fruit.length-1];
		//		System.out.println(a);
		//System.out.println(Arrays.toString(fruit));
		String s = Arrays.toString(fruit);
		System.out.println(s);
	}
}

