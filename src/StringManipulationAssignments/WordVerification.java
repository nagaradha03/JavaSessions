//Write a program to verify a word or a character contains in the sentence.
package StringManipulationAssignments;

public class WordVerification {

	public static void main(String[] args) {
		String str="This is a java program";
		if(str.contains("is")) {
			System.out.println("The String contains the given word");
		}
		else
			System.out.println("The string doesn't have the given word");

	}

}
