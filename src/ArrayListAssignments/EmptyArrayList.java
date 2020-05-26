//WAP  to empty an array list.
package ArrayListAssignments;
import java.util.ArrayList;
public class EmptyArrayList {
	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Radha");
		ar.add("Monica");
		ar.add("Kishore");
		ar.add("Abhinav");
		ar.add("Jyothsna");
		ar.add("varma");
		System.out.println("Arraylist elements are:");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
        System.out.println("**********");
        System.out.println("After delete elments in arraylist");
			ar.removeAll(ar);
			System.out.println(ar);
		
	}

}
