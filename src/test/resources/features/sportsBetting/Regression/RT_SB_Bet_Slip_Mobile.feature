Feature: User validates all the functionalies of "Bet Slip" tab

  @MOBILE1
  Scenario Outline: User visits SportsBetting application
    Given I am on SportsBetting application
    When User login to the SportsBetting site with following credential <Username> and <Password>
    Then I should see the SportsBetting site homepage
    Examples:
      | Username | Password     |
      | SB808360 | C0d0!d_P@ss1 |


  @MOBILE
  Scenario: User verifies all the functionality of "Bet Slip" under "Left Navigator" (If bet slip is empty)
    Given I am on SportsBetting application
    And I close any add pop-up
    And Under homepage I click on Left Navigator
    When Under homepage I click on Bet Slip
    Then I see page is redirected to the Sports tab page

  @MOBILE
  Scenario: User adds a bet from "SPORTS" page under "Straight Bet"
    Given as a User, I see all the games under SPORTS page
    When I choose a team in SportsBook page
    Then I see team selected added to Straight Bet pop-up for betting

  @MOBILE
  Scenario: User places a bet from under "Straight Bet" pop-up
    Given as a User, I have already added single team under Straight Bet
    And I click Place My Bet in Straight Bet form
    And If no error is displayed
    When I confirm my straight bet
    Then I should see my "Ticket Number"

  @MOBILE
  Scenario: User adds a bet from "SPORTS" page under "Straight Bet"
    Given I am on SportsBetting application
    And I close any add pop-up
    And Under homepage I click on Left Navigator
    And Under homepage I click on Bet Slip
    And I see page is redirected to the Sports tab page
    When I choose a team in SportsBook page
    Then I see team selected added to Straight Bet pop-up for betting

  @MOBILE
  Scenario: User places a bet from under "Straight Bet" pop-up, entering value using "Risk Max Limit"
    Given as a User, I have already added single team under Straight Bet
    When I click on straight bet form Risk Max Limit
    Then I see amount automatically filled in the bet field

  @MOBILE
  Scenario: User decides to close "Straight Bet" (Clearing the single bet added)
    Given as a User, I have already added single team under Straight Bet
    When I click on bet slip Close(Icon)
    Then I see Straight Bet is closed and bet added is removed

  @MOBILE
  Scenario: User adds a bet from "SPORTS" page under "Straight Bet"
    Given I am on SportsBetting application
    And I close any add pop-up
    And Under homepage I click on Left Navigator
    When Under homepage I click on Bet Slip
    Then I see page is redirected to the Sports tab page

  @MOBILE
  Scenario: User adds more than one bet from "SPORTS" page
    Given as a User, I see teams available to bet
    And I choose a team in SportsBook page
    And I see team selected added to Straight Bet pop-up for betting
    When I click Add More Selections in Straight Bet form
    Then I choose a team from different match
    And I see Check your Bet Slip as a bar showing number of bets added

  @MOBILE
  Scenario: User accesses "Check your Bet Slip" bar displayed after clicking "Add More Selections" under "Straight Bet"
    Given as a User, I already see Check your Bet Slip bar with number of selections being displayed
    And I click on Check your Bet Slip
    When I click on single bet under Bet Slip
    Then I see page is redirected to Bet Slip page with headers
      | Single Bet     |
      | Parlays        |
      | If Bet         |
      | Action Reverse |

  @MOBILE
  Scenario: User decides to remove some teams under "Single Bet"
    Given as a User, I see Bet Slip with Single Bet
    When I click on bet slip Close(Icon)
    Then I see that particular team is removed and other team is present

  @MOBILE
  Scenario: User places bet(s) from under "Single Bet"
    Given as a User, I see Bet Slip with Single Bet
    And I click Place My Bet in Single Bet form
    And If no error is displayed
    When I confirm my straight bet
    Then I should see my "Ticket Number"

  @MOBILE1
  Scenario: User adds more than one bet from "SPORTS" page
    Given as a User, I see teams available to bet
    And I choose a team in SportsBook page
    And I see team selected added to Straight Bet pop-up for betting
    When I click Add More Selections in Straight Bet form
    Then I choose a team from different match
    And I see Check your Bet Slip as a bar showing number of bets added

  @MOBILE1
  Scenario: User accesses "Check your Bet Slip" bar displayed after clicking "Add More Selections" under "Straight Bet"
    Given as a User, I already see Check your Bet Slip bar with number of selections being displayed
    And I click on Check your Bet Slip
    When I click on single bet under Bet Slip
    Then I see page is redirected to Bet Slip page with headers
      | Single Bet     |
      | Parlays        |
      | If Bet         |
      | Action Reverse |

  @MOBILE1
  Scenario: User places bet(s) from under "Parlays"
    Given as a User, I see Bet Slip with Single Bet
    And I place a Parlay Bet
    And If no error is visible
    When I confirm my bet
    Then I should see my "Ticket Number"

  @MOBILE1
  Scenario: User adds more than one bet from "SPORTS" page
    Given as a User, I see teams available to bet
    And I choose a team in SportsBook page
    And I see team selected added to Straight Bet pop-up for betting
    When I click Add More Selections in Straight Bet form
    Then I choose a team from different match
    And I see Check your Bet Slip as a bar showing number of bets added

  @MOBILE1
  Scenario: User accesses "Check your Bet Slip" bar displayed after clicking "Add More Selections" under "Straight Bet"
    Given as a User, I already see Check your Bet Slip bar with number of selections being displayed
    And I click on Check your Bet Slip
    When I click on single bet under Bet Slip
    Then I see page is redirected to Bet Slip page with headers
      | Single Bet     |
      | Parlays        |
      | If Bet         |
      | Action Reverse |

  @MOBILE1
  Scenario: User verifies all the operations available under "If Bet"
    Given as a User, I see Bet Slip with Single Bet
    And I select If Bet (If in collapsed state)
    When I see one dropdown and two action-buttons
      | Down           |
      | Up             |
    Then I click on Down or Up and see position of team changes
    And I select If Bet (If in collapsed state)

  @MOBILE1
  Scenario: User performs any action using Down or Up buttons under "If Bet" and Place bet
    Given as a User, I see Bet Slip with Single Bet
    And I click on single bet under Bet Slip
    And I place a If bet
    And If no error is visible
    When I confirm my bet
    Then I should see my "Ticket Number"

  @MOBILE1
  Scenario: User places a Action Reverse Bet in SportsBook page
    Given I am on SportsBetting application
    And I move to SPORTS
    And I choose a team in SportsBook page
    And I click Add More Selections in Straight Bet form
    And I choose a team from different match
    And I check my Bet Slip
    And I place an Action Reverse bet
    And If no error is visible
    When I confirm my bet
    Then I should see my "Ticket Number"

  @MOBILE1
  Scenario: User adds more than one bet from "SPORTS" page
    Given as a User, I see teams available to bet
    And I choose a team in SportsBook page
    And I see team selected added to Straight Bet pop-up for betting
    When I click Add More Selections in Straight Bet form
    Then I choose a team from different match
    And I see Check your Bet Slip as a bar showing number of bets added

  @MOBILE1
  Scenario: User accesses "Check your Bet Slip" bar displayed after clicking "Add More Selections" under "Straight Bet"
    Given as a User, I already see Check your Bet Slip bar with number of selections being displayed
    And I click on Check your Bet Slip
    When I click on single bet under Bet Slip
    Then I see page is redirected to Bet Slip page with headers
      | Single Bet     |
      | Parlays        |
      | If Bet         |
      | Action Reverse |

  @MOBILE1
  Scenario: User accesses "ADD MORE SELECTIONS" under "Bet Slip"
    Given as a User, I see Bet Slip with Single Bet
    When I click ADD MORE SELECTIONS under bet slip
    Then I see page is redirected to the Sports tab page
    And I see Check your Bet Slip as a bar showing number of bets added

  @MOBILE1
  Scenario: User accesses "Delete All" under "Bet Slip"
    Given as a User, I already see Check your Bet Slip bar with number of selections being displayed
    When I click Delete All under bet slip
    Then I see page is redirected to the Sports tab page