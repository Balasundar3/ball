package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Details  {

	static WebDriver driver;

	@BeforeClass
	private void tc1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

	@Parameters({"Usee","pass"})
	@Test
	private void tc2(String text,String num) {
		WebElement hh = driver.findElement(By.id("Email"));
		hh.sendKeys(text);
		
		WebElement jj = driver.findElement(By.id("pass"));
jj.sendKeys(num);
	}

}
