from selenium.webdriver.common.by import By



class AnasayfaLocators:
    ust_menu_linkleri = (By.CSS_SELECTOR,"ul.top-menu > li > a")
    ilk_urun_ismi = (By.CSS_SELECTOR,"div.product-item h2 a")
    ilk_gift_card_olmayan_urun_ismi = (By.XPATH,"//div[@class='item-box']//h2/a[not(contains(text(),'Gift Card'))]")
    ilk_urun_fiyati =(By.CSS_SELECTOR,"span.price.actual-price")











class UrunDetaySayfasiLocators:
    sepetteki_urun_yazisi = (By.CSS_SELECTOR,"a.ico-cart span:nth-child(2)")
    quantity_sayisi = (By.CSS_SELECTOR,"input[id$='EnteredQuantity']")
    add_to_cart_button = (By.CSS_SELECTOR,"input[id^='add-to-cart-button']")
    urun_ismi = (By.CSS_SELECTOR,"div.product-name h1")
    urun_fiyati = (By.CSS_SELECTOR,"div.product-price span")


class AramaSayfasiLocators:
    arama_kutusu = (By.CSS_SELECTOR, "input[name='q']")
    arama_uyari_mesaji = (By.CSS_SELECTOR, "div.search-results")
    aranan_urunler = (By.CSS_SELECTOR,"div.product-item h2 a")






















