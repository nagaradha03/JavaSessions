//Define a method that returns the product of two numbers entered by user.
package MethodsAssignments;
import java.util.Scanner;
public class ProductNumbers {	
	public static void main(String[] args) {
		ProductNumbers p=new ProductNumbers();
		p.multi();	
	}
	public void multi()
	{
	Scanner s=new Scanner(System.in);
	int a,b;
	System.out.println("Enter first number:");
	a=s.nextInt();
	System.out.println("Enter seccond number:");
	b=s.nextInt();
	int multiply=a*b;
	System.out.println("Sum of the integers " +multiply);
	}

}
