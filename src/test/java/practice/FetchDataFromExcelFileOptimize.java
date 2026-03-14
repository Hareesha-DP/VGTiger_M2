package practice;

import java.io.IOException;
import java.util.List;

import genericUtility.ExcelUtility;

public class FetchDataFromExcelFileOptimize {
	
	public static void main(String[] args) throws IOException {
//		
//		ExcelUtility eutil = new ExcelUtility ();
//		String value = eutil.getSingleCellDataFromExcelFile("cars", 3, 2);
//		System.out.println(value);
//		String value1 = eutil.getSingleCellDataFromExcelFile("actors", 3, 0);
//		System.out.println(value1);
		
		
		ExcelUtility eutil = new ExcelUtility();
	    List<String> al = eutil.getMultipleDataFromExcel("cars", 1, 0);
	    System.out.println(al);
		
}

}
