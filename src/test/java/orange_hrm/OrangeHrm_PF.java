package orange_hrm;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class OrangeHrm_PF {

	public static WebDriver driver;
    String URL = "https://opensource-demo.orangehrmlive.com/";

	@FindBy (name= "username") WebElement Username;
	@FindBy (name="password") WebElement Pwd;
	@FindBy(xpath="//button[text()=' Login ']") WebElement Login;
	@FindBy(xpath="//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span") WebElement Myinfo;
	@FindBy(xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/a") WebElement contactdetails;
	@FindBy (xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input") WebElement street1 ;
	@FindBy (xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input") WebElement street2;
	@FindBy (xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input") WebElement city;
	@FindBy (xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/input") WebElement state ;
	@FindBy (xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input") WebElement PostalCode;
	@FindBy (xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input") WebElement mobile;
	@FindBy (xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button") WebElement save;
	
	
	
	public OrangeHrm_PF(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
		
	}
	
	public void login() {
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		Username.sendKeys("Admin");
		Pwd.sendKeys("admin123");
		Login.click();
		
	}
	
	public void myinfo() {
		Myinfo.click();	
	}
	
	public void contactdetails() {
		 contactdetails.click();
	}
	
	
	public void street1() {
		street1.sendKeys("825 morris");
	}
	
	public void street2() {
		street2.sendKeys("plains");
	}
	
	public void city() {
		city.sendKeys("morriscounty");
	}
	
	public void state() {
		state.sendKeys("New Jersey");
	}
	
	public void PostalCode() {
		PostalCode.sendKeys("08432");
	}
	public void mobile() {
		mobile.sendKeys("8642143466");
	}
	public void save() {
		save.click();
	}
	
	public void savedmsg() {
		System.out.println("contacts information saved successfully");
	}
	/*
	 contactdetails.click();
		street1.sendKeys("825 morris");
		street2.sendKeys("plains");
		city.sendKeys("morriscounty");
		state.sendKeys("New Jersey");
		PostalCode.sendKeys("08432");
		mobile.sendKeys("8642143466");
		save.click();
	
		
	public void Street1() {
	}
	  public static void main(String[] args) {
			
		  OrangeHrm_PF obj = new OrangeHrm_PF(driver);
			obj.login();
		}
	 */	

	    
	
}


