package dataDrivenConcept;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class V229DataProvider_01 {
	
	@DataProvider(name="driveTest")
	public Object[][] getData(){
		Object[][] data = {{"hello ","text ",1},{"bye ","message ",2},{"solo ","call ",143}};
		return data;
	}
	
	@Test(dataProvider="driveTest")
	public void testCaseData(String greeting, String communication, int id) {
		System.out.println(greeting+communication+id);
	}

}
