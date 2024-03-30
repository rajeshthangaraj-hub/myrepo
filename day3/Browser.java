package week1.day3;

public class Browser {
	
	public static void main(String[] args) {
		
		Browser obj= new Browser();
		obj.launchBrowser("Edge");
		obj.loadUrl();
		String browser = launchBrowser("chrome");
		System.out.println("Print inside main method = "+ browser);
				
	}
	
	public static String launchBrowser(String browserName) {
		
   System.out.println("Browser launched SU");
	return(browserName);
	}
	
	public void loadUrl() {
		System.out.println("Application loaded SU");
	}

}
