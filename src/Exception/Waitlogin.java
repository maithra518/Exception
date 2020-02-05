package Exception;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitlogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe/");
		WebDriver dr=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(dr,3);
		dr.get("https://learn.letskodeit.com/p/practice");
		dr.findElement(By.xpath("//a[@class='navbar-link fedora-navbar-link']")).click();
		WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='user_email']")));
		ele.sendKeys("maithra");
	}

}
