package apavhe_programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//program to overriding the data in excel
public class p3 {
	public static void main(String[] args) throws Throwable {
		//reads the data from excel
		FileInputStream f1=new FileInputStream("C:\\Users\\suman\\Desktop\\Karthik\\selenium_workspace\\selenium_project\\data\\ecxel.xlsx");
		//creates a workspace
		Workbook book = WorkbookFactory.create(f1);
		//sets data into specified cell of the workspace
		book.getSheet("demo").createRow(10).createCell(10).setCellValue("javaSelenium");
		//writes the data from workspace to excel
		FileOutputStream f2 = new FileOutputStream("C:\\Users\\suman\\Desktop\\Karthik\\selenium_workspace\\selenium_project\\data\\ecxel.xlsx");
		book.write(f2);
		
	}
}
