package StringManipulationAssignments;

public class ThirdOccurence {

	public static void main(String[] args) {
		String str="Welcome to Naveen Automation Lab ! ";
		System.out.println(str.indexOf('e'));//first occurrence
		System.out.println(str.indexOf('e',str.indexOf('e')+1));//2nd occurrence
		System.out.println(str.indexOf('e',str.indexOf('e',str.indexOf('e')+1)+1));//3rd occurrence
	}

}
