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

import com.detroitlabs.katalonmobileutil.device.App
import com.detroitlabs.katalonmobileutil.device.Device

if (Device.isIOS()) {
	println("Installing and launching app in an iOS device.")
	Mobile.startApplication(GlobalVariable.G_iOS_App, false)
}
if (Device.isAndroid()) {
	println("Installing and launching app in an Android device.")
	Mobile.startApplication(GlobalVariable.G_Android_App, false)
}

Mobile.verifyElementExist(findTestObject('Object Repository/Android-Login/Android-Login_screenTitle'), GlobalVariable.G_Timeout_long) // to verify if the login screen title is present


// If this script is "PASS", it means that the login screen will be displayed instead of the welcome screen when the app is not installed for the first time.
// Requirement: Welcome screen will only be displayed if the app is installed and launched for the first time.