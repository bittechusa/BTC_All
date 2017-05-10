package com.bit.test;

import org.junit.Test;

import com.target.share.HomePage;
import com.target.share.MenShirt;

public class SmokeTest extends BaseTest
{
	HomePage hp;
	MenShirt mp;
	FirstShirt fs;
	
	@Test
	public void test1() throws InterruptedException
	{
		hp=new HomePage(dr);
		mp = hp.typeMenShirt_clickGo();
	    mp.clickSize_Select_15_5_32_33();
	    FirstShirt fs= mp.clickMenShirt();
	    fs.select_Click_17_32_33();
	    fs.verifyItem();
	    
	    
		
	}
}
