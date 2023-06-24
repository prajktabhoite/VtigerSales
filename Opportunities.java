package Sales;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Opportunities {

	public static void main(String[] args) throws InterruptedException {
		
		 ChromeOptions option = new ChromeOptions();
		 option.addArguments("--remote-allow-origins=*");
		 WebDriver driver = new ChromeDriver(option);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demo.vtiger.com/vtigercrm/");
		 driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		 driver.findElement(By.id("appnavigator")).click();
		 driver.findElement(By.xpath("//span[text()=' SALES']")).click();
		 driver.findElement(By.xpath("//span[text()=' Opportunities']")).click();
		 driver.findElement(By.id("Potentials_listView_basicAction_LBL_ADD_RECORD")).click();
		 driver.findElement(By.id("Potentials_editView_fieldName_potentialname")).sendKeys("Opportunities");
		 driver.findElement(By.id("Potentials_editView_fieldName_contact_id_create")).click();
		 Thread.sleep(200);
		 WebElement ele5 = driver.findElement(By.xpath("//select[@name='salutationtype']"));
		 Select s5 = new Select(ele5);
		 Thread.sleep(1000);
		 s5.selectByValue("Ms.");
		 driver.findElement(By.id("Contacts_editView_fieldName_firstname")).sendKeys("Oliviya");
		 driver.findElement(By.id("Contacts_editView_fieldName_phone")).sendKeys("9638527415");
		 driver.findElement(By.id("Contacts_editView_fieldName_email")).sendKeys("abc@gmail.com");
		 driver.findElement(By.id("Contacts_editView_fieldName_lastname")).sendKeys("okho");
		 driver.findElement(By.id("account_id_display")).sendKeys("Active");
		 driver.findElement(By.xpath("(//b[@role='presentation'])[6]")).click();
		 Thread.sleep(200);
		 WebElement c = driver.findElement(By.xpath("(//input[@id='s2id_autogen16_search'])[1]"));
		 c.sendKeys("Support Group"); 
		 Actions d = new Actions(driver);
		 d.sendKeys(c, Keys.ENTER);
		 d.perform();
		 Thread.sleep(200);
		 driver.findElement(By.xpath("//button[@name='saveButton']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//b[@role='presentation'])[1]")).click();
		 Thread.sleep(200);
		 driver.findElement(By.xpath("//input[@id='s2id_autogen2_search']")).sendKeys("New Business");
		 Actions e = new Actions(driver);
		 e.sendKeys(driver.findElement(By.xpath("//input[@id='s2id_autogen2_search']")), Keys.ENTER);
		 e.perform();
		 driver.findElement(By.xpath("(//b[@role='presentation'])[2]")).click();
		 Thread.sleep(200);
		 driver.findElement(By.xpath("//input[@id='s2id_autogen4_search']")).sendKeys("Cold Call");
		 Actions f = new Actions(driver);
		 f.sendKeys(driver.findElement(By.xpath("//input[@id='s2id_autogen4_search']")), Keys.ENTER);
		 f.perform();
		 driver.findElement(By.xpath("(//b[@role='presentation'])[3]")).click();
		 Thread.sleep(200);
		 driver.findElement(By.xpath("//input[@id='s2id_autogen6_search']")).sendKeys("Team Selling");
		 Actions g = new Actions(driver);
		 g.sendKeys(driver.findElement(By.xpath("//input[@id='s2id_autogen6_search']")), Keys.ENTER);
		 g.perform();
		 driver.findElement(By.id("Potentials_editView_fieldName_campaignid_create")).click();
		 driver.findElement(By.id("Campaigns_editView_fieldName_campaignname")).sendKeys("campaignname");
		 WebElement ele6 = driver.findElement(By.cssSelector("*[name='campaignstatus']"));
		 Select s6 = new Select(ele6);
		 Thread.sleep(1000);
	   	 s6.selectByValue("Planning");
		 driver.findElement(By.id("product_id_display")).sendKeys("Selenium");
		 WebElement ele7 = driver.findElement(By.cssSelector("*[name='expectedresponse']"));
		 Select s7 = new Select(ele7);
   		 Thread.sleep(1000);
 		 s7.selectByValue("Excellent");		 
    	 WebElement ele2 = driver.findElement(By.xpath("(//*[@type=\"owner\"])[2]"));
		 Select s2 = new Select(ele2);
		 Thread.sleep(200);
		 s2.selectByValue("3");		
		 WebElement ele3 = driver.findElement(By.xpath("//*[@name='campaigntype']"));
     	 Select s3 = new Select(ele3);
		 Thread.sleep(200);
		 s3.selectByVisibleText("Advertisement"); 
		 WebElement ac = driver.findElement(By.xpath("(//i[@class='fa fa-calendar '])[2]"));
		 Thread.sleep(200);
		 ac.click();
		 Thread.sleep(200);
		 driver.findElement(By.xpath("(//th[text()='Today'])[1]")).click();
		 driver.findElement(By.xpath("//button[@name='saveButton']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("Potentials_editView_fieldName_forecast_amount")).sendKeys("50");
		 driver.findElement(By.id("Potentials_editView_fieldName_related_to_create")).click();
		 driver.findElement(By.id("Accounts_editView_fieldName_accountname")).sendKeys("Active");
		 driver.findElement(By.id("Accounts_editView_fieldName_phone")).sendKeys("9638527415");
		 driver.findElement(By.id("Accounts_editView_fieldName_website")).sendKeys("www.google.com");
		 Thread.sleep(400);
		 WebElement ele4 = driver.findElement(By.xpath("(//*[@name='assigned_user_id'])[2]"));
		 Select s4 = new Select(ele4);
		 Thread.sleep(200);
		 s4.selectByVisibleText("Marketing Group");
		 driver.findElement(By.xpath("//button[@name='saveButton']")).click();
		 driver.findElement(By.id("Potentials_editView_fieldName_amount")).sendKeys("500");
		 driver.findElement(By.xpath("//i[@class='fa fa-calendar ']")).click();
		 WebElement AP = driver.findElement(By.xpath("//TABLE[@class=' table-condensed']/TFOOT/TR[1]/TH[@style='display: table-cell;']"));
		 AP.click();
		 driver.findElement(By.id("Potentials_editView_fieldName_nextstep")).sendKeys("Nextstep");
		 driver.findElement(By.xpath("(//b[@role='presentation'])[4]")).click();
		 WebElement ZA = driver.findElement(By.xpath("//input[@id='s2id_autogen8_search']"));
		 ZA.sendKeys("Prospecting");
		 Actions az = new Actions(driver);
		 az.sendKeys(ZA, Keys.ENTER);
		 az.perform();
		 JavascriptExecutor j3 = (JavascriptExecutor)driver;
		 j3.executeScript("window.scrollBy(0,100)");
		 driver.findElement(By.id("Potentials_editView_fieldName_probability")).sendKeys("50");
		 driver.findElement(By.id("Potentials_editView_fieldName_description")).sendKeys("Lorem ipsum dolor sit amet, cons");		
		 driver.findElement(By.cssSelector("*[type='submit']")).click();
		 Thread.sleep(2000);	
		 driver.findElement(By.xpath("//a[.='Atlas Jeniffer']")).click();
		 Thread.sleep(200);
		 driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		
		 
	
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

		
		
		
		

		
		
		

	}

}
