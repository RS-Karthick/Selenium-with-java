package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDataProvider {
	public static String[][] getExcelData () throws IOException {
		String filelocation = "./test data/Login-dta.xlsx";
		XSSFWorkbook wbook = new XSSFWorkbook(filelocation);
		XSSFSheet sheet = wbook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(0).getLastCellNum();

		String [][] data = new String[lastRowNum][lastCellNum];
		for (int i = 1; i <=lastRowNum ; i++) {
			XSSFRow row = sheet.getRow(i);

			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);

				DataFormatter df = new DataFormatter();
				String formatCellValue = df.formatCellValue(cell);
				//				System.out.println(formatCellValue);

				// we have toi store the formatCellValues... in this array
				data[i-1][j] = formatCellValue;
				// i values we consider in loop from 1 so here we are using data[i-1] bcz array strats from zero so data[0][0] = 0th place data[i-1][j] - it will store from zero th  index.
			//data[1-1][0]-0, [2-1][1]-1, [3-1][2]=2
			}

		}
		wbook.close();
return data;
	}
}
