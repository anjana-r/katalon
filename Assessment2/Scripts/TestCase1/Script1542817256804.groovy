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

WebUI.openBrowser('')

WebUI.navigateToUrl(adminUrl)

CustomKeywords.'account.Common.Login'(username, password)

CustomKeywords.'account.AdminManagement.NavigateToAccountsModule'()

CustomKeywords.'account.AdminManagement.createAdmin'()

not_run: WebUI.click(findTestObject('Object Repository/Page_Add Admin/ins_Hotels_iCheck-helper'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Add Admin/ins_Tours_iCheck-helper'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Add Admin/ins_Cars_iCheck-helper'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Add Admin/ins_Bookings_iCheck-helper'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Add Admin/ins_Locations_iCheck-helper'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Add Admin/ins_Hotels_iCheck-helper'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Add Admin/ins_Tours_iCheck-helper'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Add Admin/ins_Cars_iCheck-helper'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Add Admin/ins_Bookings_iCheck-helper'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Add Admin/ins_Locations_iCheck-helper'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Add Admin/ins_Hotels_iCheck-helper'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Add Admin/label_Tours'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Add Admin/label_Cars'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Add Admin/label_Bookings'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Add Admin/label_Locations'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Add Admin/button_Submit'))

