// WAP to trim the virtual capacity of an array list the current list size.
package ArrayListAssignments;
import java.util.ArrayList;
public class TrimSizeArraylist {
	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<Integer>(10);
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		ar.trimToSize();
		System.out.println(ar);

	}

}
