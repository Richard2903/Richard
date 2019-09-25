package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTestimonial {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dr\\eclipse-workspace\\SeleniumDayTwo\\driver\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("http://www.greenstechnologies.in/selenium-training.php");
	WebElement paraTest = d.findElement(By.xpath("(//span[contains(text(), '  ')])[2]"));
	String t = paraTest.getText();
	System.out.println(t);
}
}
