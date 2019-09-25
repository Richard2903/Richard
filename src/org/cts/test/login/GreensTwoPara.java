package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTwoPara {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dr\\eclipse-workspace\\SeleniumDayTwo\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.greenstechnologies.in/selenium-training.php");
		WebElement onePara = d.findElement(By.xpath("//p[contains(text(), 'Rated As ')]"));
		String t = onePara.getText();
		WebElement twoPara = d.findElement(By.xpath("//p[contains(text(), ' Learn ')]"));
		String t1 = twoPara.getText();
		System.out.println(t);
		System.out.println(t1);
}
}