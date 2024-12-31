package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {
	public static void main(String[] args) throws IOException {
		String filelocation = "./test data/Login-data.xlsx";
		XSSFWorkbook wbook = new XSSFWorkbook(filelocation);


		XSSFSheet sheet = wbook.getSheetAt(0);

		// getLastRowNum - it will consider Except header line 1st row.
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("lastRowNum : "+lastRowNum);

		// we can use directly from sheet - from row only we can use.
		// why sheet.getRow(0) - bcz based on Header(0)Row wise we are taking cells values.
		// this funcyion datatype is short.
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("lastCellNum "+lastCellNum);

		// if we need 1st Header Row also means
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("physicalNumberOfRows Inclusive of header: "+physicalNumberOfRows );

		//for (int i = 1; i <physicalNumberOfRows; i++)  <
		//for (int i = 1; i <=lastRowNum; i++)   <=

		for (int i = 1; i <=lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);

			for (int j = 0; j <lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);

				// we give or pass the values to SendKeys as stirng in TestScrtipt so we use this dataformater class & chnage to string here
				DataFormatter dft = new DataFormatter();

				// format to string if any values ( num, boolean etc...)
				String formatCellValue = dft.formatCellValue(cell); 
				System.out.println(formatCellValue);

				//				System.out.println(cell);
			}
		}
	}
}
