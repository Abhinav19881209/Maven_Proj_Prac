package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import UiMethods.UiOpeartion;

public class Loginpage implements UiOpeartion {
	
	public static By userName = By.name("Email");
	public static By passWord = By.name("Password");
	public static By loginbtn = By.xpath("//input[@class='button-1 login-button']");
	public static String Pagetitleloginpage = "Your store. Login";
	
	public static By welcomeTitle = By.xpath("//strong[contains(text(),'Welcome, please sign in!')]");
	//static WebDriver driver;

//	public static By username = By.name("Email");
//	public static By password = By.name("Password");
//	public static By submitbtn = By.xpath("//input[@type='submit']");
//	public static String Pagetitle = "Your store. Login";
//	public static By OrderMoreInfo = By.xpath("//*[@id='nopcommerce-common-statistics-box']/div[2]/div[1]/div/a");
//	//public static By OrderMoreInfo = By.linkText(linkText)
//			//*[@id="nopcommerce-common-statistics-box"]/div[2]/div[1]/div/a
//	public static By Ordertitle = By.xpath("//h1[contains(text(),'Orders')]");
//	public static By OrderDropDown = By.id("OrderStatusIds");
//	public static By Orderstatusbox = By.xpath("//form[1]/div[2]/div/div/div[1]/div/div[2]/div[1]/div[1]/div[5]/div[2]/div/div/input");
//	//form[1]/div[2]/div/div/div[1]/div/div[2]/div[1]/div[1]/div[5]/div[2]/div/div/input
//	public static By SerachBox = By.xpath("//*[@id='search-orders]/text(),'Search'");
//	
//	
//	
//	public static By welcomeTitle = By.xpath("//strong[contains(text(),'Welcome, please sign in!')]");
//	
//	static WebDriver driver;
	
	static String baseURL ="https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"; 
	
	//static String ChromePath = "C:\\Users\\Abhinav.Abhinav-PC\\Desktop\\Selenium\\chromedriver_New.exe";
	
//	public void launchTheURL() {
//		
//		uiobj.launchURL(baseURL);
//	}
	
	public void enterLoginPassword(String username,String password) {
		
		uiobj.textBoxMethod(userName, username);
		uiobj.textBoxMethod(passWord, password);
	}
	
	public void clickOnlogin() {
		
		uiobj.clickMethod(loginbtn);		
		
	}
	
	public boolean loginPageTitle(String Title) {
		
		if(Title.equals(uiobj.getPageTitle())) {
			return true;
		}else
		return false;

	}
	
	public boolean DashboardPageTitle(String Title) {
		
		if(Title.equals(uiobj.getPageTitle())) {
			return true;
		}else
		return false;

	}
	
	public void navigateToNext() {
		uiobj.navigateTo();
		
	}
	
	public void cleartext() {
		uiobj.navigateTo();
		
	}
	
	
	
	
}
