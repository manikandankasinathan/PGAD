package com.PGAD.QA.FileReader;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReader extends PathDirectory{
	
	public XSSFSheet mySheetObject = null;
	public String sheetName = null;
	

	public ExcelFileReader(String excelfile) {
		super();
		this.exceldata = excelfile;
	}

	public XSSFWorkbook readFile() throws Exception {
		File src=new File(exceldata);
		FileInputStream fis=new FileInputStream(src);
		return new XSSFWorkbook(fis);
	}

	public String getdata(String sheetname,int row,int column) {
		if(sheetName == null || !sheetName.equals(sheetname) || mySheetObject == null ){
			XSSFWorkbook wb = null;
			try {
				wb = readFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
			sheetName = sheetname;
			mySheetObject=wb.getSheet(sheetname);
		}
		DataFormatter formatter = new DataFormatter();
		String data = formatter.formatCellValue(mySheetObject.getRow(row).getCell(column));
		return data;
	}
	
	public static ExcelFileReader getXssfSheetUtil(String excelfile) {
		return new ExcelFileReader(excelfile);
	}
	
}
