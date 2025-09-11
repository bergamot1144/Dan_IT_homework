Feature: Product Details Page function verification

  Scenario: Verify user can be navigated to the correct product page
    Given User opens Home Page on Home Page
    When User enters "Xbox" word into search field on Home Page
    And User clicks on search button on Home Page
    And User remember 2 product name on Search Result Page
    And User clicks on 2 product picture on Search Result Page
    Then User verify product title is correct on Producty Details Page
