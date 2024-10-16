package testpkg_bigbus;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import basepkg_bigbus.Baseclass_bigbus;
import pagepkg_bigbus.Agentlogin_datadriven;
import pagepkg_bigbus.Brokenlnk_bigbus;
import pagepkg_bigbus.Countlinks_bigbus;
import pagepkg_bigbus.Datepickerandsearchbus;
import pagepkg_bigbus.Elementscreenshot_bigbus;
import pagepkg_bigbus.Get_titlebigbus;
import pagepkg_bigbus.Logoverification_bigbus;
import utilitypkg_bigbus.Utilityclass_bigbus;
import pagepkg_bigbus.Managebooking_bigbus;
import pagepkg_bigbus.Pagescreenshot_bigbus;
import pagepkg_bigbus.Windowhandling_bigbus; 

public class Testclass_bigbus extends Baseclass_bigbus {
	
	@Test(priority=7)     //7
	public void Pagescreenshot() throws IOException, InterruptedException
	{
		Pagescreenshot_bigbus pg=new Pagescreenshot_bigbus(d);
		pg.pageScreenshot();
	}
	
	@Test(priority=6)     //6
	public void elementScreenshot() throws IOException, InterruptedException
	{
		Elementscreenshot_bigbus el=new Elementscreenshot_bigbus(d);
		el.elementScreenshott();
		
	}
	
    @Test(priority=3)    //3
	public void linkCountt() throws InterruptedException
	{
		Countlinks_bigbus l=new Countlinks_bigbus(d);
		l.linkCount();
	}

	@Test(priority=2)    //2
	public void titleVerification() throws InterruptedException
	{
		Get_titlebigbus  ge=new Get_titlebigbus (d);
		ge.getTitle1();
	}
	
	@Test(priority=1)  //1
	public void logoVerification1() throws InterruptedException
	{
		Logoverification_bigbus lo=new Logoverification_bigbus(d);
	
			
		lo.logoVerification();
		
	}
	@Test(enabled=false)
	public void agentLoginDatadriven1() throws InterruptedException
	{
		    Agentlogin_datadriven ag = new Agentlogin_datadriven(d);
		    ag.clickAgent(); 

		    String x1 = "C:\\Users\\91920\\OneDrive\\Desktop\\Bigbus.xlsx";
		    String Sheet = "Sheet1";
		    int rowcount = Utilityclass_bigbus.getRowCount(x1, Sheet);

		    for (int i = 1; i <= rowcount; i++) {
		        String username = Utilityclass_bigbus.getCellValue(x1, Sheet, i, 0);
		        System.out.println("emailid----------" + username);

		        String password = Utilityclass_bigbus.getCellValue(x1, Sheet, i, 1);
		        System.out.println("password----------" + password);

		        ag.setValues_Bigbus(username, password);

		        ag.clickLogin_Bigbus();
		    }
		}
	@Test(priority=8)   //9
	
	public void Managebooking_bigbus() throws InterruptedException
	{
		Managebooking_bigbus ma = new Managebooking_bigbus(d);
		    ma.clickManageBooking();
		    String x1 = "C:\\Users\\91920\\OneDrive\\Desktop\\Ticket.xlsx";
		    String Sheet = "Sheet1";
		    int rowcount = Utilityclass_bigbus.getRowCount(x1, Sheet);

		    for (int i = 1; i <= rowcount; i++) {
		        String tino = Utilityclass_bigbus.getCellValue(x1, Sheet, i, 0);
		        System.out.println("Ticketno----------" + tino);

		        String email = Utilityclass_bigbus.getCellValue(x1, Sheet, i, 1);
		        System.out.println("emailid----------" + email);

		        ma.setValues_Bigbus(tino, email);
		    }
		        ma.clickSearchButton();
		        ma.clickManageBooking();
	}
		        
		      @Test (priority=4)        //4
		      
		        public void responseCode() throws IOException
		        {
		        	Brokenlnk_bigbus br=new Brokenlnk_bigbus(d);
		        	br.testResponsecode();
		        				
		        }
		      @Test(priority=9)   //8
		      public void windowHandle() throws InterruptedException
		      {
		      Windowhandling_bigbus win=new Windowhandling_bigbus(d);
		      win.setUp();
		      }
		      
    @Test (priority=5)   //5
	      
		      public void datePicker() throws InterruptedException
		      {
		    	  Datepickerandsearchbus se=new  Datepickerandsearchbus(d);
		    
		    	  se.destinationSelect1();
		    	  se.originSelect1();
		    	  Thread.sleep(2000);
		    	  se.datePick1();
		    	  se.datePick2();
		    	  se.searchBus();
		 	  
		      }
           }

		      

