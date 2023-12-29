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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('signUpFailed'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Browsing/Page_STORE/a_CATEGORIES'), 0)

WebUI.click(findTestObject('Browsing/Page_STORE/a_Phones'))

WebUI.click(findTestObject('Object Repository/Browsing/Page_STORE/a_Samsung galaxy s6'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Browsing/Page_STORE/h2_Samsung galaxy s6'), 0)

WebUI.click(findTestObject('Object Repository/Browsing/Page_STORE/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/Browsing/Page_STORE/a_Cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Browsing/Page_STORE/h2_Products'), 0)

WebUI.click(findTestObject('Object Repository/Browsing/Page_STORE/button_Place Order'))

WebUI.setText(findTestObject('Object Repository/Browsing/Page_STORE/input_card_name'), GlobalVariable.card_name)

WebUI.setText(findTestObject('Object Repository/Browsing/Page_STORE/input_card_country'), GlobalVariable.card_country)

WebUI.setText(findTestObject('Object Repository/Browsing/Page_STORE/input_City_city'), GlobalVariable.card_city)

WebUI.setText(findTestObject('Object Repository/Browsing/Page_STORE/input_card_card'), GlobalVariable.card_data)

WebUI.setText(findTestObject('Object Repository/Browsing/Page_STORE/input_card_month'), GlobalVariable.card_month)

WebUI.setText(findTestObject('Object Repository/Browsing/Page_STORE/input_card_year'), GlobalVariable.card_year)

WebUI.click(findTestObject('Object Repository/Browsing/Page_STORE/button_Purchase'))

WebUI.click(findTestObject('Object Repository/Browsing/Page_STORE/button_OK'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

