package practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import genericUtility.ExcelUtility;

public class WriteDataToExcelFile {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	ExcelUtility eeutil = new ExcelUtility();
	eeutil.writeDataToExcelFile("models", 7, 2, "sunny");
	
}
	
		
	}

