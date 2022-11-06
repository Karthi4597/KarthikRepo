package apavhe_programs;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//program to read the data from excel
public class p1 {
	public static void main(String[] args) throws Throwable {
		
		FileInputStream f1=new FileInputStream("C:\\Users\\suman\\Desktop\\Karthik\\selenium_workspace\\selenium_project\\data\\ecxel.xlsx");
		
		Workbook book = WorkbookFactory.create(f1);
		String data = book.getSheet("demo").getRow(3).getCell(0).getStringCellValue();
		System.out.println(data);
	}
}
