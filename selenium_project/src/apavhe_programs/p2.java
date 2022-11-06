package apavhe_programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//program to overriding the data in excel
public class p2 {
	public static void main(String[] args) throws Throwable {
		//reads the data from excel
		FileInputStream f1=new FileInputStream("./data/excel.xlsx");
		//creates a workspace
		Workbook book = WorkbookFactory.create(f1);
		//sets data into specified cell of the workspace
		book.getSheet("demo").getRow(2).getCell(0).setCellValue("abcd");
		//writes the data from workspace to excel
		FileOutputStream f2 = new FileOutputStream("./data/ecxel.xlsx");
		book.write(f2);
		
	}
}
