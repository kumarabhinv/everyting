Feature: Validating the functionality of Sports tab in SportsBetting

  @DESKTOP @MOBILE
  Scenario Outline: User visits SportsBetting application
    Given I am on SportsBetting application
    When User login to the SportsBetting site with following credential <Username> and <Password>
    Then I should see the SportsBetting site homepage

    Examples:
      | Username  | Password  |
      | SB808358  | C0d0!d_P@ss1 |

  @DESKTOP
  Scenario Outline: User verifies all the sub-tab present under SPORTS tab
    Given I am on SportsBetting application
    When I move to <Tab>
    Then I should see details related to selected <Tab>

    Examples:
      | Tab    |
      | SPORTS |

  @MOBILE
  Scenario: User verifies "SPORTS" tab under homepage
    Given I am on SportsBetting application
    When I move to SPORTS
    Then User should see games and one back (icon)

  @DESKTOP
  Scenario: User accesses the Promotions sub-tab under the SPORTS tab
    Given as a User,I click on SPORTS tab
    When I click on Promotions sub-tab
    Then I see contents for "Promotions"
    And "Promotions" sub-tab should be highlighted


  @DESKTOP
  Scenario: User opts for Terms & Conditions (If available) under Promotions sub-tab
    Given as a User, I click on Promotions sub-tab in Sports page
    When I click on "Terms & Conditions" under the Promotions
    Then I should be shown with a pop-up listing all the Terms & Conditions for that particular promotion

  @MOBILE
  Scenario: User clicks any game to see sub-games
    Given as a User, I see all the games under SPORTS page
    When I click on any game available under Sports page
    Then I see sub-games available under selected game


  @MOBILE
  Scenario: User clicks any sub-game to see teams
    Given I see sub-games available under selected game
    When I click on any sub-game available under Sports page
    Then I see various wager types available
      | Spread       |
      | Money\nLine  |
      | Game\nTotals |
      | Team\nTotals |
    And I see several teams with odds and date

      @DESKTOP
  Scenario: User selects any promotion displayed under Promotions sub-tab with DEPOSIT NOW button
    Given as a User, I click on Promotions sub-tab in Sports page
    When User clicks on any promotion available with "Deposit Now" button
    Then User should be redirected to the "CASHIER" tab

#Getting Started
  @DESKTOP
  Scenario: User accesses the Getting Started sub-tab under the SPORTS tab
    Given as a User, I am on Sportsbetting application
    And as a User,I click on SPORTS tab
    When I click on Getting Started sub-tab
    Then I see contents for "Getting Started"
    And "Getting Started" sub-tab should be highlighted

  @MOBILE
  Scenario: User verifies BACK TO TOP under Sports page
    Given I see several teams with odds and date
    And I scroll down to end of page and see BACK TO TOP
    When I click on BACK TO TOP under Sports page
    Then I see various wager types available
      | Spread       |
      | Money\nLine  |
      | Game\nTotals |
      | Team\nTotals |

  @MOBILE
  Scenario: User verifies back arrow button on the page with wagers type
    Given I see several teams with odds and date
    When I click on sub-game name with back arrow
    Then I see sub-games available under selected game

  @DESKTOP
  Scenario: User selects How To Bet Online displayed under Getting Started sub-tab
    Given as a User, I have already clicked on "Getting Started" sub-tab
    When User clicks on "How To Bet Online"
    Then User should be shown all the related contents under "How To Bet Online" along with Image Banner

  @DESKTOP
  Scenario: User validates Image Banner under the How To Bet Online
    Given as a User, I have already clicked on "How To Bet Online"
    When user click on Image Banner
    Then I see page redirects to MY ACCOUNT page along with related options

  @MOBILE
  Scenario: User verifies back arrow button on the page with game name on sub-game selection page
    Given I see sub-games available under selected game
    When I click on game name with back arrow
    Then User should see games and one back (icon)

  @MOBILE
  Scenario: User clicks any game to see sub-games
    Given as a User, I see all the games under SPORTS page
    When I click on any game available under Sports page
    Then I see sub-games available under selected game


  @DESKTOP
  Scenario: User selects Understanding Betting Odds displayed under Getting Started sub-tab
    Given as a User,I click on SPORTS tab
    And I click on Getting Started sub-tab
    When User clicks on "Understanding Betting Odds"
    Then User should be shown all the related contents under "Understanding Betting Odds" along with Image Banner


  @DESKTOP
  Scenario: User selects Sports Schedules displayed under Getting Started sub-tab
    Given as a User,I click on SPORTS tab
    And I click on Getting Started sub-tab
    When User clicks on "Sports Schedules"
    Then User should be shown all the related contents under "Sports Schedules" along with Image Banner

  @MOBILE
  Scenario: User clicks any sub-game to see teams
    Given I see sub-games available under selected game
    When I click on any sub-game available under Sports page
    Then I see various wager types available
      | Spread       |
      | Money\nLine  |
      | Game\nTotals |
      | Team\nTotals |
    And I see several teams with odds and date

  @MOBILE
  Scenario: User verifies collapse (-) icon under Sports page with teams
    Given I see several teams with odds and date
    When I click on collapse icon containing date
    Then I see teams under the collapsed bar gets hidden

  @DESKTOP
  Scenario: User selects Betting Terms displayed under Getting Started sub-tab
    Given as a User, I have already clicked on "Getting Started" sub-tab
    When User clicks on "Betting Terms"
    Then User should be shown all the related contents under "Betting Terms" along with Image Banner

  @MOBILE
  Scenario: User verifies expand (+) icon under Sports page with teams
    Given I see teams under the collapsed bar gets hidden
    When I click on expand icon for the collapsed date
    Then I see all the teams under expanded bar gets visible

  @MOBILE
  Scenario: User adds a bet from "SPORTS" page under "Straight Bet"
    Given I am on SportsBetting application
    And I move to SPORTS
    When I choose a team in SportsBook page
    Then I see team selected added to Straight Bet pop-up for betting

  @DESKTOP
  Scenario: User selects Types Of Bets displayed under Getting Started sub-tab
    Given as a User, I have already clicked on "Getting Started" sub-tab
    When User clicks on "Types of Bets"
    Then User should be shown all the related contents under "Types of Bets" along with Image Banner

  @DESKTOP
  Scenario: User selects Betting Limits displayed under Getting Started sub-tab
    Given as a User, I have already clicked on "Getting Started" sub-tab
    When User clicks on "Betting Limits"
    Then User should be shown all the related contents under "Betting Limits" along with Image Banner

  @MOBILE
  Scenario: User places a bet from under "Straight Bet" pop-up
    Given as a User, I have already added single team under Straight Bet
    And I click Place My Bet in Straight Bet form
    And If no error is displayed
    When I confirm my straight bet
    Then I should see my "Ticket Number"

  @MOBILE
  Scenario: User adds more than one bet from "SPORTS" page
    Given I am on SportsBetting application
    And I move to SPORTS
    And I choose a team in SportsBook page
    And I see team selected added to Straight Bet pop-up for betting
    When I click Add More Selections in Straight Bet form
    Then I choose a team from different match
    And I see Check your Bet Slip as a bar showing number of bets added

  @DESKTOP
  Scenario: User want to chat with live agents
    Given as a User, I have already clicked on the "Betting Limits"
    When I click sportsbetting "Live Help" button
    Then I see Live chat "Chat with us" pop-up open along with options

  @DESKTOP
  Scenario: User selects Sportsbook Rules displayed under Getting Started sub-tab
    Given as a User, I have already clicked on "Getting Started" sub-tab
    When User clicks on "Sportsbook Rules"
    Then User should be shown all the related contents under "Sportsbook Rules" along with Image Banner

  @MOBILE
  Scenario: User accesses "Check your Bet Slip" bar displayed after clicking "Add More Selections" under "Straight Bet"
    Given as a User, I already see Check your Bet Slip bar with number of selections being displayed
    When I click on Check your Bet Slip
    Then I see page is redirected to Bet Slip page with headers
      | Single Bet |
      | Parlays    |
      | If Bet     |

  @MOBILE
  Scenario: User places bet(s) from under "Parlays"
    Given as a User, I see Bet Slip with Single Bet
    And I place a Parlay Bet
    When I confirm my bet
    Then I should see my "Ticket Number"

  @DESKTOP
  Scenario: : User verifies General Rules link under Sportsbook Rules
    Given as a User, I have already clicked on the "Sportsbook Rules"
    When I will click over General rules link
    Then I see page redirects to "Rules" page with related contents


  @DESKTOP
  Scenario Outline: User validates all the Rules Links available under the Rules page
    Given as a User, I am already on Rules page
    When I should click sports <Rules options>
    Then I see page scroll to the corresponding header <Rules options> with contents
    Examples:
      | Rules options         |
      | General Rules         |
      | Player Internet Rules |
      | Bonus Rules           |
      | Free Play Rules       |
      | Parlay Rules          |
      | Cashier Rules         |
      | Payout Rules          |
      | Poker Rules           |
      | Financials Rules      |
      | Live Casino Rules     |
      | E-Sports Rules        |
#Sports News
  @DESKTOP
  Scenario: User accesses the Sports News sub-tab under the SPORTS tab
    Given as a User,I click on SPORTS tab
    When I will click Sports News sub-tab
    Then I see the Sports News page content

#HomeBetting > Odds and News
  @DESKTOP
  Scenario: User accesses the contents of the header Home Betting > Odds and News
    Given as a User, I have already clicked on Sports News
    And I see "Home Betting > Odds and News" as auto selected and displayed
    When I click Home Betting > Odds and News
    Then I am redirected to the "My Account" page

#SPORTS BETTING ODDS & NEWS
  @DESKTOP
  Scenario: User accesses the contents of the header  SPORTS BETTING ODDS & NEWS
    Given as a User,I click on SPORTS tab
    And I will click on Sports News tab
    When I scroll down to SPORTS BETTING ODDS & NEWS header
    Then I see all information related to the contents
#SPORTS BETTING LINES
  @DESKTOP
  Scenario: User accesses the contents of the header  SPORTS BETTING LINES
    Given as a User, I have already clicked on Sports News
    When I scroll down to SPORTS BETTING LINES header
    Then I should see UPCOMING GAMES containing Choose Sport dropdown list
    And I should see To all Sports Lines at the end of header content

  @DESKTOP
  Scenario: User accesses the Choose Sport contents of the header SPORTS BETTING LINES
    Given as a User, I have already scrolled down to SPORTS BETTING LINES header
    When I click any games from the dropdown
    Then I should see UPCOMING GAMES header contents change accorging to the game selected

    #SPORTS NEWS
  @DESKTOP
  Scenario: User accesses the contents of SPORTS NEWS header
    Given as a User,I click on SPORTS tab
    And I will click on Sports News tab
    When I scroll down to SPORTS NEWS header
    Then I see several contents with Read More and number links
      | 1 | 2 | 3 | 4 | 5 | 515 | Next |

  @DESKTOP
  Scenario: User accesses the To all Sports Lines present at the end of the header SPORTS BETTING LINES
    Given as a User, I have already scrolled down to SPORTS BETTING LINES header
    When I click To all Sports Lines
    Then I should be redirected to the SportsBook sub-tab page under SPORTS tab

  @DESKTOP
  Scenario: User clicks either any content or Read More present in the content from the list of contents available under SPORTS NEWS header
    Given as a User, I have already scrolled down to SPORTS NEWS header
    When I click either any content header or Read More present in that content
    Then I should be redirected to the selected content page

  @DESKTOP
  Scenario: User clicks any one Number Link available under SPORTS NEWS header
    Given as a User, I have already clicked on Sports News tab
    When I click any number link
    Then I should see, page gets reloaded and contents should change as per the number selected

#TOP PROMOTIONS

  @DESKTOP
  Scenario Outline: User accesses the contents of TOP PROMOTIONS header
    Given as a User, I have already clicked on Sports News
    When I scroll down to TOP PROMOTIONS
    Then I see several promotions available with Deposit Now link and <TOP PROMOTIONS Options>

    Examples:
      | TOP PROMOTIONS Options |
      | Terms and Conditions   |
      | See All Promotions     |

  @DESKTOP
  Scenario: User clicks any promotion image available under TOP PROMOTIONS of Sports News sub-tab
    Given as a User, I have already scrolled down to TOP PROMOTIONS header
    When I select any image present in that page
    Then I should be redirected to the PROMOTIONS tab

  @DESKTOP
  Scenario: User clicks Terms & Conditions available under any promotion under TOP PROMOTIONS header of Sports News sub-tab
    Given as a User,I click on SPORTS tab
    And I will click on Sports News tab
    And I scroll down to TOP PROMOTIONS header
    When user click Terms and Conditions
    Then I should see a pop-up with all the related Terms & Conditions

  @DESKTOP
  Scenario: User clicks See All Promotions available with TOP PROMOTIONS header of Sports News sub-tab
    Given as a User, I scroll down to TOP PROMOTIONS header
    When user click on See All Promotions
    Then I should be redirected to the PROMOTIONS tab

  @DESKTOP
  Scenario: User clicks Deposit available under TOP PROMOTIONS of Sports News sub-tab
    Given as a User,I click on SPORTS tab
    And I will click on Sports News tab
    And I scroll down to TOP PROMOTIONS header
    When I click Deposit Now
    Then I should be redirected to the CASHIER tab

  @DESKTOP
  Scenario: User accesses the NFL Betting sub-tab under Sports News sub-tab
    Given as a User,I click on SPORTS tab
    And I will click on Sports News tab
    When I select NFL Betting
    Then I should see several NFL Betting sub-tabs

  @DESKTOP
  Scenario: User see several contents under NFL Betting sub-tabs
    Given I am on NFL Betting page
    Then I see several contents under NFL Betting sub-tabs
      | NFL Betting Trends          |
      | Super Bowl Bets             |
      | NFL Betting Picks           |
      | How to bet on Football      |
      | Football Betting Calculator |

  @DESKTOP
  Scenario Outline: User accesses the NFL Betting Trends sub-tab under NFL Betting sub-tab
    Given I am on NFL Betting page
    When user click on Betting <tab>
    Then I see several contents under <Betting headers>,<Betting Odds>,<BETTING NEWS>

    Examples:
      | tab                |  | Betting headers            | Betting Odds         | BETTING NEWS |
      | NFL Betting Trends |  | Sports Betting Odds & News | SPORTS BETTING LINES | trends NEWS  |


  @DESKTOP
  Scenario Outline: User accesses the Super Bowl Bets sub-tab under NFL Betting sub-tab
    Given as a User, I have already clicked on NFL Betting
    When user click on Betting <tab>
    Then I see several contents under <Betting headers>,<Betting Odds>,<BETTING NEWS>

    Examples:
      | tab             | Betting headers                | Betting Odds    | BETTING NEWS            |
      | Super Bowl Bets | Super Bowl Betting Odds & News | SUPER BOWL ODDS | super bowl betting NEWS |


  @DESKTOP
  Scenario Outline: User accesses the NFL Betting Picks sub-tab under NFL Betting sub-tab
    Given as a User, I have already clicked on NFL Betting
    When user click on Betting <tab>
    Then I see several contents under <Betting headers>,<Betting Odds>,<BETTING NEWS>

    Examples:
      | tab               | Betting headers            | Betting Odds         | BETTING NEWS |
      | NFL Betting Picks | Sports Betting Odds & News | SPORTS BETTING LINES | picks NEWS   |


  @DESKTOP
  Scenario Outline: User accesses the How to bet on Football sub-tab under NFL Betting sub-tab
    Given I am on NFL Betting page
    When user click on Betting <tab>
    Then I see several contents under Football Betting headers
      | The first steps                       |
      | Definitions of football betting terms |
      | Total points or Over/Under            |
      | Parlays                               |
      | Teasers                               |
      | Futures                               |
      | Propositions                          |
    Examples:
      | tab                    |
      | How to bet on Football |

  @DESKTOP
  Scenario Outline: User accesses the  Football Betting Calculator sub-tab under NFL Betting sub-tab
    Given I am on NFL Betting page
    When user click on Betting <tab>
    Then I see it redirects to Bet Calculator under My Account
    Examples:
      | tab                         |
      | Football Betting Calculator |

#MLB Betting

  @DESKTOP
  Scenario Outline: User accesses the MLB Betting sub-tab under Sports News sub-tab
    Given as a User,I click on SPORTS tab
    And I will click on Sports News tab
    When user move to <tab>
    Then I see several contents under <Betting headers>,<Betting Odds>,<BETTING NEWS>
    Examples:

      | tab         | Betting headers         | Betting Odds | BETTING NEWS     |
      | MLB Betting | MLB Betting Odds & News | MLB ODDS     | mlb betting NEWS |


  @DESKTOP
  Scenario: User see several contents under MLB Betting sub-tabs
    Given I am on Sports News page
    Then I see several contents under MLB Betting sub-tabs
      | MLB Betting Picks |
      | Playoff Odds      |


  @DESKTOP
  Scenario Outline: User accesses the MLB Betting Picks sub-tab under MLB Betting sub-tab
    Given I am on Sports News page
    When user click Betting <sub-tab>
    Then I see several contents under <Betting headers>,<Betting Odds>,<BETTING NEWS>
    Examples:
      | sub-tab           | Betting headers            | Betting Odds         | BETTING NEWS |
      | MLB Betting Picks | Sports Betting Odds & News | SPORTS BETTING LINES | picks NEWS   |

  @DESKTOP
  Scenario Outline: User accesses the Playoff Odds sub-tab under MLB Betting sub-tab
    Given I am on Sports News page
    When user click Betting <sub-tab>
    Then I see several contents under <Betting headers>,<Betting Odds>,<BETTING NEWS>

    Examples:
      | sub-tab      | Betting headers                        | Betting Odds     | BETTING NEWS      |
      | Playoff Odds | MLB Playoff Betting Odds & Predictions | MLB PLAYOFF ODDS | playoff odds NEWS |


#NBA Betting

  @DESKTOP
  Scenario Outline: User accesses the NBA Betting sub-tab under Sports News sub-tab
    Given I am on Sports News page
    When user move to <tab>
    Then I see several contents under <Betting headers>,<Betting Odds>,<BETTING NEWS>

    Examples:
      | tab         | Betting headers         | Betting Odds | BETTING NEWS     |
      | NBA Betting | NBA BETTING ODDS & NEWS | NBA ODDS     | nba betting NEWS |


  @DESKTOP
  Scenario: User see several contents under NBA Betting sub-tabs
    Given I am on Sports News page
    Then I see several contents under NBA Betting sub-tabs
      | NBA Betting Picks   |
      | Finals Playoff Odds |
      | NBA Betting Trends  |

  @DESKTOP
  Scenario Outline: User accesses the NBA Betting Picks sub-tab under NBA Betting sub-tab
    Given I am on Sports News page
    When user click Betting <sub-tab>
    Then I see several contents under <Betting headers>,<Betting Odds>,<BETTING NEWS>
    Examples:
      | sub-tab           | Betting headers            | Betting Odds         | BETTING NEWS |
      | NBA Betting Picks | Sports Betting Odds & News | SPORTS BETTING LINES | picks NEWS   |

  @DESKTOP
  Scenario Outline: User accesses the Finals Playoff Odds sub-tab under NBA Betting sub-tab
    Given I am on Sports News page
    When user click Betting <sub-tab>
    Then I see several contents under <Betting headers>,<Betting Odds>,<BETTING NEWS>
    Examples:
      | sub-tab             | Betting headers                      | Betting Odds          | BETTING NEWS             |
      | Finals Playoff Odds | NBA Championship Betting Odds & News | NBA CHAMPIONSHIP ODDS | finals playoff odds NEWS |


  @DESKTOP
  Scenario Outline: User accesses the NBA Betting Trends sub-tab under NBA Betting sub-tab
    Given I am on Sports News page
    When user click Betting <sub-tab>
    Then I should see several contents under <Betting Odds>,<BETTING NEWS>
    Examples:
      | sub-tab            | Betting Odds | BETTING NEWS            |
      | NBA Betting Trends | NBA Trends   | nba betting trends NEWS |

#College Basketball Lines

  @DESKTOP
  Scenario Outline: User accesses the College Basketball Lines sub-tab under Sports News sub-tab
    Given I am on Sports News page
    When user move to <tab>
    And I see March Madness Odds tab displayed under the sub-tab
    Then I see several contents under <Betting headers>,<Betting Odds>,<BETTING NEWS>
    Examples:
      | tab                      | Betting headers                      | Betting Odds            | BETTING NEWS                    |
      | College Basketball Lines | NCAA Basketball Betting Lines & News | COLLEGE BASKETBALL ODDS | college basketball betting NEWS |


  @DESKTOP
  Scenario Outline: User accesses the March Madness Odds sub-tab under College Basketball Lines sub-tab
    Given I am on Sports News page
    When I select Basketball Lines <tab>
    Then I see several contents under <Betting headers>,<Betting Odds>,<BETTING NEWS>
    Examples:
      | tab                | Betting headers                            | Betting Odds       | BETTING NEWS               |
      | March Madness Odds | March Madness betting odds, news & bracket | MARCH MADNESS ODDS | march madness betting NEWS |

#Boxing Odds
  @DESKTOP
  Scenario: User accesses the Boxing Odds sub-tab under Sports News sub-tab
    Given I am on Sports News page
    When I click Boxing Odds
    Then I see several contents under Boxing odds sub-tabs

#College Football Betting
  @DESKTOP
  Scenario Outline: User accesses the College Football Betting sub-tab under Sports News sub-tab
    Given I am on Sports News page
    When user move to <tab>
    And I see College Football Betting Picks tab displayed under the sub-tab
    Then I see several contents under <Betting headers>,<Betting Odds>,<BETTING NEWS>
    Examples:
      | tab                      | Betting headers                               | Betting Odds          | BETTING NEWS                  |
      | College Football Betting | NCAAF - College Football Betting Lines & News | COLLEGE FOOTBALL ODDS | college football betting NEWS |

  @DESKTOP
  Scenario Outline: User accesses the College Football Betting Picks sub-tab under College Football Betting sub-tab
    Given I am on Sports News page
    When I select College Football Betting Picks tab
    Then I see several contents under <Betting headers>,<Betting Odds>,<BETTING NEWS>
    Examples:
      | Betting headers            | Betting Odds         | BETTING NEWS |
      | Sports Betting Odds & News | SPORTS BETTING LINES | picks NEWS   |

#Golf Betting Odds
  @DESKTOP
  Scenario Outline: User accesses the Golf Betting Odds sub-tab under Sports News sub-tab
    Given I am on Sports News page
    When user move to <tab>
    And I see several sub-tabs present under the Golf Betting Odds
      | British Open     |
      | Masters          |
      | PGA Championship |
      | US Open          |
    Then I see several contents under <Betting headers>,<Betting Odds>,<BETTING NEWS>
    Examples:
      | tab               | Betting headers          | Betting Odds | BETTING NEWS           |
      | Golf Betting Odds | Golf Betting Odds & News | GOLF ODDS    | golf betting odds NEWS |


  @DESKTOP
  Scenario Outline: User accesses the British Open sub-tab under Golf Betting Odds sub-tab
    Given I am on Sports News page
    When I select Golf Betting Odds <sub-tab>
    Then I see several contents under <Betting headers>,<Betting Odds>,<BETTING NEWS>

    Examples:
      | sub-tab      | Betting headers                  | Betting Odds | BETTING NEWS      |
      | British Open | British Open Betting Odds & News | BRITISH ODDS | british open NEWS |

  @DESKTOP
  Scenario Outline: User accesses the Masters sub-tab under Golf Betting Odds sub-tab
    Given I am on Sports News page
    When I select Golf Betting Odds <sub-tab>
    Then I see several contents under <Betting headers>,<Betting Odds>,<BETTING NEWS>

    Examples:
      | sub-tab | Betting headers                  | Betting Odds | BETTING NEWS      |
      | Masters | Masters Golf Betting Odds & News | MASTERS ODDS | MASTERS GOLF NEWS |


  @DESKTOP
  Scenario Outline: User accesses the PGA Championship sub-tab under Golf Betting Odds sub-tab
    Given I am on Sports News page
    When I select Golf Betting Odds <sub-tab>
    Then I see several contents under <Betting headers>,<Betting Odds>,<BETTING NEWS>

    Examples:
      | sub-tab          | Betting headers                      | Betting Odds          | BETTING NEWS          |
      | PGA Championship | PGA Championship Betting Odds & News | PGA CHAMPIONSHIP ODDS | pga championship NEWS |


  @DESKTOP
  Scenario Outline: User accesses the US Open sub-tab under Golf Betting Odds sub-tab
    Given I am on Sports News page
    When I select Golf Betting Odds <sub-tab>
    Then I see several contents under <Betting headers>,<Betting Odds>,<BETTING NEWS>

    Examples:
      | sub-tab | Betting headers                    | Betting Odds | BETTING NEWS |
      | US Open | US Open Online Betting Odds & News | US OPEN ODDS | US open NEWS |

#NHL Betting Lines
  @DESKTOP
  Scenario Outline: User accesses the NHL Betting Lines sub-tab under Sports News sub-tab
    Given I am on Sports News page
    When user move to <tab>
    And I see a sub-tab present under the NHL Betting Odds
      | Stanley Cup Odds |
    Then I see several contents under <Betting headers>,<Betting Odds>,<BETTING NEWS>
    Examples:
      | tab               | Betting headers          | Betting Odds | BETTING NEWS           |
      | NHL Betting Lines | NHL Betting Lines & News | NHL ODDS     | nhl betting lines NEWS |

  @DESKTOP
  Scenario Outline: User accesses the Stanley Cup Odds sub-tab under NHL Betting Lines sub-tab
    Given as a User, I have already clicked on NHL Betting Lines
    When I select NHL Betting Odds subtab
    Then I see several contents under <Betting headers>,<Betting Odds>,<BETTING NEWS>

    Examples:
      | Betting headers                 | Betting Odds     | BETTING NEWS          |
      | Stanley Cup Betting Odds & News | STANLEY CUP ODDS | stanley cup odds NEWS |

  @DESKTOP
  Scenario: User accesses the MMA Betting Odds sub-tab under Sports News sub-tab
    Given as a User, I have already clicked on Sports News
    When I select MMA Betting Odds
    Then I see several contents under MMA Betting Odds headers

  @DESKTOP
  Scenario Outline: User accesses the UFC Betting Odds sub-tab under Sports News sub-tab
    Given as a User, I have already clicked on Sports News
    When I select UFC Betting Odds
    Then I see several contents under <UFC Betting Odds headers>,<UFC Odds>,<UFC BETTING NEWS>
    Examples:
      | UFC Betting Odds headers | UFC Odds | UFC BETTING NEWS      |
      | UFC Betting Odds & News  | UFC ODDS | ufc betting odds NEWS |


  @DESKTOP
  Scenario Outline: User accesses the Soccer Betting Odds sub-tab under Sports News sub-tab
    Given as a User, I have already clicked on Sports News
    When user move to <tab>
    Then I see several contents under <Betting headers>,<Betting Odds>,<BETTING NEWS>

    Examples:
      | tab                 | Betting headers                   | Betting Odds | BETTING NEWS             |
      | Soccer Betting Odds | Soccer Betting Predictions & News | SOCCER ODDS  | soccer betting odds NEWS |

#Tennis Betting Odds

  @DESKTOP
  Scenario Outline: User accesses the Tennis Betting Odds sub-tab under Sports News sub-tab
    Given as a User, I have already clicked on Sports News
    When user move to <tab>
    And I see a sub-tab present under the Tennis Betting Odds
      | French Open |
    Then I see several contents under <Betting headers>,<Betting Odds>,<BETTING NEWS>
    Examples:
      | tab                 | Betting headers            | Betting Odds | BETTING NEWS             |
      | Tennis Betting Odds | Tennis Betting Odds & news | TENNIS ODDS  | tennis betting odds NEWS |


  @DESKTOP
  Scenario Outline: User accesses the French Open sub-tab under Tennis Betting Odds sub-tab
    Given as a User, I have already clicked on Tennis Betting Odds
    When I select French Open tab
    Then I see several contents under <Betting headers>,<Betting Odds>,<BETTING NEWS>

    Examples:
      | Betting headers            | Betting Odds         | BETTING NEWS     |
      | Sports Betting Odds & News | SPORTS BETTING LINES | french open NEWS |

#Horse Racing Odds

  @DESKTOP
  Scenario Outline: User accesses the Horse Racing Odds sub-tab under Sports News sub-tab
    Given I am on Sports News page
    When user move to <tab>
    And I see several sub-tabs under Horse Racing Odds tab
      | Belmont Stakes   |
      | Breeders' Cup    |
      | Kentucky Derby   |
      | Preakness Stakes |
    Then I see several contents under <Betting headers>,<Betting Odds>,<BETTING NEWS>

    Examples:
      | tab               | Betting headers                  | Betting Odds      | BETTING NEWS           |
      | Horse Racing Odds | Horse Racing Betting Odds & News | HORSE RACING ODDS | horse racing odds NEWS |

  @DESKTOP
  Scenario Outline: User accesses the Belmont Stakes sub-tab under Horse Racing Odds sub-tab
    Given as a User, Iam on Horse Racing Odds page
    When I select Horse Racing <tab>
    Then I see several contents under <Betting headers>,<Betting Odds>,<BETTING NEWS>

    Examples:
      | tab            | Betting headers                    | Betting Odds        | BETTING NEWS        |
      | Belmont Stakes | Belmont Stakes Betting Odds & News | BELMONT STAKES ODDS | belmont stakes NEWS |


  @DESKTOP
  Scenario Outline: User accesses the Breeders' Cup sub-tab under Horse Racing Odds sub-tab
    Given as a User, Iam on Horse Racing Odds page
    When I select Breeders Cup sub-tab
    Then I see several contents under <Betting headers>,<Betting Odds>,<BETTING NEWS>

    Examples:
      | Betting headers                  | Betting Odds      | BETTING NEWS      |
      | Breeders Cup Betting Odds & News | Breeders Cup Odds | breeders cup NEWS |


  @DESKTOP
  Scenario Outline: User accesses the Kentucky Derby sub-tab under Horse Racing Odds sub-tab
    Given as a User, Iam on Horse Racing Odds page
    When I select Horse Racing <tab>
    Then I see several contents under <Betting headers>,<Betting Odds>,<BETTING NEWS>

    Examples:
      | tab            | Betting headers                    | Betting Odds        | BETTING NEWS        |
      | Kentucky Derby | Kentucky Derby Betting Odds & News | KENTUCKY DERBY ODDS | kentucky derby NEWS |

  @DESKTOP
  Scenario Outline: User accesses the Preakness Stakes sub-tab under Horse Racing Odds sub-tab
    Given as a User, Iam on Horse Racing Odds page
    When I select Horse Racing <tab>
    Then I see several contents under <Betting headers>,<Betting Odds>,<BETTING NEWS>
    Examples:
      | tab              | Betting headers                      | Betting Odds   | BETTING NEWS          |
      | Preakness Stakes | Preakness Stakes Betting Odds & News | PREAKNESS ODDS | preakness stakes NEWS |

#Other Sports
  @DESKTOP
  Scenario Outline: User accesses the Other Sports sub-tab under Sports News sub-tab
    Given as a User, I have already clicked on Sports News
    When user move to <tab>
    Then I see several contents under <Betting headers>,<Betting Odds>,<BETTING NEWS>

    Examples:
      | tab          | Betting headers | Betting Odds | BETTING NEWS           |
      | Other Sports | OTHER SPORTS    | Other Sports | other sports odds NEWS |

#TOP PAGES
  @DESKTOP
  Scenario Outline:   User accesses the Top Pages sub-tab under Sports News sub-tab
    Given I am on Sports News page
    And I will scroll down to <tab>
    When I see several contents displayed as images
    Then I select any one image form the available images
    And page will be redirected to the concerned pages
    Examples:
      | tab       |
      | TOP PAGES |

#SportsBook
  @DESKTOP
  Scenario: User accesses the SportsBook sub-tab under Sports tab
    Given as a User,I click on SPORTS tab
    When I select Sportsbook tab
    Then I see few contents under header, a search bar, refresh lines button and selectors
      | Bet Slip                       |
      | Play Mini Blackjack Now!       |
      | Live Betting Games in Progress |
    And I see several sub-tabs,Live Betting icon,View Selected and Clear All options
      | MAIN SPORTS  |
      | PLAYER PROPS |
      | GAME PROPS   |
      | FUTURES      |
      | OTHER SPORTS |
      | CONTESTS     |
      | USEFUL LINKS |

#LIVE BETTING
  @DESKTOP
  Scenario: User accesses the LIVE BETTING sub-tab under SportsBook sub-tab
    Given as a User, I have already clicked on SportsBook
    When I see click on LIVE BETTING
    Then I am redirected to LIVE BETTING tab under homepage

#View Selected
  @DESKTOP
  Scenario: User verifies View Selected under SportsBook sub-tab
    Given as a User,I click on SPORTS tab
    And I select any or many choices from under SportsBook page sub-tabs but only those with checkbox
    When I select View Selected option
    Then I see all the selected choices show up for betting

#Clear All
  @DESKTOP
  Scenario: User accesses the Clear All sub-tab under SportsBook sub-tab
    Given as a User, I have already see all the selected contents
    When I see click on Clear All
    Then I see all the checkboxes selected gets un-checked

#MAIN SPORTS
  @DESKTOP
  Scenario: User accesses the MAIN SPORTS sub-tab under SportsBook sub-tab
    Given as a User, I have already clicked on SportsBook
    Then I see several Main Sports contents under MAIN SPORTS

  @DESKTOP
  Scenario: User selects without checkbox from under MAIN SPORTS sub-tab under SportsBook sub-tab
    Given as a User, I can already see all the choices under MAIN SPORTS
    When I select any choice with no checkbox only one at a time
    Then I see selected choices show up for betting

  @DESKTOP
  Scenario Outline: : User accesses "PLAYER PROPS" tab under homepage
    Given I am on SportsBetting application
    And I click on SPORTS tab
    When I select the <tab>
    Then I see games present under Upcoming Events Header
    Examples:
      | tab          |
      | PLAYER PROPS |


  @DESKTOP
  Scenario Outline: User accesses the PLAYER PROPS sub-tab under SportsBook sub-tab
    Given as a User,I click on SPORTS tab
    And I select the <tab>
    And I see few sub-tabs on the page displayed on clicking PLAYER PROPS
      | BUILD        |
      | QUICK PICKS  |
      | OVER / UNDER |
    When I see a dropdown displaying all teams available to select form
    Then I see a <Player Props header> and an Learn More anchor
    Examples:
      | tab          | Player Props header |
      | PLAYER PROPS | Build Your Bet      |

  @DESKTOP
  Scenario: User selects from the dropdown present under PLAYER PROPS sub-tab
    Given as a User, I have already clicked on PLAYER PROPS
    When I select any choice from dropdown displaying all teams available
    Then I see all the displayed teams changes according to the selected choice

  @DESKTOP
  Scenario Outline: User accesses the BUILD present under PLAYER PROPS sub-tab
    Given as a User,I click on SPORTS tab
    And I select the <tab>
    When user select <Player Props sub-tab>
    Then I see few a search box and dropdown displaying upcoming games on the page displayed on clicking BUILD
    And I see few default results to select from
    Examples:
      | tab          | Player Props sub-tab |
      | PLAYER PROPS | build                |

  @DESKTOP
  Scenario: User selects from dropdown displaying upcoming games present under BUILD
    Given as a User, I have already clicked on BUILD
    When I choose from the available options under dropdown displaying upcoming games
    Then I see all the related results getting displayed under BUILD

  @DESKTOP
  Scenario: User chooses from displayed result present under BUILD
    Given as a User,I have already see few results under BUILD
    When I select from the choices available
    Then I see all the selected teams get added under the Build Your Bet header

  @DESKTOP
  Scenario Outline: User accesses the QUICK PICKS present under PLAYER PROPS sub-tab
    Given as a User,I click on SPORTS tab
    And I select the <tab>
    And user select <Player Props sub-tab>
    When I select from the dropdown displaying upcoming games on the page displayed on clicking QUICK PICKS
    And I see few buttons to select from
    Examples:
      | tab          | Player Props sub-tab |
      | PLAYER PROPS | quick picks          |

  @DESKTOP
  Scenario: User selects from the choices displayed under QUICK PICKS after selecting from the dropdown displaying upcoming games
    Given as a User, I have already selected from dropdown displaying upcoming games from under QUICK PICKS
    And user click on any button available under teams names
    When I select any items anchor after clicking button
    Then I see selected choices gets added to Bet Slip present under Build Your Bet

  @DESKTOP
  Scenario: User selects Collapse All from the choices displayed under QUICK PICKS after selecting from the dropdown displaying upcoming games
    Given as a User, I have already selected from dropdown displaying upcoming games from under QUICK PICKS
    And I have selected from the dropdown displaying all teams available
    When I select Collapse All
    Then I see all the displayed results gets collapsed under there headers

  @DESKTOP
  Scenario: User accesses the Build Your Bet present under PLAYER PROPS sub-tab
    Given as a User, I have already clicked on PLAYER PROPS
    Then I see <anchor tags> choices and one dropdown namely BETS
      | STAT  |
      | H2H   |
      | TRIOS |

  @DESKTOP
  Scenario Outline: User accesses any anchor STAT/H2H/TRIOS present under Build Your Bet header
    Given as a User,I click on SPORTS tab
    And I select the <tab>
    And user select <Player Props sub-tab>
    And I select any anchor choices
    When I select from the choices available
    Then I see teams selected displayed under choice of anchor selected with Build options
      | Odds   |
      | Number |
    Examples:
      | tab          | Player Props sub-tab |
      | PLAYER PROPS | build                |

  @DESKTOP
  Scenario: User places a bet under any anchor STAT/H2H/TRIOS present under Build Your Bet header and declines confirmation pop-up
    Given as a User,I have already selected teams
    And I select any choice from select statistics dropdown
    And I see any will have option from under will have header only for STAT
      | at least |
      | over     |
      | under    |
    And I enter value in Number in between range
    And user click Add To Bet Slip
    And I enter value in bet input field
    When user click Place My Bets
    Then I click cancel on the confirmation pop-up shown
    And I see confirmation pop-up goes away

  @DESKTOP
  Scenario: User places a bet under any anchor STAT/H2H/TRIOS present under Build Your Bet header and accepting confirmation pop-up
    Given as a User,I have already selected teams
    And I select any choice from select statistics dropdown
    And I see any will have option from under will have header only for STAT
      | at least |
      | over     |
      | under    |
    And I enter value in Number in between range
    And user click Add To Bet Slip
    And I enter value in bet input field
    When user click Place My Bets
    Then I confirm the confirmation pop-up shown
    And I see Your bet was successfully submitted message on the pop-up

  @DESKTOP
  Scenario: User after adding teams goes for clear option under Build Your Bet
    Given as a User, I have already added teams from under BUILD
    When I click clear
    Then I see all the added teams gets removed and Build Your Bet gets empty

  @DESKTOP
  Scenario Outline: User after adding teams changes Odds content format under Build Your Bet
    Given as a User, I add teams from under Build
    When I select any <Odd options> from under Odds
    Then I see value under Odds changes accordingly
    Examples:
      | Odd options |
      | american    |
      | fraction    |
      | decimal     |

  @DESKTOP1
  Scenario: User verifies BETS under Build Your Bet
    Given as a User, I already see Build Your Bet
    When I click over BETS
    Then I see choices being displayed
#      | Betslip |
      | My Bets |
      | Help    |

  @DESKTOP
  Scenario Outline: User clicks on My Bets under BETS
    Given as a User, I have already added teams from under BUILD
    When I click the <option>
    Then I see a page displaying all the bets placed under Open Bets
    Examples:
      | option  |
      | My Bets |

  @DESKTOP
  Scenario: User clicks on Past Bets under My Bets
    Given as a User, I already see My Bets page
    When I click Past Bets
    Then I see a page displaying No Bets under Past Bets or bets placed earlier

  @DESKTOP
  Scenario: User clicks on back after viewing My Bets under BETS
    Given as a User, I already see My Bets page
    When I click back in Past Bets page
    Then I see user redirected back to PlayerProps page

  @DESKTOP
  Scenario Outline: User clicks on Betslip under BETS
    Given as a User,I click on SPORTS tab
    And I select the <tab>
    And user select <Player Props sub-tab>
    When I click the <option>
    Then I see a div page displaying No Bets
    Examples:
      | tab          | Player Props sub-tab | option  |
      | PLAYER PROPS | build                | Betslip |

    #makes next scenario error
  @DESKTOP
  Scenario Outline: User accesses Help under BETS
    Given as a User,I click on SPORTS tab
    And I select the <tab>
    And user select <Player Props sub-tab>
    When I click the <option>
    Then I am redirected to a help page
    Examples:
      | tab          | Player Props sub-tab | option |
      | PLAYER PROPS | build                | Help   |

  @MOBILE
  Scenario: User adds more than one bet from "SPORTS" page
    Given I am on SportsBetting application
    And I move to SPORTS
    And I choose a team in SportsBook page
    And I see team selected added to Straight Bet pop-up for betting
    When I click Add More Selections in Straight Bet form
    Then I choose a team from different match
    And I see Check your Bet Slip as a bar showing number of bets added

  @MOBILE
  Scenario: User accesses "Check your Bet Slip" bar displayed after clicking "Add More Selections" under "Straight Bet"
    Given as a User, I already see Check your Bet Slip bar with number of selections being displayed
    When I click on Check your Bet Slip
    Then I see page is redirected to Bet Slip page with headers
      | Single Bet |
      | Parlays    |
      | If Bet     |



#GAME PROPS
  @DESKTOP
  Scenario Outline: User accesses GAME PROPS sub-tab under SportsBook sub-tab
    Given I am on SportsBetting application
    And I click on SPORTS tab
    When I select the <tab>
    Then I see several Game props contents under GAME PROPS

    Examples:
      | tab        |
      | GAME PROPS |

    #Only when live games are available
#  @DESKTOP1  @60  @83
#  Scenario: User selects any choice from under the GAME PROPS
#    Given as a User, I have already clicked on SportsBook
#    And I select any choice from under the GAME PROPS
#    When I select one or many from the displayed results after selection of a choice under GAME PROPS
#    Then I see all the teams selected gets added to the Bet Slip

#FUTURES
  @DESKTOP
  Scenario Outline: User accesses FUTURES sub-tab under SportsBook sub-tab
    Given as a User, I have already clicked on SportsBook
    When I select the <tab>
    Then I see several Futures contents under FUTURES

    Examples:
      | tab     |
      | FUTURES |

     #Only when live games are available
#  @DESKTOP1   @85
#  Scenario: User selects any choice from under the FUTURES
#    Given as a User, I have already clicked on FUTURES
#    When I select any choice from under the FUTURES
#    When I select one/many from the displayed results after selection of a choice under FUTURES
#    Then I see all the teams selected gets added to the Bet Slip

#CONTESTS
  @DESKTOP
  Scenario Outline: User accesses CONTESTS sub-tab under SportsBook sub-tab
    Given as a User, I have already clicked on SportsBook
    When I select the <tab>
    Then I see several Contest choices under CONTESTS
      | Squares Contest |
      | Contest         |
    Examples:
      | tab      |
      | CONTESTS |

  @DESKTOP
  Scenario Outline: User selects Squares Contest from under the CONTESTS
    Given as a User, I have already clicked on CONTESTS
    When I select <tab> from under the CONTESTS
    Then I am redirected to Squares Contest page displaying Username
    And I see Contest options
      | Squares Contests Lobby  |
      | Closed Squares Contests |
      | Graded Squares Contests |
      | Rules                   |
      | Betting History         |
    Examples:
      | tab             |
      | Squares Contest |

  @MOBILE
  Scenario: User performs any action using Down or Up buttons under "If Bet" and Place bet
    Given as a User, I see Bet Slip with Single Bet
    And I click on single bet under Bet Slip
    And I place a If bet
    When I confirm my bet
    Then I should see my "Ticket Number"

  @MOBILE
  Scenario: User places an Action Reverse Bet in SportsBook page
    Given I am on SportsBetting application
    And I move to SPORTS
    And I choose a team in SportsBook page
    And I click Add More Selections in Straight Bet form
    And I choose a team from different match
    And I check my Bet Slip
    And I place an Action Reverse bet
    When I confirm my bet
    Then I should see my "Ticket Number"

    #Automation Bug  Page not redirecting to Contests page
#  @DESKTOP1  @88
#  Scenario Outline: User selects Contest from under the CONTESTS
#    Given I am on SportsBetting application
#    And I click on SPORTS tab
#    And I select the <tab>
#    When I select <Sub-tab> from under the CONTESTS
#    Then I am redirected to CONTEST tab page under homepage
#    Examples:
#      | tab      | Sub-tab |
#      | CONTESTS | Contest |

#OTHER SPORTS
  @DESKTOP
  Scenario Outline: User verifies OTHER SPORTS under SportsBook sub-tab
    Given as a User,I click on SPORTS tab
    When I select the <tab>
    Then I see OTHER SPORTS options
    Examples:
      | tab          |
      | OTHER SPORTS |

#USEFUL LINKS
  @DESKTOP
  Scenario Outline: User verifies USEFUL LINKS under SportsBook sub-tab
    Given as a User, I have already clicked on SportsBook
    When I select the <tab>
    Then I see Useful Links options
      | Sports Betting Stats  |
      | Betting Calculator    |
      | Sports Schedules      |
      | Betting Terms         |
      | Types of Bets         |
      | Betting Limits        |
      | Sportsbook Rules      |
      | Sportsbook Bonuses    |
      | Sportsbook Help & FAQ |

    Examples:
      | tab          |
      | USEFUL LINKS |

  @DESKTOP
  Scenario Outline: User accesses Sports Betting Stats under USEFUL LINKS sub-tab
    Given as a User, I have already clicked on USEFUL LINKS
    When user click over <tab>
    Then user able to see page redirected to Getting Started sub-tab
    Examples:
      | tab                  |
      | Sports Betting Stats |

  @DESKTOP
  Scenario Outline: User accesses Betting Calculator under USEFUL LINKS sub-tab
    Given as a User,I click on SPORTS tab
    And user clicks on USEFUL LINKS
    When user click over <tab>
    Then I see page redirected to My Account present under homepage
    Examples:
      | tab                |
      | Betting Calculator |

  @DESKTOP
  Scenario Outline: User accesses Sports Schedules under USEFUL LINKS sub-tab
    Given as a User,I click on SPORTS tab
    And user clicks on USEFUL LINKS
    When user click over <tab>
    Then user able to see page redirected to Getting Started sub-tab
    Examples:
      | tab              |
      | Sports Schedules |

  @DESKTOP
  Scenario Outline: User accesses Betting Terms under USEFUL LINKS sub-tab
    Given as a User,I click on SPORTS tab
    And user clicks on USEFUL LINKS
    When user click over <tab>
    Then user able to see page redirected to Getting Started sub-tab
    Examples:
      | tab           |
      | Betting Terms |

  @DESKTOP
  Scenario Outline: User accesses Types of Bets under USEFUL LINKS sub-tab
    Given as a User,I click on SPORTS tab
    And user clicks on USEFUL LINKS
    When user click over <tab>
    Then user able to see page redirected to Getting Started sub-tab
    Examples:
      | tab           |
      | Types of Bets |

  @DESKTOP
  Scenario: User accesses Betting Limits under USEFUL LINKS sub-tab
    Given I am on SportsBetting application
    And I click on SPORTS tab
    And user clicks on USEFUL LINKS
    When user clicks on Betting Limits tab
    Then user able to see page redirected to Getting Started sub-tab

  @DESKTOP
  Scenario: User accesses Sportsbook Rules under USEFUL LINKS sub-tab
    Given I am on SportsBetting application
    And I click on SPORTS tab
    And user clicks on USEFUL LINKS
    When user clicks on Sportsbook Rules
    Then user able to see page redirected to Getting Started sub-tab

  @DESKTOP
  Scenario: User accesses Sportsbook Bonuses under USEFUL LINKS sub-tab
    Given I am on SportsBetting application
    And I click on SPORTS tab
    And user clicks on USEFUL LINKS
    When user clicks on Sportsbook Bonuses
    Then I see page redirected to Promotions sub-tab

  @DESKTOP
  Scenario: User accesses Sportsbook Help & FAQ under USEFUL LINKS sub-tab
    Given I am on SportsBetting application
    And I click on SPORTS tab
    And user clicks on USEFUL LINKS
    When user clicks on Sportsbook Help & FAQ
    Then I see page redirected to SportsBook Help page with Live Chat and Frequently Asked Questions

#Search Bar
  @DESKTOP
  Scenario: User searches Rotational Number from under SportsBook sub-tab
    Given as a User,I click on SPORTS tab
    And I enter any rotational number only digits in the search bar new Rot#
    When user click on search button
    Then I see all the search results displayed related to the Rotational Number entered

#Sort Lines By
  @DESKTOP
  Scenario Outline: User hover over ? help icon near Sort Lines By dropdown
    Given as a User,I am already shown results after performing search operation under Rot#
    And I select <choice1> and hover on help icon next to Sort Lines By dropdown
    Then I see hint or description of the choice selected from under Sort Lines By dropdown
    Examples:
      | choice1         |
      | League Schedule |
      | Date and Time   |

  @DESKTOP
  Scenario Outline: User sorts Rotational Number from under SportsBook sub-tab
    Given as a User,I am already shown results after performing search operation under Rot#
    When I select any <Odds selections> from within Sort Lines By dropdown
    Then I see all the search results displayed sorted according to the selected choice
    Examples:
      | Odds selections |
      | League Schedule |
      | Rotation No     |
      | Date and Time   |

#Odds Format Selector
  @DESKTOP
  Scenario Outline: User changes Odds Format of  Rotational Number
    Given as a User,I am already shown results after performing search operation under Rot#
    When I select any <Odd options> from within Odds Format Selector dropdown
    Then I see all the search results displayed formatted according to the selected choice
    Examples:
      | Odd options |
      | American    |
      | Fraction    |
      | Decimal     |

  @DESKTOP
  Scenario Outline:User hover over ? help icon near Odds Format Selector dropdown
    Given as a User,I am already shown results after performing search operation under Rot#
    When user click on <choice1> and hover on help icon next to Sort Lines By dropdown
    Then I see hint or description of the choice selected from under Odds Format Selector dropdown
    Examples:
      | choice1  |
      | American |
      | Fraction |



#Live Betting Games in Progress
  @DESKTOP
  Scenario: User verifies Live Betting Games in Progress header
    Given as a User, I have already clicked on SportsBook
    When user scroll down to Live Betting Games in Progress
    Then I see all the games in progress if any

#Play Mini Blackjack Now!
  @DESKTOP
  Scenario: User verifies Play Mini Blackjack Now! header
    Given as a User, I have already clicked on SportsBook
    When user scroll down to Play Mini Blackjack Now!
    Then I see Mini Blackjack game loaded to play

  #Bet Slip
  @DESKTOP
  Scenario Outline: User accesses Bet Slip under Sports page
    Given as a User,I click on SPORTS tab
    And user see bet-tabs under Bet Slip
    Then user should see <bet buttons> under Bet Slip
    And I see Show Confirmation Checkbox already selected
    Examples:
      | bet buttons  |
      | Clear All    |
      | Place my bet |
      | Save         |

  @DESKTOP
  Scenario: User opts for Straight Bet under Bet Slip
    Given as a User, I have already clicked on SportsBook
    And I choose a team in the SportsBook page
    When user click on Straight Bet
    Then I see all the teams selected with Risk to be entered

  @DESKTOP
  Scenario: User places bet opting Straight Bet under Bet Slip
    Given as a User, I have already clicked on SportsBook
    And I enter Risk amount
    When user click on Place my bet
    Then I see a confirmation message with Back and Confirm button

  @DESKTOP
  Scenario: User places bet opting Straight Bet under Bet Slip and confirming the confirmation message
    Given as a User, I already see a confirmation message with Back and Confirm button
    When user click on Confirm
    Then I see a success or failure message

  @DESKTOP
  Scenario: User places bet opting Straight Bet under Bet Slip but clicks Back on the confirmation message
    Given as a User,I click on SPORTS tab
    And I choose a team in the SportsBook page
    And user click on Straight Bet
    And I enter Risk amount
    And user click on Place my bet
    When user click on Back
    Then I see all the teams selected with Risk to be entered

  @DESKTOP
  Scenario: User opts for Parlay under Bet Slip
    Given as a User,I click on SPORTS tab
    And I select any/multiple teams odds value
    When user click on Parlay & Robin
    Then I see all the teams selected with Risk to be entered in Parlay tab

  @DESKTOP
  Scenario: User places bet opting Parlay under Bet Slip
    Given as a User, I already see added teams under Parlay
    And I enter Risk amount in parlay tab
    When user click on Place my bet
    Then I see a confirmation message with Back and Confirm button

  @DESKTOP
  Scenario: User places bet opting Parlay under Bet Slip but clicks Back on the confirmation message
    Given as a User, I already see a confirmation message with Back and Confirm button
    When user click on Back
    Then I see all the teams selected with Risk to be entered in Parlay tab

  @DESKTOP
  Scenario: User places bet opting Parlay under Bet Slip and confirming the confirmation message
    Given as a User, I already see added teams under Parlay
    And user click on Place my bet
    When user click on Confirm
    Then I see a success or failure message

  @DESKTOP
  Scenario: User opts for If Bet & Reverse under Bet Slip
    Given as a User,I click on SPORTS tab
    And I select any/multiple teams odds value
    When user click on If Bet & Reverse
    Then I see all the teams selected with Amount to be entered

  @DESKTOP
  Scenario: User places bet opting If Bet & Reverse under Bet Slip
    Given as a User,I already see added teams under If Bet & Reverse
    And I select either Win Only or Win or Push from the dropdown
    And I enter Risk amount in IfBet Tab
    When user click on Place my bet
    Then I see a confirmation message with Back and Confirm button

  @DESKTOP
  Scenario: User places bet opting If Bet & Reverse under Bet Slip but clicks Back on the confirmation message
    Given as a User, I already see a confirmation message with Back and Confirm button
    When user click on Back
    Then I see all the teams selected with Amount to be entered

  @DESKTOP
  Scenario: User places bet opting If Bet & Reverse under Bet Slip and confirming the confirmation message
    Given as a User,I already see added teams under If Bet & Reverse
    And user click on Place my bet
    When user click on Confirm
    Then I see a success or failure message

  @DESKTOP
  Scenario: User places bet under any of the options under Bet Slip but unchecks the Show Confirmation Checkbox
    Given as a User,I click on SPORTS tab
    And I have already added teams to the Bet Slip
    And I uncheck the Show Confirmation Checkbox
    And user click on If Bet & Reverse
    And I select either Win Only or Win or Push from the dropdown
    And I enter Risk amount in IfBet Tab
    When user click on Place my bet
    Then I see a success or failure message

  @DESKTOP
  Scenario: User opts for Clear All under Bet Slip after adding teams
    Given as a User,I click on SPORTS tab
    And I have already added teams to the Bet Slip
    And user click on If Bet & Reverse
    When user click on the Clear All button
    Then I see all the teams from Bet Slip is removed

  @DESKTOP
  Scenario: User opts for Save under Bet Slip after adding teams
    Given as a User,I have already added teams to the Bet Slip
    And user click on If Bet & Reverse
    When user click on Save button
    Then I see all the teams under Bet Slip saved

  #BUG - Search bar results not appearing
# @DESKTOP1
##  Scenario: User searches a team from BUILD present under PLAYER PROPS sub-tab
##    Given as a User, I have already clicked on BUILD
##    When I search using search box
##    Then I see all the related results getting displayed on a dropdown search box page



#  @DESKTOP1
  #Bet not available
#  Scenario: User opts for Teaser & Pleaser under Bet Slip
#    Given as a User,I am already on Sports page
#    And I select any/multiple teams odds value
#    And I see Teaser & Pleaser under Bet Slip highlighted
#    When I click on Teaser & Pleaser
#    Then I see all the teams selected with Amount to be entered
#
#  @DESKTOP1
  #Bet not available
#  Scenario: User places bet opting Teaser & Pleaser under Bet Slip
#    Given as a User,I already see added teams under Teaser & Pleaser
#    And I select any teaser value from the dropdown
#    And I enter Amount
#    When I click on Place my bet
#    Then I see a confirmation message with Back and Confirm button
#
#  @DESKTOP1
  #Bet not available
#  Scenario: User places bet opting Teaser & Pleaser under Bet Slip and confirming the confirmation message
#    Given as a User,I already see a confirmation message with Back and Confirm button
#    When I click on Confirm
#    Then I see a success or failure message
#
#  @DESKTOP1
  #Bet not available
#  Scenario: User places bet opting Teaser & Pleaser under Bet Slip but clicks Back on the confirmation message
#    Given as a User,I already see a confirmation message with Back and Confirm button
#    When I click on Back
#    Then I see all the teams back again with Risk amount
#




#
# @DESKTOP  @NotFound
##Close icon not displayed after UI Change
#  @DESKTOP1  @s77
#  Scenario: : User clicks on close icon after viewing My Bets under BETS
#    Given as a User, I already see Betslip page
#    When I click over close icon
#    Then I see Betslip page gets closed


  #Unavailable
#  @DESKTOP1
#  Scenario Outline: User accesses the OVER/UNDER present under PLAYER PROPS sub-tab
#    Given as a User, I have already clicked on PLAYER PROPS
#    And I have selected from the dropdown displaying all teams available
#    When user select <Player Props sub-tab>
#    Then I see two <li> elements on the page displayed on clicking QUICK PICKS
#
#    Examples:
#      | li      |
#      | Players |
#      | Stats   |

#Unavailable
#  @DESKTOP1
#  Scenario: User selects Players from the choices displayed under OVER/UNDER
#    Given as a User, I have already selected from dropdown displaying upcoming games from under OVER/UNDER
#    And I have selected from the dropdown displaying all teams available
#    When I select Players
#    Then I see all the displayed results as per the selection

# Unavailable
#  @DESKTOP1
#  Scenario: User selects Stats from the choices displayed under OVER/UNDER
#    Given as a User, I have already selected from dropdown displaying upcoming games from under OVER/UNDER
#    And I have selected from the dropdown displaying all teams available
#    When I select Stats
#    Then I see all the displayed results as per the selection



#  //---------------------------//

  @MOBILE
  Scenario: User accesses "PLAYER PROPS" tab under homepage
    Given I am on SportsBetting application
    And I move to PLAYER PROPS
    And I see under Player Props page two navigators
    And I click on Left Navigator and I see three odds converters
      | AMERICAN |
      | DECIMAL  |
      | FRACTION |
    When I click on any league active with football or basketball icon
    Then I see few sub-tabs on the page displayed on clicking PLAYER PROPS
      | CURRENT MARKETS |
      | UPCOMING EVENTS |


  @MOBILE
  Scenario: User accesses Current Markets under Player Props page
    Given I see few sub-tabs on the page displayed on clicking PLAYER PROPS
      | CURRENT MARKETS |
      | UPCOMING EVENTS |
    And I see Current Markets selected as default under Player Props page
    When I click any game available under Current Markets
    Then I see a dropdown under Current Markets team selected showing odds

  @MOBILE
  Scenario: User accesses odds under Player Props page Current Markets
    Given I see a dropdown under Current Markets team selected showing odds
    When I click on any odds under team selected
    Then I see Bet Slip with team and RTN value
    And I remove team from Bet Slip

  @MOBILE
  Scenario: User accesses Upcoming Events under Player Props page
    Given I see few sub-tabs on the page displayed on clicking PLAYER PROPS
      | CURRENT MARKETS |
      | UPCOMING EVENTS |
    When I click Upcoming Events under Player Props page
    Then I see few upcoming games with Date and Time
    And I see More Help, FAQ, Rules

  @MOBILE
  Scenario: User accesses More Help, FAQ, Rules under Player Props page
    Given I see More Help, FAQ, Rules
    When I click More Help, FAQ, Rules
    Then I see help topics and one close button

  @MOBILE
  Scenario: User closes More Help, FAQ, Rules under Player Props page
    Given I see help topics and one close button
    When I click close under More Help, FAQ, Rules pop up
    Then I see help topics gets closed and current markets gets selected

  @MOBILE
  Scenario: User verifies Left Navigator under Player Props page
    Given I see help topics gets closed and current markets gets selected
    And I see Left Navigator under Player Props page
    When I click on Left Navigator and I see three odds converters
      | AMERICAN |
      | DECIMAL  |
      | FRACTION |
    Then I see few leagues under Left Navigator

  @MOBILE
  Scenario: User accesses Odds Converter under Left Navigator under Player Props page
    Given I see few leagues under Left Navigator
    When I click on any odds converter
    Then I see the odds value changes accordingly

  @MOBILE
  Scenario: User verifies Right Navigator under Player Props page
    Given I see few sub-tabs on the page displayed on clicking PLAYER PROPS
      | CURRENT MARKETS |
      | UPCOMING EVENTS |
    And I see Right Navigator under Player Props page
    When I click on Right Navigator
    Then I see a dropdown under Right Navigator with options
      | Betslip |
      | My Bets |
      | Help    |

  @MOBILE
  Scenario: User accesses Bet Slip present under Right Navigator dropdown
    Given I see a dropdown under Right Navigator with options
      | Betslip |
      | My Bets |
      | Help    |
    And I click on Betslip under the dropdown
    When I see Bet Slip stating No bets
    Then I close Bet Slip under Player Props

  @MOBILE
  Scenario: User accesses My Bets present under Right Navigator dropdown
    Given I click on Right Navigator
    And I see a dropdown under Right Navigator with options
      | Betslip |
      | My Bets |
      | Help    |
    And I click on My Bets under the dropdown
    Then I see three options under My Bets
      | Back      |
      | Open Bets |
      | Past Bets |

  @MOBILE
  Scenario: User verifies Open Bets present under My Bets
    Given I see three options under My Bets
      | Back      |
      | Open Bets |
      | Past Bets |
    When I see open bets selected as default
    Then I see any bets placed under open bets or empty open bets

  @MOBILE
  Scenario: User verifies Past Bets present under My Bets
    Given I see three options under My Bets
      | Back      |
      | Open Bets |
      | Past Bets |
    When I click past bets under My Bets
    Then I see any bets present under past bets or empty past bets

  @MOBILE
  Scenario: User verifies Back present under My Bets
    Given I see three options under My Bets
      | Back      |
      | Open Bets |
      | Past Bets |
    When I click back button under My Bets
    Then I see page redirects to Player props with Current Markets selected as default

  @MOBILE
  Scenario: User verifies Right Navigator under Player Props page
    Given I see Current Markets selected as default under Player Props page
    And I see Right Navigator under Player Props page
    When I click on Right Navigator
    Then I see a dropdown under Right Navigator with options
      | Betslip |
      | My Bets |
      | Help    |

  @MOBILE
  Scenario: User accesses Help present under Right Navigator dropdown
    Given I see a dropdown under Right Navigator with options
      | Betslip |
      | My Bets |
      | Help    |
    And I click on Help under the dropdown
    When I see help topics and one close button
    Then I click close under More Help, FAQ, Rules pop up
    And I see help topics gets closed and current markets gets selected

  @MOBILE
  Scenario: User accesses Player Props
    Given I am on SportsBetting application
    And I move to PLAYER PROPS
    And I see two navigators under Player Props page
    And I click on Left Navigator and I see three odds converters
      | AMERICAN |
      | DECIMAL  |
      | FRACTION |
    When I click on any league active with football or basketball icon
    Then I see few sub-tabs on the page displayed on clicking PLAYER PROPS
      | CURRENT MARKETS |
      | UPCOMING EVENTS |

  @MOBILE
  Scenario: User accesses Current Markets under Player Props page
    Given I see few sub-tabs on the page displayed on clicking PLAYER PROPS
      | CURRENT MARKETS |
      | UPCOMING EVENTS |
    And I see Current Markets selected as default under Player Props page
    When I click any game available under Current Markets
    Then I see a dropdown under Current Markets team selected showing odds

  @MOBILE
  Scenario: User accesses odds under Player Props page Current Markets
    Given I see a dropdown under Current Markets team selected showing odds
    When I click on any odds under team selected
    Then I see Bet Slip with team and RTN value

  @MOBILE
  Scenario: User clears Bet under Player Props
    Given I see Bet Slip with team and RTN value
    When I click on clear slip under Player Props Bet Slip
    Then I should see Bet Slip closed and Bet Slip team count to be 0

  @MOBILE
  Scenario: User accesses odds under Player Props page Current Markets
    Given I see a dropdown under Current Markets team selected showing odds
    When I click on any odds under team selected
    Then I see Bet Slip with team and RTN value

  @MOBILE
  Scenario: User places Bet under Player Props
    Given I see Bet Slip with team and RTN value
    And I enter RTN value under corresponding field
    When I click on place bets under Player Props Bet Slip
    Then I should see bet successful message
    And I remove team from Bet Slip

  @MOBILE
  Scenario: User accesses "PLAYER PROPS" tab under homepage
    Given I am on SportsBetting application
    And I move to PLAYER PROPS
    And I see two navigators under Player Props page
    And I click on Left Navigator and I see three odds converters
      | AMERICAN |
      | DECIMAL  |
      | FRACTION |
    When I click on any league active with soccer icon
    Then I see few sub-tabs on the page displayed on clicking PLAYER PROPS
      | BUILD        |
      | QUICK PICKS  |
      | OVER / UNDER |
    And I see a dropdown displaying all teams available to select form
    And I see all the displayed teams changes according to the selected choice

  @MOBILE
  Scenario: User accesses the "BUILD" present under "PLAYER PROPS" tab
    Given I see few sub-tabs on the page displayed on clicking PLAYER PROPS
      | BUILD        |
      | QUICK PICKS  |
      | OVER / UNDER |
    When I click on BUILD under Player Props page
    Then I see few a search box and dropdown displaying upcoming games on the page displayed on clicking BUILD
    And I see few default results to select from

  @TestB
  Scenario: User searches a team from "BUILD" present under "PLAYER PROPS" tab
    Given as a User, I have already clicked on BUILD
    When I search using search box
    Then I see all the related results getting displayed on a dropdown (search box) page

  @MOBILE
  Scenario: User selects from dropdown (displaying upcoming games) present under "BUILD"
    Given as a User, I have already clicked on BUILD
    When I choose from the available options under dropdown displaying upcoming games
    Then I see all the related results getting displayed under BUILD

  @MOBILE
  Scenario: User chooses from displayed result present under "BUILD"
    Given as a User,I have already see few results under BUILD
    When I select from the choices available
    Then I see all the selected teams get added under the Build Your Bet header

  @TestB
  Scenario: User accesses "HELP" present under "BUILD"
    Given as a User, I have already clicked on BUILD
    And I click on HELP under BUILD
    When I see all the build related help contents on a pop-up
    Then I can close the pop-up clicking close (Icon)

  @MOBILE
  Scenario: User accesses the "QUICK PICKS" present under "PLAYER PROPS" sub-tab
    Given I am on SportsBetting application
    And I move to PLAYER PROPS
    And I see two navigators under Player Props page
    And I click on Left Navigator and I see three odds converters
      | AMERICAN |
      | DECIMAL  |
      | FRACTION |
    And I click on any league active with soccer icon
    When I click on QUICK PICKS under Player Props
    Then I select from the dropdown displaying upcoming games on the page displayed on clicking QUICK PICKS

  @MOBILE
  Scenario: User selects from the choices displayed under "QUICK PICKS" after selecting from the dropdown (displaying upcoming games)
    Given as a User, I have already selected from dropdown displaying upcoming games from under QUICK PICKS
    And user click on any button available under teams names
    When I select any items anchor after clicking button
    Then I see Bet Slip with team and RTN value
    And I remove team from Bet Slip

  @MOBILE
  Scenario: User selects "Collapse All" from the choices displayed under "QUICK PICKS" after selecting from the dropdown (displaying upcoming games)
    Given as a User, I have already selected from dropdown displaying upcoming games from under QUICK PICKS
    And I have selected from the dropdown displaying all teams available
    When I click on collapse dropdown icon on the team that I expanded
    Then I see all the displayed results gets collapsed under there headers

  @MOBILE
  Scenario: User accesses the "OVER/UNDER" present under "PLAYER PROPS" sub-tab
    Given I see few sub-tabs on the page displayed on clicking PLAYER PROPS
      | BUILD        |
      | QUICK PICKS  |
      | OVER / UNDER |
    When I click on OVER / UNDER under Player Props
    Then I see two options on the page displayed on clicking OVER / UNDER
      | Players |
      | Stats   |

  @MOBILE
  Scenario: User selects "Players" from the choices displayed under "OVER/UNDER"
    Given I see two options on the page displayed on clicking OVER / UNDER
      | Players |
      | Stats   |
    When I click Players option under OVER / UNDER
    Then I see all the displayed results as per Players selection

  @MOBILE
  Scenario: User selects "Stats" from the choices displayed under "OVER/UNDER"
    Given I see two options on the page displayed on clicking OVER / UNDER
      | Players |
      | Stats   |
    When I click Stats option under OVER / UNDER
    Then I see all the displayed results as per Stats selection

  @MOBILE
  Scenario: User accesses the "Build Your Bet" present under "PLAYER PROPS" tab nut only when players selected from "BUILD"
    Given I see few sub-tabs on the page displayed on clicking PLAYER PROPS
      | BUILD        |
      | QUICK PICKS  |
      | OVER / UNDER |
    And I click on BUILD under Player Props page
    When I select any player(s) from under BUILD
    Then I see anchor tags choices and one dropdown namely BETS
      | STAT  |
      | H2H   |
      | TRIOS |

  @MOBILE
  Scenario: User accesses any anchor (STAT/H2H/TRIOS) present under "Build Your Bet" header
    Given I see anchor tags choices and one dropdown namely BETS
      | STAT  |
      | H2H   |
      | TRIOS |
    And I select any anchor choices
    When I select from the choices available under anchors
    Then I see teams selected displayed under choice of anchor selected with Build options
      | Number |
      | Odds   |

  @MOBILE
  Scenario: User places a bet under any anchor (STAT/H2H/TRIOS) present under "Build Your Bet" header and declines confirmation pop-up
    Given I see teams selected displayed under choice of anchor selected with Build options
      | Number |
      | Odds   |
    And I see any will have option from under will have header only for STAT
      | at least |
      | over     |
      | under    |
    And I enter value in Number in between range
    And user click Add To Bet Slip
    And I see Bet Slip with team and RTN value
    And I enter RTN value under corresponding field
    When I click on place bets under Player Props Bet Slip under Bet Slip
    Then I click cancel on the confirmation pop-up shown
    And I see confirmation pop-up goes away

  @MOBILE
  Scenario: User places a bet under any anchor (STAT/H2H/TRIOS) present under "Build Your Bet" header and accepting confirmation pop-up
    Given I see Bet Slip with team and RTN value
    When I click on place bets under Player Props Bet Slip
    Then I should see bet successful message
    And I remove team from Bet Slip

  @MOBILE
  Scenario: User after adding team(s) goes for "clear" option under "Build Your Bet"
    Given I am on SportsBetting application
    And I move to PLAYER PROPS
    And I see two navigators under Player Props page
    And I click on Left Navigator and I see three odds converters
      | AMERICAN |
      | DECIMAL  |
      | FRACTION |
    And I click on any league active with soccer icon
    And I click on BUILD under Player Props page
    And I select any player(s) from under BUILD
    And I select from the choices available under anchors
    When I click clear under Build Your Bet
    Then I see all the added teams gets removed under Build Your Bet

  @MOBILE
  Scenario: User verifies "RESET" under "Build Your Bet"
    Given I am on SportsBetting application
    And I move to PLAYER PROPS
    And I see two navigators under Player Props page
    And I click on Left Navigator and I see three odds converters
      | AMERICAN |
      | DECIMAL  |
      | FRACTION |
    And I click on any league active with soccer icon
    And I click on BUILD under Player Props page
    And I select any player(s) from under BUILD
    And I select from the choices available under anchors
    When I click on RESET under Build Your Bet
    Then I see BUILD YOUR BET dissapears and options available
      | BUILD        |
      | QUICK PICKS  |
      | OVER / UNDER |

  @MOBILE
  Scenario: User accesses help icon under soccer page
    Given I see few sub-tabs on the page displayed on clicking PLAYER PROPS
      | BUILD        |
      | QUICK PICKS  |
      | OVER / UNDER |
    And I click on help icon near Right Navigator
    When I see help pop-up
    Then I click on cross button on the help pop up
    And I see help pop-up dissapears and options available
      | BUILD        |
      | QUICK PICKS  |
      | OVER / UNDER |



