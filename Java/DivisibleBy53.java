// date:07-02-2025

// 3.Write a Java program that checks whether a number is divisible by both 3 and 5 using logical operators (&&). 
// Display a message depending on the result.

import java.util.Scanner;
public class DivisibleBy53
{
	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);

		System.out.println("Enter a number :");
		int number=scn.nextInt();
		if(number%5==0 && number%3==0)
		{
			System.out.println("YES!! This number is divisible both 5 and 3");

		}
		else
		{
			System.out.println("NO!! This number is not divisible both 5 and 3");
		}
	}
}