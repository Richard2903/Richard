package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMouseHover {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dr\\eclipse-workspace\\SeleniumDayTwo\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.navigate().to("https://www.flipkart.com/");
		WebElement clckLogin = d.findElement(By.xpath("//a[contains(text(),'Login ')]"));
		clckLogin.click();
		WebElement txtUser = d.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtUser.sendKeys("9840820045");
		WebElement txtPass = d.findElement(By.xpath("//input[@type='password']"));
		txtPass.sendKeys("Ronaldo@123");
		WebElement btnLogin = d.findElement(By.xpath("(//button[@type='submit'])[2]"));
		btnLogin.click();
		WebElement mouse1 = d.findElement(By.xpath("//span[text() = 'Home & Furniture']"));
		Actions a = new Actions (d);
		a.moveToElement(mouse1).perform();
}
}