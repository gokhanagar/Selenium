Feature: jqueryscript sitesinde bulunan emojileri secme

  @emoji
  Scenario:emoji secme
    Given kullanici "jqueryscriptUrl" anasayfasina
    Then tum ikinci emoji ogelerini tikla
    And ana iframe'e geri don
    And formu doldur ve ugula butonuna tikla
    And sayfayi kapatir