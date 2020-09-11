Feature: Validating the functionality of "CLASSIC CASINO" tab in sports betting.


  @MOBILE
  Scenario Outline: User visits SportsBetting application
    Given I am on SportsBetting application
    When User login to the SportsBetting site with following credential <Username> and <Password>
    Then I should see the SportsBetting site homepage
    Examples:
      | Username | Password     |
      | SB808360 | C0d0!d_P@ss1 |


  @MOBILE
  Scenario: User verifies all the sub tabs present under the "CLASIC CASINO" tab.
    Given I am on SportsBetting application
    And I move to CLASSIC CASINO
    And I should see a LEFT NAVIGATOR and few sub-tabs
      | Table games    |
      | Featured games |
      | Video Poker    |
      | Slot games     |
      | Other games    |
    When I see TABLE GAMES sub-tab selected as default
    Then I see Balance(amount) available

#TABLE GAMES
  @MOBILE
  Scenario: User accesses "TABLE GAMES" option from under dropdown inside "CLASIC CASINO" page
    Given as a user, I see Classic Casino page
    When I see TABLE GAMES already selected
    Then I should see various games under the Table Games displayed page

  @MOBILE
  Scenario: User selects any game from under "TABLE GAMES" inside "CLASIC CASINO" page
    Given as a user, I already see all the games under TABLE GAMES
    When I select any game from the list of Table Games available
    Then I see page gets redirected to the selected game console for playing

#  @TestM
#  Scenario: User decides to go back from game console to "TABLE GAMES" inside "CLASIC CASINO" page
#    Given as a user, I already see game cansole
#    When I click on "Close" (Icon)
#    Then I see page gets redirected back to the "TABLE GAMES" sub-tab displaying all games available

#  @TestM
#  Scenario: User clicks on "Next" button under "TABLE GAMES" inside "CLASIC CASINO" page
#    Given as a user, I already see all the games under "TABLE GAMES"
#    When I click on "Next"
#    Then I see page gets refreshed and I am shown with new games
#
#  @TestM
#  Scenario: User clicks on "Back" button under "TABLE GAMES" inside "CLASIC CASINO" page
#    Given as a user, I have already clicked on "Next" button under "TABLE GAMES"
#    When I click on "Back"
#    Then I see page gets refreshed and I am shown with previous displayed games

#VIDEO POKER
  @MOBILE
  Scenario: User accesses "VIDEO POKER" option from under dropdown inside "CLASIC CASINO" page
    Given as a user, I see Classic Casino page
    When I select Classic Casino Video Poker sub-tab
    Then I should see various games under the Video Poker displayed page

  @MOBILE
  Scenario: User selects any game from under "VIDEO POKER" inside "CLASIC CASINO" page
    Given as a user, I already see all the games under VIDEO POKER
    When I select any game from the list of Video Poker games available
    Then I see page gets redirected to the selected game console for playing

#  @TestM
#  Scenario: User decides to go back from game console to "VIDEO POKER" inside "CLASIC CASINO" page
#    Given as a user, I already see game cansole
#    When I click on "Close" (Icon)
#    Then I see page gets redirected back to the "VIDEO POKER" sub-tab displaying all games available

#SLOT GAMES
  @MOBILE
  Scenario: User accesses "SLOT GAMES" option from under dropdown inside "CLASIC CASINO" page
    Given as a user, I see Classic Casino page
    When I select Classic Casino Slot games sub-tab
    Then I should see various games under the Slots games displayed page

  @MOBILE
  Scenario: User selects any game from under "SLOT GAMES" inside "CLASIC CASINO" page
    Given as a user, I already see all the games under SLOT GAMES
    When I select any game from the list of Slot Games available
    Then I see page gets redirected to the selected game console for playing

#  @TestM
#  Scenario: User decides to go back from game console to "SLOT GAMES" inside "CLASIC CASINO" page
#    Given as a user, I already see game cansole
#    When I click on "Close" (Icon)
#    Then I see page gets redirected back to the "SLOT GAMES" sub-tab displaying all games available

#FEATURED GAMES
  @MOBILE
  Scenario: User accesses "FEATURED GAMES" option from under dropdown inside "CLASIC CASINO" page
    Given as a user, I see Classic Casino page
    When I select Classic Casino Featured games sub-tab
    Then I should see various games under the Featured Games displayed page

  @MOBILE
  Scenario: User selects any game from under "KENO GAMES" inside "CLASIC CASINO" page
    Given as a user, I already see all the games under Featured Games
    When I select any game from the list of Featured Games available
    Then I see page gets redirected to the selected game console for playing

#  @TestM
#  Scenario: User decides to go back from game console to "KENO GAMES" inside "CLASIC CASINO" page
#    Given as a user, I already see game cansole
#    When I click on "Close" (Icon)
#    Then I see page gets redirected back to the "KENO GAMES" sub-tab displaying all games available

#OTHER GAMES
  @MOBILE
  Scenario: User accesses "OTHER GAMES" option from under dropdown inside "CLASIC CASINO" page
    Given as a user, I see Classic Casino page
    When I select Classic Casino Other games sub-tab
    Then I should see various games under the Other Games displayed page

  @MOBILE
  Scenario: User selects any game from under "KENO GAMES" inside "CLASIC CASINO" page
    Given as a user, I already see all the games under Other Games
    When I select any game from the list of Other Games available
    Then I see page gets redirected to the selected game console for playing

#  @TestM
#  Scenario: User decides to go back from game console to "KENO GAMES" inside "CLASIC CASINO" page
#    Given as a user, I already see game cansole
#    When I click on "Close" (Icon)
#    Then I see page gets redirected back to the "KENO GAMES" sub-tab displaying all games available

#LEFT NAVIGATOR
  @MOBILE
  Scenario: User verifies all the sub tabs present under "LEFT NAVIGATOR" inside "CLASIC CASINO" tab.
    Given as a user, I see Classic Casino page
    When I click Classic Casino LEFT NAVIGATOR
    Then I see few Classic Casino options under LEFT NAVIGATOR
      | EXIT CASINO          |
      | Close (Icon)         |
      | Play with real funds |
      | Languages            |

  @MOBILE
  Scenario: User decides to close "CLASIC CASINO" page
    Given as a user, I see Classic Casino page
    And I click Classic Casino LEFT NAVIGATOR
    When I click on Classic Casino EXIT CASINO
    Then I should see the SportsBetting site homepage

  @MOBILE
  Scenario: User decides close "LEFT NAVIGATOR" under "CLASSIC CASINO"
    Given as a user, I see Classic Casino page
    And I click Classic Casino LEFT NAVIGATOR
    When I click on Classic Casino Close (Icon)
    Then I see CLASIC CASINO page

  @MOBILE
  Scenario: User accesses "Languages" from under "Left Navigator" inside "CLASIC CASINO" page
    Given as a user, I see Classic Casino page
    And I click Classic Casino LEFT NAVIGATOR
    When I select Classic Casino Languages
    Then I see few Classic Casino languages as dropdown list
      | English    |
      | Español    |
      | Portugês   |
      | Tiếng Việt |