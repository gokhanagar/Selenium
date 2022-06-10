Feature: US1009 Datatables sitesinde 5 farkli giris yapabilmeli

  @datatables
  Scenario Outline: TC14 kullanici 5 farkli kayit girisi yapabilmeli
    When kullanici "datatablesUrl" anasayfasina
    Then new butonuna basar
    And tum bilgileri "<firstName>","<lastName>","<position>","<office>","<extension>","<startDate>","<salary>" girer
    And Create butonuna basar
    When kullanici ilk isim ile arama yapar"<firstName>"
    Then isim bolumunde isminin oldugunu dogrular"<firstName>"
    And sayfayi kapatir

    Examples:
      | firstName | lastName | position | office | extension | startDate  | salary |
      | Alim      | Alim     | QA       | ankara | UI        | 2021-10-11 | 10000  |
      | Berk      | Can      | tester   | ankara | api       | 2022-05-05  | 11000  |
      | Huseyin   | Korkmaz  | BA       | berlin | -         | 2022-07-10 | 40000  |
      | Fatih     | Sahin    | PO       | berlin | -         | 2022-03-12 | 45000  |
      | Ahmet     | Kaya     | Tester   | ankara | database  | 2022-06-03 | 11000  |