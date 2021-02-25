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

'Verify the functionality of recording blood pressure data'

Mobile.tapAndHold(findTestObject('Object Repository/Android-RecordFromTOP/TOP_RecordBtn'), 2, GlobalVariable.G_Timeout_long)

'Verify the validation message if the inputted value for AM and PM is 0 '
if (Mobile.verifyElementVisible(findTestObject('Object Repository/Android-BloodpressureRecord/Android-bloodpressureRecordbtnfromTOP'), GlobalVariable.G_Timeout_long)) {
	Mobile.tapAndHold(findTestObject('Object Repository/Android-BloodpressureRecord/Android-bloodpressureRecordbtnfromTOP'), 2, GlobalVariable.G_Timeout_long)
	Mobile.delay(GlobalVariable.G_Delay_short)
	
	//This is for PM data
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_maxfield'), GlobalVariable.G_Timeout_long)
	AndroidDriver<?> bloodpressureminInput1 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
	bloodpressureminInput1.getKeyboard().pressKey('0')
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_donebtnkeyboard'), GlobalVariable.G_Timeout_long)
	
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_minfield'), GlobalVariable.G_Timeout_long)
	AndroidDriver<?> bloodpressureminInput2 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
	bloodpressureminInput2.getKeyboard().pressKey('0')
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_donebtnkeyboard'), GlobalVariable.G_Timeout_long)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_errmsg'), "1～999mmHgで入力してください", FailureHandling.OPTIONAL)
	
	//This is for AM data
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_AMbtn'), GlobalVariable.G_Timeout_long)
	
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_maxfield'), GlobalVariable.G_Timeout_long)
	AndroidDriver<?> bloodpressureminInput3 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
	bloodpressureminInput3.getKeyboard().pressKey('0')
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_donebtnkeyboard'), GlobalVariable.G_Timeout_long)
	
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_minfield'), GlobalVariable.G_Timeout_long)
	AndroidDriver<?> bloodpressureminInput4 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
	bloodpressureminInput4.getKeyboard().pressKey('0')
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_donebtnkeyboard'), GlobalVariable.G_Timeout_long)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_errmsg'), "1～999mmHgで入力してください", FailureHandling.OPTIONAL)
	Mobile.tap(findTestObject('Object Repository/Android-RecordFromTOP/RecordScreen_cancelbtn'), GlobalVariable.G_Timeout_long)
	Mobile.tapAndHold(findTestObject('Object Repository/Android-RecordFromTOP/TOP_RecordBtn'), 2, GlobalVariable.G_Timeout_long)
	
} else {
	println("The record Button is not present")
}


'Verify the validation message if the inputted value for AM and PM more than 999'
if (Mobile.verifyElementVisible(findTestObject('Object Repository/Android-RecordFromTOP/TOP_RecordBtn'), GlobalVariable.G_Timeout_long)) {
	Mobile.tapAndHold(findTestObject('Object Repository/Android-RecordFromTOP/TOP_RecordBtn'), 2, GlobalVariable.G_Timeout_long)
	Mobile.tapAndHold(findTestObject('Object Repository/Android-BloodpressureRecord/Android-bloodpressureRecordbtnfromTOP'), 2, GlobalVariable.G_Timeout_long)
	Mobile.delay(GlobalVariable.G_Delay_short)
		
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_maxfield'), GlobalVariable.G_Timeout_long)
	AndroidDriver<?> bloodpressureminInput5 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
	bloodpressureminInput5.getKeyboard().pressKey('1000')
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_donebtnkeyboard'), GlobalVariable.G_Timeout_long)
		
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_minfield'), GlobalVariable.G_Timeout_long)
	AndroidDriver<?> bloodpressureminInput6 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
	bloodpressureminInput6.getKeyboard().pressKey('1000')
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_donebtnkeyboard'), GlobalVariable.G_Timeout_long)
		
	Mobile.verifyElementText(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_errmsg'), "1～999mmHgで入力してください", FailureHandling.OPTIONAL)
	
	//This is for AM data
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_AMbtn'), GlobalVariable.G_Timeout_long)
	
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_maxfield'), GlobalVariable.G_Timeout_long)
	AndroidDriver<?> bloodpressureminInput7 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
	bloodpressureminInput7.getKeyboard().pressKey('1000')
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_donebtnkeyboard'), GlobalVariable.G_Timeout_long)
	
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_minfield'), GlobalVariable.G_Timeout_long)
	AndroidDriver<?> bloodpressureminInput8 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
	bloodpressureminInput8.getKeyboard().pressKey('1000')
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_donebtnkeyboard'), GlobalVariable.G_Timeout_long)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_errmsg'), "1～999mmHgで入力してください", FailureHandling.OPTIONAL)
	Mobile.tap(findTestObject('Object Repository/Android-RecordFromTOP/RecordScreen_cancelbtn'), GlobalVariable.G_Timeout_long)
	Mobile.tapAndHold(findTestObject('Object Repository/Android-RecordFromTOP/TOP_RecordBtn'), 3, GlobalVariable.G_Timeout_long)
	
}else {
	println("Record modal is not present")
}


'Verify the validation message if the inputted value for min is greater than the max data value'
if (Mobile.verifyElementVisible(findTestObject('Object Repository/Android-RecordFromTOP/TOP_RecordBtn'), GlobalVariable.G_Timeout_long)) {
	Mobile.tapAndHold(findTestObject('Object Repository/Android-RecordFromTOP/TOP_RecordBtn'), 3, GlobalVariable.G_Timeout_long)
	Mobile.tapAndHold(findTestObject('Object Repository/Android-BloodpressureRecord/Android-bloodpressureRecordbtnfromTOP'), 3, GlobalVariable.G_Timeout_long)
	Mobile.delay(GlobalVariable.G_Delay_short)
		
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_maxfield'), GlobalVariable.G_Timeout_long)
	AndroidDriver<?> bloodpressureminInput5 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
	bloodpressureminInput5.getKeyboard().pressKey('90')
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_donebtnkeyboard'), GlobalVariable.G_Timeout_long)
		
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_minfield'), GlobalVariable.G_Timeout_long)
	AndroidDriver<?> bloodpressureminInput6 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
	bloodpressureminInput6.getKeyboard().pressKey('95')
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_donebtnkeyboard'), GlobalVariable.G_Timeout_long)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressureminisgreaterthanmaxerr'), "最高血圧が最低血圧以上になるように入力してください", FailureHandling.OPTIONAL)
	
	//This is for AM data
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_AMbtn'), GlobalVariable.G_Timeout_long)
	
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_maxfield'), GlobalVariable.G_Timeout_long)
	AndroidDriver<?> bloodpressureminInput7 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
	bloodpressureminInput7.getKeyboard().pressKey('90')
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_donebtnkeyboard'), GlobalVariable.G_Timeout_long)
	
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_minfield'), GlobalVariable.G_Timeout_long)
	AndroidDriver<?> bloodpressureminInput8 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
	bloodpressureminInput8.getKeyboard().pressKey('95')
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_donebtnkeyboard'), GlobalVariable.G_Timeout_long)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressureminisgreaterthanmaxerr'), "最高血圧が最低血圧以上になるように入力してください", FailureHandling.OPTIONAL)

	Mobile.tap(findTestObject('Object Repository/Android-RecordFromTOP/RecordScreen_cancelbtn'), GlobalVariable.G_Timeout_long)
	Mobile.tapAndHold(findTestObject('Object Repository/Android-RecordFromTOP/TOP_RecordBtn'), 3, GlobalVariable.G_Timeout_long)
}else {
	println("Record modal is not present")
}


'Verify to record valid data for AM'
if (Mobile.verifyElementVisible(findTestObject('Object Repository/Android-RecordFromTOP/TOP_RecordBtn'), GlobalVariable.G_Timeout_long)) {
	Mobile.tapAndHold(findTestObject('Object Repository/Android-RecordFromTOP/TOP_RecordBtn'), 3, GlobalVariable.G_Timeout_long)
	Mobile.tapAndHold(findTestObject('Object Repository/Android-BloodpressureRecord/Android-bloodpressureRecordbtnfromTOP'), 3, GlobalVariable.G_Timeout_long)
	Mobile.delay(GlobalVariable.G_Delay_short)
	
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_AMbtn'), GlobalVariable.G_Timeout_long)
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_maxfield'), GlobalVariable.G_Timeout_long)
	AndroidDriver<?> bloodpressureminInput9 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
	bloodpressureminInput9.getKeyboard().pressKey('90')
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_donebtnkeyboard'), GlobalVariable.G_Timeout_long)
		
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_minfield'), GlobalVariable.G_Timeout_long)
	AndroidDriver<?> bloodpressureminInput10 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
	bloodpressureminInput10.getKeyboard().pressKey('85')
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_donebtnkeyboard'), GlobalVariable.G_Timeout_long)
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_recordbtn'), GlobalVariable.G_Timeout_long)
		
	Mobile.verifyElementText(findTestObject('Object Repository/Android_HOME/Android-TOP_bloodpressure'), "血圧", FailureHandling.OPTIONAL)
	Mobile.tap(findTestObject('Object Repository/TOP/Android-TOPinbloodpressreScreen'), GlobalVariable.G_Timeout_long)
}else {
	println("Error in recording the AM blood pressure data")
}

Mobile.tapAndHold(findTestObject('Object Repository/Android-RecordFromTOP/TOP_RecordBtn'), 2, GlobalVariable.G_Timeout_long)
'Verify to record valid data for PM'
if (Mobile.verifyElementVisible(findTestObject('Object Repository/Android-BloodpressureRecord/Android-bloodpressureRecordbtnfromTOP'), GlobalVariable.G_Timeout_long)) {
	Mobile.tapAndHold(findTestObject('Object Repository/Android-BloodpressureRecord/Android-bloodpressureRecordbtnfromTOP'), 2, GlobalVariable.G_Timeout_long)
	Mobile.delay(GlobalVariable.G_Delay_short)
	
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_PMbtn'), GlobalVariable.G_Timeout_long)
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_maxfield'), GlobalVariable.G_Timeout_long)
	AndroidDriver<?> bloodpressureminInput9= ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
	bloodpressureminInput9.getKeyboard().pressKey('95')
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_donebtnkeyboard'), GlobalVariable.G_Timeout_long)
		
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_minfield'), GlobalVariable.G_Timeout_long)
	AndroidDriver<?> bloodpressureminInput10 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
	bloodpressureminInput10.getKeyboard().pressKey('90')
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_donebtnkeyboard'), GlobalVariable.G_Timeout_long)
	Mobile.tap(findTestObject('Object Repository/Android-BloodpressureRecord/Android-Bloodpressure_recordbtn'), GlobalVariable.G_Timeout_long)
		
	Mobile.verifyElementText(findTestObject('Object Repository/Android_HOME/Android-TOP_bloodpressure'), "血圧", FailureHandling.OPTIONAL)
	Mobile.tap(findTestObject('Object Repository/TOP/Android-TOPinbloodpressreScreen'), GlobalVariable.G_Timeout_long)
}else {
	println("Error in recording the PM blood pressure data")
}
