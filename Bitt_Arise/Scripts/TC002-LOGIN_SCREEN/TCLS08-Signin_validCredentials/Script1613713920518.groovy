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
import com.detroitlabs.katalonmobileutil.device.App as App
import com.detroitlabs.katalonmobileutil.device.Device as Device
	
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.ios.IOSDriver as IOSDriver
	
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
	
	
	'This is to verify the signin feature using valid credentials'
	
		println('Verifying using Android device.')
		// input valid password
		AndroidDriver<?> driverLoginPassword5 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
		for (int i=1; i<=10; i++) {
			driverLoginPassword5.pressKeyCode(67);
		}
		driverLoginPassword5.getKeyboard().pressKey('Testing143')
	
		Mobile.tap(findTestObject('Object Repository/New_LoginScreen/Login-LoginBtn'), GlobalVariable.G_Timeout_long)
		Mobile.delay(GlobalVariable.G_Delay_short)
	
		if ( Mobile.verifyElementExist(findTestObject('Object Repository/Android-GoogleFit/GoogleFit-text'), GlobalVariable.G_Timeout_long, FailureHandling.OPTIONAL )) {
		Mobile.tap(findTestObject('Object Repository/Android-GoogleFit/GoogleFit - nextBtn'), GlobalVariable.G_Timeout_long)
		Mobile.delay(GlobalVariable.G_Delay_short)
		Mobile.tap(findTestObject('Object Repository/Android-GoogleFit/Google-emailAdd'), GlobalVariable.G_Timeout_long)
		} else {
		println("The google fit is already allowed")
		}
		
		if (Mobile.verifyElementExist(findTestObject('Object Repository/Android_HOME/Home - TOP_nav'), GlobalVariable.G_Timeout_long, FailureHandling.OPTIONAL)) {
		println("You are in the TOP SCREEN")
		}else {
			println("Error!!!")
		}
		
	
	
	
	


