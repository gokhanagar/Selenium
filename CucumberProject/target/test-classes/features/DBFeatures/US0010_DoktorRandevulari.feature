Feature: US_010 Kullanici doktor olarak DB ile randevulari dogrulamali

  Scenario: Kullanici DB ile randevu bilgilerini almali ve dogrulamali
    Given Kullanici database ile baglanti kurar
    When Kullanici query tanimlar
    And  Kullanici randevu bilgilerine ulasir ve kaydeder
    Then Kullanici DB ile randevu bilgilerini "<patientId>", "<startDate>","<endDate>","<status>" dogrular

