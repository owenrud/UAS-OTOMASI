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

WebUI.setText(findTestObject('Object Repository/Page_/input_ID User_id_user_1'), 'tester_otomasi')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_/input_Password_btn btn-primary btn-lg'))

WebUI.click(findTestObject('Object Repository/Page_/a_Pendataan Petani'))

WebUI.setText(findTestObject('Object Repository/Page_/input_ID User_id_user'), '1231312331')

WebUI.setText(findTestObject('Object Repository/Page_/input_Nama Petani_nama_petani'), 'asdadsas')

WebUI.click(findTestObject('Object Repository/Page_/input_Nama Istri  Suami_nama_istri'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Nama Istri  Suami_nama_istri'), 'sdsdasfsdf')

WebUI.setText(findTestObject('Object Repository/Page_/input_Alamat Petani_alamat_petani'), 'dfafdas')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Provinsi                            _919ea7'), 
    'KEPULAUAN BANGKA BELITUNG', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_KabupatenKABUPATEN BANGKAKABUPATEN B_0a108f'), 
    'KABUPATEN BANGKA SELATAN', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_KecamatanPAYUNGPULAU BESARSIMPANG RI_8dffd5'), 
    'TOBOALI', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Desa  KelurahanBIKANGGADUNGJERIJIKAP_85a92b'), 
    'RINDIK', true)

WebUI.setText(findTestObject('Object Repository/Page_/input_Nomor Telepon_nomor_telpon'), '879789879978')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_SD                                  _d31312'), 
    'D2', true)

WebUI.setText(findTestObject('Object Repository/Page_/input_Jumlah Lahan_jml_lahan'), '10')

WebUI.setText(findTestObject('Object Repository/Page_/input_Jumlah Tanggungan_jumlah_tanggungan'), '5')

WebUI.setText(findTestObject('Object Repository/Page_/input_Jumlah Tenaga Kerja Musiman_jml_tng_k_49b205'), '20')

WebUI.setText(findTestObject('Object Repository/Page_/input_Email_email'), 'sadhasdashio@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Islam                               _f363b0'), 
    'Kristen', true)

WebUI.setText(findTestObject('Object Repository/Page_/textarea_Deskripsi Keahlian_deskripsi_keahlian'), 'asdosadbodia')

WebUI.click(findTestObject('Object Repository/Page_/label_Aktif'))

WebUI.click(findTestObject('Object Repository/Page_/label_Laki-laki'))

WebUI.click(findTestObject('Object Repository/Page_/input_Password_btn btn-primary btn-lg'))

WebUI.closeBrowser()

