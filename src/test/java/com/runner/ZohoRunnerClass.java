package com.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclase.ZohoBaseClass;

import ZohoProperties.ConfigrationHelper;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//report --folder name ;jsonreport--file name 
//json formatter

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\zoho.feature", glue = "com.stepdefinition", monochrome = true,plugin={"pretty","json:Reports/jsonreport.json","html:Reports/htmlreport.html"})

public class ZohoRunnerClass {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() throws Exception {
		String browser = ConfigrationHelper.getInstance().getBrowser();
		driver = ZohoBaseClass.browserLaunch(browser);
		ZohoBaseClass.threadsleepBaseClass();
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void teardown() {
		driver.close();
	}

}
