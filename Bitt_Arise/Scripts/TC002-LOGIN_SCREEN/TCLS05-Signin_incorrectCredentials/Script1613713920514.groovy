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


'This is to verify if the validation message is displayed when the email address and password credentials are incorrect.'
	println("Verifying in Android device.")	
	// enter incorrect credentials
	Mobile.tap(findTestObject('Object Repository/New_LoginScreen/Android-Login_usernameNoterr'), GlobalVariable.G_Timeout_long)
	Mobile.delay(GlobalVariable.G_Delay_short)
	AndroidDriver<?> driverLoginUserName1 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
	driverLoginUserName1.getKeyboard().pressKey('blezel_tajorr@ligph.com')
	
	Mobile.tap(findTestObject('Object Repository/New_LoginScreen/Android-Login_passNotErr'), GlobalVariable.G_Timeout_long)
	Mobile.delay(GlobalVariable.G_Delay_short)
	AndroidDriver<?> driverLoginPassword1 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
	driverLoginPassword1.getKeyboard().pressKey('00000000')
	driverLoginPassword1.hideKeyboard()

    Mobile.tap(findTestObject('Object Repository/New_LoginScreen/Login-LoginBtn'), GlobalVariable.G_Timeout_long)
	
	Mobile.delay(GlobalVariable.G_Delay_short)
	for (int i=1; i<=8; i++) {
		driverLoginPassword1.pressKeyCode(67);
	}
	
	Mobile.verifyElementExist(findTestObject('Object Repository/New_LoginScreen/Login-ErrorMsg'), GlobalVariable.G_Timeout_long) // to verify the element of the validation message is present
	Mobile.verifyElementText(findTestObject('Object Repository/New_LoginScreen/Login-ErrorMsg'),'メールアドレスまたはパスワードが誤っています' , FailureHandling.OPTIONAL)


