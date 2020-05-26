//Write a method which gives index of (-1) if string is not available. . it should return integer. 
//if String is present, then it should return the specific index.
package StringManipulationAssignments;

public class StringCheck {
     public static int CheckString(String str,String substr) {
    	 int str1;
    	 if(str.contains(substr)) {
    		 str1= str.indexOf(substr);
    		 return str1;
    	 } 
		else {
			return -1;
    		 }
     }
	public static void main(String[] args) {
		String str="I like my pet fish";
		String substr="our";
		int value=CheckString(str,substr);
		System.out.println(value);
		 
		
	}

}
