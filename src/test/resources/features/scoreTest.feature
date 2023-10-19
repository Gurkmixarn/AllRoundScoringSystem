Feature: Testing score calculations

  Scenario Outline: Testing all minimum calculations
    Given I compete in "<discipline>"
    When I get the result <resultMin>
    Then I score <scoreMin> points

    Examples:
      | discipline      | resultMin | scoreMin |
      | Deca100M        | 5.0       | 2640     |
      | Deca110MHurdles | 10.0      | 1556     |
      | Deca400M        | 20        | 2698     |

  Scenario Outline: Testing all middle calculations
    Given I compete in "<discipline>"
    When I get the result <resultMid>
    Then I score <scoreMid> points

    Examples:
      | discipline      | resultMid | scoreMid |
      | Deca100M        | 11.4      | 774      |
      | Deca110MHurdles | 19.25     | 411      |
      | Deca400M        | 60        | 413      |

  Scenario Outline: Testing all maximum calculations
    Given I compete in "<discipline>"
    When I get the result <resultMax>
    Then I score <scoreMax> points

    Examples:
      | discipline      | resultMax | scoreMax |
      | Deca100M        | 17.8      | 1        |
      | Deca110MHurdles | 28.5      | 0        |
      | Deca400M        | 100       | 0        |
