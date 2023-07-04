package pages;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageOrangehrm {

	WebDriver driver;
	By name=By.cssSelector("input[placeholder='Username']");
	By password=By.xpath("//input[@placeholder='Password']");
	By loginbtn=By.xpath("//button[@type='submit']");
	By dashboard=By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
	public LoginPageOrangehrm(WebDriver driver) {
		this.driver = driver;
	}

	public void usernavigatesto_loginpage() {
		driver.get("https://opensource-demo.orangehrmlive.com");	

	}
	public void setUserNameandPassword() throws IOException {
		String path=System.getProperty("user.dir")+"./src/test/resources/config/config.properties";
		File file=new File(path);
		FileInputStream fi=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fi);
		driver.findElement(name).sendKeys(prop.getProperty("username"));
		driver.findElement(password).sendKeys("password");
	}
	
	public void clickOnLogin() {
		driver.findElement(loginbtn).click();
	}
	
	

	public WebElement verifydashboard() {
	return	driver.findElement(dashboard);

		}



	
}

