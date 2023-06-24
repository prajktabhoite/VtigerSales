package Sales;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Quotes {

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
		
		driver.findElement(By.xpath("//span[text()=' Quotes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Quotes_listView_basicAction_LBL_ADD_RECORD")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Quotes_editView_fieldName_subject")).sendKeys("Quote Details");
	    WebElement ele1 = driver.findElement(By.cssSelector("*[name='quotestage']"));
		Select s5 = new Select(ele1);
	    Thread.sleep(1000);
		s5.selectByValue("Delivered");
		 
		driver.findElement(By.id("Quotes_editView_fieldName_contact_id_create")).click();
		WebElement ele2 = driver.findElement(By.cssSelector("*[name='salutationtype']"));
		Select s1 = new Select(ele2);
		Thread.sleep(1000);
		s1.selectByValue("Mr.");
		
		driver.findElement(By.id("Contacts_editView_fieldName_firstname")).sendKeys("firstname");
		driver.findElement(By.id("Contacts_editView_fieldName_phone")).sendKeys("7894561235");
		driver.findElement(By.id("Contacts_editView_fieldName_email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("Contacts_editView_fieldName_lastname")).sendKeys("lastname");
		driver.findElement(By.xpath("(//*[@id='account_id_display'])[2]")).sendKeys("Organization Name ");
		WebElement ele3 = driver.findElement(By.xpath("(//*[@name='assigned_user_id'])[2]"));
		Select s2 = new Select(ele3);
		Thread.sleep(1000);
		s2.selectByValue("4");
		driver.findElement(By.cssSelector("*[name='saveButton']")).click();
		
		driver.findElement(By.id("Quotes_editView_fieldName_shipping")).sendKeys("520");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Yes']")).click();
		driver.findElement(By.id("Quotes_editView_fieldName_account_id_create")).click();
		driver.findElement(By.id("Accounts_editView_fieldName_accountname")).sendKeys("accountname");
		driver.findElement(By.id("Accounts_editView_fieldName_phone")).sendKeys("8529637415");
		driver.findElement(By.id("Accounts_editView_fieldName_website")).sendKeys("www.abc.com");
		WebElement ele4 = driver.findElement(By.xpath("(//*[@name='assigned_user_id'])[2]"));
		Select s3 = new Select(ele4);
		Thread.sleep(1000);
		s3.selectByValue("2");
		driver.findElement(By.xpath("//*[@name='saveButton']")).click();
		driver.findElement(By.xpath("//*[text()='Yes']")).click();
		driver.findElement(By.id("Quotes_editView_fieldName_potential_id_create")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Potentials_editView_fieldName_potentialname")).sendKeys("potentialname");
		driver.findElement(By.id("Potentials_editView_fieldName_amount")).sendKeys("500");
		WebElement ele5 = driver.findElement(By.xpath("(//*[@name='assigned_user_id'])[2]"));
		Select s4 = new Select(ele5);
		Thread.sleep(1000);
		s4.selectByValue("2");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("*[id='related_to_display']")).sendKeys("Select");
		driver.findElement(By.xpath("(//*[@class='input-group-addon'])[2]")).click();
		driver.findElement(By.xpath("(//*[text()='Today'])[1]")).click();
		WebElement ele6 = driver.findElement(By.cssSelector("*[name='sales_stage']"));
		Select s7 = new Select(ele6);
		Thread.sleep(1000);
		s7.selectByValue("Qualification");
		driver.findElement(By.cssSelector("*[name='saveButton']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("*[class='fa fa-calendar ']")).click();
		driver.findElement(By.xpath("(//*[contains(@style,'display: table-cell;')])[1]")).click();
		WebElement ele7 = driver.findElement(By.cssSelector("*[name='carrier']"));
		Select s8= new Select(ele7);
		Thread.sleep(1000);
		s8.selectByValue("BlueDart");
		
		driver.findElement(By.id("assigned_user_id1_display")).sendKeys("96");
		WebElement ele8 = driver.findElement(By.cssSelector("*[name='assigned_user_id']"));
		Select s9 = new Select(ele8);
		Thread.sleep(1000);
		s9.selectByValue("4");
		
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
				
		driver.findElement(By.xpath("(//*[@class='contactAddress'])[1]")).click();
		
		driver.findElement(By.xpath("(//*[@class='accountAddress'])[2]")).click();
		driver.findElement(By.id("Quotes_editView_fieldName_bill_street")).sendKeys("Unless otherwise agreed in writing by the supplier all invoices are payable within thirty (30) days of the date of invoice, in the currency of the invoice,");
		driver.findElement(By.id("Quotes_editView_fieldName_ship_street")).sendKeys("Unless otherwise agreed in writing by the supplier all invoices are payable within thirty (30) days of the date of invoice, in the currency of the invoice,");
		driver.findElement(By.id("Quotes_editView_fieldName_bill_pobox")).sendKeys("Shipping Postal Code  ");
		driver.findElement(By.id("Quotes_editView_fieldName_bill_city")).sendKeys("Mumbai");
		driver.findElement(By.id("Quotes_editView_fieldName_bill_state")).sendKeys("Maharashtra");
		driver.findElement(By.id("Quotes_editView_fieldName_bill_code")).sendKeys("456123");
		driver.findElement(By.id("Quotes_editView_fieldName_bill_country")).sendKeys("India");
		driver.findElement(By.id("Quotes_editView_fieldName_ship_pobox")).sendKeys("25");
		driver.findElement(By.id("Quotes_editView_fieldName_ship_city")).sendKeys("Nashik");
		driver.findElement(By.id("Quotes_editView_fieldName_ship_state")).sendKeys("Maharashtra");
		driver.findElement(By.id("Quotes_editView_fieldName_ship_code")).sendKeys("456258");
		driver.findElement(By.id("Quotes_editView_fieldName_ship_country")).sendKeys("India");
		driver.findElement(By.id("Quotes_editView_fieldName_terms_conditions")).clear();
		driver.findElement(By.id("Quotes_editView_fieldName_description")).sendKeys("All prices are not inclusive of VAT which shall be payable in addition by the Customer at the applicable rate.");
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,200)");
		
		WebElement ele9 = driver.findElement(By.cssSelector("*[name='region_id']"));
		Select s10 = new Select(ele9);
		Thread.sleep(1000);
		s10.selectByValue("0");
		
		WebElement ele10 = driver.findElement(By.cssSelector("*[id='currency_id']"));
		Select s11 = new Select(ele10);
		Thread.sleep(1000);
		s11.selectByValue("1");
		
		WebElement ele11 = driver.findElement(By.cssSelector("*[id='taxtype']"));
		Select s12 = new Select(ele11);
		Thread.sleep(1000);
		s12.selectByValue("group");
		

		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0,200)");
				
		driver.findElement(By.xpath("(//*[@class='vicon-products'])[4]")).click();
		driver.findElement(By.xpath("//*[@class='selectAllInCurrentPage']")).click();
		driver.findElement(By.xpath("//*[@class='select btn btn-default']")).click();
				
	   driver.findElement(By.xpath("(//*[text()='Save'])[6]")).click();
	   Thread.sleep(2000);	
		 driver.findElement(By.xpath("//a[.='Atlas Jeniffer']")).click();
		 Thread.sleep(200);
		 driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		
		
		
		
		

	}

}
