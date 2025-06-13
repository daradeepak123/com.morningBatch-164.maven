package excelLearning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import utils.ExcelUtils;

public class ReadDataExcel {

	public static void main(String[] args) throws Exception {

//		File file=new File(System.getProperty("user.dir")+"/src/main/resources/employee.xlsx");
//		FileInputStream fis=new FileInputStream(file);
//		XSSFWorkbook wb=new XSSFWorkbook(fis);
//		XSSFSheet sht=wb.getSheet("sheet1");
		
		ExcelUtils ex=new ExcelUtils();
		XSSFSheet sht=ex.returnSheetData(System.getProperty("user.dir")+"/src/main/resources/employee.xlsx", "sheet1");
		
		String data=sht.getRow(6).getCell(2).toString();
		System.out.println(data);
		
		
		int row=sht.getLastRowNum();
		int col=sht.getRow(0).getLastCellNum()-1;
		
		String dataArr[][]=new String[row+1][col];
		
		System.out.println(row+"    "+col);
		
		for(int i=0;i<=row;i++)
		{
			for(int j=0;j<col;j++)
			{
				String dataa=sht.getRow(i).getCell(j).toString();
				System.out.print(dataa+"\t");
				dataArr[i][j]=dataa;
			}
			System.out.println();
		}
		
		
	}

}
