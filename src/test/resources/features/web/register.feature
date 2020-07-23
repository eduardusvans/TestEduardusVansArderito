@Web
Feature: Register Bukalapak Account

  Scenario Outline: Register Bukalapak Account
    Given User is on homepage
    When User tap Daftar on header on homepage
    And User is on register page
    And User input "<name>" on name input text field
    And User input "<emailOrPhone>" on email or phone input text field
    And User tap jenis kelamin male
    And User input "<username>" on username input text field
    And User input "<password>" on password input text field
    And User input "<confirmPassword>" on confirm password input text field
    And User tap checkbox confirmation
    And User tap Daftar button
    Then User is on homepage after register
    Examples:
      | name                           | emailOrPhone        | username     | password   | confirmPassword |
      | aa                             | vanstest5@gmail.com | vanstesting5 | vans12     | vans12          |
      | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | vanstest6@gmail.com | vanstest6    | vanstest12 | vanstest12      |
