package pagepkg_bigbus;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Datepickerandsearchbus {
	
	WebDriver d;

	public Datepickerandsearchbus(WebDriver d) {
		this.d = d;
	}

	    public void originSelect1() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("window.scrollTo(0, 200)");
		Thread.sleep(2000);
		WebElement origin = d.findElement(By.xpath("//*[@id='search-origin']/div[1]/div/div"));
		origin.click();
		Thread.sleep(2000);
		WebElement place = d.findElement(By.xpath("//*[text()='Coimbatore']"));
		place.click();
	}
	
	public void destinationSelect1() throws InterruptedException {
		// d.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(3000);   
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("window.scrollTo(0, 200)");
		
		Thread.sleep(3000);  
		WebElement destination = d.findElement(By.xpath("//*[@id='search-destination']/div/div/div/div[1]"));	
		destination.click(); 
		
		Thread.sleep(3000);
		WebElement pl = d.findElement(By.xpath("//*[@id='search-destination']/div[1]/div/div/div[2]"));
		Thread.sleep(3000);
		pl.click();   
	}
	
	public void datePick1() throws InterruptedException {
		String month = "Dec";
		String year = "2026";
		String date = "25";
		Thread.sleep(2000);
		WebElement onward = d.findElement(By.xpath("//*[@id='react-app']/div/div/div/div/form/div/div[3]/div/div/div/span/span/div/input"));		    
		onward.click();

		Thread.sleep(2000);                         
		WebElement monthElement = d.findElement(By.xpath("//*[@title='Choose a month']"));
		monthElement.click();
		
		// click dec
		Thread.sleep(2000); 
		d.findElement(By.xpath("//*[@title='Dec']")).click(); 
		Thread.sleep(2000); 
		
		// choose year
		WebElement yearElement = d.findElement(By.xpath("//*[@title='Choose a year']"));
		
		while (true) {
			String actualYear = yearElement.getText();
			System.out.println(actualYear);

			if (actualYear.equals(year)) {
				break;
			} else {
				Thread.sleep(1000);
				// next button
				d.findElement(By.xpath("//*[@title='Next year (Control + right)']")).click();
			}
		}
		
		// date select from calendar
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@title='December 25, 2026']")).click();
	}
	///////////////
	public void datePick2() throws InterruptedException {
		String month1 = "Jan";
		String year1 = "2027";
		String date1 = "25";
		Thread.sleep(2000);
		WebElement returndate = d.findElement(By.xpath("//*[@id=\"react-app\"]/div/div/div/div/form/div/div[4]/div/div/div/span/span/div/input"));		    
		returndate.click();

		Thread.sleep(2000);                         
		WebElement monthElement = d.findElement(By.xpath("//*[@title='Choose a month']"));
		monthElement.click();                              
		
		// click dec
		Thread.sleep(2000); 
		d.findElement(By.xpath("//*[@title='Jan']")).click(); 
		Thread.sleep(2000); 
		
		// choose year
		WebElement yearElement = d.findElement(By.xpath("//*[@title='Choose a year']"));
		
		while (true) {
			String actualYear = yearElement.getText();
			System.out.println(actualYear);

			if (actualYear.equals(year1)) {
				break;
			} else {
				Thread.sleep(2000);
				// next button
				d.findElement(By.xpath("//*[@title='Next year (Control + right)']")).click();
			}
		}
		
		// date select from calendar
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@title='January 25, 2027']")).click();
	}
	public void searchBus() throws InterruptedException
	{
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id='gt-search']")).click();
	}
}

		            