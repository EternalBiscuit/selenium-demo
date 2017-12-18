Feature: coolblue demo

  Scenario: Open website & login
    Given I go to http://www.coolblue.be/nl
    When  I log in with username test.wve@gmail.com and password Test1234
    Then  I am logged on
