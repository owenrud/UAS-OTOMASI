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

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_/input_Password_btn btn-primary btn-lg'))

WebUI.click(findTestObject('Object Repository/Page_/a_Pendataan Petani'))

WebUI.setText(findTestObject('Object Repository/Page_/input_ID User_id_user'), '808797917')

WebUI.setText(findTestObject('Object Repository/Page_/input_Nama Petani_nama_petani'), 'Owen')

WebUI.setText(findTestObject('Page_/input_Tanggal Lahir_tanggal_lahir'), '06/06/2023')

WebUI.setText(findTestObject('Page_/input_Nama Istri  Suami_nama_istri'), 'adssasadas')

WebUI.setText(findTestObject('Object Repository/Page_/input_Alamat Petani_alamat_petani'), 'asdasds')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Provinsi                            _919ea7'), 
    'KALIMANTAN TIMUR', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_KabupatenKABUPATEN BERAUKABUPATEN KU_ad2e2e'), 
    'KABUPATEN KUTAI TIMUR', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_KecamatanMUARA ANCALONGBUSANGLONG ME_c9d7ea'), 
    'SANGATTA SELATAN', true)

WebUI.setText(findTestObject('Object Repository/Page_/input_Nomor Telepon_nomor_telpon'), '9087907879')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_SD                                  _d31312'), 
    'S2', true)

WebUI.setText(findTestObject('Object Repository/Page_/input_Jumlah Lahan_jml_lahan'), '3')

WebUI.setText(findTestObject('Object Repository/Page_/input_Jumlah Tanggungan_jumlah_tanggungan'), '5')

WebUI.setText(findTestObject('Object Repository/Page_/input_Jumlah Tenaga Kerja Musiman_jml_tng_k_49b205'), '10')

WebUI.setText(findTestObject('Object Repository/Page_/input_Email_email'), 'asdad@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Islam                               _f363b0'), 
    'Katolik', true)

WebUI.setText(findTestObject('Object Repository/Page_/textarea_Deskripsi Keahlian_deskripsi_keahlian'), 'sadadasdas')

WebUI.click(findTestObject('Object Repository/Page_/label_Aktif'))

WebUI.click(findTestObject('Object Repository/Page_/label_Laki-laki'))

WebUI.click(findTestObject('Object Repository/Page_/input_Password_btn btn-primary btn-lg'))

WebUI.click(findTestObject('Object Repository/Page_/input_Cetak Daftar_input_cari'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Cetak Daftar_input_cari'), 'Owen')

WebUI.click(findTestObject('Object Repository/Page_/input_Cetak Daftar_cari'))

WebUI.delay(10)

WebUI.comment('Insert Berhasil dan data tampil')

