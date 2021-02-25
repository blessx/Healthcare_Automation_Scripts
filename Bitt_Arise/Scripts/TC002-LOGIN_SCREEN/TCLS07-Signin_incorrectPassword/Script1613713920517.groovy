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


'This is to verify if the validation message is displayed when the password is incorrect.'

    println('Verifying using Android device.')
	// enter incorrect password credential
	Mobile.startApplication(GlobalVariable.G_Android_App, false)
	
	// to inpu valid email address
	Mobile.tap(findTestObject('Object Repository/New_LoginScreen/Android-Login_usernameErr'), GlobalVariable.G_Timeout_long)
	Mobile.delay(GlobalVariable.G_Delay_short)
	AndroidDriver<?> driverUsername3 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
	driverUsername3.getKeyboard().pressKey('blezel_tajor@ligph.com')
	
	Mobile.tap(findTestObject('Object Repository/New_LoginScreen/Android-Login_passwordErr'), GlobalVariable.G_Timeout_long)
	Mobile.delay(GlobalVariable.G_Delay_short)
	AndroidDriver<?> driverLoginPassword3 = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
	driverLoginPassword3.getKeyboard().pressKey('00000000')

    Mobile.tap(findTestObject('Object Repository/New_LoginScreen/Login-LoginBtn'), GlobalVariable.G_Timeout_long)
	
	Mobile.verifyElementExist(findTestObject('Object Repository/New_LoginScreen/Login-ErrorMsg'), GlobalVariable.G_Timeout_long) // to verify the element of the validation message is present
	Mobile.verifyElementText(findTestObject('Object Repository/New_LoginScreen/Login-ErrorMsg'),'メールアドレスまたはパスワードが誤っています' , FailureHandling.OPTIONAL)


