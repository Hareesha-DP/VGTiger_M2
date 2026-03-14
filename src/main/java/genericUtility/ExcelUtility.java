package genericUtility;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * this is an Utility class which deals with excel file.
 * @author Hareesha D P.
 * @version 26-02-04.
 */
public class ExcelUtility {

	/**
	 * this is an generic method used to fetch the single cell value from excel file.
	 * @param sheetName
	 * @param rowInndex
	 * @param cellIndex
	 * @return
	 * @throws IOException
	 */

	public String getSingleCellDataFromExcelFile(String sheetName , int rowInndex , int cellIndex) throws IOException {
		FileInputStream fis = new FileInputStream (IPathUtility.excelFilePath);
		Workbook wb = WorkbookFactory.create(fis);
		Cell c = wb.getSheet(sheetName).getRow(rowInndex).getCell(cellIndex);
		DataFormatter df = new DataFormatter();
		String value = df.formatCellValue(c);
		return value;

	}

	/**
	 * This is generic method used to fetch multiple data from excel file.
	 * @param sheetName
	 * @param startRowIndex
	 * @param startCellIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public List<String> getMultipleDataFromExcel(String sheetName , int startRowIndex, int startCellIndex) throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream(IPathUtility.excelFilePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		DataFormatter df = new DataFormatter();
		List<String> al = new ArrayList<String>();
		for(int i=startRowIndex ; i<=sh.getLastRowNum(); i++) {
			Row r = sh.getRow(i);
			for(int j=startCellIndex ; j<r.getLastCellNum(); j++) {
				Cell c = r.getCell(j);
				String value = df.formatCellValue(c);
				al.add(value);
			}

		}
		return al;

	}

	/**
	 * This is generic method to write data to excel file.
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @param value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public void writeDataToExcelFile(String sheetName , int rowIndex , int cellIndex , String value) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(IPathUtility.excelFilePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.createSheet(sheetName);
		Row r = sh.createRow(rowIndex);
		Cell c = r.createCell(cellIndex);
		c.setCellValue(value);
		FileOutputStream fos = new FileOutputStream(IPathUtility.excelFilePath);
		wb.write(fos);

	}
}
