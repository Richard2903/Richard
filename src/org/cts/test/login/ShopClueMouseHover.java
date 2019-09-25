package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopClueMouseHover {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dr\\eclipse-workspace\\SeleniumDayTwo\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.navigate().to("https://www.shopclues.com/wholesale.html");
		WebElement mouse1 = d.findElement(By.id("nav_44"));
		Actions a = new Actions (d);
		a.moveToElement(mouse1).perform();
		Thread.sleep(10000);
		WebElement buttonSelect = d.findElement(By.xpath("//a[contains(text(),'Rs.5001')]"));
		buttonSelect.click();
}
}