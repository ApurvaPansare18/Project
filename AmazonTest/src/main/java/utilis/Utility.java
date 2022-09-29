package utilis;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility {
	
	public static  void captureScreenshot()
	{
		
	}
	
	public static String fetchData() throws EncryptedDocumentException, IOException
	{
        String value;
        String path="C:\\Users\\UGTECH\\OneDrive\\Documents\\screenshot\\test.xlsx";
		FileInputStream file=new FileInputStream(path);
        
       Cell c=WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(1);
       try {
       value =c.getStringCellValue();
       System.out.println(value);
      
       }
       
       catch(Exception e)
       {
    	  double  data=c.getNumericCellValue();
    	 value= Double.toString(data);
       }
	return value;
	}

}
