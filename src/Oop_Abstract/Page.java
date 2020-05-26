package Oop_Abstract;

public abstract class Page {
	public  Page() {
		System.out.println("Pageclass...Constructor");
	}
	public abstract void header();
	public abstract void title();
	public void getPageInfo() {
		System.out.println("Page...getpageinfo");
	}

}
