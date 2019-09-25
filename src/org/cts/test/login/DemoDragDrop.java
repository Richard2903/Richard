package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoDragDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dr\\eclipse-workspace\\SeleniumDayTwo\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.navigate().to("http://demo.guru99.com/test/drag_drop.html");
		WebElement src = d.findElement(By.id("credit2"));
		WebElement desc = d.findElement(By.id("bank"));
		Actions a = new Actions(d);
		a.dragAndDrop(src, desc).perform();
		WebElement src1 = d.findElement(By.id("fourth"));
		WebElement desc1 = d.findElement(By.id("amt7"));
		a.dragAndDrop(src1, desc1).perform();
		WebElement src2 = d.findElement(By.id("credit1"));
		WebElement desc2 = d.findElement(By.id("loan"));
		a.dragAndDrop(src2, desc2).perform();
		WebElement src3 = d.findElement(By.id("fourth"));
		WebElement desc3 = d.findElement(By.id("amt8"));
		a.dragAndDrop(src3, desc3).perform();
}
}