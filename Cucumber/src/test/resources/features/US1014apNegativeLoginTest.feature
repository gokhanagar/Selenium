Feature: US1014 kullanici register yapamamali

  Scenario: TC19 kullanici yanlis mail adresi ile giris yapilamaz
    Given kullanici "automationUrl" anasayfasina
    And user sign in linkine tiklar
    And email kutusuna @ isareti olmayan email adresi yazar ve enter;a tiklar
    Then error mesajinin "Invalid email address" oldugunu dogrulayin