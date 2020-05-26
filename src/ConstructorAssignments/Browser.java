package ConstructorAssignments;
import java.util.ArrayList;
public class Browser {
	String browserName;
	String vendorName;
	int currentVersion;
	ArrayList<String> plugIns;
	public Browser(String browserName, int currentVersion) {
		this.browserName = browserName;
		this.currentVersion = currentVersion;
	}
	public Browser(String browserName, String vendorName) {
		this.browserName = browserName;
		this.vendorName = vendorName;
	}
	public Browser(String browserName, String vendorName, int currentVersion, ArrayList<String> plugIns) {
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
		this.plugIns = plugIns;
	}
	public String getBrowserName() {
		return this.browserName;
	}
	public String getVendorName() {
		return this.vendorName;
	}
	public int getCurrentVersion() {
		return this.currentVersion;
	}
	public ArrayList<String> getPlugIns() {
		return this.plugIns;
	}
	
	
	

}
