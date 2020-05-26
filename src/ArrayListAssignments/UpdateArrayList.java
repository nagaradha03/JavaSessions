//WAP  to update specific array element by given element.
package ArrayListAssignments;
import java.util.ArrayList;
public class UpdateArrayList {
	public static void main(String[] args) {
	ArrayList<Integer> ar=new ArrayList<Integer>();
	ar.add(100);
	ar.add(200);
	ar.add(300);
	ar.add(400);
	System.out.println("Array elememts are");
	for(int i=0;i<ar.size();i++) {
		System.out.println(ar.get(i));
	}
	System.out.println("*********");
	System.out.println("Update value 200 to 20");
	ar.set(1,20);
	for(int i=0;i<ar.size();i++) {
		System.out.println(ar.get(i));
	}

	}

}
