$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/E2ETest.feature");
formatter.feature({
  "name": "End to End Automation Testing of Google Calendar Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create a new recurring(3 days a week) meeting, and make",
  "description": "  sure it doesn\u0027t repeat on successive days",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have launched the Calendar App",
  "keyword": "Given "
});
formatter.step({
  "name": "It is not a non working day",
  "keyword": "When "
});
formatter.step({
  "name": "Meeting is not repeated on successive days",
  "keyword": "And "
});
formatter.step({
  "name": "I want to book a meeting with the title “Recurring-Team Catch Up”",
  "keyword": "Then "
});
formatter.step({
  "name": "Set Meeting duration as \"\u003cDuration\u003e\" in the evening",
  "keyword": "And "
});
formatter.step({
  "name": "I invite \"\u003cNumber\u003e\" of people",
  "keyword": "And "
});
formatter.step({
  "name": "I save the meeting",
  "keyword": "And "
});
formatter.step({
  "name": "I Check if the meeting is created as expected",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Duration",
        "Number"
      ]
    },
    {
      "cells": [
        "2",
        "3"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create a new recurring(3 days a week) meeting, and make",
  "description": "  sure it doesn\u0027t repeat on successive days",
  "keyword": "Scenario Outline"
});
formatter.before({
  "error_message": "java.lang.NullPointerException: null value in entry: lastScrollData\u003dnull\n\tat com.google.common.collect.CollectPreconditions.checkEntryNotNull(CollectPreconditions.java:32)\n\tat com.google.common.collect.ImmutableMap.entryOf(ImmutableMap.java:175)\n\tat com.google.common.collect.ImmutableMap$Builder.put(ImmutableMap.java:284)\n\tat com.google.common.collect.ImmutableMap$Builder.put(ImmutableMap.java:298)\n\tat com.google.common.collect.ImmutableMap$Builder.putAll(ImmutableMap.java:326)\n\tat com.google.common.collect.ImmutableMap$Builder.putAll(ImmutableMap.java:309)\n\tat io.appium.java_client.HasSessionDetails.getSessionDetails(HasSessionDetails.java:38)\n\tat io.appium.java_client.HasSessionDetails.getSessionDetail(HasSessionDetails.java:42)\n\tat io.appium.java_client.HasSessionDetails.getPlatformName(HasSessionDetails.java:46)\n\tat io.appium.java_client.AppiumDriver.\u003cinit\u003e(AppiumDriver.java:100)\n\tat io.appium.java_client.AppiumDriver.\u003cinit\u003e(AppiumDriver.java:112)\n\tat io.appium.java_client.android.AndroidDriver.\u003cinit\u003e(AndroidDriver.java:73)\n\tat StepDefinitions.Hooks.setup(Hooks.java:39)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:32)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:26)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runtime.HookDefinitionMatch.runStep(HookDefinitionMatch.java:17)\n\tat cucumber.runner.UnskipableStep.executeStep(UnskipableStep.java:22)\n\tat cucumber.api.TestStep.run(TestStep.java:83)\n\tat cucumber.api.TestCase.run(TestCase.java:58)\n\tat cucumber.runner.Runner.runPickle(Runner.java:80)\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:117)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:55)\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:126)\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\n",
  "status": "failed"
});
formatter.step({
  "name": "I have launched the Calendar App",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.i_have_launched_the_Calendar_App()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "It is not a non working day",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.it_is_not_a_non_working_day()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Meeting is not repeated on successive days",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.meeting_is_not_repeated_on_successive_days()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to book a meeting with the title “Recurring-Team Catch Up”",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.i_want_to_book_a_meeting_with_the_title_Recurring_Team_Catch_Up()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Set Meeting duration as \"2\" in the evening",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.set_Meeting_duration_as_in_the_evening(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I invite \"3\" of people",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_invite_of_people(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I save the meeting",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_save_the_meeting()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I Check if the meeting is created as expected",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.i_Check_if_the_meeting_is_created_as_expected()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});