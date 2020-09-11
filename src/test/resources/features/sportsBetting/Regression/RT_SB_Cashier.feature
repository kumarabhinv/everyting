Feature: Validating the functionality of "Cashier" tab in sports betting.


  @DESKTOP @MOBIlE @TEST
  Scenario Outline: User visits SportsBetting application
    Given I am on SportsBetting application
    When User login to the SportsBetting site with following credential <Username> and <Password>
    Then I should see the SportsBetting site homepage

    Examples:
      | Username  | Password  |
      | SB808358  | C0d0!d_P@ss1 |


  @DESKTOP @TEST
  Scenario Outline: User verifies all the tabs present under Cashier tab
    Given I am on SportsBetting application
    When I move to CASHIER
    Then I should be shown <sub-tabs> under the Cashier tab

    Examples:
      | sub-tabs                 |
      | Deposit                  |
      | Withdrawal               |
      | SportsBetting Live Help  |
      | Click Here to Learn More |
      | Close                    |
      | Help                     |

  @MOBILE
  Scenario Outline: User verifies the Deposit tab under "LEFT NAVIGATOR"
    Given I am on SportsBetting application
    And I click on Cashier LEFT NAVIGATOR
    When I click on Cashier Deposit
    Then I should be shown <sub-tabs> under the Cashier tab

    Examples:
      | sub-tabs                 |
      | Deposit                  |
      | Withdrawal               |
      | SportsBetting Live Help  |
      | Click Here to Learn More |
      | Close                    |
      | Help                     |

#Deposit

  @DESKTOP
  Scenario Outline: User verifies the Deposit tab present under Cashier tab
    Given as a user, I am on Cashier page
    When I see sportsbetting Deposit tab
    Then I should be shown <deposit-options> under the Deposit tab

    Examples:
      | deposit-options |
      | Bitcoin         |
      | Credit Card     |



  @MOBILE
  Scenario Outline: User verifies all the deposit options under Deposit tab
    Given as a User, I see SportsBetting mobile deposit page
    When I click on Cashier <link>
    Then I should be shown with all the deposit-options available under Deposit tab
      | Cryptocurrency |
      | Skrill         |
      | Moneygram      |
      | Wire Transfer  |
      | Money Order    |
      | Cashier Check  |
      | EcoPayz        |
      | Skrill 1 Tap   |


    Examples:
      | link                      |
      | View More Deposit Options |


  @DESKTOP
  Scenario Outline: User verifies all the deposit options under Deposit tab
    Given as a User, I move to Cashier Deposit page
    When I click on Cashier <link>
    Then I should be shown with all the deposit-options available under Deposit tab
      | Cryptocurrency |
      | Skrill         |
      | Moneygram      |
      | Wire Transfer  |
      | Money Order    |
      | Cashier Check  |
      | EcoPayz        |
      | Skrill 1 Tap   |


    Examples:
      | link                      |
      | View More Deposit Options |



  @TestB
  Scenario Outline: User accesses the Bitcoin option under Deposit tab
    Given as a User, I see SportsBetting mobile deposit page
    When I click on Cashier Bitcoin
    Then I see deposit page with several <payment-options>

    Examples:
      | payment-options |
      | 50              |
      | 100             |
      | 250             |
      | 500             |
      | 750             |
      | 1000            |
      | 1500            |
      | 2000            |

    #Bitcoin

  @TestB
  Scenario: User accesses the Bitcoin option under Deposit tab
    Given as a User, I move to Cashier Deposit page
    When I click Bitcoin under the Deposit tab
    Then I see deposit page with several payment-options
      | $50    |
      | $100   |
      | $250   |
      | $500   |
      | $750   |
      | $1,000 |
      | $1,500 |
      | $2,000 |

  @DESKTOP
  Scenario Outline: User accesses all the promo codes available under Bitcoin page
    Given as a user, I am on Bitcoin page
    When I click on Cashier <link>
    Then I see all the promo-codes available under Bitcoin page
      | Welcome\nBonus       |
      | Bonus\nFor Life      |
      | Enter Another Code   |
      | No Bonus. Thank You. |

    Examples:
      | link             |
      | View Promo Codes |

  @MOBILE
  Scenario Outline: User accesses all the promo codes available under Bitcoin page
    Given as a user, I am on Bitcoin page
    When I click on Cashier <link>
    Then I see all the promo-codes available under Bitcoin page
      | Welcome\nBonus       |
      | Bonus\nFor Life      |
      | Enter Another Code   |
      | No Bonus. Thank You. |

    Examples:
      | link             |
      | View Promo Codes |

  @DESKTOP
  Scenario: User accesses "50% Welcome Bonus" promo code under the Bitcoin Promo pop-up
    Given as a User, I am on the Promo pop-up
    When I click on Cashier 50% Welcome Bonus
    Then I see, Promo code SB1000 entered in the input for promo code

  @MOBILE
  Scenario: User accesses "50% Welcome Bonus" promo code under the Bitcoin Promo pop-up
    Given as a User, I am on the Promo pop-up
    When I click on Cashier 50% Welcome Bonus
    Then I see, Promo code SB1000 entered in the input for promo code


  @DESKTOP
  Scenario: User accesses "25% Bonus For Life" promo code under the Bitcoin Promo pop-up
    Given as a User, I click and see the Promo pop-up
    When I click on Cashier 25% Bonus For Life
    Then I see, Promo code FORLIFE entered in the input for promo code

  @MOBILE
  Scenario: User accesses "25% Bonus For Life" promo code under the Bitcoin Promo pop-up
    Given as a User, I click and see the Promo pop-up
    When I click on Cashier 25% Bonus For Life
    Then I see, Promo code FORLIFE entered in the input for promo code

  @DESKTOP
  Scenario: User accesses "Enter Another Code" promo code under Bitcoin Promo pop-up
    Given as a User, I click and see the Promo pop-up
    And I click on Cashier Enter Another Code
    And I enter promo code Codoid
    When I press SUBMIT button
    Then I see, Promo code Codoid entered in the input for promo code

  @MOBILE
  Scenario: User accesses "Enter Another Code" promo code under Bitcoin Promo pop-up
    Given as a User, I click and see the Promo pop-up
    And I click on Cashier Enter Another Code
    And I enter promo code Codoid
    When I press SUBMIT button
    Then I see, Promo code Codoid entered in the input for promo code

  @DESKTOP @MOBILE
  Scenario: User accesses either  "No Bonus. Thank You." or "CLOSE" option under the Bitcoin Promo pop-up
    Given as a User, I click and see the Promo pop-up
    When I click on Cashier No Bonus. Thank You. or CLOSE
    Then I see, Promo code _ entered in the input for promo code

  @DESKTOP @MOBILE
  Scenario: User accesses "Are you new to Bitcoin?" link under "Bitcoin" deposit page
    Given as a User, I move to Cashier Deposit page
    When I click Bitcoin under the Deposit tab
    And I click on Cashier Are You New To
    Then I see, it opens a new tab with all the informations related to Bitcoin

  @TestB
  Scenario Outline: User inserts the deposit amount in the Bitcoin Deposit page
    Given as a User, I move to Cashier Deposit page
    And I click on Cashier Bitcoin
    And I enter deposit amount as <amount> not below <amount-below> and not above <amount-above>
    And I click on Cashier Deposit Now
    And I see deposit page with Wallet Address and Current Price
    And I click on Cashier I've Completed My Payment
    When I click on Cashier Start Playing
    Then I should navigate to the home page

    Examples:
      | amount | amount-below | amount-above |
      | 25     | 20           | 100000       |

  @TestB
  Scenario Outline: User inserts the deposit amount in the Bitcoin Deposit page
    Given as a User, I am on the "Bitcoin" payment page
    And I enter deposit amount as <amount> not below <amount-below> and not above <amount-above>
    And I click on "Deposit Now"
    And I see deposit page with "Wallet Address" and "Current Price"
    And I click on "I've Completed Payment"
    And I see deposit page with "Start Playing"
    When I click on "Start Playing"
    Then I  should navigate to the home page

    Examples:
      | amount | amount-below | amount-above |
      | 25     | 20           | 5000         |



  @DESKTOP  @MOBILE
  Scenario: User decides to go back one step from the Bitcoin input amount page
    Given as a User, I move to Cashier Deposit page
    And I click on Cashier Bitcoin
    When I click on Cashier BACK(icon)
    Then user is redirected to the Deposit page

  @TestB
  Scenario Outline: User inserts the deposit amount in the Bitcoin Deposit page
    Given as a User, I move to Cashier Deposit page
    And I click on Cashier Bitcoin
    And I enter deposit amount as <amount> not below <amount-below> and not above <amount-above>
    When I click on Cashier Deposit Now
    Then I see deposit page with Wallet Address and Current Price

    Examples:
      | amount | amount-below | amount-above |
      | 25     | 20           | 100000       |

  @TestB
  Scenario:  User decides to go back one step back from the page with "Wallet Address"
    Given I click on Cashier Bitcoin
    When I click on Cashier BACK(icon)
    Then the user is redirected to the Bitcoin input payment page

  @TestB
  Scenario: User decides to go back one step back from the page with "Wallet Address"
    Given as a User, I am on Bitcoin page containing "Wallet Address"
    When I click on the "BACK(icon)"
    Then the user is redirected to the "Bitcoin" input payment page

  @TestB
  Scenario Outline: User inserts the deposit amount in the Bitcoin Deposit page
    Given as a User, I move to Cashier Deposit page
    And I click on Cashier Bitcoin
    And I enter deposit amount as <amount> not below <amount-below> and not above <amount-above>
    When I click on Cashier Deposit Now
    Then I see deposit page with Wallet Address and Current Price

    Examples:
      | amount | amount-below | amount-above |
      | 25     | 20           | 100000       |

  @TestB
  Scenario Outline: User decides to change the payment method when on Bitcoin payment page with Wallet Address
    Given as a User, I move to Cashier Deposit page
    And I click on Cashier Bitcoin
    When I click on Cashier <other-payment>
    Then I am redirected to the Deposit page and I see different payment methods

    Examples:
      | other-payment         |
      | Change Payment Method |


  @TestB
  Scenario Outline: User decides to change the payment method when on Bitcoin payment page with Wallet Address
    Given as a User, I am on Bitcoin Confirmation page containing "Wallet Address"
    When I click on <other-payment>
    Then I am redirected to the "Deposit" page and I see different payment methods

    Examples:
      | other-payment         |
      | Change Payment Method |


  @TestB
  Scenario Outline: User inserts the deposit amount in the Bitcoin Deposit page
    Given as a User, I move to Cashier Deposit page
    And I click on Cashier Bitcoin
    And I enter deposit amount as <amount> not below <amount-below> and not above <amount-above>
    And I click on Cashier Deposit Now
    And I see deposit page with Wallet Address and Current Price
    When I click on Cashier I've Completed My Payment
    Then I see Start Playing

    Examples:
      | amount | amount-below | amount-above |
      | 25     | 20           | 100000       |


  @TestB
  Scenario: User accesses "Start Playing!" at payment pending page
    Given as a User, I am already on the Deposit Pending page
    When I click on Cashier Start Playing
    Then I should navigate to the home page

  @TestB
  Scenario Outline: User accesses Credit Card deposit method under Deposit tab
    Given as a User, I am on the Deposit page
    When I click on the "Credit Card" payment option
    Then I see different <options> as deposit options

    Examples:
      | options       |
      | 50            |
      | 100           |
      | 200           |
      | 300           |
      | 400           |
      | 500           |
      | Remember Card |

#Credit Card

  @TestB
  Scenario: User accesses Credit Card deposit method under Deposit tab
    Given as a User, I move to Cashier Deposit page
    When I click on Cashier Credit Card
    Then I see different payment options
      | $50  |
      | $100 |
      | $200 |
      | $300 |
      | $400 |
      | $500 |



  @DESKTOP   @MOBILE
  Scenario Outline: User validates Insert Digits DropDown on the Credit Card page
    Given as a User, I move to Cashier Deposit page
    And I click on Cashier Credit Card
    And I enter credit card number 545454564654
    And I click on Cashier Insert Digits
    When I click on Cashier <option>
    Then user is given fresh area to enter New Card Numbers

    Examples:
      | option            |
      | [New Card Number] |

  @DESKTOP  @MOBILE
  Scenario: User decides to go back one step from the Credit Card input amount page
    Given as a User, Credit Card payment page is visible
    When I click on Cashier BACK(icon)
    Then user is redirected to the Deposit page


  @DESKTOP
  Scenario Outline: User accesses all the promo codes available under Credit Card page
    Given I click on Cashier Credit Card
    When I click on Cashier <link>
    Then I see all the promo-codes available under Credit Card page
      | Welcome\nBonus        |
      | Bonus\nFor Life       |
      | Casino\nWelcome Bonus |
      | Enter Another Code    |
      | No Bonus. Thank You.  |

    Examples:
      | link             |
      | View Promo Codes |


  @MOBILE
  Scenario Outline: User accesses all the promo codes available under Bitcoin page
    Given I click on Cashier Credit Card
    When I click on Cashier <link>
    Then I see all the promo-codes available under Credit Card page
      | Welcome\nBonus        |
      | Bonus\nFor Life       |
      | Casino\nWelcome Bonus |
      | Enter Another Code    |
      | No Bonus. Thank You.  |

    Examples:
      | link             |
      | View Promo Codes |

  @DESKTOP @MOBILE
  Scenario: User accesses "50% Welcome Bonus" promo code under the Credit Card Promo pop-up
    Given as a User, I am on the Promo pop-up
    When I click on Cashier 50% Welcome Bonus
    Then I see, Promo code SB1000 entered in the input for promo code

  @DESKTOP @MOBILE
  Scenario: User accesses "25% Bonus For Life" promo code under the Credit Card Promo pop-up
    Given as a User, I click and see the Promo pop-up
    When I click on Cashier 25% Bonus For Life
    Then I see, Promo code FORLIFE entered in the input for promo code

  @DESKTOP @MOBILE
  Scenario: User accesses "100% Bonus For Life" promo code under the Credit Card Promo pop-up
    Given as a User, I click and see the Promo pop-up
    When I click on Cashier 100% Bonus For Life
    Then I see, Promo code SBCASINO entered in the input for promo code

  @DESKTOP   @MOBILE
  Scenario: User accesses "Enter Another Code" promo  code under Credit Card Promo pop-up
    Given as a User, I click and see the Promo pop-up
    And I click on Cashier Credit Card Enter Another Code
    And I enter promo code Codoid
    When I press enter promo SUBMIT button
    Then I see, Promo code Codoid entered in the input for promo code

  @DESKTOP @MOBILE
  Scenario: User accesses either  "No Bonus. Thank You." or "CLOSE"  option under the Credit Card Promo pop-up
    Given as a User, I click and see the Promo pop-up
    When I click on Cashier No Bonus. Thank You. or CLOSE
    Then I see, Promo code _ entered in the input for promo code

  @TestB
  Scenario Outline: User validates all the inputs on the Credit Card page
    Given as a User, Credit Card payment page is visible
    And I enter Card Number as <card-number>, Expiry as <expiry-one> ont less than <expiry-one><expiry-two>, CVV as<cvv> and amount as <amount> not less than <amount-less> and not more than <amount-more>
    When user  click on "Remember Card" and  enters Expiry, expiry should not be before present month and year
    Then user is redirected to the Confirmation Page


    Examples:
      | card-number  | expiry-one | expiry-two | cvv | amount | amount-less | amount-more |
      | 545454564654 | 1          | 20         | 222 | 25     | 25          | 500         |

  @TestB
  Scenario Outline: User validates all the inputs on the Credit Card page
    Given as a User, I am on Credit Card payment page
    And I click on "Insert Digits"
    And I enter Card Number as <card-number>, Expiry as <expiry-one> ont less than <expiry-one><expiry-two>, CVV as<cvv> and amount as <amount> not less than <amount-less> and not more than <amount-more>
    When user  click on "Remember Card" and  enters Expiry, expiry should not be before present month and year
    Then user is redirected to the Confirmation Page


    Examples:
      | card-number  | expiry-one | expiry-two | cvv | amount | amount-less | amount-more |
      | 545454564654 | 1          | 20         | 222 | 25     | 25          | 500         |



  @DESKTOP
  Scenario Outline: User decides to change the payment method when on Credit Card payment page
    Given as a User, Credit Card payment page is visible
    When I click on Cashier <other-payment>
    Then I am redirected to the Deposit page and I see different payment methods

    Examples:
      | other-payment         |
      | Change Payment Method |

  @MOBILE
  Scenario Outline: User decides to change the payment method when on Bitcoin payment page with Wallet Address
    Given as a User, Credit Card payment page is visible
    When I click on Cashier <other-payment>
    Then I am redirected to the Deposit page and I see different payment methods

    Examples:
      | other-payment         |
      | Change Payment Method |

#Cryptocurrency

  @DESKTOP @MOBILE
  Scenario Outline: User accesses Cryptocurrency payment method under Deposit tab
    Given as a User, I move to Cashier Deposit page
    And I click on Cashier <link>
    When I click on Cashier Cryptocurrency
    Then I see all the cryptocurrencies-methods under the Cryptocurrency page
      | Ethereum     |
      | Litecoin     |
      | Ripple       |
      | Bitcoin Cash |
      | Stellar      |
#     | Dash         |

    Examples:
      | link                      |
      | View More Deposit Options |

  @TestB
  Scenario Outline: User accesses "Ethereum" payment option under Cryptocurrency tab
    Given as a User, I am on the Cryptocurrency page
    And I click on "Ethereum" payment option
    When I click on "Continue" on a page for ETH "Wallet Address" alert
    Then I see all the <deposit-options> under the Ethereum payment page

    Examples:
      | deposit-options |
      | 50              |
      | 100             |
      | 250             |
      | 500             |
      | 750             |
      | 1000            |
      | 1500            |
      | 2000            |

  @DESKTOP @MOBILE
  Scenario: User accesses the "Tutorial Video on how to use Cryptocurrencies" option under the Ethereum payment option
    Given as a User, I am already on Cryptocurrency page
    When I click on Cashier Tutorial Video on how to use Cryptocurrencies
    Then I see new tab with What is Cryptocurrency?

  @DESKTOP @MOBILE
  Scenario: User accesses the "Tutorial Video on how to use Cryptocurrencies" option under the Ethereum payment option
    Given as a User, I am already on Cryptocurrency page
    And I click on Cashier Ethereum
    And I click on Continue on Ethereum pop up
    When I click on Cashier Are You New To
    Then I see Ethereum page with title Home | Ethereum.org


  @TestB
  Scenario Outline: User inserts the deposit amount in the Ethereum Deposit page
    Given as a User, I am on the "Ethereum" payment page
    And I enter deposit amount as <amount> not below <amount-below> and not above <amount-above>
    And I click on "Deposit Now"
    When I see deposit page with "Wallet Address" and I click on "I've Completed Payment" option
    Then I see deposit page with "Start Playing" and "Transaction Id", I click on "Start Playing" and I am taken to the home page


    Examples:
      | amount | amount-below | amount-above |
      | 25     | 20           | 50000        |


  @TestB
  Scenario Outline: User decides to change the payment method when on Ethereum payment page with Wallet Address
    Given as a User, I am on Ethereum payment page containing "Wallet Address"
    When I click on <other-payment>
    Then I am redirected to the "Deposit" page and I see different payment methods

    Examples:
      | other-payment         |
      | Change Payment Method |


  @DESKTOP @MOBILE
  Scenario: User decides to go back one step from the Ethereum input amount page
    Given as a User, I see the Ethereum payment page
    When I click on Cashier BACK(icon)
    Then user is redirected to the Cryptocurrency page


  @TestB
  Scenario: User decides to go back one step from the Ethereum payment page with Wallet Address
    Given as a User, I am on the "Ethereum" payment page with "Wallet Address"
    When I click on the "BACK(icon)"
    Then user is redirected to the "Ethereum" deposit page


    #Litecoin
  @DESKTOP @MOBILE
  Scenario: User accesses "Litecoin" payment option under Cryptocurrency tab
    Given as a User, I move to Cashier Deposit page
    And I click on Cashier View More Deposit Options
    And I click on Cashier Cryptocurrency
    And I click on Cashier Litecoin
    When I click on Continue on Litecoin pop up
    Then I see all the deposit-options under the Litecoin payment page
      | $50    |
      | $100   |
      | $250   |
      | $500   |
      | $750   |
      | $1,000 |
      | $1,500 |
      | $2,000 |

  @TestB
  Scenario Outline: User accesses the "Tutorial Video on how to use Cryptocurrencies" option under the Litecoin payment option
    Given as a User, I am on the Ethereum payment page
    When I click on "Tutorial Video on how to use Cryptocurrencies" option
    Then I see Litecoin page with sub-tabs <options>

    Examples:
      | options    |
      | About      |
      | Download   |
      | Contact    |
      | Forum      |
      | Foundation |

  @TestB
  Scenario Outline: User accesses the "Tutorial Video on how to use Cryptocurrencies" option under the Ethereum payment option
    Given as a User, I am on the Ethereum payment page
    When I click on "Tutorial Video on how to use Cryptocurrencies" option
    Then I see Litecoin page with sub-tabs <options>

    Examples:
      | options    |
      | About      |
      | Download   |
      | Contact    |
      | Forum      |
      | Foundation |

  @TestB
  Scenario Outline: User inserts the deposit amount in the Litecoin Deposit page
    Given as a User, I am on the "Litecoin" payment page
    And I enter deposit amount as <amount> not below <amount-below> and not above <amount-above>
    And I click on "Deposit Now"
    When I see deposit page with "Wallet Address" and  I click on "I've Completed Payment" option
    Then I see deposit page with "Start Playing" and "Transaction Id" and I click on "Start Playing", I am taken to the home page


    Examples:
      | amount | amount-below | amount-above |
      | 25     | 20           | 25000        |


  @TestB
  Scenario Outline: User decides to change the payment method when on Litecoin payment page with Wallet Address
    Given as a User, I am on Litecoin payment page containing "Wallet Address"
    When I click on <other-payment>
    Then I am redirected to the "Deposit" page and I see different payment methods

    Examples:
      | other-payment         |
      | Change Payment Method |


  @DESKTOP @MOBILE
  Scenario: User decides to go back one step from the Litecoin input amount page
    Given as a User, I see the Litcoin payment page
    When I click on Cashier BACK(icon)
    Then user is redirected to the Cryptocurrency page


  @TestB
  Scenario: User decides to go back one step from the Litecoin payment page with Wallet Address
    Given as a User, I am on the "Litecoin" payment page with "Wallet Address"
    When I click on the "BACK(icon)"
    Then user is redirected to the "Litecoin" deposit page

#Ripple

  @DESKTOP @MOBILE
  Scenario: User accesses Ripple payment option under Cryptocurrency tab
    Given as a User, I move to Cashier Deposit page
    And I click on Cashier View More Deposit Options
    And I click on Cashier Cryptocurrency
    And I click on Cashier Ripple
    When I click on Continue on Ripple pop up
    Then I see all the deposit-options under the Ripple payment page
      | $50    |
      | $100   |
      | $250   |
      | $500   |
      | $750   |
      | $1,000 |
      | $1,500 |
      | $2,000 |

  @DESKTOP @MOBILE
  Scenario: User accesses the "Are you new to Ripple? Learn More" option under the Ripple payment option
    Given as a User, I see the Ripple payment page
    When I click on Cashier Are You New To
    Then I see Ripple page with title Instantly Move Money to All Corners of the World | Ripple


  @TestB
  Scenario Outline: User inserts the deposit amount in the Ripple Deposit page
    Given as a User, I am on the "Ripple" payment page
    And I enter deposit amount as <amount> not below <amount-below> and not above <amount-above>
    And I click on "Deposit Now"
    When I see deposit page with "Wallet Address" and I click on "I've Completed Payment" with "Ripple Tag"
    Then I see deposit page with "Start Playing" and "Transaction Id" and I click on "Start Playing", I am taken to the home page


    Examples:
      | amount | amount-below | amount-above |
      | 25     | 20           | 25000        |


  @TestB
  Scenario Outline: User decides to change the payment method when on Ripple payment page with Wallet Address
    Given as a User, I am on Ripple payment page containing "Wallet Address" with "Ripple Tag"
    When I click on <other-payment>
    Then I am redirected to the "Deposit" page and I see different payment methods

    Examples:
      | other-payment         |
      | Change Payment Method |


  @DESKTOP @MOBILE
  Scenario: User decides to go back one step from the Ripple input amount page
    Given as a User, I see the Ripple payment page
    When I click on Cashier BACK(icon)
    Then user is redirected to the Cryptocurrency page


  @TestB
  Scenario: User decides to go back one step from the Ripple payment page with Wallet Address
    Given as a User, I am on the "Ripple" payment page with "Wallet Address"
    When I click on the "BACK(icon)"
    Then user is redirected to the "Ripple" deposit page

#Bitcoin Cash

  @DESKTOP @MOBILE
  Scenario: User accesses Bitcoin Cash payment option under Cryptocurrency tab
    Given as a User, I move to Cashier Deposit page
    And I click on Cashier View More Deposit Options
    And I click on Cashier Cryptocurrency
    And I click on Cashier Bitcoin Cash
    When I click on Continue on Bitcoin Cash pop up
    Then I see all the deposit-options under the Bitcoin Cash payment page
      | $50    |
      | $100   |
      | $250   |
      | $500   |
      | $750   |
      | $1,000 |
      | $1,500 |
      | $2,000 |

  @DESKTOP @MOBILE
  Scenario: User accesses the "Are you new to Bitcoin Cash? Learn More" option under the Bitcoin Cash payment option
    Given as a User, I see the Bitcoin Cash payment page
    When I click on Cashier Are You New To
    Then I see Bitcoin Cash page with title Bitcoin Cash - Peer-to-Peer Electronic Cash

  @TestB
  Scenario Outline: User inserts the deposit amount in the Bitcoin Cash Deposit page
    Given as a User, I am on the "Bitcoin Cash" payment page
    And I enter deposit amount as <amount> not below <amount-below> and not above <amount-above>
    And I click on "Deposit Now"
    When I see deposit page with "Wallet Address" and I click on "I've Completed Payment"
    Then I see deposit page with "Start Playing" and "Transaction Id" and I click on "Start Playing", I am taken to the home page


    Examples:
      | amount | amount-below | amount-above |
      | 25     | 20           | 25000        |


  @TestB
  Scenario Outline: User decides to change the payment method when on Bitcoin Cash payment page with Wallet Address
    Given as a User, I am on Bitcoin Cash payment page containing "Wallet Address"
    When I click on <other-payment>
    Then I am redirected to the "Deposit" page and I see different payment methods

    Examples:
      | other-payment         |
      | Change Payment Method |


  @DESKTOP @MOBILE
  Scenario: User decides to go back one step from the Bitcoin Cash input amount page
    Given as a User, I see the Bitcoin Cash payment page
    When I click on Cashier BACK(icon)
    Then user is redirected to the Cryptocurrency page


  @TestB
  Scenario: User decides to go back one step from the Bitcoin Cash payment page with Wallet Address
    Given as a User, I am on the "Bitcoin Cash" payment page with "Wallet Address"
    When I click on the "BACK(icon)"
    Then user is redirected to the "Bitcoin Cash" deposit page

#Dash

  @TestB
  Scenario: User accesses Dash payment option under Cryptocurrency tab
    Given as a User, I move to Cashier Deposit page
    And I click on Cashier View More Deposit Options
    And I click on Cashier Cryptocurrency
    And I click on Cashier Dash
    Then I see all the deposit-options under the Dash payment page
      | $50    |
      | $100   |
      | $250   |
      | $500   |
      | $750   |
      | $1,000 |
      | $1,500 |
      | $2,000 |

  @TestB
  Scenario Outline: User accesses Dash payment option under Cryptocurrency tab
    Given as a User, I am on the Cryptocurrency page
    And I click on "Dash" payment option
    When I click on "Continue" on a page for DSH "Wallet Address" alert
    Then I see all the <deposit-options> under the "Dash" payment page

    Examples:
      | deposit-options |
      | 50              |
      | 100             |
      | 250             |
      | 500             |
      | 750             |
      | 1000            |
      | 1500            |
      | 2000            |

  @TestB
  Scenario Outline: User accesses the "Tutorial Video on how to use Cryptocurrencies" option under the Dash payment option
    Given as a User, I am on the Dash payment page
    When I click on "Tutorial Video on how to use Cryptocurrencies" option
    Then I see Dash page with sub-tabs <options>

    Examples:
      | options     |
      | Individuals |
      | Bussinesses |
      | Developers  |
      | Community   |


  @TestB
  Scenario Outline: User inserts the deposit amount in the Dash Deposit page
    Given as a User, I am on the "Dash" payment page
    And I enter deposit amount as <amount> not below <amount-below> and not above <amount-above>
    And I click on "Deposit Now"
    When I see deposit page with "Wallet Address" and I click on "I've Completed Payment"
    Then I see deposit page with "Start Playing" and "Transaction Id" and I click on "Start Playing", I am taken to the home page


    Examples:
      | amount | amount-below | amount-above |
      | 25     | 20           | 25000        |


  @TestB
  Scenario Outline: User decides to change the payment method when on Dash payment page with Wallet Address
    Given as a User, I am on Dash payment page containing "Wallet Address"
    When I click on <other-payment>
    Then I am redirected to the "Deposit" page and I see different payment methods

    Examples:
      | other-payment         |
      | Change Payment Method |


  @TestB
  Scenario: User decides to go back one step from the Dash input amount page
    Given as a User, I am on the "Dash" payment page
    When I click on the "BACK(icon)"
    Then user is redirected to the "Deposit" page


  @TestB
  Scenario: User decides to go back one step from the Dash payment page with Wallet Address
    Given as a User, I am on the "Dash" payment page with "Wallet Address"
    When I click on the "BACK(icon)"
    Then user is redirected to the "Dash" deposit page

#Skrill


  @DESKTOP @MOBILE
  Scenario: User accesses Skrill payment option under Deposit tab
    Given as a User, I move to Cashier Deposit page
    And I click on Cashier View More Deposit Options
    When I click on Cashier Skrill
    Then I see different deposit-options under the Skrill payment page
      | $50    |
      | $100   |
      | $250   |
      | $500   |
      | $750   |
      | $1,000 |
      | $1,500 |
      | $2,000 |

  @DESKTOP @MOBILE
  Scenario: User accesses the "Don't have a Skrill account? Sign Up Here" option under the Skrill payment option
    Given as a User, I see the Skrill payment page
    When I click on Cashier Don't have a Skrill account? Sign Up Here
    Then I see Skrill page with title Online payments & Money transfer | Skrill


  @TestB
  Scenario Outline: User inserts the deposit amount in the Skrill Deposit page
    Given as a User, I am on the "Skrill" payment page
    And I enter deposit amount as <amount> not below <amount-below> and not above <amount-above>
    And I click on "Deposit Now"
    When I click on the "Continue To Skrill" on the confirmation pop-up
    Then I see another page with Skrill Account login parameters <username><password>
    And I click on "Login"

    Examples:
      | amount | amount-below | amount-above | username | password |
      | 25     | 10           | 50000        | username | password |


  @DESKTOP @MOBILE
  Scenario: User decides to go back one step from the Skrill input amount page
    Given as a User, I see the Skrill payment page
    When I click on Cashier BACK(icon)
    Then user is redirected to the Deposit page


  @TestB
  Scenario: User decides to cancel Skrill payment confirmation page
    Given as a User, I am on the "Skrill" payment confirmation page
    When I click on the "BACK(icon)"
    Then user is redirected to the "Skrill" deposit page


  @TestB
  Scenario Outline: User decides to cancel Skrill Account Login Page
    Given as a User, I am on the "Skrill" Account Login Page
    And I click on the "Cancel"
    When I click on "Leave" option under the alert
    Then user is redirected to the "Skrill" cancelled payment page with different <options>

    Examples:
      | options       |
      | Retry Deposit |
      | Bitcoin       |
      | Change Method |


#Money Gram

  @DESKTOP @MOBILE
  Scenario: User accesses Moneygram payment option under Deposit tab
    Given as a User, I move to Cashier Deposit page
    And I click on Cashier View More Deposit Options
    When I click on Cashier Moneygram
    Then I see different deposit-options under the Moneygram payment page
      | Step 1                     |
      | Step 2                     |
      | Learn More About MoneyGram |


  @TestB
  Scenario Outline: User accesses the Step 1 option under the Moneygram payment page
    Given as a User, I am on the Moneygram payment page
    When I click on Step 1
    Then I see <options> under the Step 1 of the Moneygram payment optionn


    Examples:
      | options |
      | 100     |
      | 250     |
      | 500     |

  @TestB
  Scenario Outline: User inserts the deposit amount in the Step 1 under Moneygram Deposit page
    Given as a User, I am on the "Step 1 under Moneygram" payment page
    And I enter deposit amount as <amount> not below <amount-below> and not above <amount-above>
    And I click on "Continue", select "Country", enter "Address", "City" and "Mobile Number"
    When I click on "Continue"
    Then I see Moneygram Page with "Receiver", "Location", "Amount" and "Internal Trace Id" with <option>
    And I click on "Continue to Step 2"

    Examples:
      | amount | amount-below | amount-above | option          |
      | 125    | 100          | 600          | email this page |


  @TestB
  Scenario: User accesses "email this page" under Step 1 with "Continue to Step 2" option
    Given as a User, I am on the "Step 1 under Moneygram" with "Continue to Step 2" payment page
    When I click on the "email this page"
    Then I see an alert with message of "successfully sent"


  @TestB
  Scenario Outline: User accesses the Step 2 under Moneygram payment option
    Given as a User, I am on the Moneygram payment page
    And I click on Step 2 and I select from the available options under the dropdown in "Confirm Receiver Information"
    And I enter <reference-number> and click on "Process Deposit"
    When I see final page with "Thank you" on it with "Internal Trace" number
    Then I click on "OK"
    And I am redirected to the home page


    Examples:
      | reference-number |
      | 00000000         |


  @TestB
  Scenario: User decides to go back one step from the Moneygram Step 2 input details page
    Given as a User, I am on the "Step 2 under Moneygram" payment page
    When I click on the "BACK(icon)"
    Then user is redirected to the "Deposit" page


  @TestB
  Scenario: User decides to go back one step from the Moneygram Step 2 final page with "Internal Trace"
    Given as a User, I am on the "Step 2 under Moneygram" final payment page with "Internal Trace"
    When I click on the "BACK(icon)"
    Then user is redirected to the "Deposit" page

#Wire Transfer

  @DESKTOP @MOBILE
  Scenario: User accesses Wire Transfer payment option under Deposit tab
    Given as a User, I move to Cashier Deposit page
    And I click on Cashier View More Deposit Options
    When I click on Cashier Wire Transfer
    Then I see Chat head open under the Deposit page for assistance

#Money Order

  @DESKTOP @MOBILE
  Scenario: User accesses Money Order payment option under Deposit tab
    Given as a User, I move to Cashier Deposit page
    And I click on Cashier View More Deposit Options
    When I click on Cashier Money Order
    Then I see Chat head open under the Deposit page for assistance

#Cashier Check

  @DESKTOP @MOBILE
  Scenario: User accesses Cashier Check payment option under Deposit tab
    Given as a User, I move to Cashier Deposit page
    And I click on Cashier View More Deposit Options
    When I click on Cashier Cashier Check
    Then I see Chat head open under the Deposit page for assistance



#ecoPayz


  @TestB
  Scenario Outline: User accesses EcoPayz payment option under Deposit tab
    Given as a User, I am on the Deposit page
    When I click on EcoPayz payment option under Deposit payment options
    Then I see different <deposit-options> under the EcoPayz payment page

    Examples:
      | deposit-options |
      | 50              |
      | 100             |
      | 250             |
      | 500             |
      | 750             |
      | 1000            |
      | 1500            |
      | 2000            |


  @DESKTOP @MOBILE
  Scenario Outline: User accesses all the promo codes available under EcoPayz page
    Given as a User, I move to Cashier Deposit page
    And I click on Cashier View More Deposit Options
    And I click on Cashier EcoPayz
    When I click on Cashier <link>
    Then I see all the promo-codes available under ecoPayz page
      | Welcome\nBonus        |
      | Bonus\nFor Life       |
      | Casino\nWelcome Bonus |
      | Enter Another Code    |
      | No Bonus. Thank You.  |
    And I close promo pop up

    Examples:
      | link             |
      | View Promo Codes |

  @DESKTOP @MOBILE
  Scenario: User accesses the "To Visit ecoPayz. Click Here" option under the EcoPayz payment option
    Given as a User, I see the EcoPayz payment page
    When I click on Cashier To Visit ecoPayz. Click Here
    Then I see EcoPayz page with title Send, Spend & Transfer Money Internationally | ecoAccount eWallet

  @TestB
  Scenario Outline: User inserts the deposit amount in the Skrill Deposit page
    Given as a User, I am on the "Skrill" payment page
    And I enter deposit amount as <amount> not below <amount-below> and not above <amount-above>
    And I click on "Deposit Now"
    When I click on the "Continue To ecoPayz" on the confirmation pop-up
    Then I see another page with Skrill Account login parameters <username><password> with <option>
    And I click on "Login"




    Examples:
      | amount | amount-below | amount-above | username | password | option           |
      | 25     | 10           | 10000        | username | password | Back to Merchant |


  @DESKTOP @MOBILE
  Scenario: User decides to go back one step from the EcoPayz input amount page
    Given as a User, I see the EcoPayz payment page
    When I click on Cashier BACK(icon)
    Then user is redirected to the Deposit page


  @TestB
  Scenario Outline: User validates the Back to Merchant option under EcoPayz Login page
    Given as a User, I am on the EcoPayz Login page
    And I click on <link>
    When I click on "Start Playing" option on the Deposit Pending page for EcoPayz payement option with "Transaction Id"
    Then I see home page

    Examples:
      | link             |
      | Back to Merchant |

    #Skrill 1 Tap

  @TestB
  Scenario: User accesses "Skrill 1 Tap" deposit option under the "View more to Deposit option " dropdown
    Given as a User, I am on "View more to Deposit option " dropdown
    When I accesses on "Skrill 1 Tap" deposit Option
    And  I see options
      | View Promo Codes                   |
      | Back (icon)                        |
      | Don't have a Skrill 1 Tap account? |
    Then I see the page redirect to "Skrill" deposit page with several deposit-options
      | deposit-options |
      | 50              |
      | 100             |
      | 250             |
      | 500             |
      | 750             |
      | 1000            |
      | 1500            |
      | 2000            |

  @DESKTOP  @MOBILE
  Scenario: User accesses "Dont have a Skrill 1 Tap account?" link under "Skrill" Deposit page
    Given as a User, I move to Cashier Deposit page
    And I click on Cashier View More Deposit Options
    And I click on Cashier Skrill 1 Tap
    When I click on Cashier Don't have a Skrill 1-Tap account?
    Then I see Skrill page with title Online payments & Money transfer | Skrill

  @DESKTOP @MOBILE
  Scenario: User accesses the "Back"(icon) under "Skrill 1 Tap" deposit page
    Given I click on Cashier Back(icon)
    Then user is redirected to the Deposit page

  @TestB
  Scenario Outline: User wants to deposit money using "Skrill 1 Tap" deposit page
    Given as a User, I am on the "Skrill 1 Tap" deposit page
    And I enter deposit amount as <amount> not below <amount-below> and not above <amount-above>
      | Amount      |
      | Min: $10    |
      | Max: $50000 |
    And I either select <deposit-options> or enter any value in the input field
    When I click on "Deposit Now" button
    Then I see Confirmation pop-up with "Close" (icon)
    Examples:
      | deposit-options |
      | 50              |
      | 100             |
      | 250             |
      | 500             |
      | 750             |
      | 1000            |
      | 1500            |
      | 2000            |

  @TestB
  Scenario: User accesses Confirmation under "Skrill 1 Tap" Confirmation pop-up
    Given as a User, I am on "Skrill 1 Tap" Confirmation pop-up
    When I click on "Continue To Skrill 1 Tap" button under "Skrill" Confirmationpop-up
    Then l see redirects to "Skrill 1 Tap" payment page with ID and Password

  @TestB
  Scenario: User accesses "Close(Icon)" under Confirmation pop-up
    Given as a User, I am on "Skrill 1 Tap" Confirmation pop-up
    When I accesses "Close" (icon)
    Then I see Confirmation pop-up disapper in "Skrill 1 Tap" deposit page

#Withdrawal

  @DESKTOP
  Scenario: User accesses "Withdrawal" sub-tab under the "Cashier" page
    Given as a User, I click Cashier and click Withdrawal tab
    Then I see Withdrawal Request header with Options
      | Back(icon)   |
      | Help(icon)   |
      | Bitcoin      |
      | Bitcoin Cash |
      #| Money Gram    |
      | Ethereum     |
      | Litecoin     |
      | Ripple       |
      | Bank Wire    |

  @MOBILE
  Scenario: User verifies the Payout tab under "LEFT NAVIGATOR"
    Given I am on SportsBetting application
    And I click on Cashier LEFT NAVIGATOR
    When I click on Cashier Payout
    Then I see Withdrawal Request header with Options
      | Back(icon)   |
      | Bitcoin      |
      | Bitcoin Cash |
      #| Money Gram    |
      | Ethereum     |
      | Litecoin     |
      | Ripple       |
      | Bank Wire    |


  @DESKTOP  @MOBILE
  Scenario Outline: User withdraws Amount using Bitcoin option under Withdrawal sub-tab
    Given as a User, I see Withdrawal page
    And I enter <amount> under the Withdrawal Page
    When I click on Bitcoin Withdrawal option
    Then I see options on Bitcoin page
      | Change Withdrawal Method           |
      | Are you new to Bitcoin? Learn More |

    Examples:
      | amount |
      | 25     |

  @TestB
  Scenario Outline: User enters Withdrawals details under Bitcoin Withdrawal option
    Given as a User, I am on the Bitcoin Withdrawal page
    And I enter <bitcoin-address> not less than <less>
    And I enter <comments>
    When I click on "Submit Request"
    Then I see a request has been generated with "Request Id"
    Examples:
      | bitcoin-address                    | comments | less |
      | 1F1tAaz5x1HUXrCNLbtMDqcw6o5GNn4xqX | comments | 28   |

  @TestB
  Scenario Outline: User enters Payout details under Bitcoin Payout option
    Given as a User, I am on the Bitcoin Payout page
    And I enter <bitcoin-address> not less than <less>
    And I enter <comments>
    When I click on "Submit Request"
    Then I see a request has been generated with "Request Id"

    Examples:
      | bitcoin-address                    | comments | less |
      | 1F1tAaz5x1HUXrCNLbtMDqcw6o5GNn4xqX | comments | 28   |

  @DESKTOP  @MOBILE
  Scenario: User accesses Are you new to Bitcoin? Learn More option under the Bitcoin page
    Given as a User, I see Bitcoin page for Withdrawal request
    When I click on Cashier Are You New To
    Then I see new Bitcoin promotion page with title Bitcoin 101

  @DESKTOP @MOBILE
  Scenario: User accesses "Change Payment Method" option under Bitcoin  page
    Given as a User, I see Bitcoin page for Withdrawal request
    When I click on Change Payment Method Withdrawal option
    Then I see Withdrawal page with several payment options

  @TestB
  Scenario Outline: User accesses "Withdrawal" options under withdrawal request header
    Given as a User, I am on "withdrawal Request" header
    And I enter <amount> under the Withdrawal Page
    When I select "<withdrawal options>"
    Then I see  some <options>
    Examples:
      | options |
      | Login   |
      | Join    |


#Bitcoin Cash

  @DESKTOP  @MOBILE
  Scenario Outline: User withdraws Amount using Bitcoin Cash under Withdrawal sub-tab
    Given as a User, I see Withdrawal page
    And I enter <amount> under the Withdrawal Page
    When I click on Bitcoin Cash Withdrawal option
    Then I see options on Bitcoin Cash page
      | Change Withdrawal Method                |
      | Are you new to Bitcoin Cash? Learn More |

    Examples:
      | amount |
      | 25     |


  @TestB
  Scenario Outline: User enters Withdrawals details under Bitcoin cash Withdrawal option
    Given as a User, I am on the Bitcoin Withdrawal page
    And I enter <bitcoincash-address>
    And I enter <comments>
    And I choose one of the Confirmation (radio button) option
    When I click on "Submit Request"
    Then I see a request has been generated with "Request Id"
    Examples:
      | bitcoincash-address                | comments |
      | 1F1tAaz5x1HUXrCNLbtMDqcw6o5GNn4xqX | comments |

  @TestB
  Scenario Outline: User enters Payout details under Bitcoin Payout option
    Given as a User, I am on the Bitcoin Payout page
    And I enter <bitcoincash-address>
    And I enter <comments>
    And I choose any one of the Confirmation (radio button) option
    When I click on "Submit Request"
    Then I see a request has been generated with "Request Id"

    Examples:
      | bitcoincash-address                | comments |
      | 1F1tAaz5x1HUXrCNLbtMDqcw6o5GNn4xqX | comments |

  @DESKTOP @MOBILE
  Scenario: User accesses "Change" link under Bitcoin Cash final page for Withdrawal request
    Given as a User, I am on the Bitcoin Cash page for Withdrawal request
    When I click on Change Payment Method Withdrawal option
    Then I see Withdrawal page with several payment options

#Ethereum

  @DESKTOP  @MOBILE
  Scenario Outline: User withdraws Amount using Ethereum under Withdrawal sub-tab
    Given as a User, I see Withdrawal page
    And I enter <amount> under the Withdrawal Page
    When I click on Ethereum Withdrawal option
    Then I see options on Ethereum page
      | Change Withdrawal Method            |
      | Are you new to Ethereum? Learn More |

    Examples:
      | amount |
      | 25     |


  @TestB
  Scenario Outline: User enters Withdrawals details under Ethereum Withdrawal option
    Given as a User, I am on the Ethereum Withdrawal page
    And I enter <ethereum-address> not less than <less>
    And I enter <comments>
    When I click on "Submit Request"
    Then I see a request has been generated with "Request Id"
    Examples:
      | ethereum-address                   | comments | less |
      | 1F1tAaz5x1HUXrCNLbtMDqcw6o5GNn4xqX | comments | 28   |

  @TestB
  Scenario Outline: User enters Payout details under Ethereum Payout option
    Given as a User, I am on the Ethereum Payout page
    And I enter <ethereum-address> not less than <less>
    And I enter <comments>
    When I click on "Submit Request"
    Then I see a request has been generated with "Request Id"

    Examples:
      | ethereum-address                   | comments | less |
      | 1F1tAaz5x1HUXrCNLbtMDqcw6o5GNn4xqX | comments | 28   |

  @DESKTOP @MOBILE
  Scenario: User accesses "Change Payment Method" option under Ethereum  page for Withdrawal request
    Given as a User, I am on the Ethereum page for Withdrawal request
    When I click on Change Payment Method Withdrawal option
    Then I see Withdrawal page with several payment options

#Litecoin

  @DESKTOP  @MOBILE
  Scenario Outline: User withdraws Amount using Litecoin under Request New option of Withdrawal tab
    Given as a User, I see Withdrawal page
    And I enter <amount> under the Withdrawal Page
    When I click on Litecoin Withdrawal option
    Then I see options on Litecoin page
      | Change Withdrawal Method            |
      | Are you new to Litecoin? Learn More |

    Examples:
      | amount |
      | 25     |


  @TestB
  Scenario Outline: User enters Withdrawals details under Litecoin Withdrawal option
    Given as a User, I am on the Litecoin Withdrawal page
    And I enter <litecoin-address> not less than <less>
    And I enter <comments>
    When I click on "Submit Request"
    Then I see a request has been generated with "Request Id"

    Examples:
      | litecoin-address                   | comments | less |
      | 1F1tAaz5x1HUXrCNLbtMDqcw6o5GNn4xqX | comments | 28   |


  @TestB
  Scenario Outline: User enters Payout details under Litecoin Payout option
    Given as a User, I am on the Litecoin Payout page
    And I enter <litecoin-address> not less than <less>
    And I enter <comments>
    When I click on "Submit Request"
    Then I see a request has been generated with "Request Id"

    Examples:
      | litecoin-address                   | comments | less |
      | 1F1tAaz5x1HUXrCNLbtMDqcw6o5GNn4xqX | comments | 28   |


  @DESKTOP @MOBILE
  Scenario: User accesses "Change" option under Litecoin final page for Withdrawal request
    Given as a User, I am on the Litecoin page for Withdrawal request
    When I click on Change Payment Method Withdrawal option
    Then I see Withdrawal page with several payment options


#Ripple

  @DESKTOP @MOBILE
  Scenario Outline: User withdraws Amount using "Ripple" under Withdrawal sub-tab
    Given as a User, I see Withdrawal page
    And I enter <amount> under the Withdrawal Page
    When I click on Ripple Withdrawal option
    Then I see options on Ripple page
      | Change Withdrawal Method          |
      | Are you new to Ripple? Learn More |

    Examples:
      | amount |
      | 25     |


  @TestB
  Scenario Outline: User enters Withdrawals details under "Ripple" Withdrawal option
    Given as a User, I am on the "Ripple" Withdrawal page
    And I enter <bitcoincash-address>
    And I enter <comments>
    And I choose one of the Confirmation (radio button) option
    When I click on "Submit Request"
    Then I see a request has been generated with "Request Id"
    Examples:
      | bitcoincash-address                | comments | less |
      | 1F1tAaz5x1HUXrCNLbtMDqcw6o5GNn4xqX | comments | 28   |

  @TestB
  Scenario Outline: User enters Payout details under Ripple Payout option
    Given as a User, I am on the Ripple Payout page
    And I enter <ripple-address> not less than <less>
    And I enter <ripple-tag>
    And I enter <comments>
    When I click on "Submit Request"
    Then I see a request has been generated with "Request Id"

    Examples:
      | ripple-address                     | ripple-tag | comments | less |
      | 1F1tAaz5x1HUXrCNLbtMDqcw6o5GNn4xqX | xxxxxxx    | comments | 28   |


  @DESKTOP  @MOBILE
  Scenario: User accesses "Change" link under "Ripple"l page for Withdrawal request
    Given as a User, I am on the Ripple page for Withdrawal request
    When I click on Change Payment Method Withdrawal option
    Then I see Withdrawal page with several payment options


#Bank Wire

  @DESKTOP @MOBILE
  Scenario Outline: User withdraws Amount using Bank Wire under Request New option of Withdrawal tab
    Given as a User, I see Withdrawal page
    And I enter <amount> under the Withdrawal Page
    When I click on Bank Wire Withdrawal option
    Then I see options on Bank Wire page
      | Change  |
      | Deposit |
      | Payout  |

    Examples:
      | amount |
      | 507    |


  @TestB
  Scenario Outline: User enters Withdrawals details under Bank WireWithdrawal option
    Given as a User, I am on the Bank Wire Withdrawal page
    And I see Beneficiary Details already entered
    And I enter "Bank Wire" details with <option> to be checked if needed
    When I click on "Submit Request"
    Then I see a request has been generated with "Request Id"
    Examples:
      | option                                                                                                                 |
      | Does your bank use an intermediary bank to forward your bank wire? If so, please check the box and fill in the blanks. |

  @TestB
  Scenario Outline: User enters Payout details under Bank WirePayout option
    Given as a User, I am on the Bank Wire Payout page
    And I see Beneficiary Details already entered
    And I enter "Bank Wire" details with <option> to be checked if needed
    When I click on "Submit Request"
    Then I see a request has been generated with "Request Id"

    Examples:
      | option                                                                                                                 |
      | Does your bank use an intermediary bank to forward your bank wire? If so, please check the box and fill in the blanks. |


  @DESKTOP @MOBILE
  Scenario: User accesses "Change" Link under Bank Wire final page for Withdrawal request
    Given as a User, I am on the Bank Wire page for Withdrawal request
    When I click on Change Payment Method Withdrawal option
    Then I see Withdrawal page with several payment options

    #DEPOSIT

  @DESKTOP
  Scenario Outline: User accesses "Deposit" sub-tab under Bank Wire withdrawal options
    Given as a User, I click Cashier and click Withdrawal tab
    And I enter 507 under the Withdrawal Page
    When I click on Bank Wire Withdrawal option
    And I click on <Options> Withdrawal option
    Then I See page redirects to the Cashier <Options> page

    Examples:
      | Options |
      | Payout  |
      | Deposit |


##PAYOUT
#
#
#  @TestB
#  Scenario Outline: User access "Help(icon)" under <Withdrawal options>
#    Given as a user. I have already selected <Withdrawal options>
#    When I select "Help(icon)"
#    Then I see page redirected to "Payout Limits and Fees" page with <Links>
#    Examples:
#      | Withdrawal options | Links                     |
#      | Bitcoin Cash       | Payout Request            |
#      | Litecoin           | Payout Review             |
#      | Ripple             | Contact Customer Services |
#
#  @TestB
#  Scenario Outline: User accesses "<Links>" under Payout Limits and Fees
#    Given as a user, I am on "Payout Limits and Fees" page
#    When I select "<Links>"
#    Then I see redirected to related contents
#    Examples:
#      | Links                     |
#      | Payout Request            |
#      | Payout Review             |
#      | Contact Customer Services |
#
#
#
#
##MoneyGram
#
#  @TestB
#  Scenario Outline: User accesses Moneygram withdrawal option under "withdrawal" sub-tab
#    Given as a User, I am on "withdrawal" sub-tab page
#    When I accesses Moneygram withdrawal option
#    Then I see "MoneyGram" header with process details and <Option>
#    Examples:
#      | Option                  |
#      | Change withdrwal method |
#      | Continue                |
#
#  @TestB
#  Scenario: User accesses "Change Withdrawal method" under "Moneygram" page
#    Given as a User, I am on "Change Withdrawal method" under "Moneygram" page
#    When I accesses on "Change withdrawal method"
#    Then I see Withdrawal page with several payment options
#
#  @TestB
#  Scenario: User accesses "Continue" under "Moneygram withdrawal"option page
#    Given as a user,I am on "Moneygram withdrawal"option page
#    When I accesses "Continue"
#    And I clicked  I understand these conditions with details
#    And I click "Submit Request"
#    Then I see a request has been generated with "Request Id"
#
#
#  @TestB
#  Scenario: User accesses "BACK (icon)" under  under "Moneygram" withdrawal option page
#    Given as a User, I am on "Moneygram" withdrawal option page
#    When I click on "BACK (icon)
#    Then I see page redirects to "Cashier" Page
#
#  @Test1
#  Scenario: User accesses "BACK (icon)" under  under "Submit Request" page
#    Given as a User, I am on "Submit Request" page
#    When I click on "BACK (icon)
#    Then I see page redirects to "Moneygram" Withdrawal option page

  @DESKTOP
  Scenario: User wants to close the "Cashier" page under "Deposit" tab
    Given as a user, I am on Cashier page
    When I click on Cashier close(icon)
    Then I see a pop-up stating Leaving Cashier with three options
      | close (icon)                       |
      | Deposit & Claim My Bonus           |
      | No thanks, I don't want free money |

  @DESKTOP
  Scenario: User accesses "No thanks, I don't want free money" option under the "Leaving Cashier" pop-up
    Given as a User, I am on Leaving Cashier pop-up
    When I click on Cashier No thanks, I don't want free money
    Then I see page redirects to Sports page under home page

  @DESKTOP
  Scenario: User wants to close the "Cashier" page under "Deposit" tab
    Given as a user, I am on Cashier page
    When I click on Cashier close(icon)
    Then I see a pop-up stating Leaving Cashier with three options
      | close (icon)                       |
      | Deposit & Claim My Bonus           |
      | No thanks, I don't want free money |

  @DESKTOP
  Scenario: User wants to access either "Deposit & Claim My Bonus" option or "close" (icon) under "Leaving Cashier" pop-up
    Given as a User, I am on Leaving Cashier pop-up
    When I click on Cashier Deposit & Claim My Bonus or close (icon)
    Then I see page redirects to Cashier page under home page

##cancel/review
#
#
#  @TestB
#  Scenario Outline: User accesses Cancel/Review option under the Withdrawal page
#    Given as a User, I click Cashier and click Withdrawal tab
#    When I click on Cashier <link>
#    Then I see Payout Review page with "options" and Account Number
#      | Deposit         |
#      | Payout          |
#      | Status          |
#      | Print this Page |
#      | Help icon       |
#
#    Examples:
#      | link          |
#      | cancel/review |
#
#  @TestB
#  Scenario Outline: User accesses Deposit option under Cancel/Review
#    Given as a User, I am on the Payout Review page Cancel/Review page under Cancel/Review option of Withdrawal page
#    When I click on <link>
#    Then I see deposit page with options related to deposit
#
#    Examples:
#      | link    |
#      | Deposit |
#
#
#  @TestB
#  Scenario Outline: User accesses Payout option under Cancel/Review
#    Given as a User, I am on the Payout Review page under Cancel/Review option of Withdrawal page
#    When I click on <link>
#    Then I see Withdrawal page under Withdrawal tab with options related to Withdrawal
#
#    Examples:
#      | link   |
#      | Payout |
#
#
#  @TestB
#  Scenario Outline: User accesses Status option under Cancel/Review
#    Given as a User, I am on the Payout Review page under Cancel/Review option of Withdrawal page
#    When I click on Status dropdown
#    Then I see different <options> under Status dropdown
#
#    Examples:
#      | options            |
#      | Pending Requests   |
#      | Processed          |
#      | Cancelled/Rejected |
#
#
#  @TestB
#  Scenario: User accesses Print this Page option under Cancel/Review
#    Given as a User, I am on the Payout Review page under Cancel/Review option of Withdrawal page
#    When I click on "Print this Page"
#    Then I see print preview for the Cancel/Review page
#
#
#  @TestB
#  Scenario: User accesses Help (icon) option under Cancel/Review
#    Given as a User, I am on the Payout Review page under Cancel/Review option of Withdrawal page
#    When I click on "Help (icon)"
#    Then I see several help cases for the Sports Betting site


  ##cancel/review
#
#
#  @TestB
#  Scenario Outline: User accesses Cancel/Review option under the Payout page
#    Given as a User, I am on the Payout request page
#    When I click on "cancel/review"
#    Then I see "Payout Review" page with <option> and "Account Number"
#
#    Examples:
#      | option          |
#      | Deposit         |
#      | Payout          |
#      | Status          |
#      | Print this Page |
#      | Help icon       |
#
#
#  @TestB
#  Scenario Outline: User accesses Deposit option under Cancel/Review
#    Given as a User, I am on the Payout Review page Cancel/Review page under Cancel/Review option of Payout page
#    When I click on <link>
#    Then I see deposit page with options related to deposit
#
#    Examples:
#      | link    |
#      | Deposit |
#
#
#  @TestB
#  Scenario Outline: User accesses Payout option under Cancel/Review
#    Given as a User, I am on the Payout Review page under Cancel/Review option of Payout page
#    When I click on <link>
#    Then I see Payout page under Payout tab with options related to Payout
#
#    Examples:
#      | link   |
#      | Payout |
#
#
#  @TestB
#  Scenario Outline: User accesses Status option under Cancel/Review
#    Given as a User, I am on the Payout Review page under Cancel/Review option of Payout page
#    When I click on Status dropdown
#    Then I see different <options> under Status dropdown
#
#    Examples:
#      | options            |
#      | Pending Requests   |
#      | Processed          |
#      | Cancelled/Rejected |
#
#
#  @TestB
#  Scenario: User accesses Print this Page option under Cancel/Review
#    Given as a User, I am on the Payout Review page under Cancel/Review option of Payout page
#    When I click on "Print this Page"
#    Then I see print preview for the Cancel/Review page
#
#
#  @TestB
#  Scenario: User accesses Help (icon) option under Cancel/Review
#    Given as a User, I am on the Payout Review page under Cancel/Review option of Payout page
#    When I click on "Help (icon)"
#    Then I see several help cases for the Sports Betting site

#SportsBetting Live Help

  @DESKTOP @MOBILE
  Scenario: User accesses "SportsBetting Live Help" under "Deposit" tab
    Given as a User, I move to Cashier Deposit page
    And I click on Cashier SportsBetting Live Help
    When I see a Chat head open under the Deposit page for assistance
    Then I see a dropdown with several help related options

  @DESKTOP  @MOBILE
  Scenario: User accesses "SportsBetting Live Help" under "Deposit" tab but click "Cancel" when selecting help options
    Given I see a chat window with multiple help related topics to choose from
    When I click on Cashier Pop Up Cancel
    Then I see chat window gets closed

#Click Here to Learn More

  @DESKTOP @MOBILE
  Scenario: User accesses "Click Here to Learn More" under "Deposit" tab
    Given as a User, I move to Cashier Deposit page
    When I click on Cashier Click Here to Learn More
    Then I see a new windows tab gets opened with all the help related items

#Help (Icon)

  @DESKTOP @MOBILE
  Scenario: User accesses "Help (Icon)" under "Deposit" tab
    Given as a User, I move to Cashier Deposit page
    When I click on Cashier help (icon)
    Then I see a a pop-up with choices
      | Speak to SportsBetting  |
      | Email SportsBetting     |
      | SportsBetting Live Chat |

  @DESKTOP @MOBILE
  Scenario: User accesses "Speak to SportsBetting" under "Help (Icon)" pop-up
    Given as a User, I am on the Help (Icon) pop-up
    When I click on Live Help Speak to SportsBetting
    Then I am shown with Contact Number

  @DESKTOP @MOBILE
  Scenario: User accesses "Email SportsBetting" under "Help (Icon)" pop-up
    Given as a User, I am on the Help (Icon) pop-up
    And I click on Live Help Email SportsBetting
    When I click on Email shown
    Then Help pop-up goes away

  @DESKTOP @MOBILE
  Scenario: User accesses "Help (Icon)" under "Deposit" tab
    Given as a User, I move to Cashier Deposit page
    When I click on Cashier help (icon)
    Then I see a a pop-up with choices
      | Speak to SportsBetting  |
      | Email SportsBetting     |
      | SportsBetting Live Chat |

  @DESKTOP @MOBILE
  Scenario: User accesses "SportsBetting Live Help" under "Help (Icon)" pop-up
    Given as a User, I am on the Help (Icon) pop-up
    When I click on Live Help SportsBetting Live Chat
    Then I see a chat window with multiple help related topics to choose from

##Close (Icon) // Repeated
#
#  @TestB
#  Scenario: User intends to close "Deposit" page
#    Given as a User, I move to Cashier Deposit page
#    When I click on deposit page Close (Icon)
#    Then I see a pop-up appears with "option" stating "Leave Cashier"
#      | Deposit & Claim My Bonus           |
#      | No thanks, I don't want free money |
#      | Close (Icon)                       |
#
#  @TestB
#  Scenario: User accesses "Deposit & Claim My Bonus" under "Close (Icon)" pop-up
#    Given as a User, I am on the Close (Icon) pop-up
#    When I click on "Deposit & Claim My Bonus"
#    Then I see pop-up disappearing
#    And I see "Deposit" page with all the deposit options
#
#  @TestB
#  Scenario: User accesses "No thanks, I don't want free money" under "Close (Icon)" pop-up
#    Given as a User, I am on the Close (Icon) pop-up
#    When I click on "No thanks, I don't want free money"
#    Then User is redirected to the home page
#
#  @TestB
#  Scenario: User accesses "Close (Icon)" under "Close (Icon)" pop-up
#    Given as a User, I am on the Close (Icon) pop-up
#    When I click on "Close (Icon)"
#    Then I see pop-up dessappears
#    And I see "Deposit" page with with all the deposit options