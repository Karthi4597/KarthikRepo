package vTiger.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFilePractice {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream(".\\src\\test\\resources\\commonsData.properties");
		Properties pr = new Properties();
		pr.load(file);
		
		String URL=pr.getProperty("url");
		String UN = pr.getProperty("username");
		String PW = pr.getProperty("password");
		
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(PW);
	}

}
