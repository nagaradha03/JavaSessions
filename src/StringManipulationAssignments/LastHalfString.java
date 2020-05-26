//Write a program that gives you last half of the string.
package StringManipulationAssignments;

import java.util.Scanner;

public class LastHalfString {

	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Sring");
	String str=s.next();
     int length=str.length();
     System.out.println("second half of the sring is:"+str.substring(length/2));
	
	}

}
