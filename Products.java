package Sales;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Products {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		driver.findElement(By.id("appnavigator")).click();
		
		driver.findElement(By.xpath("//span[text()=' SALES']")).click();
		
		driver.findElement(By.xpath("(//*[text()=' Products'])[1]")).click();
		
		driver.findElement(By.id("Products_listView_basicAction_LBL_ADD_RECORD")).click();
		
		driver.findElement(By.id("Products_editView_fieldName_productname")).sendKeys("WebDriver");
		driver.findElement(By.id("Products_editView_fieldName_productcode")).sendKeys("452");
		WebElement ele1 = driver.findElement(By.cssSelector("*[name='manufacturer']"));
		Select s1 = new Select(ele1);
		s1.selectByValue("MetBeat Corp");
		driver.findElement(By.xpath("(//*[@class='input-group-addon'])[2]")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'Today')])[1]")).click();
		driver.findElement(By.xpath("(//*[@class='input-group-addon'])[4]")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("(//*[contains(text(),'Today')])[1]")).click();
		driver.findElement(By.id("Products_editView_fieldName_website")).sendKeys("www.google.com");
		driver.findElement(By.id("Products_editView_fieldName_mfr_part_no")).sendKeys("52");
		driver.findElement(By.id("Products_editView_fieldName_serial_no")).sendKeys("85");
		driver.findElement(By.id("Products_editView_fieldName_discontinued")).click();
		driver.findElement(By.xpath("(//*[@class='input-group-addon'])[1]")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("(//*[contains(text(),'Today')])[1]")).click();
		WebElement ele2 = driver.findElement(By.cssSelector("*[name='productcategory']"));
		Select s2 = new Select(ele2);
		s2.selectByValue("Hardware");
		driver.findElement(By.xpath("(//*[@class='input-group-addon'])[3]")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("/HTML/BODY/DIV[7]/DIV[1]/TABLE/TFOOT/TR[1]/TH")).click();
		
		driver.findElement(By.id("Products_editView_fieldName_vendor_id_create")).click();
		driver.findElement(By.id("Vendors_editView_fieldName_vendorname")).sendKeys("Selenium");
		driver.findElement(By.id("Vendors_editView_fieldName_phone")).sendKeys("8529637412");
		driver.findElement(By.id("Vendors_editView_fieldName_email")).sendKeys("abc@gmail.com");
		WebElement ele3 = driver.findElement(By.xpath("(//*[@name='assigned_user_id'])[2]"));
		Select s3 = new Select(ele3);
		s3.selectByValue("4");
		driver.findElement(By.cssSelector("*[name='saveButton']")).click();
		driver.findElement(By.id("Products_editView_fieldName_vendor_part_no")).sendKeys("45");
		driver.findElement(By.id("Products_editView_fieldName_productsheet")).sendKeys("abc");
		WebElement ele4 = driver.findElement(By.xpath("(//*[@name='glacct'])"));
		Select s4 = new Select(ele4);
		s4.selectByValue("308-Sales-Books");
		
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		
		driver.findElement(By.id("Products-editview-fieldname-unit_price")).sendKeys("45");
		driver.findElement(By.id("Products_editView_fieldName_commissionrate")).sendKeys("45");
		driver.findElement(By.xpath("(//*[@name='tax2_check'])")).click();
		driver.findElement(By.id("Products_editView_fieldName_purchase_cost")).sendKeys("85");
		WebElement ele5 = driver.findElement(By.xpath("(//*[@name='usageunit'])"));
		Select s5 = new Select(ele5);
		s5.selectByValue("Impressions");
		driver.findElement(By.id("Products_editView_fieldName_qtyinstock")).sendKeys("85666");
		WebElement ele6 = driver.findElement(By.xpath("(//*[@name='assigned_user_id'])"));
		Select s6 = new Select(ele6);
		s6.selectByValue("2");
		driver.findElement(By.id("Products_editView_fieldName_qty_per_unit")).sendKeys("68");
		driver.findElement(By.id("Products_editView_fieldName_reorderlevel")).sendKeys("963");
		driver.findElement(By.id("Products_editView_fieldName_qtyindemand")).sendKeys("852");
		
		JavascriptExecutor js1 =  (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,300)");
		Thread.sleep(200);
		 driver.findElement(By.xpath("//*[contains(@class,'fileUploadBtn btn btn-primary')]")).click();
		 Thread.sleep(2000);		 
		 Runtime.getRuntime().exec("C:\\Users\\Prajakta\\Desktop\\AutoitFiles\\A.exe"); 
		Thread.sleep(200);
		driver.findElement(By.id("Products_editView_fieldName_description")).sendKeys("Selenium is an open source umbrella project for a range of tools and libraries aimed at supporting browser automation. It provides a playback tool for authoring functional tests across most modern web browsers, without the need to learn a test scripting language. ");
		driver.findElement(By.xpath("(//*[@class='btn btn-success saveButton'])")).click();
		 Thread.sleep(1000);	
		driver.findElement(By.xpath("//a[.='Atlas Jeniffer']")).click();
		Thread.sleep(200);
		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		
		
		

	}

}
