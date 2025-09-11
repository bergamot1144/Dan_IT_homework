Feature: Check information about brand
  Scenario: Verify user can check info about brand

    Given User opens Home Page on Home Page
    When User clicks on main catalog button on Home Page
    And User clicks on Brands at the Main Catalog Page
    And User clicks on "Samsung" name at the Brand List
    And User clicks on information about "Samsung" this brand at the Side Menu
    Then User can see text about "Samsung" brand

