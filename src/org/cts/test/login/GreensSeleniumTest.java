package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensSeleniumTest {
			public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dr\\eclipse-workspace\\SeleniumDayTwo\\driver\\chromedriver.exe");
			WebDriver d = new ChromeDriver();
			d.navigate().to("http://greenstech.in/selenium-course-content.html");
			WebElement mouse1 = d.findElement(By.xpath("//a[text()='COURSES']"));
			Actions a = new Actions(d);
			a.moveToElement(mouse1).perform();
			WebElement mouse2 = d.findElement(By.xpath("//span[contains(text(),'Software ')]"));
			a.moveToElement(mouse2).perform();
			WebElement button1 = d.findElement(By.xpath("(//span[contains(text(),'Selenium')])[1]"));
			button1.click();
			WebElement paraThree = d.findElement(By.xpath("//p[contains(text(), 'Our ')]"));
			String text = paraThree.getText();
			System.out.println(text);
}
}