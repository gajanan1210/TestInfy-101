import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestNew {

	public static void main(String[] args) throws InterruptedException {
		
		
		

	    //System.setProperty("webdriver.chrome.driver", "C:/Users/gajanan.heddure/Documents/NewChrome/chromedriver_110/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
		
		driver.get("https://www.infijoy.com/");
		
		
		
		
		
	
		Thread.sleep(35000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement shawdow = (WebElement) js.executeScript("return document.querySelector(\"div#usercentrics-root\").shadowRoot.querySelector(\"button[data-testid='uc-deny-all-button']\")");
		shawdow.click();
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='About']")).click();
		Thread.sleep(5000);
		
		//System.out.println(driver.getCurrentUrl());
		String URL = driver.getCurrentUrl();
		
		if (URL.endsWith("about-us"))
		{
			System.out.println("Link is working & URL is -: " + URL);
		}
		else
		{
			System.out.println("Link not working");
		}
		 
		String Title = driver.getTitle();
		System.out.println("Title of About Us page -: " +Title);
		Thread.sleep(10000);
		
		
		System.out.println("Validation of About Us Page is as below");
		
		
		
		boolean t3 = driver.findElement(By.xpath("//button[text()='Join Our Team']")).isDisplayed();
		if (t3) {
	         System.out.println("Join Our Team Button is Present");
	      } else {
	         System.out.println("Join Our Team Button is not Present");
	      }
		
		/*
		try {
		       new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='Join Our Team']")));
		       System.out.println("Element is clickable");
		     }
		catch(TimeoutException e) {
		       System.out.println("Element isn't clickable");
		    }
		*/
		
		
		
	

		
		
		
		
		
		
		
		
		
		
		
		boolean t = driver.findElement(By.xpath("//h2[text()='Our Mission']")).isDisplayed();
		if (t) {
	         System.out.println("Our Mission Header is Present");
	      } else {
	         System.out.println("Our Mission Header is not Present");
	      }
		
		
		
		
		
	
		
		boolean t1 = driver.findElement(By.xpath("//h2[text()='Our Values']")).isDisplayed();
		
		if (t1) {
	         System.out.println("Our Values Header is Present");
	      } else {
	         System.out.println("Our Values Header is not Present");
	      }
		
		
		
		boolean t2 = driver.findElement(By.xpath("//h2[text()='Our Message']")).isDisplayed();
		
		if (t2) {
	         System.out.println("Our Message Header is Present");
	      } else {
	         System.out.println("Our Message Header is not Present");
	      }
		
		
		
		
		//driver.close();

	}

}
