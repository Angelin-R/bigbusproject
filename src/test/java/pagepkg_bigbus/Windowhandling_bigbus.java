package pagepkg_bigbus;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Windowhandling_bigbus {
	WebDriver d;
	 public Windowhandling_bigbus(WebDriver d)
	 {
		 this.d=d;
	 }
	
		public void setUp() throws InterruptedException
		{
			Thread.sleep(2000);
			String parentwindow=d.getWindowHandle();
			System.out.println("windpwhandling..........."+d.getTitle());
			d.findElement(By.xpath("//*[@id='infoBar']/div/div/div[2]/div/ul/li/a")).click();  
			Set<String>allwindowhandles=d.getWindowHandles();
			for(String handle:allwindowhandles)
			{
				if(!handle.equalsIgnoreCase(parentwindow))
				{
					d.switchTo().window(handle);
					//d.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("angel123@gmail.com");
					d.close();
				}
				d.switchTo().window(parentwindow);
			}
				
		}

}
