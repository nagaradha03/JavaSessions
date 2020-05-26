//WAP to print the factorial of a number by defining a method named 'Factorial'.
package MethodsAssignments;
public class Factorial {
	public static void main(String[] args) {	
		Factorial f=new Factorial();
		System.out.println(factor(0));	
	}
	public static int factor(int num) {
		int fact=1;
		System.out.println("Factorial of  " + num  );
		if(num==0)
			return 1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;}
		
			return fact;
				}
	}
