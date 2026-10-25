package Generic_Utility;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
	
	public String readExcelData(String sheetname, int r,int c) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("D:\\Training\\TechM\\Year_2026\\src\\test\\resources\\Test_Data\\App_ExcelData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetname);
		Row row = sheet.getRow(r);
		Cell cell = row.getCell(c);
		String data = cell.getStringCellValue();
		return data;
		
	}

}
