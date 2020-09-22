package _2_Generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class _2_Base_Test implements _1_Auto_Constant
{

	public WebDriver driver;
	
	@BeforeClass
	public void OpenBrowser()
	{
		System.setProperty(chrome_key, chrome_value);
		driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(url);
        
	}
		
	
	
	
}
