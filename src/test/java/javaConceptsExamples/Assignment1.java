package javaConceptsExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//check and uncheck checkbox1
		WebElement chbox1 = driver.findElement(By.id("checkBoxOption1"));
		chbox1.click();
		if(chbox1.isEnabled()) 
			System.out.println("Checkbox 1 is checked successfully");
		else 
			System.out.println("Checkbox 1 is not checked successfully");
		chbox1.click();
		if(chbox1.isEnabled()) 
			System.out.println("Checkbox 1 is unchecked successfully");
		else 
			System.out.println("Checkbox 1 is not unchecked successfully");
		
		//get the number of checkboxes
		List<WebElement> count = driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println("No. of checkbox = "+count.size());

	}

}
