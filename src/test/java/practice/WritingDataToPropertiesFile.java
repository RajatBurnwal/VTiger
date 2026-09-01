package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import genericUtility.PropertiesUtility;

public class WritingDataToPropertiesFile {

	public static void main(String[] args) throws IOException {

//		FileInputStream fis = new FileInputStream("C:\\Users\\rajat burnwal\\Desktop\\TestData.properties");
//		Properties prop = new Properties();
//		prop.load(fis);
//		prop.setProperty("mobile", "9876543211");
//		FileOutputStream fos = new FileOutputStream("C:\\Users\\rajat burnwal\\Desktop\\TestData.properties");
//		prop.store(fos, "mobile is updated");
		PropertiesUtility putil = new PropertiesUtility();
		putil.writeDataToProperties("name", "ravi", "name is added");
		
	}

}
