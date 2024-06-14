package javaConceptsExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class V076Alternate_DeepFunctionalTesting {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Cauliflower" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		for(String items : itemsNeeded) {
			driver.findElement(By.xpath("//*[@class='product-name'][contains(text(),'"+items+"')]/following-sibling::div/button")).click();
		}

	}

}
