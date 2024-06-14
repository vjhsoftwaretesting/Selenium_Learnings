package section17Java_Inheritance;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {

	public void doThis() {
		System.out.println("I'm here");
		
	}
	@BeforeMethod
	public void beforeRun() {
		 System.out.println("Run me 1st");
	}
	@AfterMethod
	public void afterRun() {
		System.out.println("Run me last");
	}
}
