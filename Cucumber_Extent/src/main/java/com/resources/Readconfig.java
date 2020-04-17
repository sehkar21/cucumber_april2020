package com.resources;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {

	Properties prop;
	
	public Readconfig() {
		File src = new File("C:\\Users\\sehkar\\eclipse-workspace\\New folder\\Cucumber_Extent\\configurations\\config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
			}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
		public String browser() {
			String browser = prop.getProperty("browser");
			return browser;
		}
		
		public String Applicationurl() {
			String url = prop.getProperty("url");
			return url;
		}
		
		public String username() {
			String user = prop.getProperty("username");
			return user;
		}
		
			public String password() {
				String pwd = prop.getProperty("password");
				return pwd;
		}
	
}
