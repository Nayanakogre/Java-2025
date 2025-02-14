public class Budget
{
	public static void main(String[] args) {

		double budgetInCr=10000;
		double incomeInCr=1200;
		String[] budgetInfo={"Budget :Cental Budget","Year:2024"};

		
		while(budgetInCr>1000)
		{
			System.out.println("Its a good budget ammnt");
			break;
		}
		do{
			System.out.println("Its not the good income,need improve");
		}while(incomeInCr<1200);


		for(int i=0;i<budgetInfo.length;i++)
		{
			System.out.println(budgetInfo[i]);
		}

		
	}
}