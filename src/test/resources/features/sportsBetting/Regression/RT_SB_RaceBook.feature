Feature: Validating the functionality of "Racebook" tab in sports betting.

#  @DESKTOP @MOBILE
#  Scenario Outline: User visits SportsBetting application
#    Given I am on SportsBetting application
#    When User login to the SportsBetting site with following credential <Username> and <Password>
#    Then I should see the SportsBetting site homepage
#
#    Examples:
#      | Username  | Password  |
#      | SB808358  | C0d0!d_P@ss1 |


   @DESKTOP @MOBILE
  Scenario Outline: User verifies "RACEBOOK" tab under the home page
    Given I am on SportsBetting application
    When I move to Racebook
    Then I see different <sub-tabs> under the Racebook page

    Examples:
      | sub-tabs      |
      | Racebook      |
      | Racebook Info |
      | Promotions    |

#Racebook
   @DESKTOP @MOBILE
  Scenario Outline: User verifies Racebook sub-tab under the home page
    Given as a User, I am on sportsbetting Racebook page
    When I click on Racebook sub-tab Racebook
    Then I see different <options> under the Racebook sub-tab page

    Examples:
      | options        |
      | Search         |
      | Thoroughbred   |
      | Upcoming races |
      | Bet slip       |
      | My account     |

#SEARCH
   @DESKTOP @MOBILE

  Scenario: User wants to find a race or runner or jockey using "SEARCH" box under the "Racebook" sub-tab page
     Given as a User, I am on sportsbetting Racebook page
    And I click on EXPAND if SEARCH box is in Collapsed state
    When I enter anything inside SEARCH
    Then I see results matching to entered keyword below the SEARCH box

   @DESKTOP @MOBILE
  Scenario: User searches using "ADVANCE" option under "SEARCH" sub-tab under the "Racebook" sub-tab page
    Given as a User, I am on sportsbetting Racebook page
    And I click on EXPAND if SEARCH box is in Collapsed state
    When I click on ADVANCE option
    Then I see a search pop-up with options
      | Runner or Jockey |
      | Track            |

   @DESKTOP @MOBILE
  Scenario: User searches using "Runner or Jockey" option under "ADVANCE" search pop-up
    Given as a User, I am on the ADVANCE search pop-up
    When I enter anything inside SEARCH in Runner or Jockey option with words not less than two
    Then I see results matching to entered keyword below the Runner or Jockey
    And if result fetched comes to be more than 5, I click on plus to see next page
    And if on next result section, to return I click on minus to see previous page

   @DESKTOP @MOBILE
  Scenario: User searches using "Track" option under "ADVANCE" search pop-up
    Given as a User, I am on the ADVANCE search pop-up
    When I enter anything inside SEARCH in Track option with words not less than two
    Then I see results matching to entered keyword below the Runner or Jockey
    And if result fetched comes to be more than 5, I click on plus to see next page
    And if on next result section, to return I click on minus to see previous page

   @DESKTOP @MOBILE
  Scenario: User closes the Advance search pop-up
    Given as a User, I am on the ADVANCE search pop-up
    When I click on Close
    Then I can see the Racebook sub-tab page

#My Account
   @DESKTOP
  Scenario: User hovers over "My Account" sub-tab under "Racebook" sub-tab
    Given as a User, I am on sportsbetting Racebook page
    When I hover over My Account
    Then I should see options
      | View active bets  |
      | View final bets   |
      | View race results |
      | Sign out          |


   @DESKTOP
  Scenario: User clicks on "View active bets" after hovering over "My Account" sub-tab under "Racebook" sub-tab
    Given as a User, I am on sportsbetting Racebook page
    And I hover over My Account
    When I click on View active bets
    Then I see all the acive bets under a new window

   @DESKTOP
  Scenario: User clicks on "View final bets" after hovering over "My Account" sub-tab under "Racebook" sub-tab
    Given as a User, I am on sportsbetting Racebook page
    And I hover over My Account
    When I click on View final bets
    Then I see all the final bets under a new window

   @DESKTOP
  Scenario: User clicks on "View race results" after hovering over "My Account" sub-tab under "Racebook" sub-tab
    Given as a User, I am on sportsbetting Racebook page
    And I hover over My Account
    When I click on View race results
    Then I see all the final race results below Upcoming races

   @DESKTOP
  Scenario: User selects any date under "View race results"
    Given as a User, I am see race results page
    When I click any date from date selector
    Then I see all the final race results below Upcoming races for that date chosen

   @DESKTOP @MOBILE
  Scenario: User clicks on "My Account" sub-tab under "Racebook" sub-tab
    Given as a User, I am on sportsbetting Racebook page
    When I click over My Account
    Then I should see options1
      | View active bets  |
      | View final bets   |
      | View race results |

   @MOBILE
  Scenario: User clicks on "View active bets" after clicking over "My Account" sub-tab under "Racebook" sub-tab
    Given as a User, I am on sportsbetting Racebook page
    And I click over My Account
    When I click on View active bets
    Then I see all the acive bets under a new window

   @MOBILE
  Scenario: User clicks on "View final bets" after clicking over "My Account" sub-tab under "Racebook" sub-tab
    Given as a User, I am on sportsbetting Racebook page
    And I click over My Account
    When I click on View final bets
    Then I see all the final bets under a new window

   @MOBILE
  Scenario: User clicks on "View race results" after clicking over "My Account" sub-tab under "Racebook" sub-tab
    Given as a User, I am on sportsbetting Racebook page
    And I click over My Account
    When I click on View race results
    Then I see all the final race results below Upcoming races

   @MOBILE
  Scenario: User selects any date under "View race results"
    Given as a User, I am see race results page
    When I click any date from date selector
    Then I see all the final race results below Upcoming races for that date chosen

   @DESKTOP @MOBILE
  Scenario: User accesses "Bet Slip" sub-tab under "Racebook" sub-tab
    Given as a User, I am on sportsbetting Racebook page
    When I click any jockey or runner to bet
    Then I should see selected Jockey or Runner to be displayed for betting under Bet Slip

#Remove all bets

   @DESKTOP @MOBILE
  Scenario: User removes all items from "Bet Slip" sub-tab but rejects pop-up prompt for confirmation
    Given I should see selected Jockey or Runner to be displayed for betting under Bet Slip
    And I click on Remove all bets under Bet Slip
    When I reject the pop-up by click on No
    Then I should see no item removed and Bet Slip should be intact

   @DESKTOP @MOBILE
  Scenario: User removes all items from "Bet Slip" sub-tab accepting pop-up
    Given I should see selected Jockey or Runner to be displayed for betting under Bet Slip
    And I click on Remove all bets under Bet Slip
    When I accept the pop-up by clicking on Yes
    Then I should see all the items removed and Bet Slip should be empty

   @DESKTOP @MOBILE
  Scenario: User accesses "Bet Slip" sub-tab under "Racebook" sub-tab
    Given as a User, I am on sportsbetting Racebook page
    When I click any jockey or runner to bet
    Then I should see selected Jockey or Runner to be displayed for betting under Bet Slip

   @MOBILE
  Scenario: User submits a bet accessing "Bet Slip" sub-tab
    Given I should see selected Jockey or Runner to be displayed for betting under Bet Slip
    When I click on Submit all bets
    Then I should be shown either confirmation message or failure message
    And the bet placed should be shown in Active Bets under Transactions History

  @DESKTOP
  Scenario: User submits a bet accessing "Bet Slip" sub-tab
    Given I should see selected Jockey or Runner to be displayed for betting under Bet Slip
    When I click on Submit all bets
    Then I should be shown either confirmation message or failure message
#   And the bet placed should be shown in Active Bets under Transactions History

   @DESKTOP @MOBILE
  Scenario: User accesses "Bet Slip" sub-tab under "Racebook" sub-tab
    Given as a User, I am on sportsbetting Racebook page
    When I click any jockey or runner to bet
    Then I should see selected Jockey or Runner to be displayed for betting under Bet Slip

   @DESKTOP @MOBILE
  Scenario: User wants to remove the bets under "Bet Slip" accessing "Close (Icon)" but rejects pop-up confimation
    Given I should see selected Jockey or Runner to be displayed for betting under Bet Slip
    And I click on Close under Bet Slip
    When I reject pop-up by clicking No
    Then I should see that bet should not be removed from Bet Slip

   @DESKTOP @MOBILE
  Scenario: User wants to remove the bets under "Bet Slip" accessing "Close (Icon)" accepting pop-up
    Given I should see selected Jockey or Runner to be displayed for betting under Bet Slip
    And I click on Close under Bet Slip
    When I accept pop-up by clicking Yes
    Then I should see that bet should be removed from Bet Slip

#Upcoming races
   @DESKTOP @MOBILE
  Scenario: User verifies races under "Upcoming races" header under "Racebook" sub-tab
    Given as a User, I am on sportsbetting Racebook page
    When I click on Racebook sub-tab Racebook
    Then I should be shown with all the races under Upcoming races header

   @DESKTOP @MOBILE
  Scenario: User verifies races under "Upcoming races" header under "Racebook" sub-tab
    Given as a User, I see all the upcoming races
    When I click on any upcoming race
    Then I should see selected Jockey or Runner to be displayed for betting under Bet Slip

#THOROUGHBRED(s)
   @DESKTOP @MOBILE
  Scenario: User verifies racers or jockey under "THOROUGHBRED(s)" header under "Racebook" sub-tab
    Given I am on SportsBetting application
    When I move to RACEBOOK
    Then I should be shown with all the racers or jockey under THOROUGHBRED(s) header

   @DESKTOP @MOBILE
  Scenario: User collapses racers or jockey view under "THOROUGHBRED(s)" header under "Racebook" sub-tab
    Given as a User, I am on sportsbetting Racebook page
    When I should be shown with all the racers or jockey under THOROUGHBRED(s) header
    Then I click on Minus (-) icon present in THOROUGHBRED(s)
    And I see THOROUGHBRED(s) header collapses and items went hidden

   @DESKTOP @MOBILE
  Scenario: User retract racers or jockey view under "THOROUGHBRED(s)" header under "Racebook" sub-tab
    Given I see collapsed (+) THOROUGHBRED(s) header
    When I click on Plus (+) icon present in collapsed THOROUGHBRED(s)
    Then I am shown with all the racers or jockey under THOROUGHBRED(s) header

   @DESKTOP
  Scenario: User clicks any racer or jockey under "THOROUGHBRED(s)" header under "Racebook" sub-tab
    Given as a User, I already see racers or jockeys under THOROUGHBRED(s) header
    When I click on any racer or jockey
    Then I see Races with numbers, 1 selected as default
    And I see Show race details
    And I see Add to bet slip button

   @MOBILE
  Scenario: User clicks any racer or jockey under "THOROUGHBRED(s)" header under "Racebook" sub-tab
    Given as a User, I already see racers or jockeys under THOROUGHBRED(s) header
    When I click on any racer or jockey
    Then I see Races with numbers, 1 selected as default
    And I see Streaming video header
    And I see Add to bet slip button

   @DESKTOP
  Scenario: User accesses "Show race details" under any runner or jockey selected
    Given as a User, I have already selected any racer or jockey from under THOROUGHBRED(s)
    When I click on Show race details
    Then I am shown all details related to racer or jockey in expand view

   @DESKTOP
  Scenario: User accesses "Straight" under runner or jockey selected
    Given as a User, I have already selected any racer or jockey from under THOROUGHBRED(s)
    When I see Straight selected as default
    Then I see options
      | Win   |
      | Place |
      | Show  |

   @MOBILE
  Scenario: User accesses "Straight" under runner or jockey selected
    Given as a User, I have already selected any racer or jockey from under THOROUGHBRED(s)
    When I see Straight selected as default
    Then I see options for Mobile
      | Win   |
      | Place |

   @DESKTOP @MOBILE
  Scenario: User places bet from under any racer or jockey
    Given as a User, I have already selected any racer or jockey from under THOROUGHBRED(s)
    When I enter any value under either Win or Place or Show
    Then I click on Add to bet slip
    And I see particular selection is added to the Bet Slip

#The Racebook at SportsBetting
   @DESKTOP
  Scenario Outline: User verifies "The Racebook at SportsBetting" header under "Racebook" sub-tab
    Given as a User, I am on sportsbetting Racebook page
    When I scroll down to The Racebook at SportsBetting header
    Then I should be shown with all the contents under The Racebook at SportsBetting header with <link>

    Examples:
      | link                                                        |
      | check out the horse-betting section of the sport categories |

   @DESKTOP
  Scenario: User verifies "check out the horse-betting section of the sport categories" option under "The Racebook at SportsBetting" header
    Given as a User, I already see contents under The Racebook at SportsBetting header
    When I click on check out the horse-betting section of the sport categories link
    Then I should be redirected to the SPORTS page

#Racebook Info
   @DESKTOP
  Scenario: User accesses the "Racebook Info" sub-tab under "RACEBOOK" tab
    Given as a User, I am on sportsbetting Racebook page
    When I click on Racebook sub-tab Racebook Info
    Then I should see different sub-tabs under Racebook Info sub-tab
      | How to Bet Horses |
      | Track Limits      |
      | Payoff Odds       |
      | Racebook Rules    |
      | Wagering Types    |
      | Wagering Terms    |
      | Racebook FAQs     |

   @DESKTOP
  Scenario: User accesses "How to Bet Horses" sub-tab under "Racebook Info" sub-tab
    Given I click on Racebook sub-tab Racebook Info
    When I click Racebook Info sub-tab How to Bet Horses
    Then I should see all contents under How to Bet Horses sub-tab


   @DESKTOP
  Scenario: User accesses "Track Limits" sub-tab under "Racebook Info" sub-tab
    Given I click on Racebook sub-tab Racebook Info
    When I click Racebook Info sub-tab Track Limits
    Then I should see all contents under Track Limits sub-tab


   @DESKTOP
  Scenario: User accesses "Payoff Odds" sub-tab under "Racebook Info" sub-tab
    Given I click on Racebook sub-tab Racebook Info
    When I click Racebook Info sub-tab Payoff Odds
    Then I should see all contents under Payoff Odds sub-tab

   @DESKTOP
  Scenario: User accesses "Racebook Rules" sub-tab under "Racebook Info" sub-tab
    Given I click on Racebook sub-tab Racebook Info
    When I click Racebook Info sub-tab Racebook Rules
    Then I should see all contents under Racebook Rules sub-tab

   @DESKTOP
  Scenario: User accesses "Wagering Types" sub-tab under "Racebook Info" sub-tab
    Given I click on Racebook sub-tab Racebook Info
    When I click Racebook Info sub-tab Wagering Types
    Then I should see all contents under Wagering Types sub-tab

   @DESKTOP
  Scenario: User accesses "Wagering Terms" sub-tab under "Racebook Info" sub-tab
    Given I click on Racebook sub-tab Racebook Info
    When I click Racebook Info sub-tab Wagering Terms
    Then I should see all contents under Wagering Terms sub-tab

   @DESKTOP
  Scenario: User accesses "Racebook FAQs" sub-tab under "Racebook Info" sub-tab
    Given I click on Racebook sub-tab Racebook Info
    When I click Racebook Info sub-tab Racebook FAQs
    Then I should see all contents under Racebook FAQs sub-tab

#Promotions
   @DESKTOP
  Scenario: User accesses "Promotions" sub-tab under "Racebook" sub-tab
    Given as a User, I am on sportsbetting Racebook page
    When I click on Racebook sub-tab Promotions
    Then I should see all the available promotions with options
      | Deposit Now        |
      | Terms & Conditions |

   @DESKTOP
  Scenario: User accesses "Terms & Conditions" option under "Promotions" sub-tab
    Given I click on Racebook sub-tab Promotions
    When I click on Terms & Conditions under any promotion available
    Then I should see a pop-up with all the Terms & Conditions

   @DESKTOP
  Scenario: User accesses "Deposit Now" option under "Promotions" sub-tab
    Given I click on Racebook sub-tab Promotions
    When I click on Deposit Now under any promotion available
    Then I should see a quick pop-up for credit card details same as in Cashier tab with Change Payment Method