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

import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.ios.IOSDriver as IOSDriver

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import org.apache.commons.lang.RandomStringUtils as RandStr


'Verify the functionality of the record feature for Health Checkup data'

Mobile.tapAndHold(findTestObject('Object Repository/Android-RecordFromTOP/TOP_RecordBtn'), 3, GlobalVariable.G_Timeout_long)
Mobile.delay(GlobalVariable.G_Delay_short)
'Verify to validation message if the required items are empty'
if (Mobile.verifyElementVisible(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_recordbtnhealth'), GlobalVariable.G_Timeout_long)) {
	Mobile.tapAndHold(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_recordbtnhealth'), 3, GlobalVariable.G_Timeout_long)
	
	'Scroll to 白血球数 text'
	Mobile.scrollToText('白血球数', FailureHandling.STOP_ON_FAILURE)
	Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_save'), GlobalVariable.G_Timeout_long)
	
	Mobile.verifyElementExist(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_canceldialog'), GlobalVariable.G_Timeout_long, FailureHandling.OPTIONAL)
	Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_canceldialog'), GlobalVariable.G_Timeout_long)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Android-Record/Android-healthcheckuprecordtitle'), '健康診断', FailureHandling.OPTIONAL)

} else {
	println("The record button is not present")
}

'Verify to record a valid data'
Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_field1_date'), GlobalVariable.G_Timeout_long)
Mobile.tap(findTestObject('Android-HealthcheckupRecord/Android-Healthcheckup_dateDonebtn'), GlobalVariable.G_Timeout_long)

Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_field2_name'), GlobalVariable.G_Timeout_long)
AndroidDriver<?> nameInput1 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
nameInput1.getKeyboard().pressKey('Blezel Tajor')
Mobile.tap(findTestObject('Android-HealthcheckupRecord/Android-Healthcheckup_dateDonebtn'), GlobalVariable.G_Timeout_long)

Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_field3_maleradiobtn'), GlobalVariable.G_Timeout_long)
Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_field4_birthdate'), GlobalVariable.G_Timeout_long)
Mobile.tap(findTestObject('Android-HealthcheckupRecord/Android-Healthcheckup_dateDonebtn'), GlobalVariable.G_Timeout_long)

Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_field5cm'), GlobalVariable.G_Timeout_long)
AndroidDriver<?> Input2 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
Input2.getKeyboard().pressKey('165')
Mobile.tap(findTestObject('Android-HealthcheckupRecord/Android-Healthcheckup_dateDonebtn'), GlobalVariable.G_Timeout_long)

Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_field8kg'), GlobalVariable.G_Timeout_long)
AndroidDriver<?> Input3 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
Input3.getKeyboard().pressKey('45')
Mobile.tap(findTestObject('Android-HealthcheckupRecord/Android-Healthcheckup_dateDonebtn'), GlobalVariable.G_Timeout_long)

Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_field9bmi'), GlobalVariable.G_Timeout_long)
AndroidDriver<?> Input4 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
Input4.getKeyboard().pressKey('18')
Mobile.tap(findTestObject('Android-HealthcheckupRecord/Android-Healthcheckup_dateDonebtn'), GlobalVariable.G_Timeout_long)

Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_field10cm2'), GlobalVariable.G_Timeout_long)
AndroidDriver<?> Input5 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
Input5.getKeyboard().pressKey('25')
Mobile.tap(findTestObject('Android-HealthcheckupRecord/Android-Healthcheckup_dateDonebtn'), GlobalVariable.G_Timeout_long)

Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_field11mmhg1'), GlobalVariable.G_Timeout_long)
AndroidDriver<?> Input6 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
Input6.getKeyboard().pressKey('95')
Mobile.tap(findTestObject('Android-HealthcheckupRecord/Android-Healthcheckup_dateDonebtn'), GlobalVariable.G_Timeout_long)

Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_field12mmhg2'), GlobalVariable.G_Timeout_long)
AndroidDriver<?> Input7 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
Input7.getKeyboard().pressKey('90')
Mobile.tap(findTestObject('Android-HealthcheckupRecord/Android-Healthcheckup_dateDonebtn'), GlobalVariable.G_Timeout_long)

Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_field13ast'), GlobalVariable.G_Timeout_long)
AndroidDriver<?> Input25 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
Input25.getKeyboard().pressKey('40')
Mobile.tap(findTestObject('Android-HealthcheckupRecord/Android-Healthcheckup_dateDonebtn'), GlobalVariable.G_Timeout_long)

Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_field14alt'), GlobalVariable.G_Timeout_long)
AndroidDriver<?> Input8 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
Input8.getKeyboard().pressKey('45')
Mobile.tap(findTestObject('Android-HealthcheckupRecord/Android-Healthcheckup_dateDonebtn'), GlobalVariable.G_Timeout_long)

Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_fieldy15gt'), GlobalVariable.G_Timeout_long)
AndroidDriver<?> Input9 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
Input9.getKeyboard().pressKey('50')
Mobile.tap(findTestObject('Android-HealthcheckupRecord/Android-Healthcheckup_dateDonebtn'), GlobalVariable.G_Timeout_long)

Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_field16mgdl'), GlobalVariable.G_Timeout_long)
AndroidDriver<?> Input10 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
Input10.getKeyboard().pressKey('15')
Mobile.tap(findTestObject('Android-HealthcheckupRecord/Android-Healthcheckup_dateDonebtn'), GlobalVariable.G_Timeout_long)

Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_field17egfr'), GlobalVariable.G_Timeout_long)
AndroidDriver<?> Input11 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
Input11.getKeyboard().pressKey('12')
Mobile.tap(findTestObject('Android-HealthcheckupRecord/Android-Healthcheckup_dateDonebtn'), GlobalVariable.G_Timeout_long)

Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_field18mgdl2'), GlobalVariable.G_Timeout_long)
AndroidDriver<?> Input12 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
Input12.getKeyboard().pressKey('20')
Mobile.tap(findTestObject('Android-HealthcheckupRecord/Android-Healthcheckup_dateDonebtn'), GlobalVariable.G_Timeout_long)

Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_field19hdl'), GlobalVariable.G_Timeout_long)
AndroidDriver<?> Input13 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
Input13.getKeyboard().pressKey('50')
Mobile.tap(findTestObject('Android-HealthcheckupRecord/Android-Healthcheckup_dateDonebtn'), GlobalVariable.G_Timeout_long)

Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_field20ldl'), GlobalVariable.G_Timeout_long)
AndroidDriver<?> Input14 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
Input14.getKeyboard().pressKey('55')
Mobile.tap(findTestObject('Android-HealthcheckupRecord/Android-Healthcheckup_dateDonebtn'), GlobalVariable.G_Timeout_long)

Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_field21mgdl3'), GlobalVariable.G_Timeout_long)
AndroidDriver<?> Input15 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
Input15.getKeyboard().pressKey('20')
Mobile.tap(findTestObject('Android-HealthcheckupRecord/Android-Healthcheckup_dateDonebtn'), GlobalVariable.G_Timeout_long)

Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_field22nonhdl'), GlobalVariable.G_Timeout_long)
AndroidDriver<?> Input16 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
Input16.getKeyboard().pressKey('20')
Mobile.tap(findTestObject('Android-HealthcheckupRecord/Android-Healthcheckup_dateDonebtn'), GlobalVariable.G_Timeout_long)

Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_field23mgdl4'), GlobalVariable.G_Timeout_long)
AndroidDriver<?> Input17 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
Input17.getKeyboard().pressKey('20')
Mobile.tap(findTestObject('Android-HealthcheckupRecord/Android-Healthcheckup_dateDonebtn'), GlobalVariable.G_Timeout_long)

Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_field24mgdl5'), GlobalVariable.G_Timeout_long)
AndroidDriver<?> Input18 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
Input18.getKeyboard().pressKey('20')
Mobile.tap(findTestObject('Android-HealthcheckupRecord/Android-Healthcheckup_dateDonebtn'), GlobalVariable.G_Timeout_long)

Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_field25HbA1c'), GlobalVariable.G_Timeout_long)
AndroidDriver<?> Input19 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
Input19.getKeyboard().pressKey('60')
Mobile.tap(findTestObject('Android-HealthcheckupRecord/Android-Healthcheckup_dateDonebtn'), GlobalVariable.G_Timeout_long)

Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_field2610ul'), GlobalVariable.G_Timeout_long)
AndroidDriver<?> Input20 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
Input20.getKeyboard().pressKey('69')
Mobile.tap(findTestObject('Android-HealthcheckupRecord/Android-Healthcheckup_dateDonebtn'), GlobalVariable.G_Timeout_long)

Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_field27gdl'), GlobalVariable.G_Timeout_long)
AndroidDriver<?> Input21 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
Input21.getKeyboard().pressKey('45')
Mobile.tap(findTestObject('Android-HealthcheckupRecord/Android-Healthcheckup_dateDonebtn'), GlobalVariable.G_Timeout_long)

Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_field28'), GlobalVariable.G_Timeout_long)
AndroidDriver<?> Input22 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
Input22.getKeyboard().pressKey('46')
Mobile.tap(findTestObject('Android-HealthcheckupRecord/Android-Healthcheckup_dateDonebtn'), GlobalVariable.G_Timeout_long)

Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_field29'), GlobalVariable.G_Timeout_long)
AndroidDriver<?> Input23 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
Input23.getKeyboard().pressKey('30')
Mobile.tap(findTestObject('Android-HealthcheckupRecord/Android-Healthcheckup_dateDonebtn'), GlobalVariable.G_Timeout_long)

Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_field30'), GlobalVariable.G_Timeout_long)
AndroidDriver<?> Input24 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
Input24.getKeyboard().pressKey('50')
Mobile.tap(findTestObject('Android-HealthcheckupRecord/Android-Healthcheckup_dateDonebtn'), GlobalVariable.G_Timeout_long)

Mobile.tapAndHold(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckupdropdownmenu1'), 1, GlobalVariable.G_Timeout_long)
Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-dropmenu1-3'), GlobalVariable.G_Timeout_long)

Mobile.tapAndHold(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckupdropdownmenu2'), 1, GlobalVariable.G_Timeout_long)
Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-dropmenu2-5'), GlobalVariable.G_Timeout_long)

Mobile.tapAndHold(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckupdropdownmenu3'), 1, GlobalVariable.G_Timeout_long)
Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-dropmenu1-6'), GlobalVariable.G_Timeout_long)

Mobile.scrollToText('身長', FailureHandling.STOP_ON_FAILURE)
Mobile.scrollToText('白血球数', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Android-HealthcheckupRecord/Android-Healthcheckup_save'), GlobalVariable.G_Timeout_long)

Mobile.verifyElementExist(findTestObject('Object Repository/Android_HOME/Android-TOP_healthcheckupscreen'), GlobalVariable.G_Timeout_long)
Mobile.verifyElementText(findTestObject('Object Repository/Android_HOME/Android-TOP_healthcheckupscreen'), '健康診断', FailureHandling.OPTIONAL)
Mobile.tap(findTestObject('Object Repository/TOP/Android-topfromHealthcheckup'), GlobalVariable.G_Timeout_long)
Mobile.verifyElementExist(findTestObject('Object Repository/Android_HOME/Home - TOP_nav'), GlobalVariable.G_Timeout_long)
Mobile.verifyElementText(findTestObject('Object Repository/Android_HOME/Home - TOP_nav'), 'TOP', FailureHandling.OPTIONAL)
