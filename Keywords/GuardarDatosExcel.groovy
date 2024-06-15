import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import internal.GlobalVariable

public class GuardarDatosExcel {
	String rootPrj = RunConfiguration.getProjectDir()
	
	@Keyword
	def agregarPoliza(cotizacion, poliza) {

		String gTestIdPathWay =  rootPrj+"\\Data Files\\polizas.xlsx"

		FileInputStream fis = new FileInputStream (gTestIdPathWay);
		XSSFWorkbook workbook = new XSSFWorkbook (fis);

		XSSFSheet sheet = workbook.getSheet("datos");


		//Row row = sheet.createRow(1);
		int num=0
		for  ( Object item in   sheet.collect()) {
			//print(item.(1))
			num++
		}

		print ("numerorG"+num)

		Row row = sheet.createRow(num);
		Cell cell = row.createCell(0);

		cell.setCellValue(cotizacion);

		cell = row.createCell(1);

		cell.setCellValue(poliza);

		FileOutputStream fos = new FileOutputStream(gTestIdPathWay);
		workbook.write(fos);
		fos.close();
		fis.close();
	}
}
