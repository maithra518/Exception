package Exception;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExceptionHandling {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe/");
		WebDriver dr=new ChromeDriver(option);
		dr.get("https://in.via.com/");
		
		dr.findElement(By.xpath("//div[contains(@class,'viaAlertClose')]")).click();
		
		
		try {
			dr.findElement(By.xpath("//div[contains(text(),'Sign In')]")).click();
		} catch (ElementClickInterceptedException e) {
			System.out.println(e.getMessage());
			
		}
		dr.findElement(By.xpath("//input[@id='loginIdText']")).sendKeys("testuser");

	}

}
