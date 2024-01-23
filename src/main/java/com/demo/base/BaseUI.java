package com.demo.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseUI {

	public Properties prop;
	public String configPath = System.getProperty("user.dir")+"/resources/configuration/config,properties";
	
	
	
	public void loadConfig() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream(configPath);
		System.out.println("Configuration File Path is :"+ configPath);
		prop.load(fis);
		
	}
}
