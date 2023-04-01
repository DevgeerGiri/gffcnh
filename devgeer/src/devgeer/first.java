package devgeer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {

	public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver", "D:\\devgeer automation\\chromedriver_win32\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		
		System.out.println("hiii");
		driver.close();
		int a=10,b=5,c=a+b;
		
		System.out.println(c);
	 

	}

}
