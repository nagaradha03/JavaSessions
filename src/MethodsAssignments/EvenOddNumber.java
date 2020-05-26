//Define a program to find out whether a given number is even or odd.
package MethodsAssignments;
public class EvenOddNumber {
	public static void main(String[] args) {
		EvenOddNumber e=new EvenOddNumber();
		e.evenOrAdd(101);
	}
public void evenOrAdd(int number) {
	if((number%2)==0) 
		System.out.println("The given number is even");
	else
		System.out.println("The given number is odd");
		
	}
}
	

