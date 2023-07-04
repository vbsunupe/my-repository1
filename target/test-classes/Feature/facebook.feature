Feature: Test login functionality of ecommerce app

  Scenario Outline: user should not login with invalid data
    Given user navigates to login page
    When user provide <username> and <password>
    And click on Login button.

    Examples: 
      | email                | password   |
      | "cbatest7@gmail.com" | "cba@test" |
      | "cbatest8@gmail.com" | "cb4@test" |
      | "cbatest7@gmail.com" | "cba@test" |
      | "cbatest8@gmail.com" | "cb4@test" |
