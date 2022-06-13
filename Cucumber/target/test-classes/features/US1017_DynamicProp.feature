Feature: US1017 explicitly wait kullanimi

  Scenario: TC24 ilgili bekleme islemlerinin yapilmasi

    Given kullanici "demoqaUrl" anasayfasina
    And Elements butonuna tiklar
    And kullanici 1 sn bekler
    Then Dynamic Properties'e tiklar
    And kullanici 1 sn bekler
    And Will enable five sceonds butonuna tiklar
    Then Will enable five seconds butonunun enable oldugunu test eder
   # And sayfayi kapatir
