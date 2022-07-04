@FIDEX-423
Feature: Fidexio logout functionality
  User Story: As a user, I should be able to log out.
  Accounts are: POS Manager, Sales Manager

  #Background: User is on the login page
   # Given User is on the login page

  @FIDEX-420
  Scenario Outline: Verify that user can click on the profile option
    Given User is on the login page
    When User enters username "<username>"
    And User enters password "<password>"
    And User clicks Login button
    And User clicks on the username on the top right
    Then User should see the drop-down menu correctly in order: "Documentation", "Support", "Preferences", "My Odoo.com account", "Log out"

    Examples: Usernames and passwords
      | username                | password     |
      | posmanager10@info.com   | posmanager   |
      | salesmanager10@info.com | salesmanager |

  @FIDEX-421
  Scenario Outline: Verify that user can log out
    Given User is on the login page
    When User enters username "<username>"
    And User enters password "<password>"
    And User clicks Login button
    And User clicks on the username on the top right
    And User clicks Log out button
    Then User should see text at the top of the page is "Best solution for startups"

    Examples: Usernames and passwords
      | username                | password     |
      | posmanager10@info.com   | posmanager   |
      | salesmanager10@info.com | salesmanager |

  @FIDEX-422
  Scenario Outline: Verify that user can not go to the home page again after logged out
    Given User is on the login page
    When User enters username "<username>"
    And User enters password "<password>"
    And User clicks Login button
    And User clicks on the username on the top right
    And User clicks Log out button
    When User clicks the step back button
    Then User should see error message "Your Odoo session expired. Please refresh the current web page."

    Examples: Usernames and passwords
      | username                | password     |
      | posmanager10@info.com   | posmanager   |
      | salesmanager10@info.com | salesmanager |
