@all
Feature: validate media in to qa labs test

  @media
  Scenario Outline: Login success
    Given enter login credentials "<username>" "<password>"
    When i go to media page
    Then i can see the properties related "<size>" "<id>" "<description>"
    Examples:
      | username | password         | size   | id   | description          |
      | qatester | N9j^u9&Hm@dz2Kcs | 1.02MB | MD-5 | Tekus horizontal.png |