package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTest {
	
	public static ArrayList<String> getData(String sheetName,String testCaseName) throws IOException {
		FileInputStream fis = new FileInputStream("E:\\Login.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		ArrayList<String> al = new ArrayList<String>();		
		int sheetsCount = workbook.getNumberOfSheets();

		//System.out.println(sheetsCount);
		//GetSheet and Get row of TestCases
		for (int i = 0; i < sheetsCount; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase(sheetName)) {
				XSSFSheet sheet = workbook.getSheetAt(i);

				Iterator<Row> rows = sheet.iterator();

				Row firstRow = rows.next();
				Iterator<Cell> cells = firstRow.cellIterator();
				int column = 0;
				int k = 0;
				while (cells.hasNext()) {
					Cell cValue = cells.next();
					if (cValue.getStringCellValue().equalsIgnoreCase(testCaseName)) {
						column = k;
					}
					k++;
				}
				//System.out.println(column);
				while(rows.hasNext()) {
					Row rValue=rows.next();
					if(rValue.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName)){
						Iterator<Cell> cellValues=rValue.cellIterator();
						while(cellValues.hasNext()) {
							Cell c=cellValues.next();
							if(c.getCellType()==CellType.STRING){
								al.add(c.getStringCellValue());							
								}
							else {
								al.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}
						}
					}
				}
			}
		}
		return al;
	}

}
