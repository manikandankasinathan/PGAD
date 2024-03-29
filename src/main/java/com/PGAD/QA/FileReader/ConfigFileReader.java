package com.PGAD.QA.FileReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader extends PathDirectory{
	
	  private static Properties prop;

	    //Restricting other classes to create object
	    private ConfigFileReader() {
	    }

	    //To create single object to Config Properties file through-out the project
	    public static Properties getConfigPropObject() {
	        if (prop == null) {
	            prop = new Properties();
	            FileInputStream fis = null;
				try {
					fis = new FileInputStream(new File(configPath));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
	            try {
					prop.load(fis);
				} catch (IOException e) {
					e.printStackTrace();
				}
	            try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
	        }
	        return prop;
	    }
}
