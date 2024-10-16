package pagepkg_bigbus;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.WebDriver;

public class Brokenlnk_bigbus {
	WebDriver d;
	public  Brokenlnk_bigbus(WebDriver d)
	{
	this.d=d;	
	}
	
	String link="https://www.bigbusticket.com/index.html";
	public void testResponsecode() throws IOException
	{
	URL ob=new URL (link);
	HttpURLConnection con=(HttpURLConnection)ob.openConnection();
	con.connect();
	if(con.getResponseCode()==200)
	{ 
		System.out.println("successful--------"+link);
		
	}
	else if(con.getResponseCode()==404)
	{
		System.out.println("broken link-----------"+link);
		
	}
	
	
}


}
	