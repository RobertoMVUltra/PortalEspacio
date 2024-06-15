import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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

//Comparativo de Cotizaciones
WebUI.callTestCase(findTestCase('DANIOS/TC-002_datos_generales'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/input_IncendioEdificio'), '400.00')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/input_IncendioContenidos'), '400.00')

WebUI.delay(4)

WebUI.sendKeys(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/input_PerdidasConsecuenciales'), '4,000.00')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/input_ResponsabilidadCivilGeneral'), '4,000.00')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/input_Cristales'), '4,000.00')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/input_RoboBienesDentro'), '4,000.00')

WebUI.delay(4)

WebUI.sendKeys(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/input_RoboBienesContenidos'), '400.00')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/input_DineroValoresDentro'), '4,000.00')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/input_DineroValoresFuera'), '400.00')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/input_MaquinariaEquipoUso'), '4,000.00')

WebUI.delay(4)

WebUI.sendKeys(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/input_MaquinariaEquipoUso'), Keys.chord(
        Keys.TAB))

WebUI.delay(2)


WebUI.click(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/radio_PagoSemestral'))

WebUI.verifyElementPresent(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/btn_Guardar'), 2)

WebUI.scrollToElement(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/btn_Guardar'), 2)

WebUI.click(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/btn_Guardar'))

//Formulario Datos del Contratante
WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/radio_TipoPersona', [('tipoPersona') : 'M']), 
    5)

WebUI.click(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/radio_TipoPersona', [('tipoPersona') : 'M']))

WebUI.verifyElementPresent(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/radio_TipoPersona', [('tipoPersona') : 'F']), 
    5)

WebUI.click(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/radio_TipoPersona', [('tipoPersona') : 'F']))

//WebUI.sendKeys(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/radio_TipoPersona'), Keys.chord(Keys.TAB))
WebUI.verifyElementPresent(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/cmb_Titulo'), 5)

WebUI.click(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/cmb_Titulo'))

WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_CONTRATANTE/select_titulo', [('titulo') : 'ING.']))

WebUI.setText(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/input_apellidoPaterno'), 'Mendoza')

WebUI.setText(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/input_apellidoMaterno'), 'Victoria')

WebUI.setText(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/input_nombre'), 'Roberto')

WebUI.setText(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/input_lada'), '52')

WebUI.setText(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/input_telefono'), '5516978120')

WebUI.setText(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/input_referencia'), 'Prueba')

WebUI.click(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/cmb_intermediario'))

WebUI.click(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/select_intermediario', [('intermediario') : '15977 AMY WATSON WOOD WOOD']))

WebUI.verifyElementPresent(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_CONTRATANTE/button_guardarDatosContratante'), 
    2)

WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_CONTRATANTE/button_guardarDatosContratante'))

//Alerta Recuperando Cotización
GlobalVariable.NUM_COTIZ = WebUI.getText(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/span_NumCotizacion'))

println(GlobalVariable.NUM_COTIZ)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/btn_CerrarAlerta'))

