// WAP to print 1 to 10 using while loop but quit if multiple of 7 is encountered
package Assignments;
public class LoopsAssignment5 {
	public static void main(String[] args) {
	int i=1;
	while(i<10) {
		System.out.println(i);
		if(i%7==0) {
			System.out.println("Multiple of 7 quitting the loop");
		break;
		}	
		i++;
	}
	}

}
