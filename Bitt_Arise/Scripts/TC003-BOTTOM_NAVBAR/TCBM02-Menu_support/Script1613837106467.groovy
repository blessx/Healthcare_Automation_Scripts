import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.By

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

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.android.nativekey.AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent


'Verify if you tap the SUPPORT menu the support menu will display.'
Mobile.startApplication(GlobalVariable.G_Android_App, false)

Mobile.delay(15)

//AndroidDriver<?> driver = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)
//def support = driver.findElementsByClassName("android.view.View")

Mobile.tapAndHold(findTestObject('Object Repository/Android_HOME/Android-TOP_support'), 5, GlobalVariable.G_Timeout_long)

// to verify if the support menu is present and to check if support screen is displayed
if (Mobile.verifyElementExist(findTestObject('Object Repository/Android_HOME/Android-TOP_support'), GlobalVariable.G_Timeout_long, FailureHandling.STOP_ON_FAILURE)) {
	Mobile.verifyElementExist(findTestObject('Object Repository/Android-Support/Android-Support_title'), GlobalVariable.G_Timeout_long)
	def screenTitle = Mobile.getText(findTestObject('Object Repository/Android-Support/Android-Support_title'), GlobalVariable.G_Timeout_long)
	Mobile.verifyEqual(screenTitle, "血圧")
} else {
	Mobile.tap(findTestObject('Object Repository/Android_HOME/Android-TOP_home'), GlobalVariable.G_Timeout_long)
	Mobile.verifyElementExist(findTestObject('Object Repository/Android_HOME/Home - TOP_nav'), GlobalVariable.G_Timeout_long)
} 


