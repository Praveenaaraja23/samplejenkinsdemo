package orange_hrm;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample_allure_demo {
	
	WebDriver driver;
	
	
	@BeforeClass
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
public void tnlogin() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	    driver.findElement(By.xpath("//input[@name='login-button']")).click();
	    
	    Thread.sleep(200);
	    Assert.assertEquals(driver.getTitle(), "//*[@id=\"header_container\"]/div[2]/span");
	    
	
		
	}
	
	
	@Test(priority=2)
	public void Addingproducts() {

        driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
		driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();
			
		}
	
	@Test(priority = 3)
	public void logout() {
		driver.findElement(By.xpath("//*[@id='react-burger-menu-btn']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//*[@id='logout_sidebar_link']")).click();
	}
	
	
	

}
