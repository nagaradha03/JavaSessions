// Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered
package MethodsAssignments;
import java.util.Scanner;
public class GradesMethod {
	public static void main(String[] args) {
		GradesMethod g=new GradesMethod();
		g.marks();
	}
	public void marks() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter marks");
		int a=s.nextInt();
		if(a>90)
			System.out.println("The grade of the student is AA");
		else if(a>80 && a<=90 )
			System.out.println("The grade of the student is AB");
		else if(a>70 && a<=80 )
			System.out.println("The grade of the student is BB");
		else if(a>60 && a<=70 )
			System.out.println("The grade of the student is BC");
		else if(a>50 && a<=60 )
			System.out.println("The grade of the student is CD");
		else if(a>40 && a<=50 )
			System.out.println("The grade of the student is DD");
		else 
			System.out.println("The  student failed");
		
		
	}
}
