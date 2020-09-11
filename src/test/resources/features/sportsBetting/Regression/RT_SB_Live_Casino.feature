Feature: Accessing the PTY Live Casino Tab

  @DESKTOP @MOBILE
  Scenario Outline: User visits SportsBetting application
    Given I am on SportsBetting application
    When User login to the SportsBetting site with following credential <Username> and <Password>
    Then I should see the SportsBetting site homepage
    Examples:
      | Username | Password     |
      | SB808358 | C0d0!d_P@ss1 |

  @DESKTOP
  Scenario Outline:  User navigates through the sub tabs present under the LIVE CASINO tab
    Given I am on SportsBetting application
    When I Mouse hover LIVE CASINO tab
    Then I should see <Sub-Tabs> under the LIVE CASINO tab
    Examples:
      | Sub-Tabs |
      | Black    |
      | Red      |

  @DESKTOP
  Scenario: User accesses Black sub-tab under Live Casino tab
    Given as a user, I am Mouse Hover Live Casino
    When I click Black
    Then I see some Game Types

  @DESKTOP
  Scenario: User accesses Slots game type under Black sub-tab
    Given I am on Black sub-tab
    When I click Slots in Black
    Then I see games related to the Slots

  @DESKTOP
  Scenario: User accesses any Game under SLOTS game type
    Given I am on Black sub-tab
    And I click Slots in Black
    When I click on any game in Slots
    Then I see page redirected to selected game page

#    //todo table games not availabe
#  @DESKTOP1
#  Scenario: User accesses Table Games game type under Black sub-tab
#    Given I am on Black sub-tab
#    When I click Table Games
#    Then I see games related to the Table Games
#
#  @DESKTOP1
#  Scenario: User accesses any game under Tables game type
#    Given I am on SportsBetting application
#    And I click Table Games
#    When I click any game in Table Games
#    Then I see page redirected to particular game page

#BACCARAT BLACK
  @DESKTOP
  Scenario:  User verifies Baccarat game type under live casino
    Given I am on SportsBetting application
    And I Mouse hover LIVE CASINO tab
    And I click Black
    When I click Baccarat
    Then I should see games related to the Baccarat

  @DESKTOP
  Scenario: User accesses any game under Tables game type
    Given I am on Black sub-tab
    And I click Baccarat
    When I click on any game in Baccarat Games
    Then I see page redirected to selected game page

#    ROULETTE
  @DESKTOP
  Scenario:  User verifies Roulette game type under live casino
    Given I am on SportsBetting application
    And I Mouse hover LIVE CASINO tab
    And I click Black
    When I click Roulette in Live Casino
    Then I should see games related to the Roulette

  @DESKTOP
  Scenario: User accesses any game under Tables game type
    Given I am on Black sub-tab
    And I click Roulette in Live Casino
    When I click Table Limits present in the Roulette game type
    Then I see page redirected to selected game page

#    BLACKJACK
  @DESKTOP
  Scenario:  User verifies Blackjack game type under live casino
    Given I am on SportsBetting application
    And I Mouse hover LIVE CASINO tab
    And I click Black
    When I click Blackjack in Live Casino
    Then I should see games related to the Blackjack

  @DESKTOP
  Scenario: User accesses any game under Tables game type
    Given I am on Black sub-tab
    And I click Blackjack in Live Casino
    When I click Table Limits present in the Blackjack game type
    Then I see page redirected to selected game page

    #HOLDEM
  @DESKTOP
  Scenario:  User verifies Holdem game type under live casino
    Given I am on SportsBetting application
    And I Mouse hover LIVE CASINO tab
    And I click Black
    When I click Holdem in Live Casino
    Then I should see games related to the Holdem

  @DESKTOP
  Scenario: User accesses any game under Tables game type
    Given I am on Black sub-tab
    And I click Holdem in Live Casino
    When I click Table Limits present in the Holdem game type
    Then I see page redirected to selected game page
#
##  //live dealer not availabe in black
#  @DESKTOP1
#  Scenario: User accesses Live Dealer game type under Black sub-tab
#    Given I am on Black sub-tab
#    When I click Live Dealer
#    Then I see games related to the Live Dealer
#
#  @DESKTOP1
#  Scenario: User accesses any game under Live Dealer game type
#    Given I am on Black sub-tab
#    And I click Live Dealer
#    When I click any game in Live Dealer
#    Then I see page redirected to Live game

## featured not availabe
#  @DESKTOP1
#  Scenario: User accesses Featured game type under Black sub-tab
#    Given I am on Black sub-tab
#    When I click Featured
#    Then I see games related to the Featured
#
#  @DESKTOP1
#  Scenario: User accesses any game under Featured game type
#    Given I am on Black sub-tab
#    And I click Featured
#    When I click any game in Featured
#    Then I see page redirected to particular Featured Game
##

  @DESKTOP
  Scenario: User accesses All game type under Black sub-tab
    Given I am on Black sub-tab
    And I click Slots in Black
    When I click All
    Then I see all available games in All game type

#  //---------------------------//

#  LIVE DEALER RED NOT AVIALABLE IN SITE


  @DESKTOP
  Scenario: User accesses Red sub-tab under Live Casino tab
    Given as a user, I am Mouse Hover Live Casino
    When I click Red Tab in Live Casino
    Then I see several Red Games
      | BlackJack | Roulette | Baccarat | Super6 | Slots | Tables | Bingo |

  @DESKTOP
  Scenario:  User verifies BlackJack game type under live casino
    Given as a user, I am on Red sub-tab
    When I click Blackjack in Live Casino
    Then I should see games related to the Blackjack


  @DESKTOP
  Scenario: User accesses <Table Limits> under BLACKJACK EARLY PAYOUT header
#   Given as a user,I am already under BLACKJACK EARLY PAYOUT header
    Given as a user, I am on Red sub-tab
    When I click Blackjack in Live Casino
    When I select Table Limits present in the BLACKJACK EARLY PAYOUT
    Then I see page redirected to new tab with Live game in Red

  @DESKTOP
  Scenario: User accesses <Table Limits> under EXCLUSIVE games
    Given as a user, I am on Red sub-tab
    And I click Blackjack in Live Casino
    When I select Table Limits present in the Exclusive games
    Then I see page redirected to new tab with Live game in Red

  @DESKTOP
  Scenario: User able to see LeaderBoard while mouse hover on dealer name for the <Game Types>
    Given as a user,I am already on Red games page
    And I click Roulette in Live Casino
    When I mouse hover on Dealer name
    Then I should see LeaderBoard with following details
      | LeaderBoardDetails |
      | Rank               |
      | Player             |
      | Total Points       |


  @DESKTOP
  Scenario:  User verifies Roulette game type under live casino
    Given as a user,I am already on Red games page
    When I click Roulette in Live Casino
    Then I should see games related to the Roulette

  @DESKTOP
  Scenario:  User verifies Baccarat game type under live casino
    Given as a user, I am on Red sub-tab
    When I click Baccarat
    Then I should see games related to the Baccarat

  @DESKTOP
  Scenario: User validates <Table Limit> under Roulette game type
    Given as a user,I am already under Roulette game type
    When I click Table Limits present in the Roulette game type
    Then I see page redirected to new tab with Live game in Red

  @DESKTOP
  Scenario: User validates <Table Limit> under Baccarat game type
    Given as a user, I am on Red sub-tab
    And I click Baccarat
    When I click Table Limits present in the Baccarat game type in black
    Then I see page redirected to new tab with Live game in Red

  @DESKTOP
  Scenario:  User verifies Super6 game type under live casino
    Given as a user, I am on Red sub-tab
    When I click Super6 in Red
    Then I should see games related to the Super6

  @DESKTOP
  Scenario: User validates <Table Limit> under Super6 game type
    Given as a user,I am already under Super6 game type
    When I click Table Limits present in the Super6 game type in Red
    Then I see page redirected to new tab with Live game in Red


  @DESKTOP
  Scenario: User accesses Slots game type
    Given as a user,I am already on Red games page
    When I click Slots in Red
    Then I see games related to the Live Casino Red Slots

  @DESKTOP
  Scenario: User accesses any slot Game under SLOTS game type
    Given as a user,I am already under Live Casino Red Slots game type
    When I click any slot game
    Then I see page redirected to game page

  @DESKTOP
  Scenario: User accesses Tables game type under Hamburger icon
    Given as a user,I am already on Red games page
    When I click on Tables
    Then I see games related to the Tables


  @DESKTOP
  Scenario: User accesses any  Game under Tables game type
    Given as a user,I am already on Table Games page
    When I click any Table game
    Then I see page redirected to game page

  @DESKTOP
  Scenario: User accesses Bingo game type under Hamburger icon
    Given as a user,I am already on Red games page
    When I click Bingo in Red
    Then I see games related to Bingo

  @DESKTOP
  Scenario: User accesses any Game under Bingo sub-tab
    Given as a user,I am already under Bingo Game type
    When I click any Bingo game
    Then I see page redirected to game page

  #Game not available
  #  @DESKTOP@Scenario18
#  Scenario: User verifies <Table Limits> under NON-EXCLUSIVE games
#    Given as a user,I am already under 'BLACKJACK sub-tab
#    When I select Table Limits present in the Non-Exclusive games
#    Then I see page redirected to new tab with Live game
@MOBILE 
  Scenario: User access RED Livecasino option
    Given I am on SportsBetting application
    When I move to RED
    Then I see different Game Types in LiveCasino RED tab with Hamburger Icon


  @MOBILE 
  Scenario: User accesses LIVE CASINO tab under Home page
    Given I am on SportsBetting application
    When I move to RED
    Then I should see multiple sub-tabs under Left Navigator
      | Blackjack |
      | Roulette  |
      | Baccarat  |
      | Super6    |
      | Slots     |
      | Tables    |
      | Bingo     |

  @MOBILE 
  Scenario: User accesses LIVE CASINO tab from Hamburger Icon
    Given I am on SportsBetting application
    And Under homepage I click on Left Navigator
    When I select Live Casino tab in Hamburger Icon
    Then I should see multiple sub-tabs under Left Navigator
      | Blackjack |
      | Roulette  |
      | Baccarat  |
      | Super6    |
      | Slots     |
      | Tables    |
      | Bingo     |


  #BlackJack
  @MOBILE 
  Scenario: User accesses BlackJack sub-tab
    Given I am on SportsBetting application
    And I move to RED
    When I select Blackjack
    Then I see all games related to the Blackjack

  @MOBILE 
  Scenario: User access Table Limits under BLACKJACK EARLY PAYOUT game
    Given I am on SportsBetting application
    And I move to RED
    And I select Blackjack
    When I select any Table Limits present in the BLACKJACK EARLY PAYOUT
    Then I see redirected page to new tab with Live game

  @MOBILE 
  Scenario: User access Table Limits under EXCLUSIVE games
    Given as a user, I am on Blackjack tab
    When I select any Table Limits present in the Exclusive games
    Then I see redirected page to new tab with Live game

  @MOBILE 
  Scenario: User access Table Limits under NON-EXCLUSIVE games
    Given as a user, I am on Blackjack tab
    When I select any Table Limits present in the Non-Exclusive games
    Then I see redirected page to new tab with Live game

  @MOBILE 
  Scenario: User wants to see LeaderBoard for available games
    Given as a user, I am on Blackjack tab
    When I mouse hover on any available game
    Then I see LeaderBoard details

    #Roulette

  @MOBILE 
  Scenario: User accesses Roulette sub-tab
    Given I am on SportsBetting application
    And I move to RED
    When I select Roulette
    Then I see all games related to the Roulette

  @MOBILE 
  Scenario: User access Table Limit under Roulette game
    Given I am on SportsBetting application
    And I move to RED
    And I see sportsBetting Roulette Tab
    When I select any Table Limits present in the Roulette
    Then I see redirected page to new tab with Live game

      #Baccarat
  @MOBILE 
  Scenario: User access "Baccarat" sub-tab
    Given I am on SportsBetting application
    And I move to RED
    When I select Baccarat
    Then I see games related to the Baccarat

  @MOBILE 
  Scenario: User access Table Limit under "Baccarat" game
    Given as a user, I am on sportsBetting Baccarat Game sub-tab
    When I select Table Limits present in the Baccarat game type
    Then I see redirected page to new tab with Live game

#Super6
  @MOBILE 
  Scenario: User accesses "Super6"  sub-tab
    Given I am on SportsBetting application
    And I move to RED
    When I select Super6
    Then I see games related to the Super6


  @MOBILE 
  Scenario: User validates Table Limit under "Super6" game
    Given as a user,I am on Super6
    When I select Table Limits present in the Super6 game type
    Then I see page redirected to new tab with game

    #Slots
  @MOBILE 
  Scenario: User accesses Slots sub-tab
    Given I am on SportsBetting application
    And I move to RED
    When I select Slots
    Then I see all available games

  @MOBILE 
  Scenario: User accesses play option from Game(s) under SLOTS
    Given as a user,I am on Slots sub-tab
    When I select Play
    Then I see page redirected to new tab with game

#Tables
  @MOBILE 
  Scenario: User accesses "Tables" sub-tab
    Given I am on SportsBetting application
    And I move to RED
    When I select Tables
    Then I see games related to the Tables

  @MOBILE 
  Scenario: User accesses play option from Game(s) under "TABLES"
    Given as a user, I am on TABLES sub-tab
    When I select Play
    Then I see page redirected to new tab with game


#BINGO
  @MOBILE 
  Scenario: User accesses "BINGO"  sub-tab
    Given I am on SportsBetting application
    And I move to RED
    When I select Bingo
    Then I see games related to the Bingo

  @MOBILE 
  Scenario: User accesses play option from Game(s) under "BINGO"
    Given as a user,I am on BINGO sub-tab
    When I select Play
    Then I see page redirected to new tab with game


    #LIVECASINO "BLACK"
  @MOBILE 
  Scenario: User want to access the "BLACK" in Livecasino option
    Given I am on SportsBetting application
    When I move to BLACK
    Then I see Live Lobby open with related CONTENTS and different games



  @MOBILE 
  Scenario: User access SLOTS option in the live lobby
    Given as a User, I am already in Live Lobby page under SportsBetting
    And I select SLOT
    And I see SLOT related games
    When I select any game under Slot
    Then I see respective live games started under slots

  @MOBILE 
  Scenario: User access BLACKJACK option in the live lobby
    Given as a User, I am already in Live Lobby page under SportsBetting
    And I select BLACKJACK
    And I see sportsBetting BLACKJACK related games
    When I select any game under BlackJack
    Then I see respective live games started under BlackJack

  @MOBILE 
  Scenario: User access Baccarat option in the live lobby
    Given as a User, I am already in Live Lobby page under SportsBetting
    And I select Baccarat under Black
    And I see Baccarat related games
    When I select any game under Baccarat
    Then I see respective live games started under Baccarat

  @MOBILE 
  Scenario: User access Roulette option in the live lobby
    Given as a User, I am already in Live Lobby page under SportsBetting
    And I select Roulette under Black
    And I see Roulette related games
    When I select any game under Roulette
    Then I see respective live games started under Roulette

  @MOBILE 
  Scenario: User access Holdem option in the live lobby
    Given as a User, I am already in Live Lobby page under SportsBetting
    And I select Holdem under Black
    And I see Holdem related games
    When I select any game under Holdem
    Then I see respective live games started under Holdem

  @MOBILE 
  Scenario: User access ALL option in the live lobby
    Given as a User, I am already in Live Lobby page under SportsBetting
    And I select ALL option Under live Lobby page
    And I see all the games are appeared in the All option under Live Casino Black
    When I select any game under All options
    Then I see respective live games started under All options

  @MOBILEB 
  Scenario: User want to see the page view in Fullscreen
    Given as a User, I am already in Live Lobby page under SportsBetting
    When I select Full Screen icon
    Then I see page expanded user can see the full view of the page

  @MOBILEB 
  Scenario: User want to go back the normal view of the page
    Given as a User, I am already in Live Lobby page under SportsBetting
    When I again select Full Screen icon
    Then I see the full screen view get back to normal view

  @MOBILEB 
  Scenario: User access the Setting icon in the Live Lobby page
    Given as a User, I am already in Live Lobby page under SportsBetting
    When I select Setting icon
    Then I see the Setting pop-up the current Version and X icon

  @MOBILEB 
  Scenario: User want to close the Setting pop-up
    Given as a User, I am already in Live Lobby page under SportsBetting
    When I close the pop-up
    Then I see the setting pop-up gets disappears

  @MOBILEB 
  Scenario: User accesses laungages under Live Casino Black
    Given as a User, I am already in Live Lobby page under SportsBetting
    When I select Language icon
    Then I should see several languages under Live Casino Black

  @MOBILE 
  Scenario: User want to Go to SportsBetting Homepage
    Given as a User, I am already in Live Lobby page under SportsBetting
    When I select Home icon
    Then I should see the SportsBetting site homepage
