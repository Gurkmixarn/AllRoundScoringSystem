package stepDefs;

import decathlon.*;
import heptathlon.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class Stepdad {
    String discipline;
    double score;

    Deca1500M deca1500M = new Deca1500M();
    DecaLongJump decaLongJump = new DecaLongJump();
    DecaHighJump highJump = new DecaHighJump();
    DecaDiscusThrow discusThrow = new DecaDiscusThrow();
    DecaShotPut decaShotPut = new DecaShotPut();
    DecaJavelinThrow decaJavelinThrow = new DecaJavelinThrow();
    DecaPoleVault poleVault = new DecaPoleVault();

    Hep200M hep200M = new Hep200M();
    Hep800M hep800M = new Hep800M();
    Hep100MHurdles hep100MHurdles = new Hep100MHurdles();
    HeptHightJump hepHighJump = new HeptHightJump();
    HeptLongJump hepLongJump = new HeptLongJump();
    HeptShotPut hepShotPut = new HeptShotPut();
    HeptJavelinThrow hepJavelinThrow = new HeptJavelinThrow();

    @Given("I compete in {string}")
    public void iCompeteIn(String discipline) {
        this.discipline = discipline;
        System.out.println("Wow " + discipline);
    }
    @When("I score {double}")
    public void iScore(double score) {
        this.score = score;
        System.out.println("Wow " + score);
    }


    @Then("I get the result {double}")
    public void iGetTheResult(double expectedResult) {
        switch (discipline){
            case "Deca100M" -> {
                Deca100M deca100M = new Deca100M();
                deca100M.calculateResult(score);
                assertEquals(expectedResult,deca100M.getScore() , 0.01);
            }
            case "Deca110MHurdles" -> {
                Deca110MHurdles deca110MHurdles = new Deca110MHurdles();
                deca110MHurdles.calculateResult(score);
                assertEquals(expectedResult,deca110MHurdles.getScore() , 0.01);
            }
            case "Deca400M" -> {
                Deca400M deca400M = new Deca400M();
                deca400M.calculateResult(score);
                assertEquals(expectedResult,deca400M.getScore() , 0.01);
            }
        }

    }
}
