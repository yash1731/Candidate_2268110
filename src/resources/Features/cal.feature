@smoke
Feature: feature to test calculator function

  Scenario: test add function
    Given click on digit7 number
    When click on add button
    And click on digit8 number
    Then verify result

#  @smoke1
#  Scenario Outline: test add function
#    Given click on <number1>
#    And click on <number2>
#    When click on add button
#    Then verify result
#
#    Examples:
#    | number1 | number2 |
#    |  10     |  20     |