package com.PGAD.QA.FileReader;

import java.io.File;
import java.nio.file.FileSystems;

public class PathDirectory {

	static String directory = getDirectoryPath();
	
	public static String getDirectoryPath() {
		String str = FileSystems.getDefault().getPath(".").toAbsolutePath().toString() ;
	    if (str.charAt(str.length()-1)=='.'){
	        str = str.replace(str.substring(str.length()-1), "");
	        return str;
	    } else{
	        return str;
	    }
	}
	
	static String configPath = directory+"src"+File.separator+"main"+File.separator+"java"+File.separator+"com"+File.separator+"PGAD"+File.separator+"QA"+File.separator+"FileReader"+File.separator+"config.properties";
   public static String exceldata = directory+"src"+File.separator+"main"+File.separator+"java"+File.separator+"com"+File.separator+"PGAD"+File.separator+"QA"+File.separator+"FileReader"+File.separator+"TestData.xlsx";		

}
