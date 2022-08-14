 Feature: Doktor Randevulari

  Background:
    Given Doktor medunnaURl adresine gider ve kullanici bilgileri ile giris yapar
    Then Doktor My Pages menusunde ki My Appointments butonuna tiklar

  Scenario: TC001- Yeni bir randevu oluşturulabilmeli veya mevcut bir randevu düzenlenebilmeli
    And Appointment'in gorunur oldugunu dogrula
    And Onbes gunluk tarih araligini sec
    And Zaman diliminin gorunur oldugunu dogrula
    And ilk hasta icin Edit butonuna tikla
    And Doktor ekranin saginda gorunen edit butonuna tiklar
    Then Doktor Create or Edit an Appointment sayfasina gittigini dogrular
    And Status Anamnesis Treatment Diagnosis Prescription Aspirin Description kismlarini doldur
    And Save butonuna tikla
    And ilk hastanin tum bilgilerinin gorunur oldugunu dogrula
    Then Doktor sayfayi kapatir

  Scenario: TC_002 Bir randevu guncellendiginde hastanin Id Start DateTime End DateTime
    And Doktor ekranin saginda gorunen edit butonuna tiklar
    Then Doktor Create or Edit an Appointment sayfasina gittigini dogrular
    And Status Anamnesis Treatment Diagnosis Prescription Aspirin Description kismlarini doldur
    And Save butonuna tikla
    And Id Start DateTime End DateTime Status Physician Patient  bilgilerinin gorunur olgugunu dogrula
    Then Doktor sayfayi kapatir

  Scenario: TC003-Doktor gerekli alanlara "Anamnesis, Treatment ve Diagnosis" yazabilmelidir.
    And Doktor ekranin saginda gorunen edit butonuna tiklar
    Then Doktor Create or Edit an Appointment sayfasina gittigini dogrular
    And Anamnesis Treatment Diagnosis bolumunu temizle
    And Save butonuna tikla
    And This field is required ifadelerinin goruldugunu dogrula
    Then Doktor sayfayi kapatir

  Scenario: TC004-Prescription ve Description istege bagli olmali
    And Appointmentin gorunur oldugunu dogrula
    And Onbes gunluk tarih araligini sec
    And Zaman diliminin gorunur oldugunu dogrula
    And ilk hasta icin Edit butonuna tikla
    And Create or Edit an Appointment yazisinin gorunur oldugunu dogrula
    Given Prescription Description bolumunu temizle
    And Save butonuna tikla
    And Appointmentin gorunur oldugunu dogrula
    Then Doktor sayfayi kapatir

  Scenario: TC005_Status doktor tarafindan PENDING COMPLETED veya CANCELLED olarak secilebilmeli
    And Appointmentin gorunur oldugunu dogrula
    And Onbes gunluk tarih araligini sec
    And Zaman diliminin gorunur oldugunu dogrula
    And ucuncu hasta icin Edit butonuna tikla
    And Create or Edit an Appointment yazisinin gorunur oldugunu dogrula
    Given Status kismini tikla PENDING secimini yap
    And Save butonuna tikla
    And Statusun PENDING oldugunu dogrula
    And ilk hasta icin Edit butonuna tikla
    And Status kismini tikla COMPLETED secimini yap
    And Save butonuna tikla
    And Statusun COMPLETED oldugunu dogrula
    And ikinci hasta icin Edit butonuna tikla
    And Status kismini tikla CANCELLED secimini yap
    And Save butonuna tikla
    And Statusun CANCELLED oldugunu dogrula
    Then Doktor sayfayi kapatir



