package vTiger.genericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileLibrary {
	
public String readDataFromExcel(String SheetName,int rowNum,int cellNum) throws Throwable {
	FileInputStream f=new FileInputStream(IConstantLibrary.excelFilePath);
	Workbook book = WorkbookFactory.create(f);
	String data = book.getSheet(SheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	return data;
}

public void writeDataToExcel(String SheetName,int rowNum,int cellNum,String value) throws IOException
{
	FileInputStream f1 = new FileInputStream(IConstantLibrary.excelFilePath);
	Workbook book = WorkbookFactory.create(f1);
	book.getSheet(SheetName).getRow(rowNum).createCell(cellNum).setCellValue(value);
	
	
	FileOutputStream fos = new FileOutputStream(IConstantLibrary.excelFilePath);
	book.write(fos);
	book.close();
	System.out.println("Data written successfully");
	
}

public int getRowCount(String sheetName) throws IOException
{
	FileInputStream f = new FileInputStream(IConstantLibrary.excelFilePath);
	Workbook book = WorkbookFactory.create(f);
	 int rowCount = book.getSheet(sheetName).getLastRowNum();
	 book.getSheet(sheetName).getRow(0).getLastCellNum();
	 
	return rowCount;
	
}

public short getCellCount(String sheetName,int rowNum) throws EncryptedDocumentException, IOException
{
	FileInputStream f = new FileInputStream(IConstantLibrary.excelFilePath);
	Workbook book = WorkbookFactory.create(f);
	short cellNum = book.getSheet(sheetName).getRow(rowNum).getLastCellNum();
	return cellNum;
}



	

}
