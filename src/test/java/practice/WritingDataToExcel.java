package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;

public class WritingDataToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

//		FileInputStream fis = new FileInputStream("C:\\Users\\rajat burnwal\\Desktop\\TestData.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet("Animals");
//		Row r = sh.getRow(2);
//		Cell c = r.createCell(4);
//		c.setCellValue("Leopard");
//		FileOutputStream fos = new FileOutputStream("C:\\Users\\rajat burnwal\\Desktop\\TestData.xlsx");
//		wb.write(fos);
		ExcelUtility eutil = new ExcelUtility();
		eutil.writeDataToExcel("Animals", 6, 5, "Monkey");
	}

}
