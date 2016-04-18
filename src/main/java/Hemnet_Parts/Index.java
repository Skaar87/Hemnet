package Hemnet_Parts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Index {
	
	protected static WebDriver driver;
	
	public Index(){
		if(driver == null){
		driver = new FirefoxDriver();
		
		}
	}

		public static void killDriver(){
			if(driver != null){
				driver.close();
			}
		}
		
		public void login(){
			driver.findElement(By.linkText("Logga in")).click();
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.id("anvandare_session_login")).sendKeys("silas.cagatay87@gmail.com");
			driver.findElement(By.id("anvandare_session_password")).sendKeys("123456" + Keys.ENTER);
			
		}
	}


