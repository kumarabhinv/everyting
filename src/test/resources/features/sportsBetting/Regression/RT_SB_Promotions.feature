Feature: Accessing the PTY Promotions Tab


#  @DESKTOP
#  Scenario Outline: User visits SportsBetting application
#    Given I am on SportsBetting application
#    When User login to the SportsBetting site with following credential <Username> and <Password>
#    Then I should see the SportsBetting site homepage
#
#    Examples:
#      | Username | Password  |
#      | SB808358 | C0d0!d_P@ss1 |

  @DESKTOP  
  Scenario Outline: User verifies Promotions tab present inside the home page
    Given I am on SportsBetting application
    When I move to <Tab>
    Then I should see details related to promotion tab
      | DEPOSIT        |
      | REFER A FRIEND |
      | SPORTS         |
      | RACEBOOK       |
      | CASINO         |
      | POKER          |
      | CONTESTS       |

  #  Then I see different <sub-tabs1> under Promotions tab

    Examples:
      | Tab        |
      | PROMOTIONS |
#      | sub-tabs1   |
#     | &sub-tabs1& |

#Deposit
  @DESKTOP  
  Scenario Outline: User verifies Deposit sub-tab under the Promotions tab
    Given as a User, I am on the Promotion page
    When I click on promotions <sub-tab>
    Then I see different deposit options under Deposit sub-tab

    Examples:
      | sub-tab |
      | Deposit |


#Deposit Now
  @DESKTOP  
  Scenario: User clicks on Deposit Now sub-tab under Deposit sub-tab
    Given as a User, I am inside the Deposit sub-tab
    When I click on Deposit Now
    Then I am redirected to the promotion CASHIER page

#Terms and Conditions
  @DESKTOP  
  Scenario: User clicks on the Terms & Conditions under the Deposit sub-tab of Promotions tab
    Given I am on SportsBetting application
    And I click Promotions tab
    When I click on Terms & Conditions
    Then I see the Terms & Conditions on a pop-up with Close (button and Icon) on it

  @DESKTOP  
  Scenario: User decides to Cancel the Terms & Conditions pop-up under the Deposit sub-tab of Promotions tab
    Given as a User, I am on the Terms & Conditions pop-up
    When I click on Cancel (either button or icon)
    Then I see the Terms & Conditions pop-up gets closed

#Scenario unavailable
#@DESKTOP 
#  Scenario: User verifies Click here under the Deposit sub-tab of Promotions tab
#  Given as a User, I am inside the Deposit sub-tab
##    When I click on Clcik here (if available)
#    When I click on Click here (if available)
#    Then I am redirected to that particular Contest full details view

#Play Now

  @DESKTOP  
  Scenario: User clicks on Play Now sub-tab under Deposit sub-tab
    Given I am on SportsBetting application
    And I click Promotions tab
    When I click on PLAY NOW in promotion
    Then I am redirected to the Bonus sub-tab under CASINO page

#    todo:scenario not availabe
    @DESKTOP1
  Scenario: User verifies OptIN under the Deposit sub-tab of Promotions tab
    Given I am on SportsBetting application
    And I click Promotions tab
    When I click on Opt In Deposit promotion
    Then I am redirected to that particular Contest full details


  @DESKTOP1
  Scenario Outline: User verify OptIn option in OptIn pormotion page
    Given I am on SportsBetting application
    And I click Promotions tab
    And I click on Opt In Deposit promotion
    And I enter my <email> iOpt In promotion
    When I click Opt In (If available)
    Then I see Congratulations, You have been registered. message displayed as confirmation (If Opt In available)

    Examples:

      | email              |
      | TestingUser_RANDOM |

#Refer a Friend
  @DESKTOP  
  Scenario Outline: User clicks on Refer a Friend sub-tab under Promotions tab
    Given I am on SportsBetting application
    And I click Promotions tab
    When I click on promotion <sub-tab>
#    Then I see Refers present with REFER NOW sub-tab
    Then I see Refers present with REFER NOW option

    Examples:
      | sub-tab        |
      | Refer a Friend |

#REFER NOW
  @DESKTOP  
  Scenario: User clicks on REFER NOW under Refer a Friend sub-tab
    Given as a User, I am on the Refer a Friend page
    When I click on REFER NOW
    Then I am redirected to My Account under the home page with Referal url to share

#Sports
  @DESKTOP  
  Scenario Outline: User verifies Sports sub-tab under Promotions tab
    Given I am on SportsBetting application
    And I click Promotions tab
    When I click on promotions <sub-tab>
    Then I see different sports promotions with options

    Examples:
      | sub-tab |
      | Sports  |

  @DESKTOP   
 Scenario Outline: User clicks on Deposit Now sub-tab under Sports sub-tab
    Given I am on SportsBetting application
    And I click Promotions tab
    And I click on promotions <sub-tab>
    When I click on Deposit Now in Sports Promotion
    Then I am redirected to the promotion CASHIER page

    Examples:
      | sub-tab |
      | Sports  |

  @DESKTOP  
  Scenario Outline: User verifies the Learn More sub-tab under the Sports sub-tab of Promotions tab
    Given I am on SportsBetting application
    And I click Promotions tab
    And I click on promotions <sub-tab>
    When I click on Learn More in Sports Promotion
    Then I see detailed view of information for the particular chosen

    Examples:
      | sub-tab |
      | Sports |

##Closed scenario not availabe in sports
#  @DESKTOP 
#  Scenario: User clicks on Closed inside Sports sub-tab
#    Given as a User, I am on the Sport page inside Promotions tab
#    When I click on Closed
#    Then I am redirected to Contests page

#Racebook
  @DESKTOP  
  Scenario Outline: User verifies Racebook sub-tab under Promotions tab
    Given I am on SportsBetting application
    And I click Promotions tab
    When I click on promotions <sub-tab>
    Then I see different Racebook promotions with options

    Examples:
      | sub-tab  |
      | Racebook |

  @DESKTOPBlocker
  Scenario Outline: User clicks on Deposit Now
  sub-tab under Sports sub-tab
    Given I am on SportsBetting application
    And I click Promotions tab
    And I click on promotions <sub-tab>
    When I click on Deposit Now in Racebook Promotion
    Then I am redirected to the promotion CASHIER page

    Examples:
      | sub-tab |
      | Racebook  |


#Casino
  @DESKTOP  
  Scenario Outline: User verifies Casino sub-tab under Promotions tab
    Given I am on SportsBetting application
    And I click Promotions tab
    When I click on promotions <sub-tab>
    Then I see different casino promotions with options

    Examples:
      | sub-tab |
      | Casino  |

##Click here ---
#  @DESKTOP 
#  Scenario Outline: User verifies Click here under the Casion sub-tab of Promotions tab
#    Given as a User, I am on the Casino under Promotions tab
#    When I click on Opt In Casino promotion
#    Then I am redirected to that particular Contest full details view with <option3>
#
#    Examples:
#      | option3 |
#      | Opt In  |
#
##Opt In
#  @DESKTOP --blocker
#  Scenario: User verifies e already clicked Click here option under Casino tab
#    And I enter my email iOpt In inside the Click here option under Casino tab
#    Given as a User, I havd (If available)
#    When I click Opt In (If available)
#    Then I see Congratulations, You have been registered. message displayed as confirmation (If Opt In available)
#    And I see all the contests related details

# todo: SCENARIO NOT AVAILABLE 17-7-20
  @DESKTOP1
  Scenario: User verifies Click here under the Casion sub-tab of Promotions tab
    Given I am on SportsBetting application
    And I click Promotions tab
    And I click casino tab
    When I click on Opt In Casino promotion
    Then I am redirected to that particular Contest full details



  @DESKTOPBlocker
 Scenario Outline: User verify OptIn option in OptIn pormotion page
    Given I am on SportsBetting application
    And I click Promotions tab
    And I click casino tab
    And I click on Opt In Casino promotion
    And I enter my <email> iOpt In casino promotion
    When I click Opt In (If available)
    Then I see Congratulations, You have been registered. message displayed as confirmation (If Opt In available)

    Examples:

      | email              |
      | TestingUser_RANDOM |



#Poker
  @DESKTOP  
  Scenario Outline: User verifies the Poker sub-tab under the Promotions tab
    Given I am on SportsBetting application
    And I click Promotions tab
    When I click on promotions <sub-tab>
    Then I see different poker promotions with options

    Examples:
      | sub-tab |
      | Poker |

#Learn More
  @DESKTOP  
  Scenario Outline: User verifies the Learn More sub-tab under the Poker sub-tab of Promotions tab
    Given as a User, I am on the Promotion page
    And I click on promotions <sub-tab>
    When I click on Learn More
    Then I see detailed view of information for the particular chosen

    Examples:
      | sub-tab |
      | Poker |
#      | options5   |
#      | &options5& |


#Play Now >>> not completed bcz site logged out
  @DESKTOP1  
 Scenario Outline: User clicks on Play Now sub-tab under Poker sub-tab
    Given I am on SportsBetting application
    And I click Promotions tab
    And I click on promotions <sub-tab>
    And I click on PLAY NOW in Poker Promotion
    And I see detailed view of information for the particular chosen
    When I click on PLAY NOW inside promotion
#    Then I am redirected to the Poker page under the home page    todo blocker

  Examples:
    |sub-tab|
    | Poker |


#todo:SCENARIO NOT AVAILABLE -17-7-20
  @DESKTOP1
  Scenario: User verifies Click here under the Poker sub-tab of Promotions tab
    Given I am on SportsBetting application
    And I click Promotions tab
    And I click Poker tab
    When I click on Opt In Poker promotion
    Then I am redirected to that particular Contest full details


  @DESKTOPBlocker
  Scenario Outline: User verify OptIn option in OptIn pormotion page
    Given I am on SportsBetting application
    And I click Promotions tab
    And I click Poker tab
    And I click on Opt In Poker promotion
    And I enter my <email> iOpt In Poker promotion
    When I click Opt In (If available)
    Then I see Congratulations, You have been registered. message displayed as confirmation (If Opt In available)

    Examples:

      | email              |
      | TestingUser_RANDOM |

#Click here >>>> not availabe in site
  @DESKTOP1 
  Scenario: User verifies Click here under the Poker sub-tab of Promotions tab
    Given as a User, I am inside the Poker sub-tab
    And I click on Click here
    When I see detailed view of information for the particular chosen
    Then I click on PLAY NOW
    And I am redirected to the Poker page under the home page

#Contests
  @DESKTOP  
  Scenario Outline: User verifies the Contests sub-tab under Promotions tab
    Given I am on SportsBetting application
    And I click Promotions tab
    When I click on promotions <sub-tab>
    Then I see different contest promotions with options

    Examples:
      | sub-tab |
      | Contests |

#Enter Now >>>> not avialabe in site
  @DESKTOP1 
  Scenario: User verifies the Enter Now sub-tab under the Contests sub-tab of Promotions tab
    Given as a User, I am on the Contests page inside the Promotions tab
    When I click on Enter Now
    Then I am redirected to the Contests page of the Contests tab

#Closed
  @DESKTOP  
  Scenario: User verifies the Closed sub-tab under the Contests sub-tab of Promotions tab
    Given as a User, I am on the Contests page inside the Promotions tab
    When I click on Closed
    Then I am redirected to the Contests page of the Contests tab