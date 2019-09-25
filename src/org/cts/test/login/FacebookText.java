package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dr\\eclipse-workspace\\SeleniumDayTwo\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.navigate().to("https://www.facebook.com/");
		//Case 1 correct user name and password
		WebElement txtUser = d.findElement(By.id("email"));
		txtUser.sendKeys("richard.nov6@gmail.com");
		WebElement txtPass = d.findElement(By.name("pass"));
		txtPass.sendKeys("Sangi-09");
		WebElement button = d.findElement(By.xpath("//input[@type='submit']"));
		button.click();
		d.close();
		//Case 2 correct user name and incorrect password
		WebDriver dr = new ChromeDriver();
		dr.navigate().to("https://www.facebook.com/");
		WebElement txtUser1 = dr.findElement(By.id("email"));
		txtUser1.sendKeys("richard.nov6@gmail.com");
		WebElement txtPass1 = dr.findElement(By.name("pass"));
		txtPass1.sendKeys("12345");
		WebElement button1 = dr.findElement(By.xpath("//input[@type='submit']"));
		button1.click();
		dr.close();		
		//Case 3 incorrect user name and correct password
		WebDriver dr1 = new ChromeDriver();
		dr1.navigate().to("https://www.facebook.com/");
		WebElement txtUser2 = dr1.findElement(By.id("email"));
		txtUser2.sendKeys("");
		WebElement txtPass2 = dr1.findElement(By.name("pass"));
		txtPass2.sendKeys("Sangi-09");
		WebElement button2 = dr1.findElement(By.xpath("//input[@type='submit']"));
		button2.click();
		dr1.close();	
		//Case 4 incorrect user name and incorrect password
		WebDriver dr2 = new ChromeDriver();
		dr2.navigate().to("https://www.facebook.com/");
		WebElement txtUser3 = dr2.findElement(By.id("email"));
		txtUser3.sendKeys(" ");
		WebElement txtPass3 = dr2.findElement(By.name("pass"));
		txtPass3.sendKeys(" ");
		WebElement button3 = dr2.findElement(By.xpath("//input[@type='submit']"));
		button3.click();
		dr2.close();	
}
}