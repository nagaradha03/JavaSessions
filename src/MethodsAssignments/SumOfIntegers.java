//WAP to print the sum of two numbers entered by user by defining your own method.
package MethodsAssignments;
import java.util.Scanner;
public class SumOfIntegers {
	public static void main(String[] args) {
		SumOfIntegers SI=new SumOfIntegers();
		SI.sum();
	}
	public void sum()
	{	Scanner s=new Scanner(System.in);
		int a,b;
		System.out.println("Enter first number:");
		a=s.nextInt();
		System.out.println("Enter seccond number:");
		b=s.nextInt();
		int sum=a+b;
		System.out.println("Sum of the integers " +sum);
	}
}
