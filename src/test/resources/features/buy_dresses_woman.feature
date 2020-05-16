Feature: Buy products to woman
  I as user
  I want to search the woman clothes
  To buy it

  Scenario: Buy a dresses sucessfully
    Given that Maria selects the following dresses
      | popularClothes              |
      | Faded Short Sleeve T-shirts |
      | Blouse                      |
    When She goes to the cart
    And creates a profile to buy
    Then She should see a confirmation message

#  @Manual
#  Scenario: Buy a dresses sucessfully
#    Given that Maria selects the following dresses
#      | popularClothes     | Faded Short Sleeve T-shirts |
#      | bestSellersClothes | Blouse                      |
#    When She goes to the cart
#    And creates a profile to buy
#    Then She should see a confirmation message
