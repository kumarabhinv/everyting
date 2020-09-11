Feature: Validating the functionality of "CASINO" tab in sports betting.


#  @MOBILE @DESKTOP
#  Scenario Outline: User visits SportsBetting application
#    Given I am on SportsBetting application
#    When User login to the SportsBetting site with following credential <Username> and <Password>
#    Then I should see the SportsBetting site homepage
#
#    Examples:
#      | Username | Password     |
#      | SB808358 | C0d0!d_P@ss1 |

  @DESKTOP
  Scenario: User selects "Featured" sub tab
    Given As a user, I am on CASINO Tab
    When select Featured
    Then I should see casino games under Featured


  @MOBILE
  Scenario Outline: User verifies all the sub tabs present under the "CASINO" tab.
    Given as a user, I am on the homepage
    When I click CASINO tab Under SportBetting
    Then I had to watch out <dropdown> under the CASINO tab
    And I see Featured selected as default under the dropdown

    Examples:
      | dropdown         |
      | Featured             |
      | Table Games          |
      | Video Poker          |
      | Live Casino Black    |
      | Live Casino Red      |
      | Slots                |
      | Speciality Games     |
      | Bonuses & Free Spins |

  @DESKTOP
  Scenario Outline: User selects a game from "CASINO" Tab
    Given As a user, I am on CASINO Tab
    When I click a game from <SubTabs>
    Then I should see a game modal under <SubTabs>
    Examples:
      | SubTabs          |
      | Featured         |
      | Slots            |
      | Video Poker      |
      | Speciality Games |
      | Bonus            |
      | Black            |
#      | Red              |



  @DESKTOP
  Scenario Outline: User  navigates to "Cashier" menu
    Given As a user, I see <SubTab>
    And I will click a game from <SubTab>
    When I click Casino Deposit button
    Then I should get navigated to Cashier menu
    Examples:
      | SubTab           |
      | Featured         |
      | Slots            |
      | Video Poker      |
      | Speciality Games |

  @MOBILE
  Scenario: User accesses "Featured" option from under dropdown inside "CASINO" page
    Given as a user, I have already clicked on CASINO tab under homepage
    When I see Featured already selected from under dropdown
    Then I should see various games under the displayed page
  @MOBILE
  Scenario: User selects any game from under "Featured" inside "CASINO" page
    Given as a user, I already see all the games under Featured option
    When I select any game from the list of games available
    Then I see page redirected to the selected game console for playing in mobile

  @MOBILE
  Scenario Outline: User accesses "Table Games" option from under dropdown under "CASINO" page
    Given as a user, I have already clicked on CASINO tab under homepage
    When I select Table Games from under dropdown
    Then I should see various <headers> under the displayed page

    Examples:
      | headers            |
      | Baccarat           |
      | Blackjack          |
      | Craps and Roulette |
      | Table Poker        |

  @DESKTOP
  Scenario Outline: User Closes the game modal
    Given As a user, I see <SubTab>
    And I will click a game from <SubTab>
    When I click Close icon
    Then I should see the game modal closed under the subTabs
    Examples:
      | SubTab           |
      | Featured         |
      | Slots            |
      | Video Poker      |
      | Speciality Games |

  @MOBILE
  Scenario: User selects any game from under "Table Games" inside "CASINO" page
    Given as a user, I already see all the games under Table Games option
    When I select any game from the list of games available under any header
    Then I see page gets redirected to the selected game console for playing under TableGames

  @MOBILE

  Scenario Outline: User accesses "Video Poker" option from under dropdown under "CASINO" page
    Given as a user, I have already clicked on CASINO tab under homepage
    When I select Video Poker from under dropdown
    Then I should see few <headers> under the displayed page under

    Examples:
      | headers     |
      | Multi-Hand  |
      | Single-Hand |
  @MOBILE
  Scenario: User selects any game from under "Video Poker" inside "CASINO" page
    Given as a user, I already see all the games under Video Poker option
    When I select any game from the list of games available under any header under video poker
    Then I see page gets redirected to the selected game console for playing under video poker


  @DESKTOP
  Scenario: user adds "any game modal" to favorite list
    Given As a user, I am on CASINO Tab
    And select Featured
    And I will click a game from Featured
    When I choose the Add to the Favorites game option
    Then I want to see Changes saved successfully

  @DESKTOP
  Scenario: User selects "Favorite" sub tab
    Given As a user, I am on CASINO Tab
    When select Favorites
    Then i should see the game under favorites

  @MOBILE

  Scenario: User accesses "Slots" option from under dropdown inside "CASINO" page
    Given as a user, I have already clicked on CASINO tab under homepage
    When I select Slots from under dropdown
    Then I should see various games under the displayed page under Slots header
  @MOBILE
  Scenario: User selects any game from under "Slots" inside "CASINO" page
    Given as a user, I already see all the games under Slots option
    When I select any game from the list of games available under slots
    Then I see page gets redirected to the selected game console for playing under slots

  @MOBILE
  Scenario: User accesses "Live Casino Black" option from under dropdown inside "CASINO" page
    Given   as a user, I have already clicked on CASINO tab under homepage
    When I select Live Casino Black from under dropdown
    Then I see page gets redirected to the page under Live Casino Black tab
  @MOBILE
  Scenario: User selects any game from under "Live Casino Black" inside "CASINO" page
    Given as a User, I am already in Live Lobby page under SportsBetting
    And I see all the games are appeared in the All option under Live Casino Black
    When I select any game under All options
    Then I see respective live games started under All options
  @MOBILE
  Scenario: User accesses "Live Casino Red" option from under dropdown inside "CASINO" page
    Given   as a user, I have already clicked on CASINO tab under homepage
    When I select Live Casino Red from under dropdown
    Then I see page gets redirected to the page under Live Casino Red tab


  @DESKTOP
  Scenario:  User validates information message displayed when no games added to the "Favorites"
    Given As a user, I am on CASINO Tab
    And  I will click a game from Featured
    And I choose the remove the favorite game option
    And I want to see Changes saved successfully
    When select Favorites
    Then I should gather Welcome to your own favorites page, just select the Add to Favorites check box on up to  of your favorite games to add them to this page

  @DESKTOP
   Scenario: User selects "Table Games" sub tab
    Given As a user, I am on CASINO Tab
    When select Table Games
    Then I should get craps And Roulette under Table Games

  @DESKTOP
    Scenario Outline:  User selects "Slots" sub tab
    Given As a user, I am on CASINO Tab
    When select Slots
    Then I should see All <Slots game>
    Examples:
      | Slots game  |
      | All Slots   |
      | Most Played |
      | New         |

  @DESKTOP
  Scenario Outline:  User selects "Video Poker" sub tab
    Given As a user, I am on CASINO Tab
    When select Video Poker
    Then I should see every <VideoPoker Games>
    Examples:
       | VideoPoker Games |
       | Single-Hand      |
       | Multi-Hand       |

  @DESKTOP
  Scenario Outline:  User selects "Speciality Games" sub tab
    Given As a user, I am on CASINO Tab
    When select <Sub Tab>
    Then I should see a games under speciality games
    Examples:
      | Sub Tab          |
      | Speciality Games |

  @DESKTOP
  Scenario:  User selects "Promotions" sub tab
    Given As a user, I am on CASINO Tab
    When select Promotions
    Then I should watch Promotions under Promotions
  @DESKTOP
  Scenario Outline:  User validates if the promotion relates to the "Deposit" means then user redirects to the "Cashiers" tab.
    Given As a user, I am on CASINO Tab
    And select <Sub Tab>
    When I want to click Deposit related promotion
    Then I should see page redirects to the Cashiers tab.
    Examples:
      | Sub Tab    |
      | Promotions |

#    todo 13/7 scenario not available
  @DESKTOP1
  Scenario Outline:  User validates if the promotion relates to the "Bonus" means, then user redirects to the "Poker" tab.
    Given As a user, I am on CASINO Tab
    And select <Sub Tab>
    When I click Bonus related promotion
    Then I will gather page redirects to the Poker tab.
    Examples:
      | Sub Tab    |
      | Promotions |

  @DESKTOP
  Scenario Outline:  User validates "Click here" link on promotions sub tab.
    Given As a user, I am on CASINO Tab
    And select <Sub Tab>
    When I click Click here link from any promotion
    Then I should see More information about the selected promotion
    Examples:
      | Sub Tab    |
      | Promotions |

  @DESKTOP
  Scenario Outline:  User validates "Terms and Condition" link on promotions sub tab.
    Given As a user, I am on CASINO Tab
    And select <Sub Tab>
    When I click Terms and Conditions link from any promotion
    Then I should see Terms and condition for the selected promotion
    Examples:
      | Sub Tab    |
      | Promotions |

  @DESKTOP
  Scenario Outline:  User selects "Bonus" sub tab
    Given As a user, I am on CASINO Tab
    When select <Sub Tab>
    Then I should see a game modal under <Sub Tab>
    Examples:
      | Sub Tab |
      | Bonus   |

  @MOBILE
  Scenario: User selects any game from under "Live Casino Red" inside "CASINO" page
    Given as a user, I already see all the games under Live Casino Red Option option
    When I select any game from the list of games available under Live Casino Red
    Then I see page gets redirected to the selected game console for playing under live Casino Red

  @MOBILE
  Scenario: User accesses "Speciality Games option from under dropdown inside "CASINO" page
    Given as a user, I have already clicked on CASINO tab under homepage
    When I select Speciality Games from under dropdown
    Then I should see various games under the displayed page under Speciality Games header
  @MOBILE
  Scenario: User selects any game from under Speciality Games inside "CASINO"page
    Given as a user, I already see all the games under Speciality Games option
    When I select any game from the list of games available in speciality Games
    Then I see page gets redirected to the selected game console for playing IN Speciality Games

  @MOBILE

  Scenario: User accesses "Bonus" option from under dropdown inside "CASINO" page
    Given as a user, I have already clicked on CASINO tab under homepage
    When I select Bonus&spins from under dropdown
    Then I see page reloads and displays all the Bonuses available (If any)

























