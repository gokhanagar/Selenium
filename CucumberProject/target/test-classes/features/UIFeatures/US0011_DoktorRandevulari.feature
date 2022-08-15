 Feature: Doktor Randevulari

  Background:
    Given Doktor medunnaURl adresine gider ve kullanici bilgileri ile giris yapar
    Then Doktor My Pages menusunde ki My Appointments butonuna tiklar

  Scenario: TC001- Yeni bir randevu oluşturulabilmeli veya mevcut bir randevu düzenlenebilmeli
    And Appointment'in gorunur oldugunu dogrula
    And Onbes gunluk tarih araligini sec
    And Zaman diliminin gorunur oldugunu dogrula
    And ilk hasta icin Edit butonuna tikla
    Then Doktor Create or Edit an Appointment sayfasina gittigini dogrular
    And Status Anamnesis Treatment Diagnosis Prescription Aspirin Description kisimlarini doldur
    And Save butonuna tikla
    And ilk hastanin tum bilgilerinin gorunur oldugunu dogrula
    Then Doktor sayfayi kapatir

  Scenario: TC_002 Bir randevu guncellendiginde hastanin Id Start DateTime End DateTime
    And ilk hasta icin Edit butonuna tikla
    Then Doktor Create or Edit an Appointment sayfasina gittigini dogrular
    And Status Anamnesis Treatment Diagnosis Prescription Aspirin Description kisimlarini doldur
    And Save butonuna tikla
    And Id Start DateTime End DateTime Status Physician Patient  bilgilerinin gorunur olgugunu dogrula
    Then Doktor sayfayi kapatir

  Scenario: TC003-Doktor gerekli alanlara "Anamnesis, Treatment ve Diagnosis" yazabilmelidir.
    And ilk hasta icin Edit butonuna tikla
    Then Doktor Create or Edit an Appointment sayfasina gittigini dogrular
    And Anamnesis Treatment Diagnosis bolumunu temizle
    And Save butonuna tikla
    And This field is required ifadelerinin goruldugunu dogrula
    Then Doktor sayfayi kapatir

  Scenario: TC004-Prescription ve Description istege bagli olmali
    And Appointment'in gorunur oldugunu dogrula
    And Onbes gunluk tarih araligini sec
    And Zaman diliminin gorunur oldugunu dogrula
    And ilk hasta icin Edit butonuna tikla
    And Doktor Create or Edit an Appointment sayfasina gittigini dogrular
    Given Prescription Description bolumunu temizle
    And Save butonuna tikla
    And Appointment'in gorunur oldugunu dogrula
    Then Doktor sayfayi kapatir

  Scenario: TC005_Status doktor tarafindan PENDING COMPLETED veya CANCELLED olarak secilebilmeli
    And Appointment'in gorunur oldugunu dogrula
    And Onbes gunluk tarih araligini sec
    And Zaman diliminin gorunur oldugunu dogrula
    And ilk hasta icin Edit butonuna tikla
    And Doktor Create or Edit an Appointment sayfasina gittigini dogrular
    Given Status kismini tikla PENDING secimini yap
    And Status kismini tikla COMPLETED secimini yap
    And Status kismini tikla CANCELLED secimini yap
    Then Doktor sayfayi kapatir



