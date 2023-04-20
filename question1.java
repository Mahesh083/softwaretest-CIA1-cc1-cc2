package PACKAGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.testng.annotations.Test;

public class question1 {
  public static void main(String[] args) {
	 
	  WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		
		driver.get("https://www.saucedemo.com/");
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		System.out.println("login successfullly");








		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		driver.findElement(By.xpath("//*[@class=\"shopping_cart_link\"]")).click();
		System.out.println(" added to cart");
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		System.out.println("Redirected to the Your information page");
		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("MAHESHWARAN");
		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("A");
		driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("635203");
		driver.findElement(By.id("continue")).click();
		
		
		String title="Swag Labs";
		String actual=driver.getTitle();
		if(title.equals(actual)) {
			System.out.println("verified the title");
		}
		else {
			System.out.println("Not verified the title");
		}
		String url="https://www.saucedemo.com/checkout-step-two.html";
		String current=driver.getCurrentUrl();
		System.out.println(current);
		if(url.equals(current)) {
			System.out.println("verified the url");
		}
		else {
			System.out.println("Not verified the url");
			
		}	
		
		
		
  }
}
