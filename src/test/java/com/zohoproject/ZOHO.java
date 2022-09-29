package com.zohoproject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZOHO {
public static void logionzohopage() throws InterruptedException {
	// TODO Task-1
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Sathish\\eclipse-workspace\\Siva\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.zoho.com/login.html");
	driver.manage().window().maximize();
    WebElement findElement = driver.findElement(By.xpath("//a[text()='Sign Up Now']"));
    findElement.click();
    WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
    email.sendKeys("abcefgh@gmail.com");
    WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
    password.sendKeys("abc@12345678");
    WebElement button = driver.findElement(By.className("unchecked"));
    button.click();
    WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
    login.click();
    
}

	public static void main(String[] args) throws InterruptedException {
		logionzohopage();
	}

}
