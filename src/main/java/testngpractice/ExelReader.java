package testngpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExelReader {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fStream = new FileInputStream("C:\\Users\\debma\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		Workbook create = WorkbookFactory.create(fStream);
		Cell cell = create.getSheet("sheet1").getRow(1).getCell(0);
		System.out.println(cell);
	}

}
