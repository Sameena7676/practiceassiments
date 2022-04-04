
package com.Achyuth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationWebAplicationLogin {
public static void main(String[] args) {
	String url="C:\\Phase5\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", url);
	

	WebDriver driver= new ChromeDriver();
	driver.get("https://in.jobrapido.com/");
	
	
	WebElement login=driver.findElement(By.xpath("//*[@id=\"login-header\"]"));
    login.click();
      
    
    WebElement phone=driver.findElement(By.xpath("//*[@id=\"login\"]/div[2]/div[1]/div/div/div/form/div/div/div[1]/div[2]/input[1]"));
	phone.getAttribute("placeholder");

    phone.sendKeys("achyuthvarma.2017.ece@anits.edu.in");
    
    WebElement password=driver.findElement(By.xpath("//*[@id=\"login\"]/div[2]/div[1]/div/div/div/form/div/div/div[2]/div[2]/input[1]"));
    password.sendKeys("Apple234@");
    WebElement log=driver.findElement(By.xpath("//*[@id=\"submit-registration\"]"));
    log.click();
    //driver.findElement(By.cssSelector("#id-12 > section.sc-re4bd0-11.fKQGZb > section > div.sc-60vv3c-2.ggwUJG.sc-geAPOV.kNHGbp > div > input")).click();
	//driver.switchTo().alert().accept();
}
}
