package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dr\\eclipse-workspace\\SeleniumDayTwo\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.shopclues.com/wholesale.html");
		WebElement txtSearch = d.findElement(By.xpath("//input[@id='autocomplete']"));
		txtSearch.sendKeys("watch");
		Thread.sleep(5000);
		WebElement btnSearch = d.findElement(By.xpath("(//input[@type='submit'])[3]"));
		btnSearch.click();
		Thread.sleep(10000);
		WebElement clckOption = d.findElement(By.xpath("(//a[contains(text(),' for men in ')]"));
		clckOption.click();
		Thread.sleep(10000);
		WebElement clckWatch = d.findElement(By.xpath("//h2[contains(text(),'True')]"));
		clckWatch.click();
		WebElement addCart = d.findElement(By.xpath("//button[contains(text(),'Add')]"));
		addCart.click();
		WebElement clckCart = d.findElement(By.xpath("//span[contains(text(),'1')]"));
		clckCart.click();
		WebElement txtValue = d.findElement(By.xpath("(//span[contains(text(),'Rs')])[5]"));
		String t = txtValue.getText();
		System.out.println("Rate is" +t);
		
}
}