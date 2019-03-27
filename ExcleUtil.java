package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcleUtil {
	public static void main(String[] args)throws Exception{
		List<StudentDemo> list=readXls();
		for(StudentDemo stu : list) {
			System.out.println(stu.getId());
			System.out.println(stu.getGrade());
			System.out.println(stu.getMajor());
			System.out.println(stu.getCclass());
			System.out.println(stu.getNum());
			System.out.println(stu.getStudent_Id());
			System.out.println(stu.getName());
			System.out.println(stu.getSex());
		}
	}
	public static List<StudentDemo> readXls() throws Exception{
		InputStream is=new FileInputStream("D:/Student.xlsx");
		XSSFWorkbook excel=new XSSFWorkbook(is);
		StudentDemo stu=null;
		List<StudentDemo> list=new ArrayList<StudentDemo>();
		for(int numSheet=0;numSheet<excel.getNumberOfSheets();numSheet++) {
			XSSFSheet sheet=excel.getSheetAt(numSheet);
			if(sheet==null)
				continue;
			for(int rowNum=1;rowNum<sheet.getLastRowNum();rowNum++) {
		
				XSSFRow row=sheet.getRow(rowNum);
				if(row==null)
					continue;
				stu=new StudentDemo();
				XSSFCell cell0=row.getCell(0);
				if(cell0==null)
					continue;
				stu.setId((int)cell0.getNumericCellValue());
				XSSFCell cell1=row.getCell(1);
				if(cell1==null)
					continue;
				stu.setGrade((int)cell1.getNumericCellValue());
				XSSFCell cell2=row.getCell(2);
				if(cell2==null)
					continue;
				stu.setMajor(cell2.getStringCellValue());
				XSSFCell cell3=row.getCell(3);
				if(cell3==null)
					continue;
				stu.setCclass(cell3.getStringCellValue());
				XSSFCell cell4=row.getCell(4);
				if(cell4==null)
					continue;
				stu.setNum((int)cell4.getNumericCellValue());
				XSSFCell cell5=row.getCell(5);
				if(cell5==null)
					continue;
				stu.setStudent_Id(cell5.getStringCellValue());
				XSSFCell cell6=row.getCell(6);
				if(cell6==null)
					continue;
				stu.setName(cell6.getStringCellValue());
				XSSFCell cell7=row.getCell(7);
				if(cell7==null)
					continue;
				stu.setSex(cell7.getStringCellValue());
				list.add(stu);
				
				
			}
				
				
			
		}
		return list;
	}
	 @SuppressWarnings("unused")
	private static String getValue(XSSFCell cell) {
		if(cell.getCellType()==CellType.BOOLEAN) {
			return String.valueOf(cell.getBooleanCellValue());
		}
		else if(cell.getCellType()==CellType.NUMERIC) {
			return String.valueOf(cell.getNumericCellValue());
		}
		else
		return cell.getStringCellValue();
	}
}
