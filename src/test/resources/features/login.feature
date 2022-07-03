@FIDEX-390 #execution nr
Feature: Fidexio login functionality
  User Story: As a user, I should be able to log in so that I can land on homepage.
  Accounts are: POS Manager, Sales Manager

#  Background: User is on the login page
#    Given User is on the login page

  @FIDEX-380 #TC1
  Scenario: Login page verification
    When User is on the login page
    Then User should see text at the top of the page is "Best solution for startups"

  @FIDEX-381 #TC2
  Scenario Outline: Verify that user can login as POS Manager
    Given User is on the login page
    When User enters POS Manager username "<username>"
    And User enters POS Manager password "<password>"
    And User clicks Login button
    Then User should see the home page and username "<username>" on the top right

    Examples: Valid Credentials
      | username               | password   |
      | posmanager10@info.com  | posmanager |
      | posmanager15@info.com  | posmanager |
      | posmanager28@info.com  | posmanager |
      | posmanager56@info.com  | posmanager |
      | posmanager109@info.com | posmanager |

  @FIDEX-382 #TC3
  Scenario Outline: Verify that user can login as Sales Manager
    Given User is on the login page
    When User enters Sales Manager username "<username>"
    And User enters Sales Manager password "<password>"
    And User clicks Login button
    Then User should see the home page and username "<username>" on the top right

    Examples: Valid Credentials
      | username                | password     |
      | salesmanager10@info.com | salesmanager |
      | salesmanager25@info.com | salesmanager |
      | salesmanager38@info.com | salesmanager |
      | salesmanager76@info.com | salesmanager |
      | salesmanager99@info.com | salesmanager |


  @FIDEX-383 #TC4
  Scenario Outline: Error message verification when invalid credentials are entered
    Given User is on the login page
    When User enters invalid username "<invalid_username>"
    And User enters valid password "<valid_password>"
    And User clicks Login button
    Then User should see "Wrong login/password" on the page

    Examples: Valid Credentials
      | invalid_username         | valid_password |
      | salesmanager1@info.com   | salesmanager   |
      | posmanager1@info.com     | posmanager     |
      | salesmanager35@@info.com | salesmanager   |
      | posmanager45@@info.com   | posmanager     |
      | salesmanager77@info.co   | salesmanager   |
      | posmanager88@info.co     | posmanager     |
      | salesmanager101@infocom  | salesmanager   |
      | posmanager99@infocom     | posmanager     |
      | asdfghjklwe15@info.com   | salesmanager   |
      | asdfghjklw15@info.com    | posmanager     |
      | salesmanager15info.com   | salesmanager   |
      | posmanager15info.com     | posmanager     |


  @FIDEX-384 #TC5
  Scenario Outline: Error message verification when invalid credentials are entered
    Given User is on the login page
    When User enters valid username "<valid_username>"
    And User enters invalid password "<invalid_password>"
    And User clicks Login button
    Then User should see "Wrong login/password" on the page

    Examples: Valid Credentials
      | valid_username          | invalid_password |
      | salesmanager10@info.com | salesmanage      |
      | posmanager15@info.com   | posmanage        |
      | salesmanager38@info.com | salesmanager38   |
      | posmanager76@info.com   | posmanager76     |
      | salesmanager99@info.com | SALESMANAGER     |

  @FIDEX-385 #TC6
  Scenario Outline: Error message verification when the password or username is empty
    Given User is on the login page
    When User enters only username "<username>"
    And User clicks Login button
    Then User should see message "Fülle dieses Feld aus." on the password box

    Examples: Usernames
      | username                |
      | salesmanager25@info.com |
      | posmanager15@info.com   |

  @FIDEX-386 #TC7
  Scenario Outline: Error message verification when the password or username is empty
    Given User is on the login page
    When User enters only password "<password>"
    And User clicks Login button
    Then User should see message "Fülle dieses Feld aus." on the username box

    Examples: Passwords
      | password     |
      | salesmanager |
      | posmanager   |

  @FIDEX-387 #TC8
  Scenario: 'Reset Password' page verification
    Given User is on the login page
    When User clicks Reset Password button
    Then User should see Reset Password page

  @FIDEX-388 #TC9
  Scenario: Verification that the password is in bullet signs by default
    Given User is on the login page
    When User enters a password "password" in the password box
    Then User should see password in bullet signs by default

  @FIDEX-389 #TC10
  Scenario Outline: Verify if the 'Enter' key of the keyboard is working correctly on the login page
    Given User is on the login page
    When User enters username "<username>"
    And User enters password "<password>"
    And User press the Enter key
    Then User should see the home page and username "<username>" on the top right

    Examples: Valid Credentials
      | username                | password     |
      | salesmanager10@info.com | salesmanager |
      | posmanager10@info.com   | posmanager   |

