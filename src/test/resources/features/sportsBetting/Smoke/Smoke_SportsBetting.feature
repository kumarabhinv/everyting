Feature: Smoke - Sports Betting

  @DESKTOP
  Scenario Outline: User sign up to the SportsBetting application

    Given I am on SportsBetting application
    And I move to <Join Tab>
    And I enter following details <FirstName>, <LastName>, <Email>, <Password>, <Country>, <Zip>, <PhoneNumber>, <DOB>
    When I click Create Account
    Then I should see SportsBetting Welcome page
    Examples:
      | FirstName | Join Tab | LastName           | Email              | Password  | Country | Zip   | PhoneNumber | DOB      |
      | TestUser  | JOIN     | TestingUser_RANDOM | TestingUser_RANDOM | Password1 | India   | 98104 | 9876543210  | 11021992 |

  @MOBILE
  Scenario Outline: User sign up to the SportsBetting application

    Given I am on SportsBetting application
    And I select Join option
    And I enter following details <FirstName>, <LastName>, <Email>, <Password>, <Country>, <Zip>, <PhoneNumber>, <DOB>
    When I click Create Account
    Then I should see SportsBetting Welcome page
    Examples:
      | FirstName | LastName           | Email              | Password  | Country | Zip   | PhoneNumber | DOB      |
      | TestUser  | TestingUser_RANDOM | TestingUser_RANDOM | Password1 | India   | 98104 | 9876543210  | 11021992 |

  @TABLET
  Scenario Outline: User sign up to the SportsBetting application

    Given I am on SportsBetting application
    And I select Join option
    And I enter following details <FirstName>, <LastName>, <Email>, <Password>, <Country>, <Zip>, <PhoneNumber>, <DOB>
    When I click Create Account
    Then I should see SportsBetting Welcome page
    Examples:
      | FirstName | LastName           | Email              | Password  | Country | Zip   | PhoneNumber | DOB      |
      | TestUser  | TestingUser_RANDOM | TestingUser_RANDOM | Password1 | India   | 98104 | 9876543210  | 11021992 |

  @DESKTOP

  Scenario Outline: User navigates through SportsBetting application's Tabs(Without Login)
    Given I am on SportsBetting application
    When I move to <Tab>
    Then I should see details related to selected <Tab>

    Examples:
      | Tab          |
      | SPORTS       |
      | Promotions   |
      | CASHIER      |
      | Live Betting |
      | Black        |
      | Red          |
      | Casino       |
      | Poker        |
      | Racebook     |
      | ESPORTS      |
      | CONTESTS     |

#  Scenario Outline: User navigates through SportsBetting application's Tabs(Without Login)
#    Given I am on SportsBetting application
#   When I navigate to Livecasino's <SubTab>
#    Then I should see details related to selected <Tab>
#
#    Examples:
#    |SubTab     |
#    |Black      |
#    |Red        |

  @DESKTOP @MOBILE @TABLET
  Scenario Outline: User visits SportsBetting application
    Given I am on SportsBetting application
    When User login to the SportsBetting site with following credential <Username> and <Password>
    Then I should see the SportsBetting site homepage

    Examples:
      | Username | Password  |
      | SB808349 | Password1 |

  @DESKTOP
  Scenario Outline: User navigates through SportsBetting application's Tabs (With Login)

    Given I am on SportsBetting application
    When I move to <Tab>
    Then I should see details related to selected <Tab>


    Examples:
      | Tab          |
      | SPORTS       |
      | Promotions   |
      | CASHIER      |
      | Live Betting |
      | Casino       |
      | Black        |
      | Red          |
      | Poker        |
      | Racebook     |
      | ESPORTS      |
      | CONTESTS     |

  @TABLET
  Scenario Outline: User navigates through SportsBetting application's Tabs (With Login)
    Given I am on SportsBetting application
    When I move to <Tab>
    Then I should see details related to selected <Tab>

    Examples:
      | Tab          |
      | SPORTS       |
      | DEPOSIT      |
      | Live         |
      | Casino       |
      | LIVE CASINO  |
      | Racebook     |
      | E-SPORTS     |
      | Player Props |


  @MOBILE
  Scenario Outline: User navigates through SportsBetting application's Tabs (With Login)

    Given I am on SportsBetting application
    When I move to <Tab>
    Then I should see details related to selected <Tab>

    Examples:
      | Tab            |
      | SPORTS         |
      | LIVE           |
      | CASINO         |
      | PLAYER PROPS   |
      | BLACK          |
      | RED            |
      | CLASSIC CASINO |
      | RACEBOOK       |
      | ESPORTS        |
      | POKER          |

  @DESKTOP
  Scenario: User view the Quick Deposit Pop-up while clicking on Deposit Funds
    Given As a SportBetting user, I am on home page
    When I navigate to "Deposit Funds" field in My Account page
    Then I should see the Quick Deposit Pop-up
    And I close the Quick Deposit Pop-up

  @DESKTOP @TABLET @MOBILE
  Scenario: User view the Account Profile when clicking on My Profile
    Given I am on SportsBetting application
    And I click on My Account link
    When I click My Profile
    Then I should see the Account Profile


  @DESKTOP
  Scenario: User Review payouts history and Request a New Payout in Payouts
    Given I am on SportsBetting application
    And I click on My Account link
    When I click payouts history
    Then I should see the payout history
    And I click Request a New Payout
    And I should see Withdraw Page

  @DESKTOP @TABLET @MOBILE
  Scenario: User Review the pending wagers in the My Account window
    Given I am on SportsBetting application
    And I click on My Account link
    When I click Pending wagers
    Then I should see Pending wagers

  @DESKTOP @TABLET @MOBILE
  Scenario: User Review the graded wagers in the My Account window
    Given I am on SportsBetting application
    And I click on My Account link
    When I click Graded wagers
    Then I should see Graded wagers

  @DESKTOP @TABLET @MOBILE
  Scenario: User Review the all transactions in the My Account window
    Given I am on SportsBetting application
    And I click on My Account link
    When I click Transaction History
    Then I should see Transaction History

  @DESKTOP @TABLET @MOBILE
  Scenario: User Review the Daily Figures in the account
    Given I am on SportsBetting application
    And I click on My Account link
    When I click Daily Figures
    Then I should see all the daily figures of the account

  @DESKTOP @TABLET @MOBILE
  Scenario: User send a new message and view a message history in My Account page
    Given I am on SportsBetting application
    And I click on My Account link
    When I send a new message
    Then I should see the messages history

  @DESKTOP
  Scenario: User Review the Freeplay history in the account
    Given I am on SportsBetting application
    And I click on My Account link
    When I click My Freeplay
    Then I should see the freeplay history

  @DESKTOP
  Scenario: User Review the bets Limits
    Given I am on SportsBetting application
    And I click on My Account link
    And I click Limit Information
    When I select the sport in the limit information page
    Then I should see Limit Information table


  @DESKTOP
  Scenario: User Review calculation to place bet
    Given I am on SportsBetting application
    And I click on My Account link
    When I click Bet Calculator
    Then I should see calculation in order to place a bet

  @DESKTOP
  Scenario: User Review the games schedules
    Given I am on SportsBetting application
    And I click on My Account link
    When I click Sports Schedules
    Then I should see games schedules information

  @DESKTOP
  Scenario: User Review explanation to place bets
    Given I am on SportsBetting application
    And I click on My Account link
    When I click How to Bet Online
    Then I should see information to know how to place a bet

  @DESKTOP
  Scenario: User Access the affiliate program in my account
    Given I am on SportsBetting application
    When I navigate to "Affiliate Program" field in My Account page
    Then I should redirects to affiliate programs page

  @DESKTOP
  Scenario Outline: User Exit cashier by clicking X button
    Given I am on SportsBetting application
    When I move to <Cashier tab>
    When I click Exit Cashier
    Then I should see the SportsBetting site homepage

    Examples:
      | Cashier tab |
      | CASHIER     |


  @DESKTOP
  Scenario: User Review More deposit Options
    Given I am on SportsBetting application
    And I move to CASHIER
    When I click on View More Options
    Then I should see the more deposit Options
# Then I should see the more deposit Options

  @DESKTOP
  Scenario: User Review Credit Card Page
    Given I am on SportsBetting application
    And I move to CASHIER
    When I click on Credit Card
    Then I should see the credit card page

  @DESKTOP
  Scenario: User Go back to cashier Page from Credit Card Page
    Given I am on SportsBetting application
    And I move to CASHIER
    And I click on Credit Card
    When I click on Back button in Credit Card Page
    Then I should see the credit card page

  @DESKTOP
  Scenario: User Review Payout Page
    Given I am on SportsBetting application
    And I move to CASHIER
    When I click Request New Icon in Withdrawal options
    Then I should see the Payout Page

  @DESKTOP
  Scenario: User visits Contact Us page
    Given I am on SportsBetting application
    When I selects Contact Us page
    Then I should see the contact us page

  @DESKTOP
  Scenario: User open Live Chat window
    Given I am on Contact Us page
    When I click on Live chat link
    Then I should see the live chat window prompt

  @DESKTOP @TABLET @MOBILE
  Scenario Outline: User place a bet in Sports page
    Given I am on SportsBetting application
# Given As a SportsBetting user, I login with following credential <Username> and <Password>
    And I move to <Sports Tab>
    And I choose a team in SportsBook page
    And I click Place My Bet in Straight Bet form
    When I confirm my straight bet
    Then I should see my "Ticket Number"

    Examples:
      | Sports Tab |
      | SPORTS     |

#  @DESKTOP
#  Scenario: User places a live bet in LiveBetting page
#    Given I am on SportsBetting application
#    And I select live betting tab
#    And I choose a team from LIVE ODDS section
#    When I Place My Bet in Bet Slip
#    Then I should see confirmation popup


  @TABLET @MOBILE
  Scenario: User places a Parlay Bet in SportsBook page
    Given I am on SportsBetting application
    And I move to SPORTS
    And I choose a team in SportsBook page
    And I click Add More Selections in Straight Bet form
    And I choose a team from different match
    And I check my Bet Slip
    And I place a Parlay Bet
    When I confirm my bet
    Then I should see my "Ticket Number"

  @MOBILE @TABLET
  Scenario: User places a If Bet in SportsBook page
    Given I am on SportsBetting application
    And I move to SPORTS
    And I choose a team in SportsBook page
    And I click Add More Selections in Straight Bet form
    And I choose a team from different match
    And I check my Bet Slip
    And I place a If bet
    When I confirm my bet
    Then I should see my "Ticket Number"

  @TABLET @MOBILE
  Scenario: User places a Action Reverse Bet in SportsBook page
    Given I am on SportsBetting application
    And I move to SPORTS
    And I choose a team in SportsBook page
    And I click Add More Selections in Straight Bet form
    And I choose a team from different match
    And I check my Bet Slip
    And I place an Action Reverse bet
    When I confirm my bet
    Then I should see my "Ticket Number"

  @TABLET @MOBILE
  Scenario: User place a bet in the Esports tab
    Given I am on SportsBetting application
    And I click Esports tab
    And I click on Early Markets
    And I choose the team
    When I place the bet
    Then I should see the bet is placed

  @MOBILE @TABLET
  Scenario: User accesses rules under homepage
    Given I am on SportsBetting application
    And I scroll down to bottom of the page
    When I click Rules
    Then I should be shown page related to rules

  @TABLET
  Scenario: User accesses promotions under myaccount
    Given as a User, I have already clicked on my account
    When I click Promotions
    Then I should be shown page related to promotions

  @DESKTOP @TABLET @MOBILE
  Scenario: User refer a new friend and view User lists in My Referrals page
    Given I am on SportsBetting application
    And I click on My Account link
    And I click Refer My Friends
    And I Refer a Friend
      | TestingUser_RANDOM    |
      | UserTesting001_RANDOM |
# And I should see the Refer Friends
    And I see Acknowledgment message
    And I click Refer My Friends
    When I click View My Referrals
#Then I should see My Referral table
    Then I should see My Referred Friends list
      | TestingUser_RANDOM |

  @MOBILE @TABLET
  Scenario: User accesses Payout under My Account in sportsBetting
    Given I am on SportsBetting application
    And  I click on My Account link
    When I click payout
    Then I confirm my payout submit

  @MOBILE @TABLET
  Scenario: User accesses Deposit under My Account in sportsBetting
    Given I am on SportsBetting application
    And I click on My Account link
    When I click deposit
    Then I confirm my deposit submit

  @Desktop @MOBILE @TABLET
  Scenario: User logout the SportsBetting Site
    Given I am on SportsBetting application
    When User click logout Button
    Then User is Logged out of the site

