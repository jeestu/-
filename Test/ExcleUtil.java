package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcleUtil {
	public static List<StudentDemo> readXls() throws Exception{
		InputStream is=new FileInputStream("D:/Java/Software17_Student_JavaEE.xls");
		HSSFWorkbook excel=new HSSFWorkbook(is);
		StudentDemo stu=null;
		List<StudentDemo> list=new ArrayList<StudentDemo>();
		for(int numSheet=0;numSheet<excel.getNumberOfSheets();numSheet++) {
			HSSFSheet sheet=excel.getSheetAt(numSheet);
			if(sheet==null)
				continue;
			for(int rowNum=1;rowNum<sheet.getLastRowNum();rowNum++) {
		
				HSSFRow row=sheet.getRow(rowNum);
				if(row==null)
					continue;
				stu=new StudentDemo();
				HSSFCell cell0=row.getCell(0);
				if(cell0==null)
					continue;
				stu.setId((int)cell0.getNumericCellValue());
				
			}
				
				
			
		}
		return list;
	}
}
