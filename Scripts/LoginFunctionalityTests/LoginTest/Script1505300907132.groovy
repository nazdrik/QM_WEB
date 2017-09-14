import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qmdev.quickblox.com/')

WebUI.click(findTestObject('LoginPage/button_login by email or socia'))

WebUI.setText(findTestObject('LoginPage/input_login-email'), 'nazdrik@dmail.com')

WebUI.setText(findTestObject('LoginPage/input_login-password'), '12345678')

WebUI.click(findTestObject('LoginPage/button_log in'))

WebUI.waitForPageLoad(3)

WebUI.verifyElementPresent(findTestObject('MainPage/span_Is anybody here'), 1)

WebUI.delay(3)

WebUI.click(findTestObject('MainPage/a_profile'))

WebUI.click(findTestObject('MainPage/a_Log Out'))

WebUI.click(findTestObject('MainPage/button_Cancel'))

WebUI.delay(3)

WebUI.click(findTestObject('MainPage/a_profile'))

WebUI.click(findTestObject('MainPage/a_Log Out'))

WebUI.delay(2)

WebUI.click(findTestObject('MainPage/button_Ok'))

WebUI.closeBrowser()

