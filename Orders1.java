package Automation.MobilWorld;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Orders1 
{
	@Test()
	public void Orders() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\divakar.br\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net");
	    driver.manage().window().maximize();
	    //AllMobiles
        driver.findElement(By.xpath("//a[@href='mobile.html']")).click();
        Thread.sleep(1000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.xpath("//tbody[@id='myTable']/tr[2]/td[5]/a")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        driver.findElement(By.xpath("//input[@id='inputFirstName']")).sendKeys("Divakar");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//body/div[@class='container']/div[1]/div[2]/form[1]/div[1]/div[2]/input")).sendKeys("Reddeppa");
        Thread.sleep(1000);
        driver.findElement(By.id("inputEmail")).sendKeys("divakarbr1999@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("inputPassword")).sendKeys("Divakarbr@123");
        Thread.sleep(1000);
        driver.findElement(By.id("flexRadioDefault1")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9113596392");
        Thread.sleep(1000);
        driver.findElement(By.id(" address1")).sendKeys("Booragamakalahalli");
        Thread.sleep(1000);
        driver.findElement(By.id("address2")).sendKeys("Rayalpad");
        Thread.sleep(1000);
        driver.findElement(By.id("inputCity")).sendKeys("Kolar");
        Thread.sleep(1000);
        WebElement State=driver.findElement(By.id("inputState"));
        Thread.sleep(1000);
        Select S=new Select(State);
        S.selectByIndex(2);
        driver.findElement(By.id("inputZip")).sendKeys("563134");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@rel='apple']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@rel='samsung']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='apple']//option[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='no of mobiles']")).sendKeys("1");
        Thread.sleep(1000);
        WebElement Count = driver.findElement(By.id("bought"));
        Select s3= new Select( Count );
        s3.selectByIndex(1);
        Thread.sleep(2000);
        List<WebElement> a=driver.findElements(By.id("gridCheck1"));
        a.get(0).click();
        a.get(1).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='btn btn-secondary']")).click();
        driver.quit();
		 
		
	}

}
