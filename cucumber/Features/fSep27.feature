Feature: product purchase

  Background: 
    Given App is up

  @Register
  Scenario: Register
    Given Register
    And enter username and password

  @FunctionalTest @Smoke
  Scenario Outline: microwave purchase
    Given Jhon purchse a microwave for <price> doll
    And he has a recepit
    When Jhon returened the faulty product
    Then he got refund of <price> doll

    Examples: 
      | price |
      |   100 |
      |   200 |
      |   300 |

  @Regression @Smoke
  Scenario: microwave purchase
    Given Jhon purchse a microwave for 400 doll
    And he has a recepit
    When Jhon returened the faulty product
    Then he got refund of 400 doll

  @FunctionalTest @Smoke
  Scenario: microwave purchase
    Given Jhon purchse a microwave for 500 doll
    And he has a recepit
    When Jhon returened the faulty product
    Then he got refund of 500
