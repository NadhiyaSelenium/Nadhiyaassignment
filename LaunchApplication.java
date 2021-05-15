package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("rrd");
		driver.findElementById("createLeadForm_firstName").sendKeys("nadhi");
		driver.findElementById("createLeadForm_lastName").sendKeys("jayaraman");		
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown = new Select(source);
		dropdown.selectByIndex(4);	
	
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Nadhi");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Jayaraman");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mrs");
		driver.findElementById("createLeadForm_birthDate").sendKeys("08/03/1988");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Manager");
		driver.findElementById("createLeadForm_departmentName").sendKeys("QA");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("65000");
		
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select dropdown1 = new Select(industry);
		dropdown1.selectByValue("IND_HEALTH_CARE");
		
		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropdown2 = new Select(ownership);
		dropdown2.selectByValue("OWN_LLC_LLP");				

		driver.findElementById("createLeadForm_sicCode").sendKeys("55");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("3");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("*");		
		driver.findElementById("createLeadForm_description").sendKeys("we are here to provide quality service");
		driver.findElementById("createLeadForm_importantNote").sendKeys("xxxxxxxxxxxxxxxxxxxxxxxx");	
		
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("88");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("126");
		  driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9176042888");
		  driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("02");
		  driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Nadhiya");
		  driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@gmail.com");
		  
		  driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("http://leaftaps.com/crmsfa/control/createLeadForm");
		  
		  driver.findElementById("createLeadForm_generalToName").sendKeys("Nadhiya");
		  driver.findElementById("createLeadForm_generalAttnName").sendKeys("Jayaraman");
		  driver.findElementById("createLeadForm_generalAddress1").sendKeys("21B,Tambaram");
		  driver.findElementById("createLeadForm_generalAddress2").sendKeys("Selaiyur");
		  driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
		  
		  driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600126");
		  
		  WebElement Country = driver.findElementById("createLeadForm_generalCountryGeoId");
		  Select dropdown6 = new Select (Country);
		  dropdown6.selectByVisibleText("India");
		  Thread.sleep(2000);	
		  
		  WebElement Province = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		  Select dropdown5 = new Select (Province);
		  dropdown5.selectByVisibleText("TAMILNADU");
		  
		  driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("   ");		  
		  driver.findElementByClassName("smallSubmit").click();  		  
		  driver.findElementByLinkText("Duplicate Lead").click();		  
		  driver.findElementById("createLeadForm_companyName").clear();		  
		  driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
				
		driver.findElementByClassName("submitButton").click();	
		
		WebElement compName = driver.findElementById("createLeadForm_companyName");
        compName.getText();
		driver.close();

	}

}
