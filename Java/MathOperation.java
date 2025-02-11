// Task:Basic Math operations
// Date:07-02-2025

// 1. Write a Java program that takes two integer inputs from the user and performs the following operations:
// Addition
// Subtraction
// Multiplication
// Division (handle division by zero)
// Modulo

import java.util.Scanner;

public class MathOperation
{
	static int number1;
	static int number2;
	static int addition;
	static int substraction;
	static int multiplication;
	static int division;
	static int modulus;

	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);

		System.out.println("Enetr a number1 :");
		MathOperation.number1=scn.nextInt();

		System.out.println("Enetr a number2 :");
		MathOperation.number2=scn.nextInt();

		MathOperation.addition=number1+number2;
		MathOperation.substraction=number1-number2;
		MathOperation.multiplication=number1*number2;
		MathOperation.division=number1/number2;
		MathOperation.modulus=number1%number2;
		
		System.out.println("Addition :"+MathOperation.addition);
		System.out.println("Substraction :"+MathOperation.substraction);
		System.out.println("Multiplication :"+MathOperation.multiplication);
		System.out.println("Division :"+MathOperation.division);
		System.out.println("Remainder(Modulus) :"+MathOperation.modulus);



	}
}