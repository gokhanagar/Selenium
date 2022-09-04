Feature: Doktor randevularini api ile dogrulayin

  Background:
    Given user given api "https://medunna.com"

  Scenario Outline: Getting specific data
    When user sends a Get request to "/api/appointments/<id>"
    Then user validates "<id>""<patienId>", "<StartDate>", "<EndDate>", "<Status>"
    Examples:
      | id     | patienId | StartDate            | EndDate              | Status  |
      | 169761 | 169369   | 2022-08-16T00:00:00Z | 2022-08-16T01:00:00Z | PENDING |


    






















