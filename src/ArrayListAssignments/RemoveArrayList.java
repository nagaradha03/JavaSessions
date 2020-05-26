//WAP  to remove the third element from a array list
package ArrayListAssignments;
import java.util.ArrayList;
public class RemoveArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(1000);
		ar.add(2000);
		ar.add(3000);
		ar.add(4000);
		ar.add(5000);
		System.out.println("Array elements are:");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("**********");
		System.out.println("After removing the third element of an arraylist");
		ar.remove(2);
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}

	}

}
