Feature: Doktor randevulari

  Background:
    Given Doktor medunnaURl adresine gider ve kullanici bilgileri ile giris yapar
    Then Doktor My Pages menusunde ki My Appointments butonuna tiklar

  Scenario: TC001-Kullanıcı, randevu listesini ve zaman dilimlerini "My Appointments" sekmesinden görebilmelidir.
     And from ve to zaman dilimlerini gor
     And Kullanici randevu listesini gorebilmeli
     Then Doktor sayfayi kapatir

  Scenario: Tc002-Kullanıcı "patient id, start date, end date, status" bilgilerini görebilm
     And Kullanici hast id, start date, end date, status bilgilerini gorebilmeli
     Then Doktor sayfayi kapatir

















