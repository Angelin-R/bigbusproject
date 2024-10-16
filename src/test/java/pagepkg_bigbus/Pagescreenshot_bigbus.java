package pagepkg_bigbus;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Pagescreenshot_bigbus {
	
	
	WebDriver d;
	public Pagescreenshot_bigbus(WebDriver d)
	{
		this.d=d;
	}

   // pagescreenshot
		public void pageScreenshot() throws IOException, InterruptedException
		{	
			Thread.sleep(2000);
			File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("./Bigbus_screenshot/bigbuss.png"));
			
		}
	

}
