Feature: Admin olarak cesitli islemler yapma

  Background:
    Given medunna sayfasina gider
    When Account menu ve register butonuna tikla
    And tum bilgileri gir ve register butonuna tikla
    And account menu ve sign in butonuna tikla
    And admin olarak giris yap
    And items&titles menusu ve staff bolumune tikla
    And create a new staff butonuna tikla
    And Gerekli bilgileri doldur ve save butonuna tikla
    And Administration ve user management butonuna tikla

  Scenario: TC001-Admin, kayıtlı kişilerin "firstname, lastname, email... Gibi bilgilerini görebilmeli.
    And id butonuna tikla ve ilgili ssn icin view bolumune tikla
    Then tum bilgileri dogrula ve geri don


  Scenario: TC002-Admin kullanıcılar aktive edebilir ve rollerini "ADMIN, USER
  PATIENT, STAFF ve PHYSICIAN" olarak atayabilir.
    And id butonuna tikla ve ilgili ssn icin edit bolumune tikla
    Then kullaniciyi aktif et ve ADMIN, USER PATIENT, STAFF ve PHYSICIAN olarak atandigini dogrular

  Scenario: TC003-Admin kullanıcıları silebilir.
    Then id butonu, ilgili ssn icin delete bolumune tikla ve silindigini dogrula


