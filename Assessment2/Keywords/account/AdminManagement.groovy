package account

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class AdminManagement {
	
	@Keyword
	def NavigateToAccountsModule (){
		WebUI.waitForElementPresent(findTestObject('Page_Dashboard/i_Accounts_fa fa-angle-right p'), 30)

		WebUI.click(findTestObject('Object Repository/Page_Dashboard/i_Accounts_fa fa-angle-right p'))

		WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Accounts'))
	}
	
	@Keyword
	def createAdmin(){
		WebUI.waitForElementPresent(findTestObject('Page_Dashboard/a_Admins'), 30)
		
		WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Admins'))
		
		WebUI.waitForElementPresent(findTestObject('Page_Admins Management/button_Add'), 30)
		
		WebUI.click(findTestObject('Object Repository/Page_Admins Management/button_Add'))
		
		WebUI.waitForElementPresent(findTestObject('Page_Admins Management/input_First_Name'), 30)
	}
}
