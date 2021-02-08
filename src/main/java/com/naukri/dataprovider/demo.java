package com.naukri.dataprovider;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demo {
	
	@Test()
	public void loginWithChrome(Object [] data)
	{
		Map<String, String>map = (Map<String, String>) data[0];
		System.out.println(map.get("browser"));
	}

}
