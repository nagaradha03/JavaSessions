package AbstractVSInterface;

public class FireFoxDriver implements WebDriver{
	public FireFoxDriver() {
		System.out.println("launching Firefox driver ");
	}

	@Override
	public void get(String url) {
		System.out.println("launch url "+url);
		
	}

	@Override
	public void close() {
		System.out.println("close the url");
	}

	@Override
	public void getTitle() {
		System.out.println("get the title ");
		
	}

	@Override
	public void getCurrentUrl() {
		System.out.println("get the current url");
		
	}

	@Override
	public void findElement(String Element) {
		System.out.println("find element"+ Element);
		
	
	}
}
