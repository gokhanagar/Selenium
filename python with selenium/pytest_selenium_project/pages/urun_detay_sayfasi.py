import pytest, re, time
from selenium.webdriver.common.by import By
from locators.locators import UrunDetaySayfasiLocators
from utilities.pageBase import PageBase


class Urun_detay_sayfasi(PageBase):
    
    def __init__(self,driver):
        super().__init__(driver)
        self.driver = driver
    
    def sepetteki_urun_sayisini_ver(self):
        sepetteki_urun_sayisi = self.driver.find_element(*UrunDetaySayfasiLocators.sepetteki_urun_yazisi).text
        sepetteki_urun_sayisi = re.findall(r'\d+', sepetteki_urun_sayisi)
        return int(sepetteki_urun_sayisi[0])


    def quantity_sayisini_ver(self):
        quantity = self.driver.find_element(*UrunDetaySayfasiLocators.quantity_sayisi).get_attribute('value')
        return int(re.findall(r'\d+', quantity)[0])


    def add_to_card_butonuna_tikla(self):
        add_to_cart_button = self.wait_element_visibility(UrunDetaySayfasiLocators.add_to_cart_button)
        add_to_cart_button.click()

    def urun_ismini_ver(self):
        return self.driver.find_element(*UrunDetaySayfasiLocators.urun_ismi).text.strip()
        
        
    def urun_fiyatini_ver(self):
        return self.driver.find_element(*UrunDetaySayfasiLocators.urun_fiyati).text.strip()    
        
        
        
        
        