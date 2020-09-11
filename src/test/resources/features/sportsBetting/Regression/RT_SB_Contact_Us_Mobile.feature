Feature: Validating the functionality of "CONTACT US" tab in sports betting.

#  @MOBILE
#  Scenario Outline: User visits SportsBetting application
#    Given I am on SportsBetting application
#    When User login to the SportsBetting site with following credential <Username> and <Password>
#    Then I should see the SportsBetting site homepage
#    Examples:
#      | Username | Password     |
#      | SB808360 | C0d0!d_P@ss1 |

  @MOBILE
  Scenario: User verifies all the functionalities of "Contact Us" under "Left Navigator"
    Given I am on SportsBetting application
    And as a User, I click homepage Left Navigator
    When I click on sportsBetting Contact Us
    Then I see under Rules few contact-us-options
      | General & Sports Enquiries: cssupport@SportsBetting.ag |
      | Casino Enquiries: cscasino@SportsBetting.ag            |
      | Poker Enquiries: cspoker@SportsBetting.ag              |
      | LIVE CHAT                                              |

##General & Sports Enquiries: cs@sportsbetting.ag
#  @Test
#  Scenario: User accesses "General & Sports Enquiries: cs@sportsbetting.ag" under "Contact Us" page
#    Given as a User, I see Contact us page
#    And I click on General & Sports Enquiries: cs@sportsbetting.ag
#    And I am shown with email pop-up
#    When I click on any of the email option available
#    Then I am taken to that email application
#
##Casino Enquiries: casino@sportsbetting.ag
#  @Test
#  Scenario: User accesses "Casino Enquiries: casino@sportsbetting.ag" under "Contact Us" page
#    Given as a User, I have already clicked on "Contact us" under "Left Navigator"
#    And I click on "Casino Enquiries: casino@sportsbetting.ag"
#    And I am shown with email pop-up
#    When I click on any of the email option available
#    Then I am taken to that email application
#    And I see senders email as mine email and receiver email as "casino@sportsbetting.ag" automatically filled
#
##Poker Enquiries: poker@sportsbetting.ag
#  @Test
#  Scenario: User accesses "Poker Enquiries: poker@sportsbetting.ag" under "Contact Us" page
#    Given as a User, I have already clicked on "Contact us" under "Left Navigator"
#    And I click on "Poker Enquiries: poker@sportsbetting.ag"
#    And I am shown with email pop-up
#    When I click on any of the email option available
#    Then I am taken to that email application
#    And I see senders email as mine email and receiver email as "poker@sportsbetting.ag" automatically filled

#LIVE CHAT
  @MOBILE
  Scenario: User accesses "LIVE CHAT" under "Contact Us" page
    Given as a User, I see Contact us page
    And I click on contact us page LIVE CHAT
    When a chat pop-up is opened
    Then I am shown with text Message us

  @MOBILE
  Scenario: User closes "LIVE CHAT" under "Contact Us" page
    Given as a User, I see live chat pop up
    And I click drop down under Live Chat pop up
    When I click End Chat under drop down
    Then I see Live Chat pop up closes and contact up page visible