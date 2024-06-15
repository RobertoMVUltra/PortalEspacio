import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.util.concurrent.ConcurrentHashMap.KeySetView

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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('TC-001_Login'), [('User') : 'QA4', ('Pass') : 'espaciobg'], FailureHandling.STOP_ON_FAILURE)


WebUI.click(findTestObject('Object Repository/Menu/BTN_Menu'))
WebUI.click(findTestObject('Object Repository/Menu/BTN_SubMenu',["SUBMENU":"toggle Cotizador Tradicional"]))

//Datos Generales
//Producto
WebUI.switchToFrame(findTestObject('Object Repository/DANIOS/IFRAME_TRADICIONAL'), 3)
WebUI.click(findTestObject('Object Repository/DANIOS/DATOS_GENERALES/1-PRODUCTO/CMB_Oficina'))
WebUI.sendKeys(findTestObject('Object Repository/DANIOS/DATOS_GENERALES/1-PRODUCTO/CMB_Oficina'), Keys.chord(oficina, Keys.TAB))
WebUI.click(findTestObject('Object Repository/DANIOS/DATOS_GENERALES/1-PRODUCTO/CMB_Producto'))
WebUI.sendKeys(findTestObject('Object Repository/DANIOS/DATOS_GENERALES/1-PRODUCTO/CMB_Producto'), Keys.chord(producto, Keys.TAB))
WebUI.click(findTestObject('Object Repository/DANIOS/DATOS_GENERALES/1-PRODUCTO/CMB_Giro'))
WebUI.sendKeys(findTestObject('Object Repository/DANIOS/DATOS_GENERALES/1-PRODUCTO/CMB_Giro'), Keys.chord('SEGURO HOGAR BANORTE', Keys.TAB))
WebUI.click(findTestObject('Object Repository/DANIOS/DATOS_GENERALES/1-PRODUCTO/CMB_Moneda'))
WebUI.sendKeys(findTestObject('Object Repository/DANIOS/DATOS_GENERALES/1-PRODUCTO/CMB_Moneda'), Keys.chord('PESOS', Keys.TAB))

//Direccción del Riesgo
WebUI.verifyElementVisible(findTestObject('Object Repository/DANIOS/DATOS_GENERALES/2-DIRECCION_RIESGO/input_CodigoPortal'))
WebUI.setText(findTestObject('Object Repository/DANIOS/DATOS_GENERALES/2-DIRECCION_RIESGO/input_CodigoPortal'),'64000')
WebUI.delay(5)
WebUI.verifyElementPresent(findTestObject('Object Repository/DANIOS/DATOS_GENERALES/2-DIRECCION_RIESGO/cmb_Colonia'),2)
WebUI.delay(5)
WebUI.sendKeys(findTestObject('Object Repository/DANIOS/DATOS_GENERALES/2-DIRECCION_RIESGO/cmb_Colonia'), Keys.chord('CENTRO', Keys.TAB))
//WebUI.click(findTestObject('Object Repository/DANIOS/DATOS_GENERALES/2-DIRECCION_RIESGO/cmb_Colonia'))
//WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/select_Colonia',['colonia':'CENTRO']))
WebUI.setText(findTestObject('Object Repository/DANIOS/DATOS_GENERALES/2-DIRECCION_RIESGO/input_Calle'), "MEZQUITE")
WebUI.setText(findTestObject('Object Repository/DANIOS/DATOS_GENERALES/2-DIRECCION_RIESGO/input_Numero'), "400")

//Datos del Inmueble

WebUI.click(findTestObject('Object Repository/DANIOS/DATOS_GENERALES/3-DATOS_INMUEBLE/cmb_TipoConstruccion'))
WebUI.click(findTestObject('Object Repository/DANIOS/DATOS_GENERALES/3-DATOS_INMUEBLE/select_TipoConstruccion',["tipo":"MUROS Y TECHOS MACIZOS"]))
WebUI.setText(findTestObject('Object Repository/DANIOS/DATOS_GENERALES/3-DATOS_INMUEBLE/input_Nivel'),"5")
WebUI.setText(findTestObject('Object Repository/DANIOS/DATOS_GENERALES/3-DATOS_INMUEBLE/input_DecsInmueble'), "cinco")

WebUI.verifyElementPresent(findTestObject('Object Repository/DANIOS/DATOS_GENERALES/4-MEDIDAS_SEGURIDAD/box_Vigilante'), 5)
WebUI.click(findTestObject('Object Repository/DANIOS/DATOS_GENERALES/4-MEDIDAS_SEGURIDAD/box_Vigilante'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/DANIOS/DATOS_GENERALES/4-MEDIDAS_SEGURIDAD/box_Extinguidores'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/DANIOS/DATOS_GENERALES/4-MEDIDAS_SEGURIDAD/box_AlarmaCentral'))

WebUI.setText(findTestObject('Object Repository/DANIOS/DATOS_GENERALES/5-SUMA_SEGERIDA/input_SumaAsegurada'), "400000")
WebUI.setText(findTestObject('Object Repository/DANIOS/DATOS_GENERALES/5-SUMA_SEGERIDA/input_SumaAseguradaContenidos'), "400000")
WebUI.click(findTestObject('Object Repository/DANIOS/DATOS_GENERALES/5-SUMA_SEGERIDA/btn_Siguiente'))

//Comparativo de Cotizaciones
//
//WebUI.sendKeys(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/input_IncendioEdificio'),"400.00")
//WebUI.delay(2)
//WebUI.sendKeys(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/input_IncendioContenidos'),"400.00")
//WebUI.delay(4)
//WebUI.sendKeys(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/input_PerdidasConsecuenciales'),"4,000.00")
//WebUI.delay(2)
//WebUI.sendKeys(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/input_ResponsabilidadCivilGeneral'),"4,000.00")
//WebUI.delay(2)
//WebUI.sendKeys(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/input_Cristales'),"4,000.00")
//WebUI.delay(2)
//WebUI.sendKeys(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/input_RoboBienesDentro'),"4,000.00")
//WebUI.delay(4)
//WebUI.sendKeys(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/input_RoboBienesContenidos'),"400.00")
//WebUI.delay(2)
//WebUI.sendKeys(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/input_DineroValoresDentro'),"4,000.00")
//WebUI.delay(2)
//WebUI.sendKeys(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/input_DineroValoresFuera'),"400.00")
//WebUI.delay(5)
//WebUI.sendKeys(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/input_MaquinariaEquipoUso'),"4,000.00")
//WebUI.delay(4)
//WebUI.sendKeys(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/input_MaquinariaEquipoUso'), Keys.chord(Keys.TAB))
//WebUI.delay(2)
//WebUI.verifyElementPresent(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/radio_Pago',["tipoPago":"003"]),2)
//WebUI.scrollToElement(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/radio_Pago',["tipoPago":"003"]),2)
////WebUI.click(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/radio_Pago',["tipoPago":"003"]))
//WebUI.verifyElementPresent(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/btn_Guardar'), 2)
//WebUI.scrollToElement(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/btn_Guardar'), 2)
//WebUI.click(findTestObject('Object Repository/DANIOS/COMPARATIVO_COTIZACIONES/btn_Guardar'))
//
////Formulario Datos del Contratante
//WebUI.delay(5)
//WebUI.verifyElementPresent(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/radio_TipoPersona',['tipoPersona':'M']), 5)
//WebUI.click(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/radio_TipoPersona',['tipoPersona':'M']))
//WebUI.verifyElementPresent(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/radio_TipoPersona',['tipoPersona':'F']), 5)
//WebUI.click(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/radio_TipoPersona',['tipoPersona':'F']))
////WebUI.sendKeys(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/radio_TipoPersona'), Keys.chord(Keys.TAB))
//WebUI.verifyElementPresent(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/cmb_Titulo'), 5)
//WebUI.click(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/cmb_Titulo'))
//WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_CONTRATANTE/select_titulo', ['titulo':"ING."]))
//WebUI.setText(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/input_apellidoPaterno'), "Mendoza")
//WebUI.setText(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/input_apellidoMaterno'), "Victoria")
//WebUI.setText(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/input_nombre'), "Roberto")
//WebUI.setText(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/input_lada'),"52")
//WebUI.setText(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/input_telefono'), "5516978120")
//WebUI.setText(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/input_referencia'), "Prueba")
//WebUI.click(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/cmb_intermediario'))
//WebUI.click(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/select_intermediario',['intermediario':'15977 AMY WATSON WOOD WOOD']))
//WebUI.verifyElementPresent(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_CONTRATANTE/button_guardarDatosContratante'), 2)
//WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_CONTRATANTE/button_guardarDatosContratante'))
//
//
////Alerta Recuperando Cotización
//String numCotizacion=WebUI.getText(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/span_NumCotizacion'))
//println(numCotizacion)
//WebUI.delay(5)
//WebUI.click(findTestObject('Object Repository/DANIOS/DATOS_CONTRATANTE/btn_CerrarAlerta'))
//
////Emisión
//WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/btn_Emitir'))
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/DANIOS/EMISION_PAGO/input_RFC'), 5)
//WebUI.setText(findTestObject('Object Repository/DANIOS/EMISION_PAGO/input_RFC'), "MEVR950826DEA")
////WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/input_FechaNacimiento'))
////WebUI.sendKeys(findTestObject('Object Repository/DANIOS/EMISION_PAGO/input_FechaNacimiento'),Keys.chord('26/08/1995' ,Keys.TAB) )
//WebUI.clearText(findTestObject('Object Repository/DANIOS/EMISION_PAGO/input_FechaNacimiento'))
//WebUI.setText(findTestObject('Object Repository/DANIOS/EMISION_PAGO/input_FechaNacimiento'), Keys.chord("1995/08/26",Keys.TAB))
//WebUI.sendKeys(findTestObject('Object Repository/DANIOS/EMISION_PAGO/input_FechaNacimiento'), Keys.chord(Keys.TAB))
//
//WebUI.setText(findTestObject('Object Repository/DANIOS/EMISION_PAGO/input_CURP'), "MEVR950826HDFNCB08")
//WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/cmb_Sexo'))
//WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/select_Sexo',['tipo':'MASCULINO']))
//WebUI.setText(findTestObject('Object Repository/DANIOS/EMISION_PAGO/input_CodigoPostal'),'64000')
//WebUI.sendKeys(findTestObject('Object Repository/DANIOS/EMISION_PAGO/input_CodigoPostal'), Keys.chord(Keys.TAB))
//WebUI.delay(5)
//WebUI.verifyElementPresent(findTestObject('Object Repository/DANIOS/EMISION_PAGO/cmb_Colonia'),2)
//WebUI.delay(2)
//WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/cmb_Colonia'))
//WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/select_Colonia',['colonia':'CENTRO']))
//WebUI.setText(findTestObject('Object Repository/DANIOS/EMISION_PAGO/input_Calle'), "MEZQUITE")
//WebUI.setText(findTestObject('Object Repository/DANIOS/EMISION_PAGO/input_Numero'), "400")
//
//WebUI.delay(2)
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/DANIOS/EMISION_PAGO/radio_DatosAseguradoIgualContratante'),2)
//WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/radio_DatosAseguradoIgualContratante'))
//
////Conducto de Pago
//WebUI.verifyElementPresent(findTestObject('Object Repository/DANIOS/EMISION_PAGO/Conducto_pago/cmb_CoductoPago'),10)
//WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/Conducto_pago/cmb_CoductoPago'))
//WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/Conducto_pago/select_ConductoPago', ['pago':'EFECTIVO']))
//WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/btn_Emitir'))
//
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/DANIOS/EMISION_PAGO/Conducto_pago/btn_Continuar'),5)
//WebUI.scrollToElement(findTestObject('Object Repository/DANIOS/EMISION_PAGO/Conducto_pago/btn_Continuar'), 2)
//WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/Conducto_pago/btn_Continuar'))
////WebUI.sendKeys(findTestObject('Object Repository/DANIOS/EMISION_PAGO/Conducto_pago/btn_Continuar'),Keys.chord(Keys.TAB))
////WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/Conducto_pago/btn_Continuar'))
//WebUI.delay(3)
//String numPoliza=WebUI.getText(findTestObject('Object Repository/DANIOS/EMISION_PAGO/Conducto_pago/span_NumPoliza'))
//println(numPoliza)
//
//WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/Conducto_pago/btn_Continuar'))
//
//WebUI.delay(5)
//WebUI.verifyElementPresent(findTestObject('Object Repository/DANIOS/EMISION_PAGO/btn_Imprimir'), 2)
//WebUI.scrollToElement(findTestObject('Object Repository/DANIOS/EMISION_PAGO/btn_Imprimir'), 2)
//WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/btn_Imprimir'))
//
//WebUI.switchToWindowIndex(1)
//WebUI.delay(10)
//WebUI.closeWindowIndex(1)
//WebUI.switchToDefaultContent()
//WebUI.switchToFrame(findTestObject('Object Repository/DANIOS/IFRAME_TRADICIONAL'), 3)
//
//
//WebUI.scrollToElement(findTestObject('Object Repository/DANIOS/EMISION_PAGO/Conducto_pago/input_Correo'), 2)
//WebUI.setText(findTestObject('Object Repository/DANIOS/EMISION_PAGO/Conducto_pago/input_Correo'), "jrmendozav@desarrollo-ultrasist.com.mx")
//WebUI.scrollToElement(findTestObject('Object Repository/DANIOS/EMISION_PAGO/Conducto_pago/btn_EnviarDocumentos'), 2)
//WebUI.click(findTestObject('Object Repository/DANIOS/EMISION_PAGO/Conducto_pago/btn_EnviarDocumentos'))
