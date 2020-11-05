Feature: End to End Automation Testing of Google Calendar Application

  Scenario Outline: Create a new recurring(3 days a week) meeting, and make
  sure it doesn't repeat on successive days
    Given I have launched the Calendar App
    When It is not a non working day
    And Meeting is not repeated on successive days
    Then I want to book a meeting with the title “Recurring-Team Catch Up”
    And Set Meeting duration as "<Duration>" in the evening
    And I invite "<Number>" of people
    And I save the meeting
    Then I Check if the meeting is created as expected
    Examples:
    | Duration | Number |
    | 2        | 3      |
