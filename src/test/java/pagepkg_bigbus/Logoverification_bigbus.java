package pagepkg_bigbus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logoverification_bigbus {
	
	WebDriver d;
	public Logoverification_bigbus(WebDriver d)
	{
		this.d=d;
	}
	public void logoVerification() throws InterruptedException
	{
		Thread.sleep(2000);
	
	 WebElement logo = d.findElement(By.xpath("//*[@id=\"header\"]/div/div/nav/div/div[1]/a/img"));

     // Verify if the logo is displayed
     if (logo.isDisplayed()) {
         System.out.println("Logo is displayed.");
     } else {
         System.out.println("Logo is not displayed.");
     }
}
}
	


