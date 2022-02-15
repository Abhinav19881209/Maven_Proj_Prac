package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import UiMethods.UiOpeartion;
//import UtilityPackage.Driverutil;

public class customerPage implements UiOpeartion{

	public static By customerlink = By.xpath("//ul[@class='sidebar-menu tree']/li[4]/a");
	
	public static By addCustomerLink = By.xpath("//ul[@class='treeview-menu']/li[1]/a[@href='/Admin/Customer/List']");
	
	public static String customerTitlePage = "Customers / nopCommerce administration";
	
	public static String dashboardTitle = "Dashboard / nopCommerce administration";
	
	public static By customerAddButton = By.xpath("//a[@href = '/Admin/Customer/Create']");
	
	public static String addNewCustomerTitlePage ="Add a new customer / nopCommerce administration";
	
	public static By backTocustlink = By.xpath("//*[contains(text(),'back to customer list')]");
	
	public static By saveAndconatinue = By.name("save-continue");
	
	public static By savebtn = By.name("save");
	
	public static By errormsgCustomerPath = By.xpath("//div[@class='validation-summary-errors']/ul/li");
	
	public static String errormsgCustomer = "Add the customer to 'Guests' or 'Registered' customer role";
	
	public static By Customerinfotitle = By.xpath("//*[@id='customer-info']/div[1]/span");//Customer info
	
	public static By emailtextBox = By.id("Email");
	
	public static By passwordTextBox = By.id("Password");
	
	public static By firstNameTextBox = By.id("FirstName");
	
	public static By lastNameTextBox = By.id("LastName");
	
	public static By maleRadiobtn = By.id("Gender_Male");
	
	public static By femaleRadiobtn = By.id("Gender_Female");
	
	public static By dobbtn  = By.xpath("//span[@class='k-select']");
	
	public static By dobtxtbox = By.id("DateOfBirth");
	
	//public static By dobtxtbox = By.xpath("//div[@class='col-md-9']/span/span");
	
	public static By comapnytxtbox = By.id("Company");
	
	public static By IsTaxExemptchkbox = By.id("IsTaxExempt");
	
	public static By newsletterchkbox1 = By.xpath("//input[@name='SelectedNewsletterSubscriptionStoreIds' and @value = '1']");
	
	public static By newsletterchkbox2 = By.xpath("//input[@name='SelectedNewsletterSubscriptionStoreIds' and @value = '2']");
	
	public static By customerRole = By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']");
	
	public static By customerRoledropdown = By.id("SelectedCustomerRoleIds");//for select class- customer role
	
	public static By managerOfVendordropdown = By.id("VendorId ");//for select class - vendors
	
	public static By adminComment = By.id("AdminComment ");//for select class - vendors
	
	public static By AllNewsletterChechbox = By.xpath("//input[@name = 'SelectedNewsletterSubscriptionStoreIds']");
	

	
	
	
	public void clickOnCustomerLink() {
		
			uiobj.clickMethod(customerlink);
			uiobj.clickMethod(addCustomerLink);			
		
	}
	
	
	public  void clcikOnAddBtn() {
		
		uiobj.clickMethod(customerAddButton);
		
	}
		
	public boolean enterTextFieldForCustomer(String email,String password,String firstname,String lastname,String gender,
			String dob,String companyname,String newsletter,String CustRoleDropdown,String ManagofVendor,String Comment) throws InterruptedException
	{
		
		screenshotobj.takeScreenshot("Add_Customer_Page");
		uiobj.textBoxMethod(emailtextBox, email);
		uiobj.textBoxMethod(passwordTextBox, password);
		uiobj.textBoxMethod(firstNameTextBox, firstname);
		uiobj.textBoxMethod(lastNameTextBox, lastname);
		System.out.println("last Name printed");
		Thread.sleep(5000);
		
		if(gender.equalsIgnoreCase("M")) {
			uiobj.clickonRadioBtn(maleRadiobtn, gender);
			System.out.println("male selected");
		} else if(gender.equalsIgnoreCase("F")) {
			uiobj.clickonRadioBtn(femaleRadiobtn, gender);
			System.out.println("female selected");
		}
		
		uiobj.actionmethod(dobtxtbox, dob);
	
		uiobj.textBoxMethod(comapnytxtbox, companyname);
		uiobj.checkTheCheckBox(IsTaxExemptchkbox);
		System.out.println(" chekbox selected");
		
		if(newsletter.equals("(Your store name)")) {
			uiobj.checkTheCheckBox(newsletterchkbox1);
			System.out.println("1st chekbox selected");
		}else if (newsletter.equals("(Test store 2)")) {
			uiobj.checkTheCheckBox(newsletterchkbox2);
			System.out.println("2nd chekbox selected");
		}else if (newsletter.equals("All")) {
			uiobj.selectAllCheckbox(AllNewsletterChechbox);
			System.out.println("both chekbox selected");
		}
		
		
		
		uiobj.actionmethod(customerRole, CustRoleDropdown);
		
		//uiobj.scrolltoview(managerOfVendordropdown);
		
		//uiobj.SelectfromDropDown(managerOfVendordropdown, byoption, ManagofVendor);
		
		uiobj.actionmethod(managerOfVendordropdown, ManagofVendor);
		
		screenshotobj.takeScreenshot("Add_Customer_Page_After_Adding");
		
		return true;
	}
	
	public  void clickOnSave() {
		
		uiobj.clickMethod(savebtn);
		
	}
	

}
