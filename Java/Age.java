public class Age
{
	public static void main(String args[])
	{
		int age=18;
		if(age>=1 && age<=12)
		{
			System.out.println("Child");
		}
		else if(age>=13 && age<=19)
		{
			System.out.println("Teenager");
		}
		else if(age>=20 && age<=100)
		{
			System.out.println("Adult");
		}
		else
		{
			System.out.println("Invalid Choice");
		}
	}
}