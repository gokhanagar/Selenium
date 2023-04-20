import pytest
from pages.anasayfa import Anasayfa
from pages.urun_detay_sayfasi import Urun_detay_sayfasi
from selenium.webdriver.common.by import By


@pytest.mark.usefixtures("setup")
class TestHomepage:
  
  @pytest.fixture(autouse=True)
  def class_setup(self):
    self.anasayfa = Anasayfa(self.driver)
    self.urun_detay_sayfasi = Urun_detay_sayfasi(self.driver)
  
    
  def test_ust_menu_linklerini_dogrula(self):      
      
    expected_menu = ["BOOKS", "COMPUTERS", "ELECTRONICS", "APPAREL & SHOES", "DIGITAL DOWNLOADS",
                         "JEWELRY", "GIFT CARDS"]
     
     
    
    actual_menu_items = self.anasayfa.ust_menu_isimlerini_liste_ver()
      
      # elements = self.driver.find_elements(By.CSS_SELECTOR,"ul.top-menu > li > a")
      # actual_menu_items = []
      
      # for i in elements:
      #   actual_menu_items.append(i.text)
        
    for i in range(len(expected_menu)):
        assert expected_menu[i] == actual_menu_items[i]
          
          
        
  def test_urun_ismine_tiklayinca_urun_detaylari_sayfasi_acilir(self):
      self.driver.get("https://demowebshop.tricentis.com/") 
      
      
      
      urun_ismi = self.anasayfa.ilk_urun_ismini_ver()
      # ilk_urun_linki = self.driver.find_element(By.CSS_SELECTOR,"div.product-item h2 a")
      # urun_ismi = ilk_urun_linki.text
      
      urun_fiyati = self.anasayfa.ilk_urun_fiyatini_ver()
      #urun_fiyati = self.driver.find_element(By.CSS_SELECTOR,"span.price.actual-price").text
      
      self.anasayfa.ilk_urun_ismine_tikla()
      #ilk_urun_linki.click()
      
      urun_ismi_detay_sayfasi = self.urun_detay_sayfasi.urun_ismini_ver()
      #urun_ismi_detay_sayfasi = self.driver.find_element(By.CSS_SELECTOR,"div.product-name h1").text.strip()
      
      urun_fiyat_detay_sayfasi = self.urun_detay_sayfasi.urun_fiyatini_ver()
      #urun_fiyat_detay_sayfasi = self.driver.find_element(By.CSS_SELECTOR,"div.product-price span").text.strip()
      
      assert urun_ismi == urun_ismi_detay_sayfasi
      assert urun_fiyati == urun_fiyat_detay_sayfasi

      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      

