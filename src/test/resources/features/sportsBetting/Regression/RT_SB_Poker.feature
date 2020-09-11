Feature: Validating the functionality of Poker tab in sports betting.

#  @DESKTOP
#  Scenario Outline: User visits SportsBetting application
#    Given I am on SportsBetting application
#    When User login to the SportsBetting site with following credential <Username> and <Password>
#    Then I should see the SportsBetting site homepage
#    Examples:
#      | Username | Password     |
#      | SB808360 | C0d0!d_P@ss1 |

 @MOBILE
  Scenario:  User verifies all the sub tabs present under the Live Betting tab.
   Given as a User, I am on Sportsbetting application
   When I move to POKER
    Then I see different choices available with options

#POKER
  @DESKTOP  
  Scenario Outline: User accesses the Poker sub-tab under the POKER tab
    Given as a User, I am on the Poker sub-tab page
    When I see different images available with different text and an iframe
      | Download PC  |
      | PLAY ONLINE NOW  |
      | DOWNLOAD MAC |
    Then I see several <headers> Poker sub-tab should be highlighted
    Examples:
      | headers              |
      | POPULAR PROMOTIONS   |
      | FAVORITE TOURNAMENTS |
      | LEADERBOARDS         |

  @MOBILE
  Scenario: User verifies Poker tab under the homepage
    Given I am on SportsBetting application
    When I move to POKER
    Then I am shown two images with QR respectively for APPLE and ANDROID devices with options
      | PLAY NOW     |
      | DOWNLOAD NOW |

#PLAY NOW (Apple Devices)
  @MOBILE
  Scenario: User clicks on "PLAY NOW" (APPLE DEVICES) under "POKER" tab
    Given I see Poker page with Play Now and Download Now
    When I click on PLAY NOW under Poker
    Then I see redirected page with game active to play

  @MOBILE1
  Scenario: User scans QR (APPLE DEVICES) under "POKER" tab
    Given I am on SportsBetting application
    And I move to POKER
    When I see Poker page with Play Now and Download Now
    Then I see QR available for APPLE DEVICES

  @DESKTOP   
  Scenario Outline: User accesses image displaying BAD BEAT JACKPOT under Poker sub-tab
    Given as a User, I am on the Poker sub-tab page
    When I click on BAD BEAT JACKPOT image
    Then I should be redirected to BAD BEAT JACKPOT page
    And I see div-class along with an image with carousel, headers displaying contestants winning prizes and <t&c>

    Examples:
      | t&c              |
      | Terms&Conditions |

#Pop-up not opening
#  @DESKTOP  @scenario4 @batch
#  Scenario: User accesses Terms & Conditions under BAD BEAT JACKPOT redirected page
#    Given as a User, I am on the redirected page after clicking BAD BEAT JACKPOT image in Poker sub-tab
#    When I click Terms &Condition
#    Then I should see a pop-up with all the terms and conditions

  @DESKTOP  
  Scenario: User accesses image with alt as banner under BAD BEAT JACKPOT redirected page
    Given as a User, I am on the redirected page after clicking BAD BEAT JACKPOT image in Poker sub-tab
    When I click image displaying BAD BEAT JACKPOT with alt as banner
    Then I should be redirected back to the Poker sub-tab page

#div-class
  @DESKTOP 
  Scenario: User verifies the counting figure under BAD BEAT JACKPOT redirected page
    Given as a User, I am on the Poker sub-tab page
    When I click on BAD BEAT JACKPOT image
#    When I scroll down to div element with class as layout__landing-odometer-content
    Then I should be shown count figure which should keep updating in every 1 minute

#iframe
  @DESKTOP1
  Scenario: User verifies the counting figure in Poker sub-tab
    #Given as a User, I am on the Poker sub-tab page
    Given I am on SportsBetting application
    When I move to Poker
    When I scroll down to iframe with id as myIframe
    Then I should be shown count figure which should keep updating within 15 seconds


#DOWNLOAD FOR PC
  @DESKTOP
  Scenario: User accesses image displaying DOWNLOAD FOR PC under Poker sub-tab
    Given I am on SportsBetting application
    When I move to Poker
    When I click on image displaying DOWNLOAD FOR PC containing link
    Then I should be given windows pop-up to save the file

#PLAY ONLINE NOW
  @DESKTOP
  Scenario: User accesses image displaying PLAY ONLINE NOW under Poker sub-tab
    Given as a User, I am on the Poker sub-tab page
    When I click on image displaying PLAY ONLINE NOW
    Then I should see a new tab with login credentials option for login


#DOWNLOAD FOR MAC
  @DESKTOP
  Scenario: User accesses image displaying DOWNLOAD FOR MAC under Poker sub-tab
    Given as a User, I am on Sportsbetting application
    And as a User, I am on the Poker sub-tab page
    When I click on image displaying DOWNLOAD FOR MAC
    Then I should be given windows pop-up to save file

#POKER TOURNAMENT SCHEDULE
  @DESKTOP
  Scenario: User accesses image displaying POKER TOURNAMENT SCHEDULE under Poker sub-tab
    Given as a User, I am on the Poker sub-tab page
    When I click on image displaying POKER TOURNAMENT SCHEDULE
    Then User should be redirected to Poker tournaments page

#POKER FEEDBACK
  @DESKTOP
  Scenario Outline: User accesses image displaying POKER FEEDBACK under Poker sub-tab
    Given I am on SportsBetting application
    And I move to Poker
    When I click on image displaying POKER FEEDBACK
    Then User gets redirected to <link>
    Examples:
      | link                                            |
      | https://www.surveymonkey.com/r/SB-POKERFEEDBACK |

#POPULAR PROMOTIONS
  @DESKTOP
  Scenario: User accesses options displayed  under POPULAR PROMOTIONS header of Poker sub-tab
    Given I am on SportsBetting application
    And I move to Poker
    When I scroll down to POPULAR PROMOTIONS header
    Then User should be shown different promotional options

  @DESKTOP
  Scenario: User selects any option displayed  under POPULAR PROMOTIONS header of Poker sub-tab
    Given as a User, I see all the options available under POPULAR PROMOTIONS header
    When I select any option from the available options
    Then I should be redirected to that particular selection page
    And I should see all promotional details for the selection


#Favourite Tournaments

  @DESKTOP
  Scenario: User accesses options displayed  under Favourite Tournaments header of Poker sub-tab
    Given I am on SportsBetting application
    And I move to Poker
    When I scroll down to Favourite Tournaments header
    Then User should be shown different tournaments available

  @DESKTOP
  Scenario: User selects any option displayed under Favourite Tournaments header of Poker sub-tab
    Given I am on SportsBetting application
    And I move to Poker
    And I see all the options available under Favourite Tournaments header
    When I select any option under Favorite Tournaments header
    Then I should be redirected to that particular tournament page
#    And I should see all promotional details for that particular selection

#Leaderboards
  @DESKTOP
  Scenario: User accesses options displayed  under LEADERBOARDS header of Poker sub-tab
    Given I am on SportsBetting application
    And I move to Poker
    When I scroll down to LEADERBOARD header
    Then User should be shown different results available

  @DESKTOP
  Scenario: User selects any option displayed  under LEADERBOARDS header of Poker sub-tab
    Given I am on SportsBetting application
    And I move to Poker
    And I see all the options available under Leaderboards header
    When I select any option under the Leaderboards Header
    Then I should be redirected to that particular page
    And I should see all leaderboard details for that particular selection

#PROMOTIONS
  @DESKTOP
  Scenario: User accesses the Promotions sub-tab under the POKER tab
    Given I am on SportsBetting application
    And I move to Poker
    When I click on Promotions sub-tab in poker
    Then I see different promotional options
    And Promotions sub-tab should be highlighted

  @DESKTOP
  Scenario: User selects any promotion displayed under Promotions sub-tab
    Given as a User, I have already clicked on Promotions tab
    When I click on any available option from the available options
    Then I should be redirected to that particular selection page with options


  @DESKTOP
  Scenario: User opts for PLAY NOW (If available) under selected option from Promotions sub-tab
    Given as a User, I have already selected any option from under Promotions sub-tab
    When I click on PLAY NOW in poker
    Then I should see a new tab with login credentials option

    #Pop-up not opening
#  @DESKTOP
#  Scenario: User opts for Terms & Conditions (If available) under selected option from Promotions sub-tab
#    Given as a User, I have already clicked on Promotions tab
#    When I click on any available option from the available options
#    When I click on Terms & Conditions
#    Then I should be shown with a pop-up listing all the Terms & Conditions

#Not present most of the times
#  @DESKTOP
#  Scenario: User opts for DEPOSIT NOW (If available) under selected option from Promotions sub-tab
#    Given as a User, I have already selected any option from under Promotions sub-tab
#    And I see all the details for that particular selection
#    When I click on DEPOSIT NOW
#    Then I should see a new tab with all the deposit and payout related options

 #Pop-up not opening
#  @DESKTOP
#  Scenario: User opts to Close Terms & Conditions displayed
#    Given as a User, I can see a pop-up with all the Terms & Conditions
#    When I click on Close either button or icon
#    Then pop-up should get closed
#    And I see all the details of the particular selection

#Mobile
  @DESKTOP
  Scenario: User accesses the Mobile sub-tab under the POKER tab
    Given I am on SportsBetting application
    And I move to Poker
    When I click on Mobile sub-tab
    Then I see an image and two QR codes
    And Mobile sub-tab should be highlighted
    
    #DOWNLOAD NOW (Android Devices)
  @MOBILE
  Scenario: User clicks on "DOWNLOAD NOW" (ANDROID DEVICES) under "POKER" tab
    Given I see Poker page with Play Now and Download Now
    Then I see DOWNLOAD NOW under Poker

  @MOBILE
  Scenario: User scans QR (ANDROID DEVICES) under "POKER" tab
    Given I see Poker page with Play Now and Download Now
    Then I see QR available for ANDROID DEVICES