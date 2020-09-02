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

'Note: There is no Sign_up feature yet so signin feature test auth is static'
'Note: To login use *test-user-nnnn* for username and *passwordnnn* for password'


Mobile.comment('This is to verify the signin feature using valid credentials')

if (Device.isIOS()) {
    println('This is an iOS device.')
	
	Mobile.verifyElementExist(findTestObject('Object Repository/iOS-Login/iOS-Login_screenTitle'), GlobalVariable.G_Timeout_long)
	
	Mobile.tap(findTestObject('Object Repository/iOS-Login/iOS-Login_username_inputfield'), GlobalVariable.G_Timeout_long)
	Mobile.delay(GlobalVariable.G_Delay_short)
	IOSDriver<?> driverLoginUserName = ((MobileDriverFactory.getDriver()) as IOSDriver<?>)
	driverLoginUserName.getKeyboard().pressKey('test-user-100')

	Mobile.tap(findTestObject('Object Repository/iOS-Login/iOS-Login_password_inputfield'), GlobalVariable.G_Timeout_long)
	Mobile.delay(GlobalVariable.G_Delay_short)
	IOSDriver<?> driverLoginPassword = ((MobileDriverFactory.getDriver()) as IOSDriver<?>)
	driverLoginPassword.getKeyboard().pressKey('password100')

	Mobile.tap(findTestObject('Object Repository/iOS-Login/iOS-Login_loginButton'), GlobalVariable.G_Timeout_long)
	Mobile.delay(GlobalVariable.G_Delay_short)
}

if (Device.isAndroid()) {
    println('This is an Android device.')
	Mobile.verifyElementExist(findTestObject('Android-Login/Android-Login_screenTitle'), GlobalVariable.G_Timeout_long)
    
	Mobile.tap(findTestObject('Object Repository/Android-Login/Android-Login_Username_inputfield'), GlobalVariable.G_Timeout_long)
    Mobile.delay(GlobalVariable.G_Delay_short)
	AndroidDriver<?> driverLoginUserName = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
	driverLoginUserName.getKeyboard().pressKey('test-user-100')

    Mobile.tap(findTestObject('Object Repository/Android-Login/Android-Login_Password_inputfield'), GlobalVariable.G_Timeout_long)
	Mobile.delay(GlobalVariable.G_Delay_short)
	AndroidDriver<?> driverLoginPassword = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
    driverLoginPassword.getKeyboard().pressKey('password100')

    Mobile.tap(findTestObject('Object Repository/Android-Login/Android-Login_LoginButton'), GlobalVariable.G_Timeout_long)
	Mobile.delay(GlobalVariable.G_Delay_short)
}


