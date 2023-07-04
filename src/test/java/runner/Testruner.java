package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\test\\resources\\Feature\\sample.feature",
glue= {"stepdef","hooks"},
plugin= {"pretty","html:target/html-reports/AUTOMATION_REPORT.html"},
tags="not @ignore",
monochrome = true,
publish = true
		)
public class Testruner {





}






