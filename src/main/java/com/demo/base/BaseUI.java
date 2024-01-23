package com.demo.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;

public class BaseUI {

	public static Properties prop;
	public String configPath = System.getProperty("user.dir")+"/resources/configuration/config,properties";
	public static WebDriver driver;
	
	@BeforeTest
	public void loadConfig() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream(configPath);
		System.out.println("Configuration File Path is :"+ configPath);
		prop.load(fis);
		
	}
	
	public static void launchApplication()
	{
		String browserName = prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
		driver= new ChromeDriver();	
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();	
		}
		
		else
		{
			driver= new InternetExplorerDriver();	
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(prop.getProperty("url"));

	}
	
	
	
	
	
	
	
	
}
