//Task on datatypes
//04-02-2002

1.Write a Java program that takes an integer, a floating-point number, a character, Then, the program should perform the following tasks:
1.Print the square of the integer.
2.Floating-Point Number (float or double):
3.Print the result of multiplying the floating-point number by 10.
4.Print the ASCII value of the character.

public class Cycle
{
	public static void main(String args[])
	{
		int price=10000;
		char quality='h';
		float speedInKm=5.5f;
		System.out.println("Square :"+price*price);
		System.out.println(speedInKm);
		System.out.println("Multiplication of float number with 10 :"+speedInKm*10);
		System.out.println((int)quality);

	}
}