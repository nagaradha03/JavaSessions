//Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
package MethodsAssignments;
import java.util.Scanner;
public class MinMaxNumbers {
	public static void main(String[] args) {
		MinMaxNumbers m=new MinMaxNumbers();
		m.max();
		m.min();
	}
	public void max() {
		Scanner s=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter first number:");
		a=s.nextInt();
		System.out.println("Enter second number:");
		b=s.nextInt();
		System.out.println("Enter third number:");
		c=s.nextInt();
		if(a>b &&a>c) 
			System.out.println("max number is :"+a);
		else if(b>c)
			System.out.println("Max number is :"+b);
		else
			System.out.println("Max number is : "+c);
	}
	public void min() {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number:");
		a=s.nextInt();
		System.out.println("Enter second number:");
		b=s.nextInt();
		System.out.println("Enter third number:");
		c=s.nextInt();
		if(a<b &&a<c) 
			System.out.println("Minimum number is :"+a);
		else if(b<c)
			System.out.println("Minimum number is :"+b);
		else
			System.out.println("Minimum number is : "+c);
	}
}
