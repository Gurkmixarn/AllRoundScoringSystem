Feature: Testing score calculations

  Scenario Outline: Testing all max and min calcs
    Given I compete in "<discipline>"
    When I score <min>
    Then I get the result <resultMin>
    When I score <mid>
    Then I get the result <resultMid>
    When I score <max>
    Then I get the result <resultMax>


    Examples:
      | discipline      | min  | mid   | max  | resultMin | resultMid | resultMax |
      | Deca100M        | 5.0  | 11.4  | 17.8 | 2640      | 774       | 1         |
      | Deca110MHurdles | 10.0 | 19.25 | 28.5 | 1556      | 411       | 0         |
      | Deca400M        | 20   | 60    | 100  | 2698      | 413       | 0         |
