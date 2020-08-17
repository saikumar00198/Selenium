package Selenium;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\SeleniumPractice\\Executable Files\\chromedriver.exe");
		ChromeDriver chrome = new ChromeDriver();
		chrome.get("https://www.google.com");	
		
		//FirefoxDriver ff = new FirefoxDriver();
		//ff.get("http://www.google.com");
		
		System.out.println("Browser open success fully");
		chrome.findElement(By.xpath("q")).sendKeys("Selenium");
	} 	

}
