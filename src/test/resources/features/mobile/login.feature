@Android
#noinspection NonAsciiCharacters
Feature: Login Android sample apk

  Background:
    Given User is on login page
    When User tap create one link text
    And User is on register page on mobile
    And User input "vans" as name on name input text field on mobile
    And User input "vans@gmail.com" as email on email input text field on mobile
    And User input "vans123" as password on password input text field on mobile
    And User input "vans123" as confirm password on confirm password input text field on mobile
    And User tap register button on mobile
    And User tap login text link
    Then User is on login page on mobile

  Scenario Outline: Login App
    Given User is on login page on mobile
    When User input "<email>" on email input text field on mobile
    And User input "<password>" on password input text field on mobile
    And User tap login button on mobile
    Then User is on home page on mobile
    Examples:
      | email            | password |
        #positive
      | vans@gmail.com   | vans123  |
        #negative
      | a@b.             | vans123  |
      | a                | a        |
      | !sasda@gmail.com | a        |
      | a v              | a v      |
      | 1                | 1        |
      | Vans😎           | ssa      |
      | .!               | .sa      |




