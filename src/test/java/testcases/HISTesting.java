package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HISTesting {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
//		//EdgeDriver driver = new EdgeDriver();
//		driver.get("http://www.google.com");
//
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		
		driver.get("http://15.206.195.210/");
		System.out.println("Clicked Successfully");
		driver.findElement(By.name("user_name")).sendKeys("krishna");
		driver.findElement(By.id("password")).sendKeys("123");
		driver.findElement(By.name("action")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div/table/tbody/tr[11]/td[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"control-body\"]/nav/div/ul[1]/li[4]/a")).click();
		driver.findElement(By.className("waves-effect waves-default")).click();

	}

}
