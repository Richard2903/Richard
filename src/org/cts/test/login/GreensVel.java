package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensVel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dr\\eclipse-workspace\\SeleniumDayTwo\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.google.com/");
		WebElement txtSearch = d.findElement(By.xpath("//input[@title='Search']"));
		txtSearch.sendKeys("greens velmurugan");
		WebElement searchResult = d.findElement(By.xpath("//span[contains(text(),'greens')]"));
		//searchResult.getText();
		searchResult.click();
}
}