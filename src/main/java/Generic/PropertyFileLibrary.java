package Generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileLibrary {

	public String ReadDataFromPropertyFile(String key) throws IOException
	{
		FileInputStream fs=new FileInputStream(IConstantLibrary.ProperyFilePath);
		Properties p=new Properties();
		p.load(fs);
		String value = p.getProperty(key);
		return value;
	}
}
