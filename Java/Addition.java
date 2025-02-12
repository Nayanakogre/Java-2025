public class Addition
{
	public static int add(int a,int b)
	{
		int c=a+b;
		return c;

	}
	public static boolean isCorrect()
	{
		boolean isCorrect=true;
		return isCorrect;
	}
	public static void main(String args[])
	{
		int add=Addition.add(12,14);
		System.out.println(add);
		boolean isCorrect=Addition.isCorrect();
		System.out.println(isCorrect);
	}
}