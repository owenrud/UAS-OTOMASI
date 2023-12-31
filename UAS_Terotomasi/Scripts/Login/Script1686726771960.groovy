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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://genesis.dutatani.id/si_petani/login.php?pesan=Mohon%20Login')

WebUI.click(findTestObject('Object Repository/Page_/nav_Toggle navigation                      _5b9ed4'))

WebUI.setText(findTestObject('Object Repository/Page_/input_ID User_id_user_1'), 'tester_otomasi')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Password_password'), 'rylvSgSSGAw=')

WebUI.click(findTestObject('Object Repository/Page_/input_Password_btn btn-primary btn-lg'))

WebUI.comment('Login Gagal')

if (WebUI.verifyNotMatch(WebUI.getAttribute(findTestObject('Object Repository/Page_/input_Password_password'), 'rylvSgSSGAw='), 
    'hUKwJTbofgPU9eVlw/CnDQ==', false)) {
    WebUI.delay(1)

    WebUI.openBrowser('')

    WebUI.navigateToUrl('https://genesis.dutatani.id/si_petani/login.php?pesan=Mohon%20Login')

    WebUI.click(findTestObject('Object Repository/Page_/nav_Toggle navigation                      _5b9ed4'))

    WebUI.setText(findTestObject('Object Repository/Page_/input_ID User_id_user_1'), 'tester_otomasi')

    WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

    WebUI.click(findTestObject('Object Repository/Page_/input_Password_btn btn-primary btn-lg'))

    WebUI.delay(1)
} else {
    WebUI.closeBrowser()
}

