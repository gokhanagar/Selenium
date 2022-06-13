Feature:US1016 explicitly wait ozelligi kullanimi

  Scenario:TC23 ilgili allertionlari kapatma
    Given kullanici "demoqaUrl" anasayfasina
    And Alerts,Frame,Windows butonuna tiklar
    And kullanici 1 sn bekler
    And Alerts'e tiklar
    And kullanici 2 sn bekler
    And On button click, alert will appear after five seconds karsisindaki click me butonuna basar
    And Allert'in gorunur olmasini bekleyin
    Then Allert uzerindeki yazinin “This alert appeared after five seconds” oldugunu test edin
    And Ok yazisina tiklayarak alerti kapatin
    And sayfayi kapatir