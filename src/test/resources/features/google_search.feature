@google
Feature: Google search

  Scenario Outline: Search on google page
    Given I navigate to google
    When I search for "<search>"
    And I click on search button
    Then The first result should be a page named "<name>"
    Examples:
      | search    | name                            |
      | wikipedia | Wikipédia, l'encyclopédie libre |
