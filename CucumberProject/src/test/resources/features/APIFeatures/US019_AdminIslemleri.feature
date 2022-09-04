Feature: Admin randevularini api ile dogrulayin

  Background:
    Given user given api "https://medunna.com"

  Scenario: Getting specific data
    & When user send a Get request to "/api/staff/<id>"
    & Then user validates
















