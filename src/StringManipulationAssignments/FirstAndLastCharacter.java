// Write a program that will  print out last character and first character of a word.
package StringManipulationAssignments;

public class FirstAndLastCharacter {

	public static void main(String[] args) {
		String str="Selinium";
		char c1=str.charAt(0);
		System.out.println("First character of the given word is:"+c1);
		char c2=str.charAt(str.length()-1);
		System.out.println("Last character of the given word is:"+c2);
	}

}
