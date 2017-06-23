Feature: As a user,
  I want to check various
     registration number.

  @Test_completed
  Scenario Outline: Register number
    Given am on the "Home page"
    And I click "Start_button"
    When I Enter car "registration number" as "<number_plate>"
    And I click "Continue_button"
    Then "Registration_number" is displayed as "<displayed_number>"

    Examples: Parameterising using different plate number
      | number_plate | displayed_number  |
      | LV57BDF      | LV57 BDF          |
      | WJ56PFD      | WJ56 PFD          |
      | EU64SVO      | EU64 SVO          |
      
