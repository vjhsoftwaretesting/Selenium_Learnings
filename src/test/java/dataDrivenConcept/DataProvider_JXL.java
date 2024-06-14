package dataDrivenConcept;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataProvider_JXL {
	
String[][] data=null;
	
	@DataProvider 
	public String[][] loginDataProvider() throws BiffException, IOException{
		data=getExcelData();
		return data;
	}
	
	public String[][] getExcelData() throws BiffException, IOException{
		FileInputStream excel = new FileInputStream("D:\\myCortexSeleniumData\\InstitutionData.xls");
		Workbook workbook = Workbook.getWorkbook(excel);
		Sheet sheet = workbook.getSheet(0);
		int rowCount = sheet.getRows();
		int columnCount = sheet.getColumns();
		
		String testData[][] = new String[rowCount-1][columnCount];
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<columnCount;j++) {
				testData [i-1][j]=sheet.getCell(j,i).getContents();
			}	
		}
		return testData;
	}
	
	@Test(dataProvider = "loginDataProvider")
	public void cr_Ins(String InsName, String SHName, String Insmail, String country, String state, String city)
			throws InterruptedException {
		System.out.println(InsName);
		System.out.println(SHName);
		System.out.println(Insmail);
		System.out.println(country);
		System.out.println(state);
		System.out.println(city);
	
	
	}

}
