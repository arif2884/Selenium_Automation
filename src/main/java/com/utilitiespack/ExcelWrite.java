package com.utilitiespack;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	
	 // any exceptions need to be caught
    public static void main(String[] args) throws Exception
    {
        // Create a workbook object
        @SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook();
  
        // create a sheet object in workbook
        XSSFSheet sheet = workbook.createSheet(" Student Data ");
  
        // This data needs to be written (Object[])
        Map<String, Object[]> studentData = new TreeMap<String, Object[]>();
  
        studentData.put("1", new Object[] { "Roll No", "NAME", "Year" });
  
        studentData.put("2", new Object[] { "128", "Aditya", "2nd year" });
  
        studentData.put("3", new Object[] { "129", "Narayana", "2nd year" });
  
        studentData.put("4", new Object[] { "130", "Mohan", "2nd year" });
  
        studentData.put("5", new Object[] { "131", "Radha", "2nd year" });
  
        studentData.put("6", new Object[] { "132", "Gopal", "2nd year" });
  
        Set<String> keyid = studentData.keySet();
  
        int rowid = 0;
  
        // writing the data into the sheets...
  
        for (String key : keyid) {
        	
        	// creating a row object
        	XSSFRow row = sheet.createRow(rowid++);
        	
            Object[] objectArr = studentData.get(key);
            int cellid = 0;
  
            for (Object obj : objectArr) {
                Cell cell = row.createCell(cellid++);
                cell.setCellValue((String)obj);
            }
        }
  
        // .xlsx is the format for Excel Sheets...
        // writing the workbook into the file...
        FileOutputStream out = new FileOutputStream(
            new File("./ExcelData/Students.xlsx"));
  
        workbook.write(out);
        out.close();
        System.out.println("Excel Sheet created....");
    }


}
