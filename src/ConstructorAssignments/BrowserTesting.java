package ConstructorAssignments;
import java.util.ArrayList;
public class BrowserTesting {
	public static void main(String[] args) {
		ArrayList<String>PlugIns=new ArrayList<String>();
		PlugIns.add("ABP");
		PlugIns.add("LastPass");
		PlugIns.add("FireBug");
		
		Browser chrome=new Browser("ChromeBrowser",81);
		Browser Firefox=new Browser("FirefoxBrowser","Infosys",11,PlugIns);
		Browser Safari= new Browser("SafariBrowser","Tcs");

		System.out.println(chrome.currentVersion);
		System.out.println(Firefox.vendorName +" " +Firefox.currentVersion +" "+Firefox.plugIns);
		System.out.println(Safari.getVendorName());
	}
	

}
