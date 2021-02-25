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

import groovy.inspect.swingui.BytecodeCollector
import internal.GlobalVariable as GlobalVariable

import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.ios.IOSDriver as IOSDriver

import io.appium.java_client.*

import com.detroitlabs.katalonmobileutil.device.App
import com.detroitlabs.katalonmobileutil.device.Device

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory

'This is to verify if a validation message is displayed if no credentials have been entered'

	println("Verifying in Android device.")
	
	Mobile.delay(GlobalVariable.G_Delay_short)
	Mobile.tap(findTestObject('Object Repository/New_LoginScreen/Login-LoginBtn'), GlobalVariable.G_Timeout_long)
	Mobile.delay(GlobalVariable.G_Delay_short)
	Mobile.verifyElementExist(findTestObject('Object Repository/New_LoginScreen/Login-ErrorMsg'), GlobalVariable.G_Timeout_long) // to verify the element of the validation message is present
	Mobile.verifyElementText(findTestObject('Object Repository/New_LoginScreen/Login-ErrorMsg'),'メールアドレスまたはパスワードが誤っています' , FailureHandling.OPTIONAL)



