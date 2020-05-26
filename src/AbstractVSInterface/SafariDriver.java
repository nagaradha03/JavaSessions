package AbstractVSInterface;

public class SafariDriver implements WebDriver {
    public SafariDriver() {
    	System.out.println("launching safari driver ");
    }
	@Override
	public void get(String url) {
		System.out.println("get the url:"+url);
		
	}

	@Override
	public void close() {
		System.out.println("close the browser");
		
	}

	@Override
	public void getTitle() {
		System.out.println("get the title");
		
	}

	@Override
	public void getCurrentUrl() {
		System.out.println("get the current url");
		
	}

	@Override
	public void findElement(String Element) {
		System.out.println("get the element "+Element);
		
	}

}
