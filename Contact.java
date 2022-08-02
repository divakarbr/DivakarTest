package Automation.MobilWorld;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Contact 
{
	  @Test()
	    public void contact() throws InterruptedException
	    {
	        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\divakar.br\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://mobileworld.azurewebsites.net");
	        driver.findElement(By.xpath("(//a[@id='navbarDropdown'])")).click();
	        driver.findElement(By.linkText("Contact Us")).click();
	        Set<String> windows = driver.getWindowHandles();
	        Iterator<String> it = windows.iterator();
	        String parentId = it.next();
	        String childId = it.next();
	        driver.switchTo().window(childId);
	        driver.manage().window().maximize();
	        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("divakar");
	        Thread.sleep(500);
	        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("divakarbr1999@gmail.com");
	        Thread.sleep(500);
	        driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("9113596392");
	        Thread.sleep(500);
	        driver.findElement(By.name("message")).sendKeys("hello world");
	        Thread.sleep(500);
	        driver.findElement(By.xpath("//input[@type='submit']")).click();
	        Thread.sleep(500);
	        driver.quit();
	    }

}
