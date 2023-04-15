package com.seshu;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDatafromExcel {

	public static void main(String[] args) throws Throwable {
		File fi = new File("‪‪C:\\DemoFile.xls");
		FileInputStream file = new FileInputStream(fi);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet4");
		int rowcount = sheet.getLastRowNum();
		int cell = sheet.getRow(0).getLastCellNum();
		for (int i = 0; i < rowcount; i++) {
			XSSFRow currentrow = sheet.getRow(i);
			for (int j = 0; j < cell; j++) {
				String currentcell = currentrow.getCell(j).toString();
				System.out.println(currentcell);
			}
		}
	}

}
