package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	By signuplink =By.xpath("//a[@class=\"_97w5\"]");
	By text=By.xpath("//div[@class=\"mbs _52lq _9bp_ fsl fwb fcb\"]");
	By email=By.xpath("//input[@id='email']");
	By password=By.xpath("//input[@id='pass']");
	By loginbtn=By.xpath("//button[@type=\"submit\"]");
	By logo=By.xpath("//img[@alt='Facebook']");
	By textonpage=By.xpath("//div[@class=\"_8esl\"]//h2");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void user_navigatesto_loginpage() {
		driver.get("https://www.facebook.com/login/");	

	}
	public void clickonsignupelink() {
		driver.findElement(signuplink).click();

	}
	public String verifypagetitle() {
		return	driver.findElement(text).getText();

	}
	public void setemailandpassword(String email1,String password1) {
		driver.findElement(email).sendKeys(email1);
		driver.findElement(password).sendKeys(password1);

	}
	public void clickonloginbtn() {
		driver.findElement(loginbtn).click();

	}
	public WebElement logoverification() {
		return driver.findElement(logo);

	}
	

	public String textverification() {
		String texte= driver.findElement(textonpage).getText();
		return texte;
	}







}

