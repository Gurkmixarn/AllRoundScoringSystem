Feature: Testing score calculations

  Scenario Outline: Testing all minimum calculations
    Given I compete in "<discipline>"
    When I get the result <resultWorst>
    Then I score <scoreMin> points

    Examples:
      | discipline       | resultWorst | scoreMin |
      | Deca100M         | 17.8        | 1        |
      | Deca110MHurdles  | 28.5        | 0        |
      | Deca400M         | 100.0       | 0        |
      | Deca1500M        | 7.0         | 3346     |
      | DecaDiscusThrow  | 0           | 0        |
      | DecaHighJump     | 0           | 0        |
      | DecaJavelinThrow | 0           | 0        |
      | DecaLongJump     | 250         | 16       |
      | DecaPoleVault    | 2           | 0        |
      | DecaShotPut      | 0           | 0        |
      | Hep100MHurdles   | 26.4        | 1.0      |
      | Hep200M          | 42.08       | 1.0      |
      | Hep800M          | 250.79      | 1.0      |
      | HeptHightJump    | 270         | 1.0      |
      | HeptJavelinThrow | 100         | 1.0      |
      | HeptLongJump     | 400         | 1.0      |
      | HeptShotPut      | 100         | 1.0      |

  Scenario Outline: Testing all middle calculations
    Given I compete in "<discipline>"
    When I get the result <resultMid>
    Then I score <scoreMid> points

    Examples:
      | discipline       | resultMid | scoreMid |
      | Deca100M         | 11.4      | 774      |
      | Deca110MHurdles  | 19.25     | 411      |
      | Deca400M         | 60.0      | 413      |
      | Deca1500M        | 4.5       | 3379     |
      | DecaDiscusThrow  | 42.5      | 716      |
      | DecaHighJump     | 150       | 389      |
      | DecaJavelinThrow | 55        | 663      |
      | DecaLongJump     | 625       | 641      |
      | DecaPoleVault    | 500       | 910      |
      | DecaShotPut      | 30        | 1731     |
      | Hep100MHurdles   | 13.2      | 1094     |
      | Hep200M          | 21,04     | 1.0      |
      | Hep800M          | 125,395   | 1.0      |
      | HeptHightJump    | 135       | 1.0      |
      | HeptJavelinThrow | 50        | 1.0      |
      | HeptLongJump     | 200       | 1.0      |
      | HeptShotPut      | 50        | 1.0      |


  Scenario Outline: Testing all maximum calculations
    Given I compete in "<discipline>"
    When I get the result <resultBest>
    Then I score <scoreMax> points

    Examples:
      | discipline       | resultBest | scoreMax |
      | Deca100M         | 5.0        | 2640     |
      | Deca110MHurdles  | 10.0       | 1556     |
      | Deca400M         | 20.0       | 2698     |
      | Deca1500M        | 2          | 3412     |
      | DecaDiscusThrow  | 85         | 1622     |
      | DecaHighJump     | 300        | 1852     |
      | DecaJavelinThrow | 110        | 1513     |
      | DecaLongJump     | 1000       | 1606     |
      | DecaPoleVault    | 1000       | 2722     |
      | DecaShotPut      | 30         | 1731     |
      | Hep100MHurdles   | 5          | 2616     |
      | Hep200M          | 14         | 1.0      |
      | Hep800M          | 70         | 1.0      |
      | HeptHightJump    | 75.7       | 1.0      |
      | HeptJavelinThrow | 0          | 1.0      |
      | HeptLongJump     | 0          | 1.0      |
      | HeptShotPut      | 5          | 1.0      |

