public class Bank
{
	public static void main(String args[])
	{
		double accountAmnt=900;
		double rateOfInterst=8;
		double interst=accountAmnt*rateOfInterst*1/3;
		System.out.println("Interst is :"+interst);
		if(accountAmnt>=1000)
		{
			System.out.println("Youre are maintaning the minimum balance ");
		}
		else
		{
			System.out.println("Youre not are maintaning the minimum balance please maintain 1000");
		}
		if(!(accountAmnt>=1000))
		{
			double penaltyInterst=accountAmnt*1*1/100;
			System.out.println("Penalty for not maintaing minimum balance :"+penaltyInterst);

		}
		else{
			System.out.println("Great!! youre maintaining minimum balance");
		}
 System.out.println(8 + "\n" + 13 + " " + 21 + "\n");

 

System.out.println("I"+"\n"+"love"+"\n"+"CodeChef");
	}
}