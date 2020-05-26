// WAP to print all the elements of a ArrayList using the position of the elements
package ArrayListAssignments;
import java.util.ArrayList;
public class PrintPositionElements {
	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<Integer>(10);
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		System.out.println("Print the 2nd element to last element");
		for(int i=1;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}

	}

}
