package Exception;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) {
		//ChromeOptions option=new ChromeOptions();
		//option.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe/");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.amazon.in/");
		Actions action=new Actions(dr);
		WebElement ele=dr.findElement(By.xpath("//span[contains(@class,'nav-line-2')][contains(text(),'Account & Lists')]"));
				action.moveToElement(ele).perform();
		dr.findElement(By.xpath("//span[contains(text(),'Your Account')]")).click();

	}

}
