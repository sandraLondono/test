@all
Feature: login in to qa labs test

  @login_success
  Scenario Outline: Login success
    When enter login credentials "<username>" "<password>"
    Then i can see the home page
    Examples:
      | username | password         |
      | qatester | N9j^u9&Hm@dz2Kcs |