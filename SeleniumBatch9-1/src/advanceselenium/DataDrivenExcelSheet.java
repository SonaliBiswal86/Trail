package advanceselenium;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenExcelSheet 
{
  public static void main(String[] args) throws Throwable 
  {
	//Give the path  
	FileInputStream fis=new FileInputStream("./Data/GoIbibo.xlsx");
	//Take the control of Workbook
	Workbook wb=WorkbookFactory.create(fis);
	//Take the control of sheet
	Sheet sheet=wb.getSheet("Sheet1");
	//Take the control of row
	Row row=sheet.getRow(3);
	//Take the control of cell
	Cell cell=row.getCell(1);
	//Fetch the data
	String data=cell.getStringCellValue();
	System.out.println(data);
}
}
