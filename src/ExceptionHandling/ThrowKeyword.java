package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) throws Exception  {
		String browser="chrome";
		if(browser.equals("chrome")){
			System.out.println("launch chrome");

	}
		else if(browser.equals("Firefox")){
			System.out.println("launch firefox");

	}
		else if(browser.equals("safari")){
			System.out.println("launch safari");

	}
		else
		{
		 throw new Exception("please pass the correct browser");
		}

	String username= null;
	if(username !=null) {
		System.out.println("please login with username:"+username);
	}
	else {
		throw new Exception("DATA NOT FIND EXCEPTION");
	}
}
}
