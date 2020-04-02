Feature: Book a local flight
  I as user
  I want to search the fligths in my country
  To realize a bussiness travel

  Scenario: Buy a local flight sucessfully
    Given that Juan searchs the flight options
    When he selects the flight
    Then he should see the ticket