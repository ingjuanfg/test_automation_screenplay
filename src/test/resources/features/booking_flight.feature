Feature: Book a local flight
  I as user
  I want to search the fligths in my country
  To realize a bussiness travel

  Scenario: Buy a local flight sucessfully
    Given that Juan searchs the flight options
      | originCity    | Los Angeles               |
      | destinyCity   | New York                  |
      | flyingFrom    | Los Angeles, CA (LAX-Los Angeles Intl.) |
      | flyingTo      | New York (NYC-All Airports) |
      | departingDate | 20/05/2020                |
      | returningDate | 26/05/2020                |
    When he selects the flight
    Then he should see the ticket