Feature: login to facebook page

  Scenario Outline: verify wheather the user is able to login to the application.
    Given user navigates to login page.
    When user provides <email> and <password>
    And clicks on login botton.

    Examples: 
      | email                     | password     |
      | "vishalsunupe6@gmail.com" | "Va124@5245" |
      | "vishaunupe6@gmail.com"   | "Va4@5245"   |
      | "cbatest7@gmail.com"      | "cba@test"   |
      | "cbatest8@gmail.com"      | "cb4@test"   |

  Scenario: verify if the company logo is displayed or not.
    When user navigates to login page.
    Then verify company logo is displayed or not.

  Scenario: verify the text on loginpage.
    When user navigates to Facebook login page.
    Then verify the text is "Facebook helps you connect and share with the people in your life."

  Scenario: verify the text on loginpage.
    Given user navigates to registration page.
    When user fill all details.
