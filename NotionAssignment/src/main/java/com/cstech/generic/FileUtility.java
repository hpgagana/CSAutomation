package com.cstech.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream fileread = new FileInputStream("./src/test/resources/data/Data-data.property");
		Properties pobj = new Properties();
		pobj.load(fileread);
		String value = pobj.getProperty(key);
		return value;
	}
}
