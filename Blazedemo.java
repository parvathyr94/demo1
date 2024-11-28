package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Blazedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.blazedemo.com/");
		Select depature=new Select(driver.findElement(By.name("fromPort")));
		Select destination=new Select(driver.findElement(By.name("toPort")));
		depature.selectByVisibleText("Boston");
		destination.selectByVisibleText("New York");
		
		

	}

}
