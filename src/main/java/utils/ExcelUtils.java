package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	
	
	public XSSFSheet returnSheetData(String path,String SheetName) throws Exception
	{
		File file=new File(path);//System.getProperty("user.dir")+"/src/main/resources/employee.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sht=wb.getSheet(SheetName);//"sheet1");
		return sht;
	}
	
	
	public String readFromProps(String prop) throws Exception
	{
		File file=new File(System.getProperty("user.dir")+"/src/main/resources/config.properties");
		FileInputStream fis=new FileInputStream(file);
		
		Properties config=new Properties();
		
		config.load(fis);
		String data=config.getProperty(prop);
		
		return data;
	}
	

}
