package webdriverelements;

import org.openqa.selenium.chrome.ChromeDriver;

public class closemethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omaya.blogspot.com");
		Thread.sleep(3000);
		driver.close();


	}

}
