package suhaliProject2.suhaliProject2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceLogin {

	public static void main(  )
    {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://login.salesforce.com");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("gowtham");
        driver.close();
    }
}
