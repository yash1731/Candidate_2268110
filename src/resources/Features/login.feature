@handy

Feature: Test Login Funcationality
  Scenario Outline: login with invalid credential
    Given handyman browser open
    When user enter "<username>" and "<password>"
    And user click on signin button
    Then verify user should not able to login

    Examples:
    | username       |  password |
    | yash@gmail.com | yash123!  |
    |                | yash123!  |

