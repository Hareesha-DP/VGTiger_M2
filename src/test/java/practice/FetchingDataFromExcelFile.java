package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream ("C:\\Users\\Hareesha D P\\Desktop\\seleniumexcel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("cars");
		Row r = sh.getRow(5);
		Cell c = r.getCell(4);
//		String value = c.getStringCellValue();
//	System.out.println(value);
	double value1 = c.getNumericCellValue();
	System.out.println(value1);
	}

}
