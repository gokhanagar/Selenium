@grid_feature
  Feature: grid_feature
    @grid_chrome
    Scenario: TC01_running_on_chrome
      Given user is on the application_URL with chrome
      And verify the title of the page is "Blue Rental Car | Just another WordPress site"
      Then close the remote driver

    @grid_firefox
    Scenario: TC02_running_on_chrome
      Given user is on the application_URL with firefox
      And verify the title of the page is "Blue Rental Car | Just another WordPress site"
      Then close the remote driver