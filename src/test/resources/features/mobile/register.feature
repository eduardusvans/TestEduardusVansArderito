@Android
#noinspection NonAsciiCharacters
Feature: Register Android sample apk

  @positive
  Scenario Outline: Register App with valid input
    Given User is on login page on mobile
    When User tap create one link text
    And User is on register page on mobile
    And User input "<name>" as name on name input text field on mobile
    And User input "<email>" as email on email input text field on mobile
    And User input "<password>" as password on password input text field on mobile
    And User input "<confirmPassword>" as confirm password on confirm password input text field on mobile
    And User tap register button on mobile
    And User get notification success
    Examples:
      | name        | email                 | password | confirmPassword |
      | vanstesting | vanssuccess@gmail.com | vans123  | vans123         |

  @negative
  Scenario Outline: Register App with invalid input
    Given User is on login page on mobile
    When User tap create one link text
    And User is on register page on mobile
    And User input "<name>" as name on name input text field on mobile
    And User input "<email>" as email on email input text field on mobile
    And User input "<password>" as password on password input text field on mobile
    And User input "<confirmPassword>" as confirm password on confirm password input text field on mobile
    And User tap register button on mobile
    And User get notification invalid email
    Examples:
      | name        | email | password | confirmPassword |
      | vanstesting | a     | vans123  | vans123         |

  @negative
  Scenario Outline: Register App with invalid input
    Given User is on login page on mobile
    When User tap create one link text
    And User is on register page on mobile
    And User input "<name>" as name on name input text field on mobile
    And User input "<email>" as email on email input text field on mobile
    And User input "<password>" as password on password input text field on mobile
    And User input "<confirmPassword>" as confirm password on confirm password input text field on mobile
    And User tap register button on mobile
    And User get notification invalid confirm password
    Examples:
      | name        | email                  | password | confirmPassword |
      | vanstesting | invalidemail@gmail.com | vans123  | vans12          |

  @negative
  Scenario Outline: Register App with invalid input
    Given User is on login page on mobile
    When User tap create one link text
    And User is on register page on mobile
    And User input "<name>" as name on name input text field on mobile
    And User input "<email>" as email on email input text field on mobile
    And User input "<password>" as password on password input text field on mobile
    And User input "<confirmPassword>" as confirm password on confirm password input text field on mobile
    And User tap register button on mobile
    Then User is on register page on mobile
    Examples:
      | name     | email                         | password | confirmPassword |
      | a        | vansz@gmail.com               | vans123  | vans123         |
      | .!       | !asda@gmail.com               | ask!@    | asz!@           |
      | zx92102@ | @kasdasd@gmail.com            | asdasdk0 | 21sa            |
      | $%@#     | adsa.asdas.asdasda.@gmail.com | asdadsa  | asdasdas        |
      | abc      | abc.abc.abc.aba.a@yahoo.com   | asd      | dsa             |




