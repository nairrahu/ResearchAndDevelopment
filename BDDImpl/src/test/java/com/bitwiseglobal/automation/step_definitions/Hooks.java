package com.bitwiseglobal.automation.step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	private static WebDriver webDriver = null;
	
	public static WebDriver getDriver() {
		return webDriver;
	}
	
	@Before
	public void initializeDrivers(Scenario scenario) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		webDriver = new ChromeDriver();
	}
	
	@After
	public void destroyDriver(Scenario scenario) {
		webDriver.quit();
	}
}
