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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

'Verify if it will transition to each screen when you tap each tab.'
Mobile.startApplication(GlobalVariable.G_Android_App, false)

'Verify if you tap the STEPS tab the steps graph screen will display.'
Mobile.tap(findTestObject('Object Repository/Android_HOME/Android-TOP_stepscreen'), GlobalVariable.G_Timeout_long)
Mobile.verifyElementText(findTestObject('Object Repository/Android_HOME/Android-TOP_stepscreen'),'歩数', FailureHandling.OPTIONAL)

'Verify if you tap the WEIGHT tab the weight graph screen will display.'
Mobile.tap(findTestObject('Object Repository/Android_HOME/Android-TOP_weightscreen'), GlobalVariable.G_Timeout_long)
Mobile.verifyElementText(findTestObject('Object Repository/Android_HOME/Android-TOP_weightscreen'), 'サポート', FailureHandling.OPTIONAL)

'Verify if you tap the BODY FAT tab the body fat graph screen will display.'
Mobile.tap(findTestObject('Object Repository/Android_HOME/Android-TOP_bodyfatscreen'), GlobalVariable.G_Timeout_long)
Mobile.verifyElementText(findTestObject('Object Repository/Android_HOME/Android-TOP_bodyfatscreen'), '体脂肪率', FailureHandling.OPTIONAL)

'Verify if you tap the BLOOD PRESSURE tab the blood pressure graph screen will display.'
Mobile.tap(findTestObject('Object Repository/Android_HOME/Android-TOP_bloodpressure'), GlobalVariable.G_Timeout_long)
Mobile.verifyElementText(findTestObject('Object Repository/Android_HOME/Android-TOP_bloodpressure'), '血圧', FailureHandling.OPTIONAL)

'Verify if you tap the HEALTH CHECKUP tab the health checkup list screen will display.'
Mobile.tap(findTestObject('Object Repository/Android_HOME/Android-TOP_healthcheckupscreen'), GlobalVariable.G_Timeout_long)
Mobile.verifyElementText(findTestObject('Object Repository/Android_HOME/Android-TOP_healthcheckupscreen'), '健康診断', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/TOP/Android-topfromHealthcheckup'), GlobalVariable.G_Timeout_long)
