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
import org.openqa.selenium.Keys as Keys

'Verify if all PHR record modals are displayed when you tap each record button.'

Mobile.tapAndHold(findTestObject('Object Repository/Android-RecordFromTOP/TOP_RecordBtn'), 2, GlobalVariable.G_Timeout_long)
Mobile.delay(GlobalVariable.G_Delay_short)

'Verify if the record modal will display if the weight record button is tap'
if (Mobile.verifyElementVisible(findTestObject('Object Repository/Android-RecordFromTOP/TOP_Weightrecordbtn'), GlobalVariable.G_Timeout_long)) {
	Mobile.tapAndHold(findTestObject('Object Repository/Android-RecordFromTOP/TOP_Weightrecordbtn'), 0, GlobalVariable.G_Timeout_long)
	Mobile.verifyElementText(findTestObject('Object Repository/Android-Record/Android-Weightrecordtitle'), '体重' , FailureHandling.OPTIONAL)
	Mobile.tap(findTestObject('Object Repository/Android-RecordFromTOP/RecordScreen_cancelbtn'), GlobalVariable.G_Timeout_long)
} else {
	println("Button is not present")
}

'Verify if the record modal will display if the body fat record button is tap'
if (Mobile.verifyElementVisible(findTestObject('Object Repository/Android-RecordFromTOP/TOP_BodyFatrecordbtn'), GlobalVariable.G_Timeout_long)) {
	Mobile.tapAndHold(findTestObject('Object Repository/Android-RecordFromTOP/TOP_BodyFatrecordbtn'), 0, GlobalVariable.G_Timeout_long)
	Mobile.verifyElementText(findTestObject('Object Repository/Android-Record/Android-Bodyfatrecordtitle'), '体脂肪率' , FailureHandling.OPTIONAL)
	Mobile.tap(findTestObject('Object Repository/Android-RecordFromTOP/RecordScreen_cancelbtn'), GlobalVariable.G_Timeout_long)
} else {
	println("Button is not present")
}

'Verify if the record modal will display if the blood pressure record button is tap'
if (Mobile.verifyElementVisible(findTestObject('Object Repository/Android-RecordFromTOP/TOP_BloodPressurerecordbtn'), GlobalVariable.G_Timeout_long)) {
	Mobile.tapAndHold(findTestObject('Object Repository/Android-RecordFromTOP/TOP_BloodPressurerecordbtn'), 0, GlobalVariable.G_Timeout_long)
	Mobile.verifyElementText(findTestObject('Object Repository/Android-Record/Android-Bloodpressurerecordtitle'), '血圧' , FailureHandling.OPTIONAL)
	Mobile.tap(findTestObject('Object Repository/Android-RecordFromTOP/RecordScreen_cancelbtn'), GlobalVariable.G_Timeout_long)
} else {
	println("Button is not present")
}

'Verify if the record modal will display if the record button is tap'
if (Mobile.verifyElementVisible(findTestObject('Object Repository/Android-RecordFromTOP/TOP_healthcheckuprecordbtn'), GlobalVariable.G_Timeout_long)) {
	Mobile.tapAndHold(findTestObject('Object Repository/Android-RecordFromTOP/TOP_healthcheckuprecordbtn'), 0, GlobalVariable.G_Timeout_long)
	Mobile.verifyElementText(findTestObject('Object Repository/Android-Record/Android-healthcheckuprecordtitle'), '健康診断' , FailureHandling.OPTIONAL)
	Mobile.tap(findTestObject('Object Repository/Android-RecordFromTOP/healthcheckup_cancelbtn'), GlobalVariable.G_Timeout_long)
} else {
	println("Button is not present")
}

