Feature: Admin olarak cesitli islemler yapma

  Scenario: TC001-Admin SSN kullanarak; kayıtlı kişiler arasında Staff arayabilir.
    Given medunna sayfasina gider
    When Account menu ve register butonuna tikla
    And tum bilgileri gir ve register butonuna tikla
    And account menu ve sign in butonuna tikla
    And admin olarak giris yap
    And Administration ve user management butonuna tikla
    And id butonuna tikla ve ilgili ssn'nin var oldugunu dogrula

  Scenario: TC002-Tüm bilgileri doldurulmalıdır
    Given medunna sayfasina gider
    When Account menu ve register butonuna tikla
    And tum bilgileri gir ve register butonuna tikla
    And account menu ve sign in butonuna tikla
    And admin olarak giris yap
    And items&titles menusu ve staff bolumune tikla
    And create a new staff butonuna tikla
    And Gerekli bilgileri doldur ve save butonuna tikla
    And Administration ve user management butonuna tikla
    And id butonuna tikla ve ilgili ssn'nin var oldugunu dogrula

  Scenario: TC003-Admin kayıtlı kişilerden bir kullanıcı seçebilir.
    Given medunna sayfasina gider
    When Account menu ve register butonuna tikla
    And tum bilgileri gir ve register butonuna tikla
    And account menu ve sign in butonuna tikla
    And admin olarak giris yap
    And items&titles menusu ve staff bolumune tikla
    And create a new staff butonuna tikla
    And Gerekli bilgileri doldur ve save butonuna tikla
    And Administration ve user management butonuna tikla
    And id butonuna tikla ve ilgili ssn icin view bolumune tikla
    Then tum bilgileri dogrula ve geri don

  Scenario: TC004-Admin kullanıcı bilgilerini düzenleyebilir.
    Given medunna sayfasina gider
    When Account menu ve register butonuna tikla
    And tum bilgileri gir ve register butonuna tikla
    And account menu ve sign in butonuna tikla
    And admin olarak giris yap
    And items&titles menusu ve staff bolumune tikla






























