Feature: Validating the functionality of "My Account" tab in sports betting.

#  @DESKTOP @MOBILE
#  Scenario Outline: User visits SportsBetting application
#    Given I am on SportsBetting application
#    When User login to the SportsBetting site with following credential <Username> and <Password>
#    Then I should see the SportsBetting site homepage
#    Examples:
#      | Username | Password     |
#      | SB808358 | C0d0!d_P@ss1 |

  @DESKTOP
  Scenario: User verifies all the functionalities of "My Account" tab under homepage but "My Account" is replaced by "My Messages"
    Given as a User, I already see homepage
    And I see New Messages instead of My Account
    When I click on New Messages
    Then I see all the messages under My Messages sub-tab under My Account tab

  @MOBILE

  Scenario: User verifies all the functionalities of "My Account" tab under homepage
    Given as a User, I have already clicked on Left Navigator
    When I click on My Account under Left Navigator
    Then page should be redirected to My Account page with sub-tabs
      | Profile          |
      | Reports          |
      | Promotions       |
      | Deposit          |
      | Payouts          |
      | My Messages      |
      | Refer My Friends |

  @MOBILE
  Scenario Outline: User accesses "Profile" sub-tab under "My Account"
    Given as a User, I have already clicked on My Account under Left Navigator
    When I click on Profile sub-tab
    Then I see three <headers> with + and - sign
    And I see Customer Service link

    Examples:
      | headers              |
      | Personal Information |
      | Time Zone            |
      | Odds Type            |

  @MOBILE
  Scenario: User accesses "Personal Information" under "Profile"
    Given as a User, I have already clicked on Profile under My Account
    When I click on Personal Information plus sign
    Then I see Personal Information header expanded
    And I see all the profile (User) information under Profile Information

  @DESKTOP
  Scenario Outline: User verifies all the functionalities of "My Account" tab under homepage
    Given as a User, I already see homepage
    When I click on New Messages
    Then page is redirected to My Account page with <headers>

    Examples:
      | headers      |
      | My Account   |
      | Useful Links |

  @MOBILE
  Scenario: User chooses to collapse (hide) details shown below "Personal Information" under "Profile"
    Given as a User, I have already see all the profile (User) information under Profile Information
    When I click on Personal Information  - sign
    Then I see Personal Information header collapsed and all the information gets hidden

  @MOBILE
  Scenario: User accesses "Time Zone" under "Profile"
    Given as a User, I have already clicked on Profile under My Account
    #When I click on Time Zone plus sign
    Then I see my default time zone
    And I see Change in order to change my time zone

  @DESKTOP
  Scenario Outline: User verifies "My Account" header under "My Account" tab
    Given as a User, I already see My Account tab page
    When page is redirected to My Account page with My Account
    Then I see My Account header containing different <sub-tabs>

    Examples:
      | sub-tabs               |
      | Deposit Funds          |
      | My Profile             |
      | Payouts                |
      | View My Payout History |
      | Request a New Payout   |
      | Pending Wagers         |
      | Graded Wagers          |
      | Transaction History    |
      | Daily Figures          |
      | My Messages            |
      | My Freeplay            |
      | Refer My Friends       |
      | Refer a Friend         |
      | View My Referrals      |
      | Limits Information     |
      | Bet Calculator         |

  @MOBILE
  Scenario: User chooses to collapse (hide) details shown below "Time Zone" under "Profile"
    Given as a User, I have already see my default time zone
    When I click on Time Zone ( - sign )
    Then I see Time Zone header collapsed and time zone information gets hidden
  @MOBILE
  Scenario: User accesses "Odds Type" under "Profile"
    Given as a User, I have already clicked on Profile under My Account
   # When I click on Odds Type ( + sign )
    Then I see my default odds selected
    And I see Change in order to change my odds

  @DESKTOP
  Scenario Outline: User accesses "Deposit Funds" under "My Account" header
    Given as a User, I already see My Account tab page
    When I click on Deposit Funds
    Then I see a pop-up with deposit <card-options>

    Examples:
      | card-options          |
      | Change Payment Method |
      | Saved Cards           |
      | Add New Card          |

  @MOBILE
  Scenario: User chooses to collapse (hide) details shown below "Odds Type" under "Profile"
    Given as a User, I have already see my default time zone
    When I click on Odds Type minus sign
    Then I see Odds Type header collapsed and odds information gets hidden
  @MOBILE
  Scenario: User accesses "Custome Service" link under "Profile"
    Given as a User, I have already clicked on Profile under My Account
    When I click on Customer Service
    Then page is redirected to Contact Us page under Left Navigator

  @DESKTOP1
  Scenario Outline: User accesses all the inputs on the "Saved Cards" option under    Deposit Funds pop-up
    Given as a User, I am on Deposit Funds pop-up page in sportsbetting
#    And I click on Insert Digits
    And I enter Card Number as <card-number>, Ebxpiry as <expiry>, CVV as<cvv> and amount as <amount>
   # And  I see not less than <amount-less> and not more than <amount-more>
    When I click Deposit option
    Then user is redirected to Confirmation Page


    Examples:
      | card-number  | expiry | cvv | amount |
      | 545454564654 | 0758   | 200 | 222    |

  @DESKTOP1
  Scenario: User accesses "Saved Cards" option under Deposit Funds pop-up (If any card already saved)
    Given as a User, I am on Deposit Funds pop-up page
    And I click on Insert Digits
    And I  should select any saved card from the dropdown of saved cards, then all the details are filled accordingly
    And I insert cvv as 200
    And I select any promotion available
    When I click on "Deposit"
    Then user is redirected to the Confirmation Page


  @DESKTOP
  Scenario: User accesses "Change Payment Method" option under Deposit Funds pop-up
    Given as a User, I am on Deposit Funds pop-up page in sportsbetting
    When I click on Change Payment Method
    Then user is redirected to the Cashier page with multiple deposit options

  @DESKTOP
  Scenario: User accesses "My Profile" under "My Account" header
    Given as a User, I already see My Account tab page
    When I click on My Profile under My Account header
    Then I see a redirected page with all the User profile related informations

  @MOBILE
  Scenario Outline: User accesses "Payouts" sub-tab under "My Account"
    Given as a User, I have already clicked on My Account under Left Navigator
    When I click on Payouts sub-tab
    Then I see page gets redirected to the Payouts (Withdrawal) page of payouts tab under Left Navigator
    And I shall see all the <withdrawal-related-options>

    Examples:
      | withdrawal-related-options |
      | Bitcoin                    |
      | Bitcoin Cash               |
      | Ethereum                   |
      |Litecoin                    |
      |Ripple                      |
      | Bank Wire                  |

  @DESKTOP
  Scenario: User accesses "Payouts" under "My Account" header
    Given as a User, I already see My Account tab page
    When I click My Account header containing different  Payouts
    Then I see My Account header containing different View My Payout History
    And  I see My Account header containing different Request a New Payout

  @DESKTOP
  Scenario: User accesses "View My Payout History" under "Payouts" sub-tab
    Given as a User, I already see My Account tab page
    When I click My Account header containing different  Payouts
    When I click on View My Payout History
    Then I a redirected page with Refresh button
    And I see all the payouts done earlier if any else I see No data returned

  @DESKTOP
  Scenario: User accesses "Refresh" button under "View My Payout History" sub-tab
    Given as a User, I already see My Account tab page
    When I click My Account header containing different  Payouts
    When I click on View My Payout History
    When I click on Refresh button
    Then I see View My Payout History page can be refreshed

  @DESKTOP
  Scenario: User accesses "Request a New Payout" under "Payouts" sub-tab
    Given as a User, I already see My Account tab page
    When I click My Account header containing different  Payouts
    When I click on Request a New Payout
    Then I see a redirected page with all the Payout related options to choose from

  @DESKTOP
  Scenario: User accesses "Pending Wagers" inside "My Account" header
    Given as a User, I already see My Account tab page
    When I click My Account header containing different Pending Wagers
    Then I see a redirected page with all the pending wagers

  @MOBILE
  Scenario: User accesses "Deposits" sub-tab under "My Account"
    Given as a User, I have already clicked on My Account under Left Navigator
    When I click on Deposits sub-tab
    Then I see page gets redirected to the Deposits page of Deposit tab under Left Navigator
    And I should see all the deposit related options


  @MOBILE
  Scenario Outline: User accesses "Refer My Friends" inside "My Account" tab
    Given as a User, I have already clicked on My Account under Left Navigator
    When  I click on Refer My Friends
    Then  I have to see refer <sub-tabs>

    Examples:
      | sub-tabs          |
      | Refer Friends     |
      | View My referrals |

  @DESKTOP
  Scenario: User clicks any ticket number from under "TICKET" inside "Pending Wagers" pag
    Given as a User, I already see My Account tab page
    Given I click My Account header containing different Pending Wagers
    When I click on any ticket number from under TICKET header
    Then I see Ticket Number expands showing all the details related  under the choice selected

  @DESKTOP
  Scenario: User clicks any ticket number from under "TICKET" inside "Pending Wagers" page when user can see ticket number expanded details
    Given as a User, I already see My Account tab page
    And I click My Account header containing different Pending Wagers
    When I click on any ticket number from under TICKET header
    And I see Ticket Number expands showing all the details related  under the choice selected
    When I click on any ticket number from under TICKET header
    Then I see the details related get collapsed and few descriptions visible

  @DESKTOP
  Scenario Outline: User accesses "Graded Wagers" inside "My Account" header
    Given as a User, I already see My Account tab page
    When I click My Account header containing different Graded Wagers
    Then I see a redirected page with all the graded wagers
    And I see few <selectors> options

    Examples:
      | selectors  |
      | Start Date |
      | End Date   |
      | Show       |

  @DESKTOP
  Scenario: User accesses all selectors inside "Transaction History" page
    Given as a User, I already see My Account tab page
    Given I click My Account header containing different Transaction History
    And I  will select any date from Start Date and End Date
    And I should select any option from under Show
    When I click on Refresh
    Then I see all Doc # Numbers shown for the particular choices selected

  @DESKTOP
  Scenario: User clicks any Doc # number from under "TICKET" inside "Transaction History" page
    Given as a User, I already see Transaction History page
    When I click on any doc number from under Doc header
    Then I see Ticket Number expands showing few details related to the choice selected


#    todo:16-7-20 SCENARIO NOT AVAILABLE FOR ALL TRANSACTION HISTORY
  @DESKTOP
  Scenario: User clicks any doc number from under "Doc #" inside "Transaction History" page when user can see ticket number expanded details
    Given as a User, I already see Ticket Number expanded showing all the details related under the choice selected
    When I click on any doc number from under Docs header
    Then I  want to see the details related get collapsed and few descriptions visible

  @DESKTOP
  Scenario Outline: User accesses "Daily Figures" inside "My Account" header
    Given as a User, I already see My Account tab page
    When I click My Account header containing different Daily Figures
    Then I see a redirected page with all the daily figures details
    And I have to see few <header>

    Examples:
      | header    |
      | Monday    |
      | Tuesday   |
      | Wednesday |
      | Thursday  |
      | Friday    |
      | Saturday  |
      | Sunday    |
      | Total     |

  @DESKTOP
  Scenario: User clicks on "Current Week's Figures" under "Daily Figures"
    Given as a User, I already see My Account tab page
    And I click My Account header containing different Daily Figures
    And I click on Last Week's Figures
    When I click on Current Week's Figures
    Then I see all the results changing with respect to current week figures


  @DESKTOP
  Scenario: User accesses any clickable value from under any header inside "Daily Figures" page
    Given as a User, I already see My Account tab page
    And I click My Account header containing different Daily Figures
    And I click on Last Week's Figures
    When I click on any clickable value from under any header
    Then I see all the details shown for that particular selection

  @DESKTOP
  Scenario: User clicks on any expanded details value from under any header inside "Daily Figures" page
    Given as a User, I see all the details shown for that particular selection
#    Given as a User, I already see My Account tab page
#    And I click on Last Week's Figures
    When I click on any clickable value from under any header
    Then I see all the details shown for that particular selection gets collapsed


  @DESKTOP
  Scenario: User clicks on "Last Week's Figures" under "Daily Figures"
    Given as a User, I already see My Account tab page
    And I click My Account header containing different Daily Figures
    When I click on Last Week's Figures
    Then I see all the results changing with respect to last week figures

  @DESKTOP
  Scenario: User accesses "Limits Information" inside "My Account" header
    Given as a User, I already see My Account tab page
    When I click My Account header containing different Limits Information
    Then I see a redirected page with a dropdown for Select Sport

  @DESKTOP
  Scenario: User selects any sport from inside "Select Sport" dropdown under "Limits Information"
    Given as a User, I already see My Account tab page
    And as a User, I am already under the Limits Information page
    When I will select any sport from under Select Sport dropdown
    Then I see all the results for that particular sport selected

  @DESKTOP
  Scenario Outline: User accesses "Refer My Friends" inside "My Account" header
    Given as a User, I already see My Account tab page
    When I click My Account header containing different Refer My Friends
    Then I  have to see <options>

    Examples:
      | options           |
      | Refer a Friend    |
      | View My Referrals |

  @DESKTOP
  Scenario Outline: User accesses "Refer a Friend" inside "Refer My Friend"
    Given as a User, I already see My Account tab page
    Given I click My Account header containing different Refer My Friends
    When I click on Refer a Friend
    Then I am given with <choices>
    And I would have see <sharing> options

    Examples:
      | choices | sharing       |
      | Sports  | copy & paste  |
      | Casino  | social media  |
      | Poker   | enter details |

  @MOBILE
  Scenario Outline: User accesses "Refer Friends" inside "Refer My Friends"
    Given as a User, I have already clicked on Refer My Friends under My Account
    When I click on Refer Friends
    Then I was given with  <choices>
    And I was to see  <sharing> options

    Examples:
      | choices | sharing       |
      | Sports  | copy & paste  |
      | Casino  | social media  |
      | Poker   | enter details |

  @MOBILE
  Scenario Outline: User accesses any choice from "Choose the Refer-A-Friend bonus you would prefer to earn:" under "Refer Friends"
    Given as a User, I have already clicked on Refer Friends
    Then I was given with  <choices>
    Then I see a referral link being generated for that particular choice
    Examples:
      | choices |
      | Sports  |
      | Casino  |
      | Poker   |

  @DESKTOP
  Scenario Outline: User accesses any choice from "Choose the Refer-A-Friend bonus you would prefer to earn:" under "Refer a Friend"
    Given as a User, I have already clicked on Refer a Friend
    When I  have to select <choices>
    Then I see a referal link being generated for that particular choice
    Examples:
      | choices |
      | Sports  |
      | Casino  |
      | Poker   |

  @DESKTOP
  Scenario: User accesses "Copy & Paste" choice from under "Refer a Friend"
    Given as a User, I have already clicked on Refer a Friend
    When I click on Click here link
    Then I see a pop-up for confirmation with link to share

  @MOBILE
  Scenario: User accesses "Copy & Paste" choice from under "Refer Friends"
    Given as a User, I have already clicked on Refer Friends
    When I  should click on Click here link
    Then I should watch a pop-up for confirmation with link to share
  @MOBILE
  Scenario: User accesses "social media" share option choice from under "Refer Friends"
    Given  as a User, I have already clicked on Refer Friends
    When I click on any of the social media (icon)
    Then I should watch a pop-up to Login and share
  @MOBILE
  Scenario: User accesses "enter details" choice from under "Refer Friends"
    Given  as a User, I have already clicked on Refer Friends
    And I  will enter First Name, Last Name and email
      | TestingUser_RANDOM    |
      | UserTesting001_RANDOM |
    When I  should click on Submit
    Then I spectate a redirected page with referral successful or denied message
  @MOBILE
  Scenario: User accesses "Add from Address Book" inside 3rd choice from under "Refer Friends"
    Given as a User, I have already clicked on Refer Friends
    And I should click on Add from Address Book
    When I have to select any choice from among the choices under pop-up
    Then I was landed with option as per the selected choice

  @DESKTOP
  Scenario: User accesses "social media" share option choice from under "Refer a Friend"
    Given as a User, I have already clicked on Refer a Friend
    When I click on any of the social media
    Then I see a pop-up to Login and share

  @DESKTOP
  Scenario: User accesses "enter details" choice from under "Refer a Friend"
    Given as a User, I have already clicked on Refer a Friend
    And I enter First Name, Last Name and email
      | TestingUser_RANDOM    |
      | UserTesting001_RANDOM |
    When I click on Submit
    Then I see a redirected page with referal successful or denied message

  @DESKTOP
  Scenario: User accesses "Add from Address Book" inside 3rd choice from under "Refer a Friend"
    Given as a User, I have already clicked on Refer a Friend
    And I click on Add from Address Book
    When I  has to select any choice from among the choices under pop-up
    Then I suppose to be  with option as per the selected choice

  @MOBILE
  Scenario: User accesses "View My Referrals" inside "Refer My Friend"
    Given as a User, I have already clicked on Refer My Friends under My Account
    When I want to click on View My Referrals
    Then I have to shown with all the details related to the past referrals


  @MOBILE
  Scenario Outline: User accesses "Reports" inside "My Account" tab
    Given as a User, I have already clicked on My Account under Left Navigator
    When I has to click on Reports
    Then I has to see <sub-tabs>

    Examples:
      | sub-tabs         |
      | Pending Wagers   |
      | Graded Wagers    |
      | All Transactions |
      | Daily Figures    |

  @MOBILE
  Scenario: User accesses "Pending Wagers" inside "Reports" sub-tab
    Given as a User, I have already clicked Reports under My Account
    When I will click on Pending Wagers
    Then I want to see a redirected page options
      | 24 hours |
      | 48 hours |
      | All      |

  @MOBILE
  Scenario: User accesses "24 hours" under "Pending Wagers"
    Given as a User, I have already clicked on Pending Wagers
    When I has to  click on twentyFour hours under Pending Wagers
    Then I am shown with all the Pending Wagers from under twentyfour hours duration

  @MOBILE
  Scenario: User accesses "48 hours" under "Pending Wagers"
    Given  as a User, I have already clicked on Pending Wagers
    When I click on fourty eight hours under Pending Wagers
    Then I am shown with all the Pending Wagers from under fourty eight hours duration

  @MOBILE
  Scenario: User accesses "All" under "Pending Wagers"
    Given as a User, I have already clicked on Pending Wagers
    When I click on All under Pending Wagers
    Then I am shown with all the Pending Wagers from the very beginning

  @MOBILE
  Scenario: User clicks any ticket number from under "TICKET" inside any time-option of "Pending Wagers" page
    Given as a User, I already see Pending Wagers page
    And I click on any ticket number from under TICKET header of any time-option
    And I see Ticket Number expands showing all the Wagers
    When I click on Wagers
    Then I see all the details related to the selected ticket and wager number

  @MOBILE
  Scenario Outline: User accesses "Graded Wagers" inside "Reports" sub-tab
    Given as a User, I have already clicked Reports under My Account
    When I click on Graded Wagers
    Then I had to see a redirected page <options>

    Examples:
      | options      |
      | 24 hours     |
      | 48 hours     |
      | Select range |

  @MOBILE
  Scenario: User accesses "24 hours" under "Graded Wagers"
    Given as a User, I have already clicked on Graded Wagers
    When I click on twenty four hours under Graded Wagers
    Then I am shown with all the Graded Wagers from under twenty four hours duration
  @MOBILE
  Scenario: User accesses "48 hours" under "Graded Wagers"
    Given as a User, I have already clicked on Graded Wagers
    When I click on fourty eight hours under Graded Wagers
    Then I am shown with all the Graded Wagers from under fourty eight hours duration
  @MOBILE
  Scenario: User accesses "Select range" under "Graded Wagers"
    Given as a User, I have already clicked on Graded Wagers
    And I had to select a redirected page select range
    And I wil select any start and end date under Select range
    When I should be clicking on Submit
    Then I am shown with all the Graded Wagers for the selected time range
  @MOBILE
  Scenario: User clicks any ticket number from under "TICKET" inside any time-option of "Graded Wagers" page
    Given as a User, I have already clicked on Graded Wagers
    And I will click on any ticket number from under TICKET header of any time-option
    And I want to watch Ticket Number expands showing all the Wagers
    When I clicking on Wagers (if collapsed)
    Then I  have to watch all the details related to the selected ticket and wager number

  @MOBILE
  Scenario: User accesses "All Transactions" inside "Reports" sub-tab
    Given as a User, I have already clicked Reports under My Account
    When I click on All Transactions
    Then I see a redirected page under all Transactions options
      | 24 hours     |
      | 48 hours     |
      | Select range |

  @MOBILE
  Scenario: User accesses "24 hours" under "All Transactions"
    Given as a User, I have already clicked on All Transactions
    When I click on twenty four hours under All Transactions
    Then I am shown with all the transactions under twenty hours duration
  @MOBILE
  Scenario: User accesses "48 hours" under "All Transactions"
    Given as a User, I have already clicked on All Transactions
    When I click on fourty eight under All Transactions
    Then I am shown with all the transactions under under fourty eight hours duration


  @DESKTOP
  Scenario: User accesses "View My Referrals" inside "Refer My Friend"
    Given as a User, I already see My Account tab page
    When I click on View My Referrals
    Then I am shown with all the details related to the past referrals

  @DESKTOP
  Scenario Outline: User accesses "Bet Calculator" inside "My Account" header
    Given as a User, I already see My Account tab page
    When I click on Bet Calculator
    Then I am redirected to Betting Calculator page
    And I would see <options>

    Examples:
      | options                 |
      | Odds Converter          |
      | Win And Risk Calculator |
      | Parlay Calculator       |
      | Teaser Calculator       |

  @MOBILE
  Scenario: User accesses "Select range" under "All Transactions"
    Given as a User, I have already clicked on All Transactions
    And I had to select a redirected page select range under All Transactions
    And I want to select All transactions any start and end date under Select range
    When I click on Submit under All Transactions
    Then I am shown with all the the transactions under for the selected time range

  @MOBILE
  Scenario Outline: User accesses "Daily Figures" inside "Reports" sub-tab
    Given as a User, I have already clicked Reports under My Account
    When I click on Daily Figures
    Then I had to watch a redirected page  <options>

    Examples:
      | options        |
      | Current Week's |
      | Last Week's    |

  @MOBILE
  Scenario: User accesses "Current Week's" inside "Daily Figures"
    Given as a User, I have already clicked Daily Figures under Reports
    When I click on Current Week's
    Then I will spectate a redirected page day-selector
      |Monday         |
      |Tuesday        |
      |Wednesday      |
      |Thursday        |
      |Friday          |
      |Saturday        |
      |Sunday          |
  @MOBILE
  Scenario: User clicks any "day" inside "Current Week's" of "Daily Figures" page
    Given as a User, I already see all the days under Current Week's
    When I click on any day under current week
    Then I see all the daily figures related transaction for Current Week (if any)
  @MOBILE
  Scenario: User accesses "Last Week's" inside "Daily Figures"
    Given as a User, I have already clicked Daily Figures under Reports
    When I click on Last Week's
    Then I will watch a redirected page day-selector
      | Monday         |
      | Tuesday        |
      | Wednesday      |
      | Thursday       |
      | Friday         |
      | Saturday       |
      | Sunday         |

  @MOBILE
  Scenario: User clicks any "day" inside "Last Week's" of "Daily Figures" page
    Given as a User, I already see all the days under Last Week's
    When I click on any day Under Last Week
    Then I see all the daily figures related transaction for Last Week (if any)

  @DESKTOP
  Scenario: User accesses Odds Converter under "Bet Calculator" page
    Given as a User, I am already on Bet Calculator page
    And I click on Odds Converter
    When I enter value under American header
    Then I am shown with values corresponding to the other header automatically filled

  @DESKTOP
  Scenario: User accesses "Win And Risk Calculator" under "Bet Calculator" page
    Given as a User, I am already on Bet Calculator page
    And I click on Win And Risk Calculator
    And I enter value under any odds-header
    And I see other odds-headers gets filled automatically
    When I enter value under either Win or Risk header
    Then I see other header values automatically getting filled

  @MOBILE
  Scenario: User accesses "Promotions" under "My Account"
    Given as a User, I have already clicked on My Account under Left Navigator
    When I click on Promotions
    Then I see several promotions available under Promotion of My Account page
  @MOBILE
  Scenario: User accesses "50% Sports Welcome Bonus" under "Promotions"
    Given as a User, I have already clicked on Promotions
    And I click on fifty percent Sports Welcome Bonus
    And I see promo code for the selected option with Terms and Conditions
    When I will be clicking on Terms and Conditions
    Then I am shown with all the the terms and conditions related to the selected promotion choice
  @MOBILE
  Scenario: User accesses "$25 Rish-Free Props Bet" under "Promotions"
    Given as a User, I have already clicked on Promotions
    And I click on $twentyFive Rish-Free Props Bet
    And I see promo code for the selected option with Terms and Conditions under Rish Free
    When I click on Terms and Conditions under Rish Free
    Then I am shown with all the the terms and conditions related to the selected promotion choice under Rish Free


  @DESKTOP
  Scenario: User accesses "Parlay Calculator" under "Bet Calculator" page
    Given as a User, I am already on Bet Calculator page
    And I click on Parlay Calculator
    And I will enter value  under American header
    And I  need to select any option from dropdown under Line Type header
    And I  need to select any option from dropdown under Sport Type
    When I enter value for Bet $
    Then I click on Calculate
    And I see Winnings  automatically gets filled

  @DESKTOP
  Scenario: User accesses "Reset" under "Parlay Calculator" under "Bet Calculator" page
    Given as a User, I have already performed operations and I see some value under Winnings
    When I click on Reset
    Then I see all the fields gets reset

  @MOBILE
  Scenario: User accesses "$50 Mobile Betting Free Play" under "Promotions"
    Given as a User, I have already clicked on Promotions
    And I click on $Fifty Mobile Betting Free Play
    And I see promo code for the selected option with Terms and Conditions under Mobile betting
    When I click on Terms and Conditions under Mobile betting
    Then I am shown with all the the terms and conditions related to the selected promotion choice under Mobile betting
  @MOBILE
  Scenario: User accesses "$25 Live In-Game Betting Free Play" under "Promotions"
    Given as a User, I have already clicked on Promotions
    And I click on $Twenty Five Live In-Game Betting Free Play
    And I see promo code for the selected option with Terms and Conditions under Live in  Game
    When I click on Terms and Conditions under Live in  Game
    Then I am shown with all the the terms and conditions related to the selected promotion choice under Live in  Game
  @MOBILE
  Scenario: User accesses "7% Horse Rebate" under "Promotions"
    Given as a User, I have already clicked on Promotions
    And I click on seven percent Horse Rebate
    And I see promo code for the selected option with Terms and Conditions under Horse Debate
    When I click on Terms and Conditions under Horse Debate
    Then I am shown with all the the terms and conditions related to the selected promotion choice under Horse Debate


  @DESKTOP
  Scenario: User accesses "ADD ANOTHER ROW" under "Parlay Calculator" under "Bet Calculator" page
    Given as a User, I have already performed operations and I see some value under Winnings
    When I click on ADD ANOTHER ROW
    Then I see a new field gets added


  @MOBILE
  Scenario: User accesses "Refer-a-Friend" under "Promotions"
    Given as a User, I have already clicked on Promotions
    When I click on Refer-a-Friend Under Promotions
    Then I see Refer a Friend Now and Terms and Conditions
  @MOBILE
  Scenario: User accesses "Refer a Friend Now" under "Refer-a-Friend"
    Given as a User, I have already clicked on Refer-a-Friend in mobile
    When I click on Refer a Friend Now
    Then I see a redirected page with all the referral related instructions
    And I see REFER NOW button
  @MOBILE
  Scenario: User accesses "REFER NOW" under "Refer My Friend" instruction page
    Given as a User, I already see all the instructions related to Refer Friends
    When I click on REFER NOW under myaccount
    Then I see the page gets redirected to Refer My Friends under My Account

  @DESKTOP
  Scenario: User accesses "Teaser Calculator" under "Bet Calculator" page
    Given as a User, I am already on Bet Calculator page
    And I click on Teaser Calculator
    And I  has select any option from dropdown for Select Teaser Group
    And I enter vaule atleast two time under Points header
    And I seem to select any option from dropdown under line Type
    And I seem to select any option from dropdown under Sport Type
    And I see New Point header values automatically gets filled
    When I have to enter value for Bet $
    Then I click on CalculateTeaser
    And I see Winnings under teaser  automatically gets filled

  @DESKTOP
  Scenario: User accesses "Reset" under "Teaser Calculator" under "Bet Calculator" page
    Given as a User, I have already performed operations and I see some value under Winnings $
    When I should click on Reset
    Then I check all the fields gets reset

  @MOBILE
  Scenario: User accesses "Terms and Conditions" under "Refer-a-Friend"
    Given as a User, I have already clicked on "Refer-a-Friend"
    When I click on "Terms and Conditions"
    Then I see refreshed page with all the terms and conditions related to "Refer-a-Friend"
  @MOBILE
  Scenario: User accesses "$100K GUARANTEED" under "Promotions"
    Given as a User, I have already clicked on Promotions
    And I click on $Hundred thousand guaranteed Under promotions
    And  I click on LearnMore
    When  I see a redirected page with all the money guaranteed instructions
    Then I see play Now Button

    @MOBILE
    Scenario: User accesses "PLAY NOW" under "$100K GUARANTEED" instruction page
      Given as a User, I already see all the instructions related to money guaranteed
      When I click on PLAY NOW
      Then I see the page gets redirected to page under My Account

  @MOBILE
  Scenario: User accesses "Terms and Conditions" under "$100K GUARANTEED"
    Given as a User, I already see all the instructions related to money guaranteed
    When I click on Terms and Conditions under Money Guaranteed
    Then I see refreshed page with all the terms and conditions related to $ hundred K GUARANTEED

  @MOBILE
  Scenario: User accesses "$10,000 WEEKLY CASH RACE" under "Promotions"
    Given as a User, I have already clicked on Promotions
    And I click on $ten thousand weekly cash race Under promotions
    And  I click on LearnMore Under Cash race
    When  I see a redirected page with all the Under Cash race instructions
    Then I see play Now Button Under Cash race

  @DESKTOP
  Scenario: User accesses "ADD ANOTHER ROW" under "Teaser Calculator" under "Bet Calculator" page
    Given  as a User, I have already performed operations and I see some value under Winnings $
    When I  has to click on ADD ANOTHER ROW
    Then I suppose see a new field gets added

  @DESKTOP
  Scenario Outline: User accesses "My Messages" under "My Account" header
    Given as a User, I already see My Account tab page
    Then the page is redirected and I see <headers>

    Examples:
      | headers               |
      | Compose a new message |
      | Your messages history |

  @MOBILE
  Scenario: User accesses "PLAY NOW" under "$10,000 WEEKLY CASH RACE" instruction page
    Given as a User, I already see all the instructions related to Cash race
    When I click on PLAY NOW Under Cash race
    Then I see the page gets redirected to  Cash race under My Account
  @MOBILE
  Scenario: User accesses "Terms and Conditions" under "$10,000 WEEKLY CASH RACE"
    Given as a User, I already see all the instructions related to Cash race
    When I click on Terms and Conditions under Under Cash race
    Then I see refreshed page with all the terms and conditions related to Under Cash race
  @MOBILE
  Scenario: User accesses "$5,000 WEEKLY SIT AND GO LEADERBOARD" under "Promotions"
    Given as a User, I have already clicked on Promotions
    And I click on $ five thousand weekly sit and go leaderboard Under promotions
    And   I click on LearnMore under weekly sit and go leaderboard
    When  I see a redirected page with all weekly sit and go leaderboard instructions
    Then I see play Now Button under weekly sit and go leaderboard

  @DESKTOP
  Scenario Outline: User decides to create a new message under "COMPOSE A NEW MESSAGE" header under "My Messages"
    Given as a User, I have already clicked My Messages
    And I have to select any <choice> from under Subject dropdown
    And I write something under the text area given for Your message
    When I click on Send
    Then I see the message posted under Your messages history header
    Examples:
      | choice                   |
      | Deposit                  |
      | Payout                   |
      | Other (Specify in Notes) |

  @DESKTOP
  Scenario Outline: User decides to create a new message but clicks on "Clear" instead of "Send" button
    Given as a User, I have already clicked My Messages
    And  I have to select any <choice> from under Subject dropdown
    And I write something under the text area given for Your message
    When I click on cancel
    Then I see the message posted under Your messages history header

    Examples:
      | choice                   |
      | Deposit                  |
      | Payout                   |
      | Other (Specify in Notes) |

  @MOBILE
  Scenario: User accesses "PLAY NOW" under "$5,000 WEEKLY SIT AND GO LEADERBOARD" instruction page
    Given as a User, I already see all the instructions related to weekly sit and go leader board
    When I click on PLAY NOW under weekly sit and go leaderboard
    Then I see the page gets redirected to  weekly sit and go leaderboard under My Account
  @MOBILE
  Scenario: User accesses "Terms and Conditions" under "$5,000 WEEKLY SIT AND GO LEADERBOARD"
    Given as a User, I already see all the instructions related to weekly sit and go leader board
    When I click on Terms and Conditions under weekly sit and go leaderboard
    Then I see refreshed page with all the terms  and conditions related to under weekly sit and go leaderboard
  @MOBILE
  Scenario: User accesses "20% MONTHLY RELOAD BONUS" under "Promotions"
    Given as a User, I have already clicked on Promotions
    And I click on twenty percent monthly Reload Bonus Under promotions
    And  I click on LearnMore under  monthly Reload Bonus
    When  I see a redirected page with all monthly Reload Bonus instructions
    Then I see Deposit Now Button under monthly Reload Bonus

  @DESKTOP
  Scenario: User decides to read a message under "Your messages history" header under "My Messages"
    Given as a User, I have already clicked My Messages
    When I scroll down to Your messages history header
    Then I see  the messages posted with Message details

  @DESKTOP
  Scenario: User accesses "Message(s) details" from under any message posted
    Given  as a User, I have already clicked My Messages
    When I click on Message(s) details from under any message posted
    Then I see all the replies to the message posted by the admin

  @DESKTOP
  Scenario Outline: User verifies "Useful Links" header under "My Account" tab
    Given  as a User, I have already clicked My Messages
    When I see Useful Links header
    Then I see Useful Links header having different <sub-tabs>

    Examples:
      | sub-tabs          |
      | Sports Schedules  |
      | How To Bet Online |
      | Affiliate Program |

  @MOBILE
  Scenario: User accesses "PLAY NOW" under "20% MONTHLY RELOAD BONUS" instruction page
    Given as a User, I already see all the instructions related to monthlyReload Bonus
    When I click on Deposit NOW under monthly Reload Bonus
    Then I see the page gets redirected to  monthly Reload Bonus under My Account

  @MOBILE
  Scenario: User accesses "Terms and Conditions" under "20% MONTHLY RELOAD BONUS"
    Given as a User, I already see all the instructions related to monthlyReload Bonus
    When I click on Terms and Conditions under monthly Reload Bonus
    Then I see refreshed page with all the terms and conditions related to under monthly Reload Bonus

  @MOBILE
  Scenario: User accesses "10% WEEKLY CASINO REBATE" under "Promotions"
    Given as a User, I have already clicked on Promotions
    And I click on ten percent weekly casino rebate Under promotions
    And  I click on LearnMore under  weekly casino rebate
    When  I see a redirected page with all weekly casino rebate instructions
    Then I see play Now Button under weekly casino rebate

  @DESKTOP
  Scenario: User accesses "Sports Schedules" from under "Useful Links" header
    Given as a User, I have already clicked My Messages
    When I click on Sports Schedules
    Then I see page gets redirected to Getting Started sub-tab under Sports tab
    And I see all the schedules

  @DESKTOP
  Scenario: User accesses "How To Bet Online" from under "Useful Links" header
    Given as a User, I have already clicked My Messages
    When I click on How To Bet Online
    Then I see page gets redirected to Getting Started
    And I have to see all the help related options

  @DESKTOP
  Scenario: User accesses "Affiliate Program" from under "Useful Links" header
    Given as a User, I have already clicked My Messages
    When I click on Affiliate Program
    Then I see page gets redirected to https://www.commissionkings.ag/



  @MOBILE
  Scenario: User accesses "PLAY NOW" under "10% WEEKLY CASINO REBATE" instruction page
    Given as a User, I already see all the instructions related to weekly casino rebate
    When I click on PLAY NOW under weekly casino rebate
    Then I see the page gets redirected to weekly casino rebate under My Account

  @MOBILE
  Scenario: User accesses "Terms and Conditions" under "10% WEEKLY CASINO REBATE"
    Given as a User, I already see all the instructions related to money guaranteed
    When I click on Terms and Conditions under weekly casino rebate
    Then I see refreshed page with all the terms and conditions related to under weekly casino rebate
  @MOBILE
  Scenario: User accesses "$100,000 CASINO IRON MAN CONTEST" under "Promotions"
    Given as a User, I have already clicked on Promotions
    And I click on hundred thousand dollars casino iron man contest Under promotions
    And  I click on LearnMore under casino iron man contest
    When  I see a redirected page with all casino iron man contest  instructions
    Then I see opt Button under casino iron man contest

  @MOBILE
  Scenario: User accesses "PLAY NOW" under "$100,000 CASINO IRON MAN CONTEST" instruction page
    Given as a User, I already see all the instructions related casino iron man contest
    When I click on OPT IN under casino iron man contest
    Then I see the page gets redirected to casino iron man contest  under My Account

  @MOBILE
  Scenario: User accesses "Terms and Conditions" under "$100,000 CASINO IRON MAN CONTEST"
    Given as a User, I already see all the instructions related casino iron man contest
    When I click on Terms and Conditions under casino iron man contest
    Then I see refreshed page with all the terms and conditions related to under casino iron man contest


  @MOBILE
  Scenario Outline: User accesses "My Messages" inside "My Account"
    Given as a User, I have already clicked on My Account under Left Navigator
    When I click on My Messages under My Account
    Then I see My Messages <headers>

    Examples:
      | headers               |
      | Compose a new message |
      | Your messages History |
  @MOBILE
  Scenario Outline: User accesses "Compose a new message" inside "My Messages"
    Given as a User, I have already clicked on My Messages under My Account
    When I click on Compose a new message (if in collapsed state)
    Then I see a dropdown to select a subject, message field
    And I will see two compose Message <message-buttons>

    Examples:
      | message-buttons |
      | Send            |
      | Cancel          |
  @MOBILE
  Scenario Outline: User composes and sends a message under "Compose a new message"
    Given as a User, I already see all the compose message fields and dropdown
    And i click a dropdown subject
    And I would select any <options> from Subject dropdown
    And I enter any message in message field
    When I click on Send button
    Then I see that message has is uploaded and displayed under Your messages History

    Examples:
      | options                  |
      | Deposit                  |
      | Payout                   |
      | Other (Specify in Notes) |
  @MOBILE
  Scenario Outline: User composes a message under "Compose a new message" but decides to cancel the message
    Given as a User, I already see all the compose message fields and dropdown
    And I would select any <options> from Subject dropdown
    And I enter any message in message field
    When I click on Cancel in mobile
    Then I see that message has been deleted
    And I see fresh fields to write a message
    Examples:
      | options                  |
      | Deposit                  |
      | Payout                   |
      | Other (Specify in Notes) |
  @MOBILE
  Scenario Outline: User accesses "Your messages History" inside "My Messages"
    Given as a User, I have already clicked on My Messages under My Account
    When I click on Your messages History (if in collapsed state)
    Then I see all the messages posted by user with Message(s) details
    And I see two <message-buttons>

    Examples:
      | message-buttons |
      | Previous        |
      | Next            |
  @MOBILE
  Scenario: User accesses "Message(s) details" under any message
    Given as a User, I already see all the message(s) under Your messages History
    When I click on Message(s) details
    Then I see date, time and messages from admin (if any)
    And I see a Reply header
  @MOBILE
  Scenario: User accesses "Reply" under "Message(s) details"
    Given as a User, I already see Reply header in collapsed state
    When I click on Reply
    Then I see message field, send and cancel buttons
  @MOBILE
  Scenario: User accesses "Next" under "Your messages History"
    Given as a User, I already see all the message(s) under Your messages History
    When I click on Next
    Then I see new messages being displayed relatively old to the one I see for now
  @MOBILE
  Scenario: User accesses "Previous" under "Your messages History"
    Given I see new messages being displayed relatively old to the one I see for now
    When I click on Previous
    Then I see new messages being displayed relatively new to the one I see for now