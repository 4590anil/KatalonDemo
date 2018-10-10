import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://newtours.demoaut.com/')

WebUI.setText(findTestObject('Page_Welcome Mercury Tours/input_User'), 'mercury')

WebUI.setEncryptedText(findTestObject('Page_Welcome Mercury Tours/input_Password_password'), 'Vo4qP0PVzw0=')

WebUI.click(findTestObject('Page_Welcome Mercury Tours/input_Password_login'))

WebUI.click(findTestObject('Object Repository/Page_Find a Flight Mercury Tours/input_Round TripOne Way_tripTy'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Find a Flight Mercury Tours/select_1                 2'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Find a Flight Mercury Tours/select_AcapulcoFrankfurtLondon'), 
    'London', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Find a Flight Mercury Tours/select_12345678910111213141516'), 
    '18', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Find a Flight Mercury Tours/select_AcapulcoFrankfurtLondon_1'), 
    'London', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Find a Flight Mercury Tours/select_AcapulcoFrankfurtLondon_2'), 
    'Portland', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Find a Flight Mercury Tours/select_No Preference'), 'Blue Skies Airlines', 
    true)

WebUI.click(findTestObject('Object Repository/Page_Find a Flight Mercury Tours/input_Airline_findFlights'))

