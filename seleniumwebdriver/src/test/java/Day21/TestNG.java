package Day21;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
//@BeforeMethod
	//@BeforeClass
	//@BeforeTest
	//void beforemethod()
	//{
		//System.out.println("beforetest");
//	}
	@AfterMethod
	//@AfterClass
	//@AfterTest
	//void after()
	//{
		//System.out.println("aftertest");
	//}
@Test(priority=1)
	
	void open()
	{
		System.out.println("open");
	}
	@Test(priority=2)
	void login()
	{
		System.out.println("login");
	}
	@Test(priority=3)
	void logout()
	{
		System.out.println("logout");
		
	}

	
}
