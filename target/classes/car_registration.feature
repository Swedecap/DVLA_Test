Feature: As a user, 
I want to check various
     registration number.

@Test_completed
Scenario Outline: Register number
Given am on the "Home page"
And I click "Start button"
When I Enter car "registration number" as "<Number_Plate>"
And I click "Continue button"
Then "Registration_number" is displayed as "<displayed_number>"

Examples: Parameterising using different plate number
| Number_Plate | Displayed_Number |
|    LV57BDF   |       LV57BDF    |
|    WJ56PFD   |       WJ56PFD    |
|    EU64SVO   |       EU64SVO    |

