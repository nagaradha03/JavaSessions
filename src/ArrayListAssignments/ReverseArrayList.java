//WAP to reverse elements in a array list
// Write a Java program to reverse elements in a array list
package ArrayListAssignments;
import java.util.ArrayList;
public class ReverseArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(5);
		System.out.println("Array elements are:");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("******");
		System.out.println("Reverse elements in the arraylist");
		for(int i=ar.size()-1;i>=0;i--) {
			System.out.println(ar.get(i));
		}
	}

}
