import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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
import com.thoughtworks.selenium.webdriven.commands.Click

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('TC-001_Login'), [('User') : 'QA4', ('Pass') : 'espaciobg'], FailureHandling.STOP_ON_FAILURE)

//Menu Principal
WebUI.click(findTestObject('Object Repository/Menu/BTN_Menu'))
WebUI.click(findTestObject('Object Repository/Menu/BTN_SubMenu',["SUBMENU":"toggle Individual"]))
WebUI.click(findTestObject('Object Repository/Menu/BTN_SubMenu',["SUBMENU":"toggle Vida Individual"]))

//Datos Asegurado
WebUI.switchToFrame(findTestObject('Object Repository/DANIOS/IFRAME_TRADICIONAL'), 3)
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_ASEGURADO/CMB_Oficina'))
WebUI.sendKeys(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_ASEGURADO/CMB_Oficina'), Keys.chord('074', Keys.TAB))
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_ASEGURADO/CMB_Producto'))
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_ASEGURADO/CMB_SeleccionarItem',['item':' PROTECCION VIDA INDIVIDUAL ']))
WebUI.setText(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_ASEGURADO/INPUT_ApePaterno'), "Mendoza")
WebUI.setText(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_ASEGURADO/INPUT_ApeMaterno'), "Victoria")
WebUI.setText(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_ASEGURADO/INPUT_Nombre'), "Roberto")
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_ASEGURADO/INPUT_FechaNacimiento'))
WebUI.sendKeys(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_ASEGURADO/INPUT_FechaNacimiento'), Keys.chord('26/08/1995', Keys.TAB))
WebUI.setText(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_ASEGURADO/INPUT_Edad'), "28")
WebUI.setText(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_ASEGURADO/INPUT_Estatura'), "1.63")
WebUI.setText(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_ASEGURADO/INPUT_Peso'), "68")
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_ASEGURADO/CBM_Sexo'))
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_ASEGURADO/CBM_SeleccionarSexo'))
WebUI.setText(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_ASEGURADO/INPUT_IngresoMensual'), "10000")
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_ASEGURADO/CMB_Giro'))
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_ASEGURADO/CMB_SeleccionarItem',['item':'EDUCACION']))
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_ASEGURADO/RADIO_Fuma',["fuma":'2'])) //Si fuma agregar 2 si no 3
WebUI.sendKeys(WebUI.sendKeys(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_ASEGURADO/RADIO_Fuma',["fuma":'2']), Keys.chord(Keys.TAB)),Keys.chord(Keys.ENTER))
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_ASEGURADO/CMB_Ocupacion'))
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_ASEGURADO/CMB_SeleccionarItem',['item':'Profesor o director']))
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_ASEGURADO/BTN_Siguiente'))
WebUI.delay(5)

/*se parametriza el xpath para cambiar el tipo de paquete de acuerdo al flujo
*  0=primer paquete
*  1=segund paquete
*  2=tercer paquete
*/
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/COMPARATIVO_COTIZACION/BTN_Paquete',["paquete":"0"]))
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/COMPARATIVO_COTIZACION/BTN_vida_guardar'))

//Formulario Datos del Contratante
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_CONTRATANTE/cmb_titulo'))
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_CONTRATANTE/select_titulo', ['titulo':" ALMTE. "]))
WebUI.setText(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_CONTRATANTE/input_apellidoPaterno'), "Mendoza")
WebUI.setText(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_CONTRATANTE/input_apellidoMaterno'), "Victoria")
WebUI.setText(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_CONTRATANTE/input_nombre'), "Roberto")
WebUI.setText(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_CONTRATANTE/input_lada'),"52")
WebUI.setText(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_CONTRATANTE/input_telefono'), "5516978120")
WebUI.setText(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_CONTRATANTE/input_referencia'), "Prueba")
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_CONTRATANTE/cmb_intermediario'))
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_CONTRATANTE/select_intermediario',['intermediario':' 15977 AMY WATSON WOOD WOOD ']))
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_CONTRATANTE/button_guardarDatosContratante'))

//COtizacion Generada Recuperamos num. cotización
String text = WebUI.getText(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_CONTRATANTE/span_noCotizacion'))
print(text)
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/DATOS_CONTRATANTE/btn_alertaCotización'))

WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/COMPARATIVO_COTIZACION/btn_Siguiente'))

WebUI.verifyElementPresent(findTestObject('Object Repository/VIDA_INDIVIDUAL/CUESTIONARIO/btn_Siguiente'), 3)

WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/CUESTIONARIO/btn_Siguiente'))

//Aviso
if(WebUI.verifyElementPresent(findTestObject('Object Repository/VIDA_INDIVIDUAL/CUESTIONARIO/btn_AvisoAceptar'), 5,FailureHandling.CONTINUE_ON_FAILURE) ) {
	WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/CUESTIONARIO/btn_AvisoAceptar'))
}

WebUI.delay(5)

//Formulario Emision_pago 
WebUI.setText(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/input_LugarNacimiento'), "MONTERREY")
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/cmb_EstadoCIvil'))
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/select_EstadoCivil',["estadoCivil":" SOLTERO "]))
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/cmb_Estado'))
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/select_Estado',["estado":" NUEVO LEÓN "]))
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/cmb_Poblacion'))
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/select_Poblacion',["Poblacion":" MONTERREY "]))
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/cmb_Colonia'))
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/select_Colonia',["Colonia":" CENTRO "]))
WebUI.setText(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/input_calle'), "AV BERNARDO REYES")
WebUI.setText(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/input_Numero'), "552")

//Contacto
WebUI.setText(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/Contacto/input_Lada'), "55")
WebUI.setText(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/Contacto/input_Valor'), "5616978520")	
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/Contacto/radio_datosContratanteIgualAsegurado'))	

//Aviso
if(WebUI.verifyElementPresent(findTestObject('Object Repository/VIDA_INDIVIDUAL/CUESTIONARIO/btn_AvisoAceptar'), 10,FailureHandling.CONTINUE_ON_FAILURE) ) {
	WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/CUESTIONARIO/btn_AvisoAceptar'))
	WebUI.switchToWindowIndex(1)
	WebUI.delay(10)
	WebUI.closeWindowIndex(1)
	WebUI.switchToDefaultContent()
	WebUI.switchToFrame(findTestObject('Object Repository/DANIOS/IFRAME_TRADICIONAL'), 3)
}
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/cmb_Estado'))
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/select_Estado',["estado":" NUEVO LEÓN "]))

//Beneficiarios
WebUI.setText(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/Beneficiario/input_ApellidoPaterno'), "Mendoza")
WebUI.setText(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/Beneficiario/input_ApellidoMaterno'), "Victoria")
WebUI.setText(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/Beneficiario/input_Nombre'), "José")
WebUI.setText(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/Beneficiario/input_Porcentaje'), "100")
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/Beneficiario/cmb_Parentesco'))
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/Beneficiario/select_Parentesco',['parentesco':" HIJO "]))
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/Beneficiario/btn_Agregar'))

//Conducto de pago

WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/CoductoPago/cmb_ConductoPago'))
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/CoductoPago/select_ConductoPago', ['conducto':'EFECTIVO']))
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/CoductoPago/btn_previsualizar'))

//Se cierra la venta de pdf
WebUI.switchToWindowIndex(1)
WebUI.delay(10)
WebUI.closeWindowIndex(1)
WebUI.switchToDefaultContent()

//Se recupera los datos de la poliza 
WebUI.switchToFrame(findTestObject('Object Repository/DANIOS/IFRAME_TRADICIONAL'), 3)
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/Beneficiario/btn_Aceptar'))
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/Beneficiario/btn_Emitir'))
String poliza=WebUI.getText(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/strong_noPoliza'))
println(poliza)

WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/btn_continuar'))

//Enviar poliza
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/box_SeleccionarDocsTodos'))
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/btn_Cerrar'))

WebUI.delay(5)
//Envío de documentación por correo
WebUI.setText(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/input_correo'), 'juanjuanmendezmendez000@gmail.com')
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/btn_EnviarDoc'))
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/btn_EnvioExitoso'))
WebUI.click(findTestObject('Object Repository/VIDA_INDIVIDUAL/EMISION_PAGO/btn_AvisoNuevaPolizaSi'))
WebUI.closeBrowser()
