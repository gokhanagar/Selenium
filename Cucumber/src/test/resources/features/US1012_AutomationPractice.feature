Feature:US1012 kullanici register yapabilmeli

  Scenario: TC17 kullanici uygun datalarla register olabilmeli

    Given kullanici "automationUrl" anasayfasina
    And user sign in linkine tiklar
    And user Create and account bolumune email adresi girer
    And Create and Account butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user Register butonuna basar
    Then hesap olustugunu dogrular
    And sayfayi kapatir