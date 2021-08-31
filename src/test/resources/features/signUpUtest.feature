#Author : Daniel
@stories
Feature: Utest
  As a user, I want to signup in the Utest platform

  @scenario1
  Scenario: Enter any null field

    Given than Daniel wants to signUp in the utest platform
      | strFirtsname  | strLastname  |
      | YourFirtsname | YourLastname |
      | strEmail      | strDate  |
      | YourEmail     | YourDate |
      | strLanguages  |
      | YourLanguages |

    When he add him address
      | strCity  | strPostalcode |
      | YourCity | YourPostalcode |
      | strCountry  |
      | YourCountry |

    Then he add him smartphone information
      | strComputer  | strVersion |
      | YourComputer | YourVersion |
      | strLanguage  | strPostalcode |
      | YourLanguage | YourPostalcode |
      | strDevice  | strModel |
      | YourDevice | YourModel |
      | strOs  |
      | YourOs |

