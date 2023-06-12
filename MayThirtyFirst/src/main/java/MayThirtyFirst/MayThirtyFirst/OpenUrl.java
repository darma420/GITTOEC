package MayThirtyFirst.MayThirtyFirst;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(5000);
		driver.close();	}

}
}
