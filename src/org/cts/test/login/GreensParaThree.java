package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensParaThree {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dr\\eclipse-workspace\\SeleniumDayTwo\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.greenstechnologies.in/selenium-training.php");
		WebElement paraThree = d.findElement(By.xpath("//p[contains(text(), 'Our ')]"));
		String text = paraThree.getText();
		System.out.println(text);
		
	}
}
