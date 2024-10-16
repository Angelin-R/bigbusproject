package basepkg_bigbus;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass_bigbus {
	
	public  WebDriver d;
	
    @BeforeClass
    public void preCondition1()
    {
       
       d = new ChromeDriver();
       d.get("https://www.bigbusticket.com/index.html");
       d.manage().window().maximize();
       d.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    }
    @AfterClass
    public void postCondition1() 

    {
                d.quit();
    }	
}
	


