package dataDrivenConcept;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class V230DataProvider_02 {
	DataFormatter formatter = new DataFormatter();
	@DataProvider(name="driveTest")
	public Object[][] getData() throws IOException{
		//Object[][] data = {{"hello ","text ",1},{"bye ","message ",2},{"solo ","call ",143}};
		//return data;
		
		FileInputStream fis = new FileInputStream("D:\\RahulShetty\\demodatas.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = 	sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object data[][] = new Object [rowCount-1][colCount];
		for(int i=0;i<rowCount-1;i++) {
			row=sheet.getRow(i+1);
			for(int j=0;j<colCount;j++) {
				XSSFCell cell = row.getCell(j);
				
				data[i][j] = formatter.formatCellValue(cell);
			}
		}
		workbook.close();
		fis.close();
		return data;
	}
	
	@Test(dataProvider="driveTest")
	public void testCaseData(String greeting, String communication, String id) {
		System.out.println(greeting+communication+id);
	}

}
