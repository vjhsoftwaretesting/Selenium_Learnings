package dataDrivenConcept;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class V228Basics {
	
	
	public ArrayList<String> dataDriven(String testcaseName) throws IOException {
		
		ArrayList<String> a = new ArrayList<String>();
		
		
		FileInputStream fis = new FileInputStream("D:\\RahulShetty\\demodatas.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(1);
		
	/*	int sheets = workbook.getNumberOfSheets();
		for(int i=0; i<sheets;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata")) {*/
				//XSSFSheet sheet = workbook.getSheet("testdata");
				//identify testcases column by scanning the entire 1st row
				
				Iterator<Row> rows = sheet.iterator(); //sheet is collection of rows
				Row firstRow = rows.next();
				Iterator<Cell> ce = firstRow.cellIterator(); //row is collection of cells
				int k=0;
				int column = 0;
				while (ce.hasNext()) {
					Cell value = ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("Testcases")) {
						column=k;
					}
					k++;
					}
				System.out.println(column);
				
				while(rows.hasNext()) {
					Row r = rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName)) {
						Iterator<Cell> cv = r.cellIterator();
						while(cv.hasNext())
						{
							a.add(cv.next().getStringCellValue());
						}
					}
				}
				
				workbook.close();
				fis.close();
				return a; 	 	
			}
	
	
	@Test
	public void cc() throws IOException {
		
		ArrayList<String> data = dataDriven("Add Profile");
		
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
	}

}
