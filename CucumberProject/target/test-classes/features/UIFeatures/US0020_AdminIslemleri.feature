Feature: Admin olarak cesitli islemler yapma

  Scenario: TC001-Admin, kayıtlı kişilerin "firstname, lastname, email... Gibi bilgilerini görebilmeli.
    Given medunna sayfasina gider
    When Account menu ve register butonuna tikla
    And tum bilgileri gir ve register butonuna tikla
    And account menu ve sign in butonuna tikla
    And admin olarak giris yap
    And items&titles menusu ve staff bolumune tikla
    And create a new staff butonuna tikla
    And Gerekli bilgileri doldur ve save butonuna tikla
    And Administration ve user management butonuna tikla
    And createddate butonuna tikla ve ilgili ssn icin view bolumune tikla
    Then tum bilgileri dogrula ve geri don