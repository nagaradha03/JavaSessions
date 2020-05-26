package AbstractVSInterface;

public class LoginPageTest {

	public static void main(String[] args) {
		String browser="firefox";
		WebDriver driver=null;
		if(browser.equals("chrome")){
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver=new FireFoxDriver();
		}
		else if(browser.equals("safari")) {
			driver=new SafariDriver();
		}
		driver.get("https://www.google.com");
		driver.getTitle();
		driver.getCurrentUrl();
		driver.findElement("element");
		driver.close();

	}

}
