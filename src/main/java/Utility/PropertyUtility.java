package Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtility {
	public String ReadDatafrompropertyfile(String Key) throws Throwable
	{
		FileInputStream file=new FileInputStream(Constantutilities.propertyfilepath);
		Properties property=new Properties();
		property.load(file);
		String values=property.getProperty(Key);
		return values;
	}

}
