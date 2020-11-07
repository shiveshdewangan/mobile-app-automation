Feature: iOS Calendar Application

  Scenario Outline: Create a new recurring (3 days a week) meeting that doesn't repeat on successive days
    Given I have launched the Calendar App
    Then I click on the Plus Button
    Then I enter the title as "<Title>" and "<Sequence>"
    And I enter the location as "<Location>"
    Then I set the Start Time as "<StartTime>"
    Then I select a week day for the meeting as per "<Iteration>"
    And I check the "<EndTime>" of the meeting
    Then I set weekly "<Frequency>" of the meeting
    And I save the meeting
    Then I check if the meeting is created as expected
    Examples:
      | Title                   | Location | StartTime | EndTime | Frequency | Iteration | Sequence |
      | Recurring-Team Catch Up | Sydney   | 600       | 7       | Weekly    | 0         | First    |
      | Recurring-Team Catch Up | Sydney   | 600       | 7       | Weekly    | 2         | Second   |
      | Recurring-Team Catch Up | Sydney   | 600       | 7       | Weekly    | 4         | Third    |