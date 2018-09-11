package bhaskar1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelwrite {

 public static XSSFSheet sheet;
 public static FileOutputStream fos;
 public static XSSFWorkbook wb;
	

	public static  void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("D:\\daya.xlsx");
		fos = new FileOutputStream(file);
		wb=new XSSFWorkbook();
		sheet=wb.createSheet("names");
		Excelwrite re=new Excelwrite();
		re.writedata(0,"bhaskar","gooty",30);
		re.writedata(1,"kishore","gooty",40);
		re.writedata(2,"lakshman","lcp",50);
		wb.write(fos);
		fos.close();
	}
	public void writedata(int rownum,String col1,String col2,int col3)
	{
		XSSFRow row=sheet.createRow(rownum);
		XSSFCell cell=row.createCell(0);
		cell.setCellType(Cell.CELL_TYPE_STRING);
		cell.setCellValue(col1);
		cell=row.createCell(1);
		cell.setCellType(Cell.CELL_TYPE_STRING);
		cell.setCellValue(col2);
		cell=row.createCell(2);
		cell.setCellType(Cell.CELL_TYPE_NUMERIC);
		cell.setCellValue(col3);
		
	}

	}


