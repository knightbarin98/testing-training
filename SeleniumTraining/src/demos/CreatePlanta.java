package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreatePlanta {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/home/mrbarin/Documents/SDET/geckodriver-v0.33.0-linux64/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://localhost:96/login");
		driver.findElement(By.name("email")).sendKeys("contacto@tresfactorial.com");
		driver.findElement(By.name("password")).sendKeys("secret");
		driver.findElement(By.id("login")).click();
		
		//driver.get("http://localhost:96/");
		driver.findElement(By.linkText("Administracion")).click();
		driver.findElement(By.linkText("Plantas")).click();
	}
}
