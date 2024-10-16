package pagepkg_bigbus;

import org.openqa.selenium.WebDriver;

public class Get_titlebigbus {
	
	WebDriver d;

	public  Get_titlebigbus (WebDriver d)
	{
		this.d=d;
	}
	
	public void getTitle1() throws InterruptedException
	{
		Thread.sleep(2000);
	String Exp="Register Account";
	String act=d.getTitle();
	System.out.println(act);
	if(Exp.equals(act))
	{
	
	System.out.println("passed");
	}
	else
	{
		System.out.println("failed");
	}
	
	}}


