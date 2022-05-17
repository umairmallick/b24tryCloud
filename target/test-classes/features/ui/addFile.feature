
Feature: As a user, I want to add a file as favorite

  Scenario: User should be able to add file as favourite
    Given User logs in to tryCloud app
    When User hovers to app menu and click on "Files"
    Then User should be landed to files dashboard
    And User right clicks "Unit 5 + 6 Study Guide"
    Then "Unit 5 + 6 Study Guide" should have a star sign on top of the icon
    And "Unit 5 + 6 Study Guide" should be moved to "Favorites" folder


