package AmazonTestcases;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;

import AutomationCore.BaseClass;


public class TestCases extends BaseClass{
	
	WebDriver driver;
	
	/*@BeforeMethod
	public void initialization()
	{
		driver=browserInitilization("Edge");
		driver.get("https:www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	
	public  void TC01()
	{
		System.out.println("TEST CASES 1");
		driver.findElement(By.name("field-keywords")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.findElement(By.className("nav-input nav-progressive-attribute"));
		//driver.findElement(By.tagName("input"));
		//driver.findElement(By.linkText("Shop on Amazon Business"));
		//driver.findElement(By.PartiallinkText("Shop "));
		//driver.findElement(By.cssSelector("//input[class='a-button-input']"));
		String brandname=driver.findElement(By.xpath("//span[text()='Apple']")).getText();
		String brandtagname=driver.findElement(By.xpath("//span[text()='Apple']")).getTagName();
		String brandclassname=driver.findElement(By.xpath("//span[text()='Apple']")).getAttribute("class");
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		//List<WebElement>products=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		//int prodcount=products.size();
		//System.out.println("size :"+prodcount);
        /*System.out.println(brandname);
		System.out.println(brandtagname);
		System.out.println(brandclassname);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("https://www.swiggy.com/");
		driver.findElement(By.xpath("//img[@class='sc-koXPp jheTCm'][7]"));*/
		
		//driver.navigate().quit();
	

	/*@BeforeMethod
	public void initialization2()
	{
		driver=browserInitilization("Edge");
		driver.get("https://www.immigration.ca/");
		driver.manage().window().maximize();
	}
    @Test
    public  void TC02()
    	{
        	System.out.println("TEST CASE 2");
            driver.navigate().to("https://form.immigration.ca/skilled-worker/");
        	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Archana");
        	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("archanaan@gmail.com");
        	driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9562060060");
        	WebElement dropdown=driver.findElement(By.id("natioanality"));
        	Select drp=new Select(dropdown);
        	drp.selectByVisibleText("India");
        	WebElement dropdown1=driver.findElement(By.id("residence_country"));
        	Select drp1=new Select(dropdown1);
        	drp1.selectByVisibleText("India");
        	WebElement dropdown2=driver.findElement(By.id("age"));
        	Select drp2=new Select(dropdown2);
        	drp2.selectByVisibleText("33");
        	WebElement dropdown3=driver.findElement(By.id("sex"));
        	Select drp3=new Select(dropdown3);
        	drp3.selectByVisibleText("Female");
        	driver.findElement(By.id("submitApplicationBtn")).click();  	
    }*/
    @BeforeMethod
	public void initialization3()
	{
		driver=browserInitilization("Edge");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
@Test
public void TC03(){
	System.out.println("Testcase 3");
	driver.findElement(By.name("field-keywords")).sendKeys("laptop");
	driver.findElement(By.id("nav-search-submit-button")).click();
	driver.findElement(By.xpath("//li[@class='a-spacing-micro'])[4]")).click();
	
	}
}
