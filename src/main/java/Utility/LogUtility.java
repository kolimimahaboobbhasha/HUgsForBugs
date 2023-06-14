package Utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

public class LogUtility {
	Logger logger=Logger.getLogger(LogUtility.class);
	public void info(String message)
	{  
		PropertyConfigurator.configure("D:\\Projects\\miinnwest\\BashaFramework\\src\\test\\resources\\Log4j (1).properties");
		logger.info(message);
	}
	public void error(String message)
	{ PropertyConfigurator.configure("D:\\Projects\\miinnwest\\BashaFramework\\src\\test\\resources\\Log4j (1).properties");
		logger.error(message);
	}
	public void Error(String message)
	{
		PropertyConfigurator.configure("D:\\Projects\\miinnwest\\BashaFramework\\src\\test\\resources\\Log4j (1).properties");
		logger.error(message);
	}
}