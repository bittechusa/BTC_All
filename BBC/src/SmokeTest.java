import org.junit.Test;

import com.thoughtworks.selenium.webdriven.commands.GetTitle;

public class SmokeTest extends BaseTest
{
	BBCHomePage hp;
	NewsPage wp;
	WorldPage w;
	@Test
	public void getHeadline() throws InterruptedException
	{
		 hp=new BBCHomePage(dr);
		Thread.sleep(3000);
	     wp=hp.clickNews();
	    Thread.sleep(3000);
          w=wp.clickWorld().get();
		  w.getTitleWorld();
			
		
	}
}
