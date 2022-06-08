#amazon sayfasina gidip sirasiyla bicycle,java,elma, armut aratip
# sonuclarin arama yaptigimiz kelimeyi icerdigini test edelim

  Feature:US1007 kullanici amazonda istedigi kelimeleri aratir
    Scenario Outline: TC12 amazonda listedeki elementleri aratma

      Given kullanici "amazonUrl" anasayfasina
      Then kullanici "<istenenKelime>" icin arama yapar
      And sonuclarin "<istenenKelime>" icerdigini test eder
      And sayfayi kapatir

      Examples:
      |istenenKelime|
      |bicycle|
      |Java|
      |elma|
      |armut|