Feature: Buy products to woman
  I as user
  I want to search the woman clothes
  To buy it

  Scenario: Buy a dresses sucessfully using Strings
    Given that Maria selects the following dresses
      | popularClothes              |
      | Faded Short Sleeve T-shirts |
      | Blouse                      |
    When She goes to the cart
    And creates a profile with that information: Mrs.,Vanesa,Vanegas,123456,24,1,1993,Devco,Medellin,Medellin,Indiana,00000,Account to test automation,3334445,3334445566,vanevane
    Then she should see the message Your order on My Store is complete. as confirmation message

  Scenario: Buy a dresses sucessfully using DataTables
    Given that Maria selects the following dresses
      | popularClothes              |
      | Faded Short Sleeve T-shirts |
      | Blouse                      |
    When She goes to the cart
    And creates a profile to buy
      | title          | Mrs.                       |
      | firstName      | Vanesa                     |
      | lastName       | Vanegas                    |
      | password       | 123456                     |
      | dayBirth       | 24                         |
      | monthBirth     | 1                          |
      | yearBirth      | 1993                       |
      | company        | Devco                      |
      | address        | Medellin                   |
      | city           | Medellin                   |
      | state          | Indiana                    |
      | postalCode     | 00000                      |
      | additionalInfo | Account to test automation |
      | homePhone      | 3334445                    |
      | mobilePhone    | 3334445566                 |
      | alias          | vanevane                   |
    Then she should see the message Your order on My Store is complete. as confirmation message

  Scenario: Buy a dresses sucessfully using just DataTables
    Given that Maria selects the following dresses
      | popularClothes              |
      | Faded Short Sleeve T-shirts |
      | Blouse                      |
    When She goes to the cart
    And creates a profile to buy clothes
      | title   | firstName   | lastName   | password   | dayBirth   | monthBirth   | yearBirth   | company   | address   | city   | state   | postalCode   | additionalInfo   | homePhone   | mobilePhone   | alias   |
      | Mrs.  | Vanesa    | Vanegas  | 123456   | 24       | 1          | 1993      | Devco   | Medellin | Medellin | Indiana | 00000      | Account to test automation | 3334445   | 3334445566  | vanevane |
    Then she should see the message Your order on My Store is complete. as confirmation message

  Scenario Outline: Buy a dresses sucessfully using Examples - Datatable
    Given that Maria selects the following dresses
      | popularClothes              |
      | Faded Short Sleeve T-shirts |
      | Blouse                      |
    When She goes to the cart
    And creates a profile to buy clothes
      | title   | firstName   | lastName   | password   | dayBirth   | monthBirth   | yearBirth   | company   | address   | city   | state   | postalCode   | additionalInfo   | homePhone   | mobilePhone   | alias   |
      | <title> | <firstName> | <lastName> | <password> | <dayBirth> | <monthBirth> | <yearBirth> | <company> | <address> | <city> | <state> | <postalCode> | <additionalInfo> | <homePhone> | <mobilePhone> | <alias> |
    Then she should see the message Your order on My Store is complete. as confirmation message
    Examples:
      | title | firstName | lastName | password | dayBirth | monthBirth | yearBirth | company | address  | city     | state   | postalCode | additionalInfo             | homePhone | mobilePhone | alias    |
      | Mrs.  | Vanesa    | Vanegas  | 123456   | 24       | 1          | 1993      | Devco   | Medellin | Medellin | Indiana | 00000      | Account to test automation | 3334445   | 3334445566  | vanevane |

  Scenario: Buy a dresses sucessfully using CSV
    Given that Maria selects the following dresses
      | popularClothes              |
      | Faded Short Sleeve T-shirts |
      | Blouse                      |
    When She goes to the cart
    And creates her profile to buy
    Then she should see the message Your order on My Store is complete. as confirmation message