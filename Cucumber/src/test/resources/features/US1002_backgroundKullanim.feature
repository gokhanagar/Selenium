@vip
Feature:US1002 Kullanici ortak adimlari Background ile calistirir

  Background: ortak adim
    Given kullanici amazon anasayfasina

  Scenario: TC04 amazon Java arama
    And kullanici tea pot icin arama yapar
    Then sonuclarin tea pot icerdigini test eder
    And sayfayi kapatir

  Scenario:TC05 amazon iphone arama
    And kullanici iphone icin arama yapar
    Then sonuclarin iphone icerdigini test eder
    And sayfayi kapatir