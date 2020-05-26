package ExceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		try {
		int i=9/0;
		System.out.println("B");
		System.out.println("A");
		}
		/*catch(Exception e) {
			System.out.println("AB");
			e.printStackTrace();
		}*/
		catch(Throwable t) {
			System.out.println("ABC");
			t.printStackTrace();
			
		}
	}
}
