import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


WebUI.callTestCase(findTestCase('DANIOS/TC-003_camparativa_cotizacion'), [:], FailureHandling.STOP_ON_FAILURE)

//Emisión
WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/btn_Emitir'))

WebUI.verifyElementPresent(findTestObject('Object Repository/DANIOS/EMISION_PAGO/input_RFC'), 5)

WebUI.setText(findTestObject('Object Repository/DANIOS/EMISION_PAGO/input_RFC'), 'MEVR950826DEA')

//WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/input_FechaNacimiento'))
//WebUI.sendKeys(findTestObject('Object Repository/DANIOS/EMISION_PAGO/input_FechaNacimiento'),Keys.chord('26/08/1995' ,Keys.TAB) )
WebUI.clearText(findTestObject('Object Repository/DANIOS/EMISION_PAGO/input_FechaNacimiento'))

WebUI.setText(findTestObject('Object Repository/DANIOS/EMISION_PAGO/input_FechaNacimiento'), Keys.chord('1995/08/26', Keys.TAB))

WebUI.sendKeys(findTestObject('Object Repository/DANIOS/EMISION_PAGO/input_FechaNacimiento'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('Object Repository/DANIOS/EMISION_PAGO/input_CURP'), 'MEVR950826HDFNCB08')

WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/cmb_Sexo'))

WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/select_Sexo', [('tipo') : 'MASCULINO']))

WebUI.setText(findTestObject('Object Repository/DANIOS/EMISION_PAGO/input_CodigoPostal'), '64000')

WebUI.sendKeys(findTestObject('Object Repository/DANIOS/EMISION_PAGO/input_CodigoPostal'), Keys.chord(Keys.TAB))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/DANIOS/EMISION_PAGO/cmb_Colonia'), 2)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/cmb_Colonia'))

WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/select_Colonia', [('colonia') : 'CENTRO']))

WebUI.setText(findTestObject('Object Repository/DANIOS/EMISION_PAGO/input_Calle'), 'MEZQUITE')

WebUI.setText(findTestObject('Object Repository/DANIOS/EMISION_PAGO/input_Numero'), '400')

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/DANIOS/EMISION_PAGO/radio_DatosAseguradoIgualContratante'), 
    2)

WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/radio_DatosAseguradoIgualContratante'))

//Conducto de Pago
WebUI.verifyElementPresent(findTestObject('Object Repository/DANIOS/EMISION_PAGO/Conducto_pago/cmb_CoductoPago'), 10)

WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/Conducto_pago/cmb_CoductoPago'))

WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/Conducto_pago/select_ConductoPago', [('pago') : 'EFECTIVO']))

WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/btn_Emitir'))

WebUI.verifyElementPresent(findTestObject('Object Repository/DANIOS/EMISION_PAGO/Conducto_pago/btn_Continuar'), 5)

WebUI.scrollToElement(findTestObject('Object Repository/DANIOS/EMISION_PAGO/Conducto_pago/btn_Continuar'), 2)

WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/Conducto_pago/btn_Continuar'))

//WebUI.sendKeys(findTestObject('Object Repository/DANIOS/EMISION_PAGO/Conducto_pago/btn_Continuar'),Keys.chord(Keys.TAB))
//WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/Conducto_pago/btn_Continuar'))
WebUI.delay(3)

String numPoliza = WebUI.getText(findTestObject('Object Repository/DANIOS/EMISION_PAGO/Conducto_pago/span_NumPoliza'))

println(numPoliza)

CustomKeywords.'GuardarDatosExcel.agregarPoliza'(GlobalVariable.NUM_COTIZ, numPoliza)

WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/Conducto_pago/btn_Continuar'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/DANIOS/EMISION_PAGO/btn_Imprimir'), 2)

WebUI.scrollToElement(findTestObject('Object Repository/DANIOS/EMISION_PAGO/btn_Imprimir'), 2)

WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/btn_Imprimir'))

WebUI.switchToWindowIndex(1)

WebUI.delay(10)

WebUI.closeWindowIndex(1)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Object Repository/DANIOS/IFRAME_TRADICIONAL'), 3)

WebUI.scrollToElement(findTestObject('Object Repository/DANIOS/EMISION_PAGO/Conducto_pago/input_Correo'), 2)

WebUI.setText(findTestObject('Object Repository/DANIOS/EMISION_PAGO/Conducto_pago/input_Correo'), 'jrmendozav@desarrollo-ultrasist.com.mx')

WebUI.scrollToElement(findTestObject('Object Repository/DANIOS/EMISION_PAGO/Conducto_pago/btn_EnviarDocumentos'), 2)

WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/Conducto_pago/btn_EnviarDocumentos'))

WebUI.click(findTestObject)
