package vTiger.genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileLibrary {
	
	public String readDataFromPropertyFile(String key) throws IOException
	{
		FileInputStream f=new FileInputStream(IConstantLibrary.propertyFileData);
		Properties p=new Properties();
		p.load(f);
		String value = p.getProperty(key);
		return value;
	}

}
