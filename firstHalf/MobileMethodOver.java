package firstHalf;

public class MobileMethodOver 
{
	// take picture, take video, makecall - fun overloading ( name , number )
	public void takePicture() 
	{
		System.out.println("Picture has been taken succcessfully");
	}
	public void takeVideo()
	{
		System.out.println("Video has been recorded successfully");
	}
	public int makeCall(int number)
	{
		//System.out.println("Contact number : " +number);
		return number;
	}
	public void makeCall(String name)
	{
		//System.out.println("Contact name : " +name);
	}
public static void main(String[] args) 
{
	MobileMethodOver mob = new MobileMethodOver();
	mob.takePicture();
	mob.takeVideo();
   // mob.makeCall(12345);
	System.out.println("number " + mob.makeCall(789));
	mob.makeCall("kkk");
	mob.makeCall(345);
	mob.makeCall("karthick");
}
}
