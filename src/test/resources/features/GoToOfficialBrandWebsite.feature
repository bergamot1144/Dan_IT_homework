Feature: Open official brand website

  Scenario: Verify user can be navigated to the correct brand website

    Given User opens Home Page on Home Page
    When User enters "Apple" word into search field on Home Page
    And User clicks on search button on Home Page
    And User clicks on 2 product picture on Search Result Page
    And User clicks on About Product Page
    And User clicks on name of brand
    And User clicks on information about "Apple" this brand at the Side Menu
    Then User click on website and relocate there



