Feature: Review

  @webuni
  Scenario: TC17 windowlar ve alertler
    Given kullanici "webUniversityUrl" anasayfasina
    Then "login portala" kadar asagi iner
    And login portala tiklar
    And diger windowa gecer
    And username "username" yazar
    And password "password" yazar
    And Login butonuna tiklar
    And popup yazisinin "validation failed" oldugunu test eder
    And popupi ok ile kapatir
    Then ilk sayfaya doner
    And ilk sayfaya dondugunu test eder
    And sayfayi kapatir