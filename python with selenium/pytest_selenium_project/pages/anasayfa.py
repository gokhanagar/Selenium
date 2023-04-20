from selenium.webdriver.common.by import By
from locators.locators import AnasayfaLocators
from utilities.pageBase import PageBase




class Anasayfa(PageBase):
    
    def __init__(self,driver):
        super().__init__(driver)
        self.driver = driver
        
        
        
    
    def gift_card_olmayan_ilk_urun_ismine_tikla(self):
       self.driver.find_element(*AnasayfaLocators.ilk_gift_card_olmayan_urun_ismi).click() 


    def ust_menu_isimlerini_liste_ver(self):
      elements = self.driver.find_elements(*AnasayfaLocators.ust_menu_linkleri)
      actual_menu_items = []
      
      for i in elements:
        actual_menu_items.append(i.text)   
        
      return actual_menu_items 
        
    def ilk_urun_ismini_ver(self):
        ilk_urun_linki = self.driver.find_element(*AnasayfaLocators.ilk_urun_ismi)
        return ilk_urun_linki.text    
        
    def ilk_urun_fiyatini_ver(self):
        return self.driver.find_element(*AnasayfaLocators.ilk_urun_fiyati).text   
        
    def ilk_urun_ismine_tikla(self):
      ilk_urun_ismi = self.wait_element_visibility(AnasayfaLocators.ilk_urun_ismi)
      ilk_urun_ismi.click()    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        