Feature: Fidexio logout functionality
  User Story: As a user, I should be able to log out.
  Accounts are: POS Manager, Sales Manager

  Background: User is on the login page
    Given User is on the login page

  Scenario Outline: Verify that user can click on the profile option
    When User enters username "<username>"
    And User enters password "<password>"
    And User clicks Login button
    And User click on the username on the top right
    Then User should see the drop-down menu correctly in order: "Documentation", "Support", "Preferences", "My Odoo.com account", "Log out"

    Examples: Usernames and passwords
      | username                | password     |
      | posmanager10@info.com   | posmanager   |
      | salesmanager10@info.com | salesmanager |

  @wip
  Scenario Outline: Logout function verification
    When User enters username "<username>"
    And User enters password "<password>"
    And User clicks Login button
    And User click on the username on the top right
    And User clicks Log out button
    Then User should see text at the top of the page is "Best solution for startups"

    Examples: Usernames and passwords
      | username                | password     |
      | posmanager10@info.com   | posmanager   |
      | salesmanager10@info.com | salesmanager |


