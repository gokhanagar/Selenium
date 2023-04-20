import pytest, time
from pages.arama_sayfasi import AramaSayfasi
from ddt import ddt,data, unpack
import unittest
from utilities.ExcelYardimcisi import ExcelYardimcisi


@pytest.mark.usefixtures("setup")
@ddt
class TestArama(unittest.TestCase):
    
    @data(*ExcelYardimcisi.excel_listeler_listesine_cevir("/Users/gokhanagar/python with selenium /pytest_selenium_project/testdata/arama.xlsx", "Sheet1"))
    @unpack
    def test_arama(self,senaryoturu, kelime, beklenen_mesaj):
        
        self.driver.get("https://demowebshop.tricentis.com/")
        arama = AramaSayfasi(self.driver)
        arama.arama_yap(kelime)
        
        if senaryoturu.lower() == "negatif":
            time.sleep(2)
            mesaj = arama.arama_uyari_mesajini_ver()
            assert mesaj == beklenen_mesaj
        elif senaryoturu.lower() == "pozitif":
            time.sleep(4)
            urun_isimleri = arama.aranan_urun_isimlerini_liste_ver()
            for isim in urun_isimleri:
                assert kelime.lower() in isim.lower()
        
        



































