from utilities.pageBase import PageBase
from locators.locators import AramaSayfasiLocators
from selenium.webdriver.common.keys import Keys



class AramaSayfasi(PageBase):
    
    def __init__(self,driver):
        super().__init__(driver)
        self.driver = driver
        
        
    def arama_yap(self,kelime):
        arama_kutusu = self.driver.find_element(*AramaSayfasiLocators.arama_kutusu)
        arama_kutusu.send_keys(kelime)
        arama_kutusu.send_keys(Keys.ENTER)
        
        
        
    def arama_uyari_mesajini_ver(self):
        mesaj= self.driver.find_element(*AramaSayfasiLocators.arama_uyari_mesaji).text.strip()
        return mesaj    

    def aranan_urun_isimlerini_liste_ver(self):
        urunler = self.webelement_listesinden_string_listesi_ver(AramaSayfasiLocators.aranan_urunler)
        return urunler











































