Feature: Validating the functionality of "Rules" tab in sports betting.

#  @MOBILE
#  Scenario Outline: User visits SportsBetting application
#    Given I am on SportsBetting application
#    When User login to the SportsBetting site with following credential <Username> and <Password>
#    #Then I should see the SportsBetting site homepage
#
#    Examples:
#      | Username | Password     |
#      | SB808358 | C0d0!d_P@ss1 |

  @MOBILE
  Scenario: User verifies all the functionality of "Rules" under "Left Navigator"
    Given I am on SportsBetting application
    And Under homepage I click on Left Navigator
    When Under homepage I click on Rules
    Then I am shown with all the rules related to sportsbetting web site

  @TestB
  Scenario: User accesses pop-up under "Rules"
    Given as a User, I am already on the SportsBetting Rules page
    And I see a pop-up stating "You have not met the minumum deposit requirement for using your free play balance"
    When I click on "Close" (Icon) available on the pop-up
    Then I see, page is redirected to back to which ever page user was on prior clicking "Rules"

  @MOBILE
  Scenario: User accesses Back To Top under "Rules"
    Given as a User, I am already on the SportsBetting Rules page
    And I scroll down to Back To Top
    When I click on Rules page Back To Top
    Then I see page is scrolled to top of Rules page