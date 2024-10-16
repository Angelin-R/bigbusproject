package pagepkg_bigbus;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Countlinks_bigbus {
	
	
	WebDriver d;

	public  Countlinks_bigbus (WebDriver d)
	{
		this.d=d;
	}
	
	
	public void linkCount() throws InterruptedException
	{
		Thread.sleep(2000);
		List <WebElement> li=d.findElements(By.tagName("a"));
		System.out.println("no:of links is="+li.size());
		
	}
	    

}
