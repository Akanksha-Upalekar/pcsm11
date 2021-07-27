import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData1 {

	public static void main(String[] args) throws FileNotFoundException {
	
		String path="G:\\\\login.xlsx";
		FileInputStream fis=new FileInputStream(path); //mentioning the path of file
		
		Workbook wb=WorkbookFactory.create(fis))
		
	}

}
