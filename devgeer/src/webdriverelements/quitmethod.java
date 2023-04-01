package webdriverelements;

import org.openqa.selenium.chrome.ChromeDriver;

public class quitmethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("hi");
		Thread.sleep(3000);
		driver.quit();
	}
	

}
