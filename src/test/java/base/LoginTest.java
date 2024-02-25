package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;
	
	public void setUp() throws IOException{
		
		if (driver==null) {
			
		FileReader fr = new FileReader("C:\\workspace\\HIS_Testing\\HISAutomationFramework\\src\\test\\resources\\configfiles\\config.properties");
		prop.load(fr);
					
		}
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"));
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		
			}
		
				
		
		public void tearDown() {
			
		driver.close();
		
		
	}
	
}


