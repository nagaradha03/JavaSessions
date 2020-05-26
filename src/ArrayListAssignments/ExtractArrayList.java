//WAP to extract a portion of a array list.
package ArrayListAssignments;
import java.util.ArrayList;
public class ExtractArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		System.out.println("Array elements are:");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("*******");
		System.out.println("Get the last 3 elements of ArrayList");
		System.out.println(ar.subList(2, 5));
		
	}

}
