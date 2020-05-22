Feature: Tiki Order
  Scenario: Tiki Order
    Given The homepage is displayed
    When The user search product
    And The user choose item to card
    And The user checkout the card
    Then The checkout page is displayed
