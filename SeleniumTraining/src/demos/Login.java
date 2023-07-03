package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		//1.Define web driver
		System.setProperty("webdriver.gecko.driver", "/home/mrbarin/Documents/SDET/geckodriver-v0.33.0-linux64/geckodriver");
		WebDriver driver = new FirefoxDriver();
		//2.Open web browser and navigate to the web application
		//http://sdettraining.com
		driver.get("http://localhost:96/login");
		
		//Find elements: locate elements, determine the action
		
		//3.Enter email address
		driver.findElement(By.name("email")).sendKeys("contacto@tresfactorial.com");
		
		//4. Enter password
		driver.findElement(By.name("password")).sendKeys("secret");
		//5. Click login
		driver.findElement(By.id("login")).click();
		//6. Get confirmation
		String name = driver.findElement(By.id("navbarDropdown")).getText();
		System.out.println("CONFIRMATION "+ name);
		//7. Close the browser
		driver.close();
		
	}

}
