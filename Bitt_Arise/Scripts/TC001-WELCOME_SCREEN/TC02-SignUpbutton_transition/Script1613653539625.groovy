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

//imports for checking device type
import com.detroitlabs.katalonmobileutil.device.App
import com.detroitlabs.katalonmobileutil.device.Device


// Launch the app first before executing this script

if (Device.isIOS()) {
	println("Verifying iOS device.")
}
if (Device.isAndroid()) {
	println("Verifying Android device.")
	Mobile.comment('This is to verify if the signup button is tap it will transition to Terms of Service Screen')
	Mobile.tap(findTestObject('Welcome_screen/Android-Welcome_signupbtn'), 0) // to tap the signup button in the welcome screen
	Mobile.verifyElementExist(findTestObject('Object Repository/Android-Signup/Android-Signup_screenTitle_TOS'), GlobalVariable.G_Timeout_long)//to verify if the signup screen title is present
	Mobile.tap(findTestObject('Android-Signup/Android-SignupScreen_backbtn'), 0) // to tap the back icon to go back [this should transition to login screen]
	Mobile.verifyElementExist(findTestObject('Object Repository/Android-Login/Android-Login_screenTitle'), GlobalVariable.G_Timeout_long)//to verify if the login screen title is present
}
Mobile.closeApplication() //to close the application


// If this script is "PASS", it means that the sign-up button will successfully transition to TOS and the back button will transition to the login screen instead of the welcome screen.
// Requirement: Welcome screen will only be displayed if the app is installed and launched for the first time.

