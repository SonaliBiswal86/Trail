package advanceselenium;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchMultipleDataFromExcelSheet 
{
  public static void main(String[] args) throws Throwable 
  {
    FileInputStream fis=new FileInputStream("./Data/GoIbibo.xlsx"); 
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sheet=wb.getSheet("Sheet1");
    int rowCount=sheet.getPhysicalNumberOfRows();
    int cellCount= sheet.getRow(0).getPhysicalNumberOfCells();
    for(int i=1;i<rowCount;i++)
    {
    	for(int j=0;j<cellCount;j++)
    	{
    		String data=sheet.getRow(i).getCell(j).getStringCellValue();
    		System.out.println(data);
    	}
    }
    
  }
}
