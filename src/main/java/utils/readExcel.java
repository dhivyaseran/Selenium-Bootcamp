package utils;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class readExcel {
@Test
	public static  String[][] readExcelData(String filename) throws IOException {
		XSSFWorkbook wb=new XSSFWorkbook("./Data/"+filename+".xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowcount = ws.getLastRowNum();
		System.out.println(rowcount);
		short lastCellNum = ws.getRow(0).getLastCellNum();
		System.out.println(lastCellNum);
		
		String[][] data=new String[rowcount][lastCellNum];
		
		for (int i = 1; i <=rowcount; i++) {
			
		
			for (int j = 0; j <lastCellNum; j++) {
				String CellValue = ws.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=CellValue;
				System.out.println(CellValue);
				
			}	
			
		wb.close();	
		
		}
	
		return data;
		

	}

}
