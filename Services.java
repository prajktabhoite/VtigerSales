package Sales;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Services {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		driver.findElement(By.id("appnavigator")).click();
		
		driver.findElement(By.xpath("//span[text()=' SALES']")).click();
		
		driver.findElement(By.xpath("(//*[text()=' Services'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Services_listView_basicAction_LBL_ADD_RECORD")).click();
		Thread.sleep(200);
		driver.findElement(By.id("Services_editView_fieldName_servicename")).sendKeys("Software");
		driver.findElement(By.id("Services_editView_fieldName_discontinued")).click();
		driver.findElement(By.id("Services_editView_fieldName_website")).sendKeys("www.abc.com");
		WebElement ele1 = driver.findElement(By.cssSelector("*[name='assigned_user_id']"));
		Select s1 = new Select(ele1);
		s1.selectByValue("2");
		
		driver.findElement(By.xpath("(//*[@class='input-group-addon'])[2]")).click();
		driver.findElement(By.xpath("(//*[@class='today'])[1]")).click();
		driver.findElement(By.xpath("(//*[@class='input-group-addon'])[4]")).click();
		driver.findElement(By.xpath("(//*[@class='today'])[1]")).click();
		
		WebElement A1 = driver.findElement(By.cssSelector("*[name='service_usageunit']"));
		Select s11 = new Select(A1);
		s11.selectByValue("Hours");
		
		
		driver.findElement(By.id("Services_editView_fieldName_qty_per_unit")).sendKeys("85");
		
		WebElement A2 = driver.findElement(By.cssSelector("*[name='servicecategory']"));
		Select s2 = new Select(A2);
		s2.selectByValue("Installation");
		
		
		driver.findElement(By.xpath("(//*[@class='input-group-addon'])[1]")).click();
		driver.findElement(By.xpath("(//*[@class='today'])[1]")).click();
		driver.findElement(By.xpath("(//*[@class='input-group-addon'])[3]")).click();
		driver.findElement(By.xpath("(//*[@class='today'])[1]")).click();
		
		
		driver.findElement(By.id("Services-editview-fieldname-unit_price")).sendKeys("74185");
		driver.findElement(By.id("Services_editView_fieldName_commissionrate")).sendKeys("852");
		driver.findElement(By.id("tax2_check")).click();
		driver.findElement(By.id("Services_editView_fieldName_purchase_cost")).sendKeys("3654");
		driver.findElement(By.id("Services_editView_fieldName_description")).sendKeys("Selenium is an open source umbrella project for a range of tools and libraries aimed at supporting browser automation. ");
		Thread.sleep(200);
		 driver.findElement(By.xpath("(//*[@class='btn btn-success saveButton'])")).click();
		 Thread.sleep(2000);	
		 driver.findElement(By.xpath("//a[.='Atlas Jeniffer']")).click();
		 Thread.sleep(200);
		 driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		
		





	}

}
