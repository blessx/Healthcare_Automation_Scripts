import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

'Verify if each card will transition to each screen when you tap each card section.'

if (Mobile.verifyElementExist(findTestObject('Object Repository/Android_HOME/Android-TOP_home'), GlobalVariable.G_Timeout_long)) {
	
	'Verify if the steps section will transition to Steps screen'
	Mobile.tap(findTestObject('Object Repository/Android_HOME/Android-TOP_PHR_steps'), GlobalVariable.G_Timeout_long)
	Mobile.verifyElementText(findTestObject('Object Repository/Android_HOME/Android-TOP_stepscreen'),'歩数', FailureHandling.OPTIONAL)
	
	Mobile.tap(findTestObject('Object Repository/TOP/Android-TOPinStepsScreen'),GlobalVariable.G_Timeout_long)
	
	'Verify if the weight section will transition to weight screen'
	Mobile.tap(findTestObject('Object Repository/Android_HOME/Android-TOP_PHR_weight'), GlobalVariable.G_Timeout_long)
	Mobile.verifyElementText(findTestObject('Object Repository/Android_HOME/Android-TOP_weightscreen'), 'サポート', FailureHandling.OPTIONAL)


	Mobile.tap(findTestObject('Object Repository/TOP/Android-TOPinWeightScreen'), GlobalVariable.G_Timeout_long)
	
	'Verify if the body fat section will transition to body fat screen'
	Mobile.tap(findTestObject('Object Repository/Android_HOME/Android-TOP_PHR_bodyfat'), GlobalVariable.G_Timeout_long)
	Mobile.verifyElementText(findTestObject('Object Repository/Android_HOME/Android-TOP_bodyfatscreen'), '体脂肪率', FailureHandling.OPTIONAL)
	
	Mobile.tap(findTestObject('Object Repository/TOP/Android-StepsfromBodyfatscreen'), GlobalVariable.G_Timeout_long)
	Mobile.tap(findTestObject('Object Repository/TOP/Android-TOPinStepsScreen'), GlobalVariable.G_Timeout_long)
	
	'Verify if the blood pressure section will transition to blood pressure screen'
	Mobile.tap(findTestObject('Object Repository/Android_HOME/Android-TOP_PHR_bloodpressure'), GlobalVariable.G_Timeout_long)
	Mobile.verifyElementText(findTestObject('Object Repository/Android_HOME/Android-TOP_bloodpressure'), '血圧', FailureHandling.OPTIONAL)
	
	Mobile.tap(findTestObject('Object Repository/TOP/Android-TOPinbloodpressreScreen'), GlobalVariable.G_Timeout_long)
	
	'Verify if the health checkup record section will transition to health checkup screen'
	Mobile.tap(findTestObject('Object Repository/Android_HOME/Android-TOP_PHR_healthcheckup'), GlobalVariable.G_Timeout_long)
	Mobile.verifyElementText(findTestObject('Object Repository/Android_HOME/Android-TOP_healthcheckupscreen'), '健康診断', FailureHandling.OPTIONAL)
	
	Mobile.tap(findTestObject('Object Repository/TOP/Android-topfromHealthcheckup'), GlobalVariable.G_Timeout_long)
	
} else {
println("HOME screen is not present");
println("Possible cause the app crashed");
}