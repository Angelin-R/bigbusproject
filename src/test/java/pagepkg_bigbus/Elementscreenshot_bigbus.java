package pagepkg_bigbus;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elementscreenshot_bigbus {
	
	WebDriver d;
	public Elementscreenshot_bigbus(WebDriver d)
	{
		this.d=d;	
	}
	           //elementscreenshot
		public void elementScreenshott() throws IOException, InterruptedException
		{
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) d;
			js.executeScript("window.scrollTo(0, 500)");
			//WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));
			WebElement chk=d.findElement(By.xpath("//*[@id=\"myCarousel1\"]/div/div/div[2]/a/img"));
			Thread.sleep(2000);
			File btnsn=chk.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(btnsn,new File("./Bigbus_screenshot/busphoto.png"));
		}
     //pagescreenshot
//		public void pageScreenshot() throws IOException
//		{	
//			File src=((TakeScreenshot)d).getScreenshotAs(OutputType.FILE);
//			FileHandler.copy(src, new File("C:\\Users\\91920\\OneDrive\\Desktop\\iamfullpage.png"));
//		}
//	
}
