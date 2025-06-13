package excelLearning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadFromPropertyFile {

	public static void main(String[] args) throws Exception {
		

		File file=new File(System.getProperty("user.dir")+"/src/main/resources/config.properties");
		FileInputStream fis=new FileInputStream(file);
		
		Properties config=new Properties();
		
		config.load(fis);
		
		System.out.println(config.getProperty("browser"));
		System.out.println(config.getProperty("url"));
		

	}

}
