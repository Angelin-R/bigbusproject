package pagepkg_bigbus;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Managebooking_bigbus {
	
	WebDriver d;
    By TICKETNO=By.xpath("//*[@id=\"pnr_number\"]");
    By EM=By.xpath("//*[@id=\"email\"]");
    By SEARCHBTN=By.xpath("//*[@id=\"ticketForm\"]/div[3]/button");
    @FindBy(xpath="//*[@id=\"cssmenu\"]/ul/li[2]/a")
    WebElement clickbooking;

public Managebooking_bigbus(WebDriver d)
{
	this.d=d;
	PageFactory.initElements(d, this);
}

public void clickManageBooking() throws InterruptedException
{
	Thread.sleep(2000);
	clickbooking.click();
}

	public void setValues_Bigbus(String ti,String em) throws InterruptedException
	{

		Thread.sleep(1000);
	    d.findElement(TICKETNO).clear();
        d.findElement(TICKETNO).sendKeys(ti);
      //  Thread.sleep(2000);
        d.findElement(EM).clear();
        d.findElement(EM).sendKeys(em); 
        Thread.sleep(2000);
	}
	
	public void clickSearchButton() throws InterruptedException
	{
        Thread.sleep(2000);
         d.findElement(SEARCHBTN).click();  
		 Thread.sleep(2000);
		 Alert alert = d.switchTo().alert();
         String alertText = alert.getText(); 
         System.out.println("Alert Text: " + alertText);
         alert.accept();
         Thread.sleep(2000);
         d.navigate().back();
 
	}
}


