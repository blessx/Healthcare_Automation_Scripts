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

'Verify record Weight data functionality'
Mobile.tapAndHold(findTestObject('Object Repository/Android-RecordFromTOP/TOP_RecordBtn'), 2, GlobalVariable.G_Timeout_long)
Mobile.delay(GlobalVariable.G_Delay_short)

'Verify the validation message if the inputted value is 0.'
if (Mobile.verifyElementVisible(findTestObject('Object Repository/Android-RecordFromTOP/TOP_BodyFatrecordbtn'), GlobalVariable.G_Timeout_long)) {
	Mobile.tapAndHold(findTestObject('Object Repository/Android-RecordFromTOP/TOP_BodyFatrecordbtn'), 2, GlobalVariable.G_Timeout_long)
	Mobile.delay(GlobalVariable.G_Delay_short)

	Mobile.tap(findTestObject('Object Repository/Android-BodyFatRecord/Android-BodyFat_inputfield'), GlobalVariable.G_Timeout_long)
	AndroidDriver<?> bodyfatInput1 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
	bodyfatInput1.getKeyboard().pressKey('0')

	Mobile.verifyElementText(findTestObject('Object Repository/Android-BodyFatRecord/Android-BodyFat_errmsg'), "0.1～99.9%で入力してください", FailureHandling.OPTIONAL)
	bodyfatInput1.pressKeyCode(67);
} else {
	println("The record Button is not present")
}

'Verify the validation message if the inputted value is more than 100'
if (Mobile.verifyElementVisible(findTestObject('Object Repository/Android-Record/Android-Bodyfatrecordtitle'), GlobalVariable.G_Timeout_long)) {
	AndroidDriver<?> bodyfatInput2 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
	bodyfatInput2.getKeyboard().pressKey('100')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Android-BodyFatRecord/Android-BodyFat_errmsg'), "0.1～99.9%で入力してください", FailureHandling.OPTIONAL)
		for (int i=1; i<=3; i++) {
		bodyfatInput2.pressKeyCode(67);
	}
} else {
	println("The record modal is not present")
}


'Verify to record a valid data'
if (Mobile.verifyElementVisible(findTestObject('Object Repository/Android-Record/Android-Bodyfatrecordtitle'), GlobalVariable.G_Timeout_long)) {
	AndroidDriver<?> bodyfatInput3 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
	bodyfatInput3.getKeyboard().pressKey('18')
	Mobile.tap(findTestObject('Object Repository/Android-BodyFatRecord/Android-BodyFat_recordbtn'), GlobalVariable.G_Timeout_long)
	Mobile.verifyElementExist(findTestObject('Object Repository/Android_HOME/Android-TOP_bodyfatscreen'), GlobalVariable.G_Timeout_long, FailureHandling.OPTIONAL)
} else {
	println("Not recorded")
}

	Mobile.tap(findTestObject('Object Repository/TOP/Android-StepsfromBodyfatscreen'), GlobalVariable.G_Timeout_long)
	Mobile.tap(findTestObject('Object Repository/TOP/Android-TOPinStepsScreen'), GlobalVariable.G_Timeout_long)
