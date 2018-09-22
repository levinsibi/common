package general;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperationsAll {

	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static FileOutputStream fos;
	public static int r=0;
	public static int c=0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println(System.getProperty("user.dir"));
		String TC="TC5";
		r=getRow("TC5");
		c=getcell(r,"MOB");
		setcell(r,"MOB","55555");
	}

	private static void setcell(int r2, String string, String string2) throws IOException {
		// TODO Auto-generated method stub
		c=getcell(r2, string2);
		sheet.getRow(r2-1).getCell(c).setCellValue(string2);
		fos=new FileOutputStream("./TestData.xlsx");
		wb.write(fos);
		wb.close();
	}

	private static int getcell(int r2, String string) {
		// TODO Auto-generated method stub
	Row row=sheet.getRow(0);
	c=0;
	Iterator<Cell>cellIterator=row.cellIterator();
	while(cellIterator.hasNext())
	{
		c++;
		if(cellIterator.next().toString().equalsIgnoreCase(string))
		{
			break;
		}
	}
	System.out.println(c);
	
	System.out.println(sheet.getRow(r2-1).getCell(c-1).getStringCellValue());
	return c-1;
	}

	private static int getRow(String string) throws IOException {
		// TODO Auto-generated method stub
		fis=new FileInputStream("./TestData.xlsx");
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheetAt(0);
		
		Iterator<Row>rowIterator=sheet.rowIterator();
		while(rowIterator.hasNext())
		{
			r++;
			if(rowIterator.next().getCell(0).toString().equalsIgnoreCase(string))
			{
				break;
			}
		}
		System.out.println(r);
		return r;
	}

}
