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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.detroitlabs.katalonmobileutil.device.App as App
import com.detroitlabs.katalonmobileutil.device.Device as Device

'This is to verify if all the components or elements in the login screen is present'
if (Device.isIOS()) {
    println('Verifying in iOS device.')
}

if (Device.isAndroid()) {
    println('Verifying in an Android device.')

    Mobile.startApplication(GlobalVariable.G_Android_App, false)

    Mobile.verifyElementExist(findTestObject('Object Repository/New_LoginScreen/Login-pockethealthcarelogoimage'), GlobalVariable.G_Timeout_long) // to verify if pockethealthcare logo image is present
    Mobile.verifyElementExist(findTestObject('New_LoginScreen/Login-EmailaddressInputField'), GlobalVariable.G_Timeout_long )// to verify if email address input field is present
    Mobile.verifyElementExist(findTestObject('New_LoginScreen/Login-PasswordInputField'), GlobalVariable.G_Timeout_long )// to verify if password input field is present
        

    // to verify the placeholder text if it is correct
    Mobile.verifyElementText(findTestObject('New_LoginScreen/Login-EmailaddressInputField'), 'メールアドレス')
    Mobile.verifyElementText(findTestObject('New_LoginScreen/Login-PasswordInputField'), 'パスワード')
    Mobile.verifyElementExist(findTestObject('Object Repository/New_LoginScreen/Login-ForgotPasswordLink'), GlobalVariable.G_Timeout_long) // to verify if forgot password link is present
    Mobile.verifyElementExist(findTestObject('Object Repository/New_LoginScreen/Login-SignupTitleDesc'), GlobalVariable.G_Timeout_long) // to verify if signup text is present
    Mobile.verifyElementExist(findTestObject('Object Repository/New_LoginScreen/Login-Signuplink'), GlobalVariable.G_Timeout_long) // to verify if signup link is present
}

