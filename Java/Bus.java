public class Bus
{
	public static void main(String args[])
	{
		String route="Rajajinagar";
		String busNo="KA-15-9078";
		String driver="Abc";
		String conducter="Xyz";
		String busType="Electrical";
		int ticketPrice=12;
		String busFrom="Mejestic";
		String busTo="Rajajinagar";


		if(route=="Rajajinagar")
		{
			System.out.println("Bus Details");
			System.out.println("Bus no :"+busNo +" ," +"Driver :"+driver +"  ,"+"Conducter :"+conducter +"  ,"
				+"Bus Type :"+busType);
			System.out.println("Ticket Price is  :"+ticketPrice);
			System.out.println("Route is From "+busFrom  +"  " +"To  " +busTo);

		}
		else
		{
			System.out.println("There is no route found");
		}
	}
}
