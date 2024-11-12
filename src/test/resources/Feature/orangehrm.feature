@MyInfoSaveScenario 
Feature: Testing My Info contact details page in Orange HRM
  User will be able to enter contact details in HRM application

@contactdeatils  @sampleTest
  Scenario: Entering Adress details
  
  Given user is login to Orange HRM application with "Admin" and "admin123"
  When user navigates to contact details page in Orange HRM application
  And user enters Street 1 details in street 1 field under Adress section in Orange HRM application
  And user enters Street 2 details in street 2 field under Adress section in Orange HRM application
  And user enters City details in City field under Adress section in Orange HRM application
  And user enters Zip/Postal Code details in Zip/Postal Code field under Adress section in Orange HRM application
  And user enters Mobile details in Mobile field under Telephone section in Orange HRM application
  When user clicks the save button
  Then successfully updated message should be displayed
   