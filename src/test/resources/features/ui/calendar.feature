Feature: Calendar Menu

  Background: login
    Given User logs in to tryCloud app


  Scenario: Navigation Calender
    When the user click on calenderMenu
    Then the title should be "Calendar - Trycloud"
    When  the user click on to Hamburger menu
    Then User should see & click following options
    |Day    |
    |Week   |
    |Month  |
    |List   |
