//WAP to retrieve an element (at a specified index) from a given array list.
package ArrayListAssignments;
import java.util.ArrayList;
public class RetrieveArrayList {
	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Radha");
		ar.add("Monica");
		ar.add("Kishore");
		System.out.println("Arraylist elements are:");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("*********");
		System.out.println("To retrieve at the first index element ");
		System.out.println(ar.get(1));
	}

}
