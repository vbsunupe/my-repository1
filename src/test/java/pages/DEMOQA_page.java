package pages;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DEMOQA_page {

	WebDriver driver;


	public DEMOQA_page(WebDriver driver) {
		this.driver = driver;
	}
	By name=By.xpath("//input[@id='firstName']");
	By lastname=By.xpath("//input[@id='lastName']");
	By email=By.xpath("//input[@id='userEmail']");
	By checboxkmale=By.xpath("//label[@for='gender-radio-1']");
	By mobilenumber=By.xpath("//input[@id='userNumber']");
	By subjects=By.xpath("//div[@class=\"subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3\"]");
	By Hobbiecheck=By.xpath("//input[@type=\"checkbox\"]");
	By address=By.xpath("//textarea[@id='currentAddress']");
	By dobinput=By.id("dateOfBirthInput");
	By year=By.xpath("//select[@class='react-datepicker__year-select']");
	By month=By.xpath("//select[@class='react-datepicker__month-select']");
	By state=By.tagName("//img[@title='Ad.Plus Advertising']");
	By  date=By.xpath("//*[text()=\"22\"]");
	By pic=By.xpath("//input[@id='uploadPicture']");




	public void user_navigatesto_registration_page() throws IOException {
		File file=new File(".\\src\\test\\resources\\config\\config.properties");
		FileInputStream fi=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fi);

        driver.get(prop.getProperty("WEBURL"));



	}
	public void setalldetails()  {
		driver.findElement(name).sendKeys("vishal");
		driver.findElement(lastname).sendKeys("sunupe");
		driver.findElement(email).sendKeys("vishalsunupe6@gmail.com");
		driver.findElement(checboxkmale).click();
		driver.findElement(mobilenumber).sendKeys("8767217764");
		/*driver.findElement(subjects).sendKeys("math,english science");
	 

		List<WebElement>hobbies=driver.findElements(Hobbiecheck);
		for(WebElement h:hobbies) {
			if(!h.isSelected()) {
				h.click();
				
			}
			
			
		}*/
		
		driver.findElement(dobinput).click();
		Select selectyear=new Select(driver.findElement(year));
		selectyear.selectByValue("2024");
		Select selectmonth=new Select(driver.findElement(month));
		selectmonth.selectByIndex(3);
		driver.findElement(date).click();
		
		//add pic on clicking choose
		driver.findElement(pic).click();
	/*	try {
			Runtime.getRuntime().exec(".\\src\\test\\resources\\fileupload.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/




	}
	public void userclickson_submit_button() {






	}







}

