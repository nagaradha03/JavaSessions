// Write a program that breaks a whole string into small strings, and print out its all values .
package StringManipulationAssignments;

public class SmallStrings {

	public static void main(String[] args) {
		String str="This is a java program";
		String words[]=str.split(" ");
		for (int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
		
	}

}
