#Author: pamelavlealr@gmail.com



Feature:  feature to test adding products
 


  Scenario Outline: add products to the cart
    Given user is logged in
    When find <product>
    Then user clicks on the <product>
    And click add to cart
    Then check the cart has <product>

    Examples: 
      | product  | 
      | Sauce Labs Backpack |     
      
