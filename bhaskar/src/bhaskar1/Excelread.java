package bhaskar1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread {
	
	public static void main(String[] args) throws IOException
	{
		
	
	File Excel=new File("E:\\boss.xlsx");
	FileInputStream fis=new FileInputStream(Excel);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet ws=wb.getSheet("boss");
	int rowNum=ws.getLastRowNum();
	System.out.println("row count"+rowNum);
	int colNum=ws.getRow(1).getLastCellNum();
	System.out.println("colume count is "+colNum);
	/*for(int i=0;i<rowNum;i++)
	{
		XSSFRow row=ws.getRow(i);
		for(int j=0;j<colNum;j++)
		{
		XSSFCell cell=row.getCell(j);
		String value=cell.toString();
		System.out.println("the value is"+"\t"+value);
	}
	

}
*/
	for(int i=0; i<=rowNum;i++)
	{
		XSSFRow row = ws.getRow(i);
		for(int j=0; j<colNum;j++)
		{
			System.out.println("row no::"+i+" and column no::"+j+" and celldatais"+row.getCell(j).toString());
		}
	}
	}
	
}

