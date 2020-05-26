package AbstractVSInterface;

public class ChromeDriver implements WebDriver {
	public ChromeDriver() {
		System.out.println("launching chrome driver ");
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
