//get only numeric part from this String:
package StringManipulationAssignments;

public class NumericPartString {

	public static void main(String[] args) {
		String str="your transaction id is: 12345";
		String str1=str.replaceAll("[^0-9]","");
		System.out.println(str1);

	}

}
