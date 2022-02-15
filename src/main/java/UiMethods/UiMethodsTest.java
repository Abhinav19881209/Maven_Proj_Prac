package UiMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import UtilityPackage.Driverutil;

public class UiMethodsTest extends Driverutil{
	
	@SuppressWarnings("deprecation")
	static 
	WebDriverWait wait = new WebDriverWait(getDriver(), 10);
	
	static WebElement element = null;
	
	//private Select dropdown = null;
		
	 public static WebElement getElement(By elementpath) {
		   
		     element = getDriver().findElement(elementpath);
		   
		   return element;
		   
	   }
	 

	 public void clickMethod(By elementpath ) {
		 
		 wait.until(ExpectedConditions.elementToBeClickable(elementpath)).click();
//		 element = getElement(elementpath);
//		 element.click();
 
	 }
	 
	 public boolean textBoxMethod(By elementpath,String Text) {
		 
		 element = getElement(elementpath);
		 
		 if(element != null) { 
			// element.clear();
			 element.sendKeys(Text);
		 }
		 else {
			 return false;
		 }
		return true;
		
	 }
	 
	 public boolean chkErrorMsg(By elementpath,String Text) {
		 
		 boolean flag = false;
		 
		 element = getElement(elementpath);
		 String errormsg = element.getText();
		
		 if(errormsg.equals(Text)) {
			 
			 return true;
		 }else
			 
		 return false;
	 	}
	 
	 
	 public String getPageTitle() {
			
		String title = getDriver().getTitle();
		
		return title;
		
		}
	 
	 public  void clickonRadioBtn(By elementpath,String Text) {
		 
		 WebElement radiobtn = getElement(elementpath);
		 
		 //if(radiobtn.getText().equals(Text) && !radiobtn.isSelected())
		 if(radiobtn.getAttribute("value").equals(Text)){
			 
			 radiobtn.click();
		 }else {
			 
			 //do nothing
		 	}
		 }
	 
	
	 
	 public  void checkTheCheckBox(By elementpath) {
		 WebElement checkbox = getElement(elementpath);
		 
		 if(!checkbox.isSelected()) {
			 checkbox.click();
		 }else {
			 
			 System.out.println("Chcek box is default Selected");
		 }
	 
	 }
	 
	 public  void checkTheCheckBoxByoption(By elementpath,String option) {
		 WebElement checkbox = getElement(elementpath);
		 
		 if(!checkbox.isSelected() && checkbox.getText().equals(option)) {
			 checkbox.click();
		 }else {
			 
			 System.out.println("Chcek box is default Selected");
		 }
	 
	 }
	 
	 ////input[@name = 'SelectedNewsletterSubscriptionStoreIds']
	 
	 public void selectAllCheckbox(By elementpath) {
		 List<WebElement> checkbox =  getDriver().findElements(elementpath);
		
		 for(int i= 0;i<=checkbox.size();i++) {
			 
			 if(!checkbox.get(i).isSelected()) {
				 checkbox.get(i).click();
			 }
			 
		 }
		 
		 
		 
	 }
	 
	 
	 public void SelectfromDropDown(By elementpath, String byoption,String option) {
		 
		 Select  dropdown = Select(getElement(elementpath));
		
		 if(byoption.equals("Index")) {
			 dropdown.selectByIndex(Integer.parseInt(option));
		 }
		 else if(byoption.equals("Value")) {
			 dropdown.selectByValue(option);
		 }
		 else if(byoption.equals("Text")) {
			 dropdown.selectByVisibleText(option);
		 }
		 
	 }
	 
	 public void setdatebyJS(By elementpath,String date) { 
		 JavascriptExecutor js = ((JavascriptExecutor)getDriver());
		 js.executeScript("arguments[0].setAttribute('Value','"+date+"')", elementpath);
		 
	 }
	 
	 public void scrolltoview(By elementpath) { 
		 
		 WebElement vendors = getElement(elementpath);
		 JavascriptExecutor js = ((JavascriptExecutor)getDriver());
		 js.executeScript("arguments[0].scrollIntoView();", vendors);
		 
	 }
	 
	 


	private Select Select(WebElement element2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public  void enterTxtByjavascriptExec(By elementpath,String Text ) {
		 
		 JavascriptExecutor jse = ((JavascriptExecutor)getDriver());
		 
		 WebElement textBox = getElement(elementpath);
		 
		 if(textBox!= null) {
			 
			 jse.executeScript("arguments[0].value='"+Text +"'", textBox);
		 }
	 
	 }
	
	@SuppressWarnings("deprecation")
	public static boolean isAlertPresent() {
		 
		 try {
			
			 wait.until(ExpectedConditions.alertIsPresent());
			 
			 return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		 
		 
	 }
	 
	 public void handleAlerts(String AlertDecision) {
		 
		 if(AlertDecision.equalsIgnoreCase("Cancle")) {
			 
			 getDriver().switchTo().alert().dismiss();
		 }
		 else if(AlertDecision.equalsIgnoreCase("OK")) {
			 
			 getDriver().switchTo().alert().accept();
		 }
		 
	 }
	 
	 public String getAlerttest() {
		
		 try {
			if(isAlertPresent()) {
				 
			String alerttest= getDriver().switchTo().alert().getText(); 
			
			return alerttest;
			 }
		} catch (Exception e) {
			System.out.println("No alert present");
			
		}
		return null;

	 }
	 
	 
	 public String getCurrentUrl() {
		 
		 String CurrentURl= getDriver().getCurrentUrl();
		return CurrentURl;
	 }
	 
	 public void navigateTo() {
		 getDriver().navigate().to(getCurrentUrl());
	 }
	 
	
	 public void actionmethod(By elementpath,String dropdownoption ) {
		 
		 WebElement element = getElement(elementpath);
		 Actions action = new Actions(getDriver());
		action.moveToElement(element).click().sendKeys(dropdownoption).sendKeys(Keys.ENTER).build().perform();
		//return action;	 
	 }
	 
}
