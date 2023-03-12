Feature: Amazon Search

  Scenario:TC01 kullanici amazonda kelime aratir
    Given kullanici amazon anasayfasina
    Then kullanici iphone icin arama yapar
    And sonuclarin iphone icerdigini test eder
    And sayfayi kapatir

  Scenario:TC02 kullanici amazonda tea pot aratir
    Given kullanici amazon anasayfasina
    Then kullanici tea pot icin arama yapar
    And sonuclarin tea pot icerdigini test eder
    And sayfayi kapatir

  Scenario:TC03 kullanici amazonda flower aratir
    Given kullanici amazon anasayfasina
    Then kullanici flower icin arama yapar
    And sonuclarin flower icerdigini test eder
    And sayfayi kapatir




