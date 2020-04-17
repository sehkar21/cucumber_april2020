package com.resources;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData  {
	public static List<HashMap<String, String>> mydata;

	public static List<HashMap<String, String>> getData() {
		mydata = new ArrayList<>();
		try {
			FileInputStream fs = new FileInputStream("C:\\Users\\sehkar\\eclipse-workspace\\New folder\\"
					+ "Cucumber_Extent\\src\\main\\java\\com\\Testdata\\orangehrmexcel.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			XSSFSheet sheet = workbook.getSheet("data");
			Row HeaderRow = sheet.getRow(0);
			for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
				Row currentRow = sheet.getRow(i);
				HashMap<String, String> currentHash = new HashMap<String, String>();
				for (int j = 0; j < HeaderRow.getPhysicalNumberOfCells(); j++) {
					Cell currentCell = currentRow.getCell(j);
					try {
						currentCell.getCellType();
						switch (currentCell.getCellType()) {
						case Cell.CELL_TYPE_STRING:
							currentHash.put(HeaderRow.getCell(j).getStringCellValue(),
									currentCell.getStringCellValue());
							break;
						case Cell.CELL_TYPE_NUMERIC:
							currentHash.put(HeaderRow.getCell(j).getStringCellValue(),
									String.valueOf(currentCell.getNumericCellValue()));
							break;
						case Cell.CELL_TYPE_BLANK:
							currentHash.put(HeaderRow.getCell(j).getStringCellValue(), "null");
							break;
						default:
							currentHash.put(HeaderRow.getCell(j).getStringCellValue(), "null");
						}
					} catch (NullPointerException e) {
						currentHash.put(HeaderRow.getCell(j).getStringCellValue(), "null");
					}
				}
				mydata.add(currentHash);
			}
			fs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mydata;
	}

}