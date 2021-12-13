package com.crm.vtiger;

import org.testng.annotations.Test;

public class addData {
	@Test
	public void dataAdd ()  {
		String url= System.getProperty("url");
		String browser= System.getProperty("browser");
		String username= System.getProperty("username");
		String paasword= System.getProperty("paasword");
		
		System.out.println(url);
		System.out.println(browser);
		System.out.println(username);
		System.out.println(paasword);

		
		
	}

}
