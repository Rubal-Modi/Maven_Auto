package Spicejet2021;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckCheckBox 
{

	@BeforeSuite
	public void loginApp() {
		System.out.println("Login in app");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("launch browser");
	}

	@BeforeMethod
	public void enterUrl() {
		System.out.println("enter url");
	}

	@Test
	public void checkTitle() {
		System.out.println("Check title");
	}

	@Test
	public void aradioButton() {
		System.out.println("radio button");
	}

	@AfterMethod
	public void delCookies() {
		System.out.println("del cookies");
	}

	@AfterClass
	public void logOut() {
		System.out.println("Logout");
	}

	@AfterSuite
	public void closeBrowser() {
		System.out.println("close browser");
	}
}
