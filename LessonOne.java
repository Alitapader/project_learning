package SeliniumLesson;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LessonOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://iarchtaps.com:8080/opentaps");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemosalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC INC");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ali");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Tapader");
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select dd = new Select(source);
		
		dd.selectByIndex(2);
		
		WebElement mktComp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		
		Select dd1 = new Select(mktComp);
		dd1.selectByIndex(4);
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("2675321009");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("alicorp@gmail.com");
		
		driver.findElement(By.className("smallSubmit")).click();

		
		
		

	}

}
