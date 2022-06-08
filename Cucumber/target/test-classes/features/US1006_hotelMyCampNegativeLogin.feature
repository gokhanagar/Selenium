# hotel my camp sitesinde 3 adet negative test senaryosu olusturalim
#1- dogru username- yanlis password
#2- yanlis username-dogru password
#3- yanlis username-yanlis password

Feature:US1006 yanlis bilgilerle siteye giris yapilamaz

  Background: ortak adim
    Given kullanici "hmcUrl" anasayfasina
    Then Login yazisina tiklar

  Scenario:TC09 yanlis password ile giris yapilamaz
    And gecerli username girer
    And gecersiz password "HMCWrongPassword" girer
    And login butonuna basar
    Then sayfaya giris yapilamadigini test eder
    And sayfayi kapatir

  Scenario:TC10 yanlis username ile giris yapilamaz
    And gecersiz username "HMCWrongUsername" girer
    And gecerli password girer
    And login butonuna basar
    Then sayfaya giris yapilamadigini test eder
    And sayfayi kapatir

  Scenario:TC11 yanlis username ve password ile giris yapilamaz
    And gecersiz username "HMCWrongUsername" girer
    And gecersiz password "HMCWrongPassword" girer
    And login butonuna basar
    Then sayfaya giris yapilamadigini test eder
    And sayfayi kapatir










