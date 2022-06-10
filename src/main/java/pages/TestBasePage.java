package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBasePage {
	
	public static WebDriver driver; 
	
	public static void initDriver() { 
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver102.exe");
		driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	
	
	public static int randomNumGen(int bound) { 
		Random rnd = new Random();
		int randomNo = rnd.nextInt(bound);
		return randomNo; 
		
	}
    
	public void takesScreenshot(WebDriver driver) { 
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		String currentDirectory = System.getProperty("user.dir");
		SimpleDateFormat  formatter = new SimpleDateFormat("MMddyy_HHmmss");
		
		Date date = new Date(); 
		String label = formatter.format(date);
		
		File destFile = new File(currentDirectory + "/screenshot/" + label + ".png");
		
	    try {
			FileUtils.copyFile(sourceFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
