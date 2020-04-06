Feature: Book a local flight
  I as user
  I want to search the fligths in my country
  To realize a bussiness travel

  Scenario: Buy a local flight sucessfully
    Given that Juan searchs the flight options
      | originCity    | Los Angeles               |
      | destinyCity   | New York                  |
      | flyingFrom    | Avalon, CA (AVX-Catalina) |
      | flyingTo      | Islip, NY (ISP-MacArthur) |
      | departingDate | 06/04/2020                |
      | returningDate | 09/04/2020                |
    When he selects the flight
    Then he should see the ticket