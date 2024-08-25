package AmazonTestcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import AutomationCore.BaseClass;


public class TestCases extends BaseClass{
	
	WebDriver driver;
	SoftAssert softassert;
	
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
        System.out.println(brandname);
		System.out.println(brandtagname);
		System.out.println(brandclassname);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("https://www.swiggy.com/");
		driver.findElement(By.xpath("//img[@class='sc-koXPp jheTCm'][7]"));
		
		driver.navigate().quit();
}*/

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
  
        	WebElement dropdown=driver.findElement(By.id("nationality"));
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
		softassert=new SoftAssert();
		
	}
	
@Test(priority=2)
public void TC03() throws InterruptedException{
	System.out.println("Testcase 3");
	driver.findElement(By.name("field-keywords")).sendKeys("laptop");
	driver.findElement(By.id("nav-search-submit-button")).click();
	driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();//checkbox
	boolean seachButtonStatus=driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
	softassert.assertEquals(seachButtonStatus, true);//softassertion
	System.out.println(seachButtonStatus);
	boolean locationBoxStatus=driver.findElement(By.id("nav-search-submit-button")).isEnabled();
	System.out.println(locationBoxStatus);//displayed and enabled
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
	driver.findElement(By.name("field-keywords")).sendKeys("iphone");
	driver.findElement(By.id("nav-search-submit-button")).click();
	driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));
	String parentWindow=driver.getWindowHandle();
	Set<String>childWindows=driver.getWindowHandles();
	for(String actual:childWindows) {
		if(!actual.equalsIgnoreCase(parentWindow)) {
			driver.switchTo().window(actual);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='a-autoid-3-announce']"));
		}
	}
	driver.switchTo().window(parentWindow);
	driver.navigate().refresh();
	softassert.assertAll();
}
@SuppressWarnings("unchecked")
@Test
	public void TC04() throws InterruptedException {
	driver.get("https://demoqa.com/alerts");
	driver.findElement(By.id("confirmButton")).click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
	wait.until(ExpectedConditionsframeToBeavailableAndswitchToIt("frame1"));
	driver.switchTo().alert().accept();
	driver.findElement(By.id("confirmButton")).click();
	driver.switchTo().alert().dismiss();
	
	
	driver.get("https://demoqa.com/frames");
	driver.switchTo().frame("frame1");
	String value=driver.findElement(By.id("sampleHeading")).getText();
	System.out.println(value);
	driver.switchTo().defaultContent();
	
}
private Function ExpectedConditionsframeToBeavailableAndswitchToIt(String string) {
	// TODO Auto-generated method stub
	return null;
}

@Test

public void TC05() throws AWTException, InterruptedException {
	driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
	Thread.sleep(4000);
	WebElement choosefile=driver.findElement(By.name("userfile"));
	WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
	
	JavascriptExecutor executor=(JavascriptExecutor)driver;
	executor.executeScript("arguments[0]", choosefile);
	setClickBoardData("C:\\Users\\lenovo\\Pictures\\Saved Pictures\\poornasree.png");
	
	
	//choosefile.click();
	Thread.sleep(2000);
	Robot robot=new Robot();
	robot.delay(300);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.delay(300);
	robot.keyRelease(KeyEvent.VK_ENTER);
	submit.click();
	}

private void setClickBoardData(String path) {
	StringSelection stringSelection=new StringSelection(path);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);
	
}
@Test
public void TC06() {
	driver.get("https://www.amazon.in/");
	JavascriptExecutor executor=(JavascriptExecutor)driver;
	executor.executeScript("window.scrollBy(0,250)");
	boolean status=driver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).isDisplayed();//hardassertion
	Assert.assertEquals(status, true);
	System.out.println(" Test case 7");
}
@BeforeSuite
public void beforeSuiteexample() {
	System.out.println("This is before suite methord");
}
@AfterSuite
public void afterSuiteexample() {
	System.out.println("This is after suite methord");
}
@BeforeTest
public void beforeTestexample() {
	System.out.println("This is before test methord");
}
@AfterTest
public void afterTestexample() {
	System.out.println("This is after test methord");
}
@BeforeMethod
public void beforeMethordexample() {
	System.out.println("This is before methord");
}
@AfterMethod
public void afterMethordexample() {
	System.out.println("This is  after methord");
}
@BeforeClass
public void beforeClassexample() {
	System.out.println("This is beforeclass methord");
}
@AfterClass
public void afterClassexample() {
	System.out.println("This is afterclass methord");
}
@BeforeGroups
public void beforeGroupexample() {
	System.out.println("This is beforegroup methord");
}
@AfterGroups
public void afterGroupexample() {
	System.out.println("This is aftergroup methord");
}
}


    

