Feature:US1004 Kullanici parametre ile configuration file'i kullanabilmeli

  @config
  Scenario:TC07 configuration properties dosyasindan parametre kullanimi
    Given kullanici "twitterUrl" anasayfasina
    Then kullanici 3 saniye bekler
    And url'in "twitter" icerdigini test eder
    Then sayfayi kapatir