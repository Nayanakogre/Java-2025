public class MobilePhone
{
	static byte ramSize=8;
	static short internalStorage=256;
	static int price=23000;
	static long serialId=1434323212l;
	static float displaysize=2.2f;
	static double weight=200.43;
	static char noOfPorts='4';
	static boolean isAmboled=true;
	static String company="Samsung";

	public static void main(String args[])
	{
		System.out.println("RAM Size :"+MobilePhone. ramSize);
		System.out.println("Internal Storage :"+MobilePhone.internalStorage);
		System.out.println("Price :"+MobilePhone.price);
		System.out.println("Serial Id :"+MobilePhone.serialId);
		System.out.println("Display Size :"+MobilePhone.displaysize);
		System.out.println("Weight :"+MobilePhone.weight);
		System.out.println("No Of Ports :"+MobilePhone.noOfPorts);
		System.out.println("Is amboled :"+MobilePhone.isAmboled);
		System.out.println("Company :"+MobilePhone.company);
	}


}