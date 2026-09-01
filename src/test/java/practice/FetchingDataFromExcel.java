package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;

public class FetchingDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

//		FileInputStream fis = new FileInputStream("C:\\Users\\rajat burnwal\\Desktop\\TestData.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Cell c = wb.getSheet("Animals").getRow(2).getCell(6);
//		DataFormatter df = new DataFormatter();
//		String value = df.formatCellValue(c);
		ExcelUtility eutil = new ExcelUtility();
		String animal = eutil.getDataFromExcel("Animals", 2, 5);
		System.out.println(animal);
		String car = eutil.getDataFromExcel("Cars", 4, 4);
		System.out.println(car);
		String fruit = eutil.getDataFromExcel("Fruits", 6, 2);
		System.out.println(fruit);
	}

}
