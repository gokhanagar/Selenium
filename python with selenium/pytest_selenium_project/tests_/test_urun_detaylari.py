import pytest, re, time
from pages.anasayfa import Anasayfa
from pages.urun_detay_sayfasi import Urun_detay_sayfasi
from selenium.webdriver.common.by import By


@pytest.mark.usefixtures("setup")
class TestUrunDetaylari:
    
    @pytest.fixture(autouse=True)
    def class_setup(self):
        self.anasayfa = Anasayfa(self.driver)
        self.urun_detay_sayfasi = Urun_detay_sayfasi(self.driver)
        
    
    
    
    
    def test_add_to_cart_button_adds_product_to_cart(self):
        self.driver.get("https://demowebshop.tricentis.com/")
        anasayfa = Anasayfa(self.driver)
        urun_detay_sayfasi = Urun_detay_sayfasi(self.driver)
        
        anasayfa.gift_card_olmayan_ilk_urun_ismine_tikla()
        #self.driver.find_element(By.XPATH,"//div[@class='item-box']//h2/a[not(contains(text(),'Gift Card'))]").click()
        
        
        oncesi = urun_detay_sayfasi.sepetteki_urun_sayisini_ver() 
        # sepetteki_urun_sayisi = self.driver.find_element(By.CSS_SELECTOR,"a.ico-cart span:nth-child(2)").text
        # sepetteki_urun_sayisi = re.findall(r'\d+', sepetteki_urun_sayisi)
        # oncesi = int(sepetteki_urun_sayisi[0])
    
    
        quantity = urun_detay_sayfasi.quantity_sayisini_ver()
        # quantity = self.driver.find_element(By.CSS_SELECTOR,"input[id$='EnteredQuantity']").get_attribute('value')
        # quantity = int(re.findall(r'\d+', quantity)[0])
        
        urun_detay_sayfasi.add_to_card_butonuna_tikla()
        #self.driver.find_element(By.CSS_SELECTOR,"input[id^='add-to-cart-button']").click()
        time.sleep(2)# sepetteki urun sayisinin degismesini bekliyor
        
        
        sonrasi = urun_detay_sayfasi.sepetteki_urun_sayisini_ver()
        # sepetteki_urun_sayisi = self.driver.find_element(By.CSS_SELECTOR,"a.ico-cart span:nth-child(2)").text
        # sepetteki_urun_sayisi = re.findall(r'\d+', sepetteki_urun_sayisi)
        # sonrasi = int(sepetteki_urun_sayisi[0])
    
        assert sonrasi == (oncesi + quantity)
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    