package ExceptionHandling;

public class ThrowsKeyword {

	public static void main(String[] args)  {
		ThrowsKeyword a=new ThrowsKeyword();
		try {
			a.m1();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
   public void m1() throws Exception {
	m2();
    }
   public void m2() throws Exception {
	m3();	
   }
   public void m3() throws Exception{
	   int i=9/0;
		
   }
}

