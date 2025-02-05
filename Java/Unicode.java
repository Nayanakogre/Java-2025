//Task on converting charcter to unicode
//I used casting
//04-02-2025

2.Write a Java program that does the following:
1.Take a character as input.
2.Print the next character in the Unicode sequence.
3.Print the previous character in the Unicode sequence.



public class Unicode
{
	public static void main(String args[])
	{

		char letter='H';
		
		System.out.println("Unicode of given charcter  :"+(int)letter);
		System.out.println("Unicode of given's Next charcter  :"+((int)letter+1));
		System.out.println("Unicode of given's Previous charcter  :"+((int)letter-1));
		
		


	}
}