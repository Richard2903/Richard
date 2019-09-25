package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptSample {
		public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dr\\eclipse-workspace\\SeleniumDayTwo\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.navigate().to("https://www.facebook.com");
		JavascriptExecutor js = (JavascriptExecutor) d;
		WebElement txtUser = d.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value', 'Richard')", txtUser);
		String name = (String) js.executeScript("return arguments[0].getAttribute('value')", txtUser);
		System.out.println(name);
		WebElement txtPass = d.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value', '12345')", txtPass);
		String name1 = (String) js.executeScript("return arguments[0].getAttribute('value')", txtPass);
		System.out.println(name1);
		String name2 = (String) js.executeScript("return arguments[1].getAttribute('value')", txtPass, txtUser);
		System.out.println(name2);
}
}