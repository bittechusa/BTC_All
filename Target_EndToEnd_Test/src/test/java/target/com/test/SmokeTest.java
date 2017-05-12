package target.com.test;

import java.io.IOException;

import org.junit.Test;

import target.com.share.HomePage;
import target.com.share.MenShirtPage;

public class SmokeTest extends BaseTest
{
		
	HomePage hp;
	MenShirtPage ms;
	
	@Test
		
	public void test1() throws IOException, InterruptedException
		{
			hp=new HomePage(dr);
			hp.search_men_shirt();
			ms=hp.click_on_go();
			ms.verify_Title();
			ms.click_Size_Button();
			ms.select_Sizes();
			Thread.sleep(2000);
			ms.select_Product();
			ms.select_currentProduct_Size();
			ms.clickAddTocart();
			Thread.sleep(3000);
			ms.continue_Shopping();
			ms.verifiy_Cart();
			
		
			
			
		}

	
	
	
}
