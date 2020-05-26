// Assume that a string consists of 3 words, print out the middle one. 
package StringManipulationAssignments;

public class MiddleWord {

	public static void main(String[] args) {		
		String str="Naveen Automation Labs";
		String words[]=str.split(" ");
		
		System.out.println("Middle word of the given string is:"+words[1]);
	}

}
