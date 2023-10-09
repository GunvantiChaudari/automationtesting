package OpenBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\AUTOMATION SESSION\\Workspace\\SeleniumBasic\\Drivers\\chromedriver-win32\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver() ;
	}

}
