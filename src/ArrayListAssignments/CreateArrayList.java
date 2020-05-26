//WAP to create a new arraylist to add colors(string)and print out the collection.
package ArrayListAssignments;
import java.util.ArrayList;
public class CreateArrayList {
	public static void main(String[] args) {	
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("Pink");
		colors.add("Blue");
		colors.add("Black");
		colors.add("Green");
		colors.add("Red");
		colors.add("Purple");
		for(int i=0;i<colors.size();i++) {
			System.out.println(colors.get(i));
		}
		
	}

}
