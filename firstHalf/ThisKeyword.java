package firstHalf;

public class ThisKeyword 
{
	int a;
	void addTwoNumbers(int a,int b)
	{
		int sum =a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		ThisKeyword tk = new ThisKeyword();
		tk.addTwoNumbers(10, 10);
		//tk.addTwoNumbers(this.a, 10);
	}
}
