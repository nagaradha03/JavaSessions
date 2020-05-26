package Oop_Abstract;

public class LoginPage extends Page {
	public LoginPage() {
		System.out.println("LoginPage....constructor");
	}

	@Override
	public void header() {
		System.out.println("LoginPage....Header");
		
	}

	@Override
	public void title() {
		System.out.println("LoginPage.....Title");
	}
	public void doLogin(String userName,String Password) {
		System.out.println("LoginWith....."+ userName  + Password);
	}

}
