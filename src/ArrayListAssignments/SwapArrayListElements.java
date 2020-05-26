//WAP swap two elements in an array list.
package ArrayListAssignments;
import java.util.ArrayList;
 class SwapElements{
	public static void swap( ArrayList list,int fi,int si) {
		Object temp=list.get(fi);
		list.set(fi,list.get(si));
		list.set(si, temp);	} }
public class SwapArrayListElements {
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
			System.out.println(ar.get(i));}
		System.out.println("**********");
		System.out.println("After swapping elements in arraylst");
		SwapElements.swap(ar,0,3);
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		
	}

}
