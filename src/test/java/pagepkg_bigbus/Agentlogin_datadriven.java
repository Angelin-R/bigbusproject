package pagepkg_bigbus;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Agentlogin_datadriven {
	
	WebDriver d;
	    By UN=By.name("login");
	    By PSWD=By.name("password");
	    By CLSIGNIN=By.xpath("//*[@id=\'login_button\']");

	
	
	
	@FindBy (xpath="//*[@id=\"infoBar\"]/div/div/div[2]/div/ul/li/a")
	WebElement clickagent;
	public Agentlogin_datadriven(WebDriver d)
	{
		this.d=d;
		PageFactory.initElements(d, this);
	}
	public void clickAgent() throws InterruptedException
	{
		Thread.sleep(2000);
		clickagent.click();
	}
	
	public void pageSource1()
	{
		System.out.println(d.getPageSource());
	}
	   
		public void setValues_Bigbus(String un,String pswd) throws InterruptedException
		{
			WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));
			@SuppressWarnings("unused")
			WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("login")));

			Thread.sleep(2000);
		    d.findElement(UN).clear();
	        d.findElement(UN).sendKeys(un);
	        Thread.sleep(2000);
	        d.findElement(PSWD).clear();
	        d.findElement(PSWD).sendKeys(pswd); 
	        Thread.sleep(2000);
		}
		
		public void clickLogin_Bigbus() throws InterruptedException
		{
	        Thread.sleep(2000);
	        d.findElement(CLSIGNIN).click();  
		}	
	}

