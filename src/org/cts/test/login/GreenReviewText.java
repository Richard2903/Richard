package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenReviewText {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dr\\eclipse-workspace\\SeleniumDayTwo\\driver\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("http://www.greenstechnologys.com/");
	WebElement txtDisplay = d.findElement(By.xpath("//h2[text()='Greens Technologys Overall Reviews']"));
	String t = txtDisplay.getText();
	System.out.println(t);
}
}
