//.Write a function/ method to reverse your own name.
package StringManipulationAssignments;

public class ReverseName {

	public static void main(String[] args) {
		String str="NagaRadha";
		String temp=" ";
		for(int i=str.length()-1;i>=0;i--) {
			 temp=temp+str.charAt(i);
			
		}
		System.out.println("Reverse of name is:"+temp);
	
	}
}
