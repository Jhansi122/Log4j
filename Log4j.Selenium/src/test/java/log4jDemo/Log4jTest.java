package log4jDemo;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Log4jTest
{
	WebDriver driver;

@Test
 public void logger() {
	Logger log = Logger.getLogger(Log4jTest.class);
	PropertyConfigurator.configure("C:\\Users\\JHANSI\\git\\log4j\\Log4j.Selenium\\src\\main\\resources\\log4j.properties");
	System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Selenium\\Geckodriver\\geckodriver.exe\\");
	driver= new FirefoxDriver();
	log.info("Webbrowser Started");
	driver.get("http://google.com/");
	log.info("URL Opened");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	log.warn("waiting for the webpage to load");
	driver.close();
	log.info("Driver closed");
	
}
}
