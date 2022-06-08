Feature: US1003 kullanici parametre kullanarak arama yapabilmeli

  @parametre
  Scenario: TC06 kullanici parametre ile amazonda arama yapabilmeli
    Given kullanici amazon anasayfasina
    Then kullanici "bicycle" icin arama yapar
    And sonuclarin "bicycle" icerdigini test eder
    And sayfayi kapatir