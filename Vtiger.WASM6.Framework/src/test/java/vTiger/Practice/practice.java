package vTiger.Practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class practice {

	public static void main(String[] args) throws Throwable {
FileInputStream f1=new FileInputStream("C:\\Users\\suman\\Desktop\\Karthik\\selenium_workspace\\Vtiger.WASM6.Framework\\data\\TestData.xlsx");
		
		Workbook book = WorkbookFactory.create(f1);
		String data = book.getSheet("organization").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);

	}

}
