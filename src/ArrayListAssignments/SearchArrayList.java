//WAP to search an element in a array list
package ArrayListAssignments;
import java.util.ArrayList;
public class SearchArrayList {
	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Radha");
		ar.add("Monica");
		ar.add("Kishore");
		System.out.println("Arraylist elements are:");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("**********");
		boolean br=ar.contains("Monica");
		if(br) {
			System.out.println("Arraylist contains Monica");
		}
		else {
			System.out.println("Arraylist doesn't have Moninca");
		}
	}

}
