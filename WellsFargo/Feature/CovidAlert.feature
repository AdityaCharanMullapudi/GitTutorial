@CovidAlert
Feature: Verify Covid Response Page

Scenario: Verify Covid resources and response page is displayed from Home page
Given User is on the Home page
When Alert icon is displayed on home page
And clicked on the Learn more link
Then Covid Resources and Support page should be displayed
And User should be able to navigate back to Home page.

 