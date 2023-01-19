package Parameterization;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Chitte_Bhau {

	 public static void main(String[] args) throws Throwable, Throwable {
		
		FileInputStream file = new FileInputStream("C:\\Users\\kadus\\OneDrive\\Desktop\\champ.xlsx");
		         String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		         System.out.println(data);
		         
	}
}
