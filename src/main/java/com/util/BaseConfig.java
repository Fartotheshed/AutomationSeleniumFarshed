package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class BaseConfig {
	public static String getConfig(String value) {
		File file = new File("./Config.properties");
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		Properties pro = new Properties();
		try {
			pro.load(fis);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(pro.getProperty(value));
		
		return pro.getProperty(value);
	}
	public static void main(String[] args) {
		BaseConfig.getConfig("URL");
	}
}
