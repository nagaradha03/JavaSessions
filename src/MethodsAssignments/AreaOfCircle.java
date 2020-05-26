//WAP to print the circumference and area of a circle of radius entered by user by defining your own method.
package MethodsAssignments;
import java.util.Scanner;
public class AreaOfCircle {
	public static void main(String[] args) {
		AreaOfCircle a=new AreaOfCircle();
		a.areaCircumference();
	}
	public void areaCircumference() {
		//area =PI.r.r;
		//circumference=2*PI*r;
		Scanner s=new Scanner(System.in);
		int radius;
		System.out.println("Enter Radius:");
		radius=s.nextInt();
	    double area=Math.PI*radius*radius;
	    double circumference=2*Math.PI*radius;
	  System.out.println("Area of a circle: "+area);
	  System.out.println("Circumference of a circle : "+circumference);	
	}

}
