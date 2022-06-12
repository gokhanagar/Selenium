Feature: US1015 Web Table da istenen hucreyi yazdirma

  Scenario:TC20 kullanici sutun ile istedigi hucreye ulasabilmeli
    Given kullanici "guruUrl" anasayfasina
    And kullanici 3 saniye bekler
    Then "Company", sutunundaki tum degerleri yazdirir
    And "IDFC Bank" listede oldugunu test eder
    And sayfayi kapatir

  Scenario: TC21 kullanici istenen satir ve sutundaki yaziyi yazdirir
    Given kullanici "guruUrl" anasayfasina
    And Istenen Satir 1 , Istenen Sutun 1 daki yaziyi yazdir
    And sayfayi kapatir

  Scenario: TC22 kullanici sutun basligi ile liste alabilmeli
    Given kullanici "guruUrl" anasayfasina
    And "Current Price (Rs)", sutunundaki tum degerleri yazdirir