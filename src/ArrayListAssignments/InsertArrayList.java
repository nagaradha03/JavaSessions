//WAP to insert an element into the array list at the first and last positions.
package ArrayListAssignments;
import java.util.ArrayList;
public class InsertArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> ar= new ArrayList<Integer>();
		ar.add(200);
		ar.add(300);
		ar.add(400);
		ar.add(500);
		System.out.println("Arraylist elements are:");
		for(int i=0;i<ar.size();i++) {
		System.out.println(ar.get(i));}
		System.out.println("Insert an element in the first position:");
		ar.add(0,100);
		for(int i=0;i<ar.size();i++) {
		System.out.println(ar.get(i));}
		System.out.println("Insert an element in the last position:");
		ar.add(ar.size(),600);
		for(int i=0;i<ar.size();i++) {
		System.out.println(ar.get(i));}
	}

}
