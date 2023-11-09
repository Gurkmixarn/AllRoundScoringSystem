package stepDefs;

import decathlon.*;
import heptathlon.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.formula.ptg.ScalarConstantPtg;

import static org.junit.Assert.assertEquals;

public class Stepdad {
    String discipline;
    double score;

    DecaShotPut decaShotPut = new DecaShotPut();
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
        System.out.println(discipline);
    }

    @When("I get the result {double}")
    public void iScore(double score) {
        this.score = score;
    }

    @Then("I score {double} points")
    public void iGetTheResult(double expectedResult) {
        switch (discipline) {
            case "Deca100M" -> {
                Deca100M deca100M = new Deca100M();
                deca100M.calculateResult(score);
                assertEquals(expectedResult, deca100M.getScore(), 0.01);
            }
            case "Deca110MHurdles" -> {
                Deca110MHurdles deca110MHurdles = new Deca110MHurdles();
                deca110MHurdles.calculateResult(score);
                assertEquals(expectedResult, deca110MHurdles.getScore(), 0.01);
            }
            case "Deca400M" -> {
                Deca400M deca400M = new Deca400M();
                deca400M.calculateResult(score);
                assertEquals(expectedResult, deca400M.getScore(), 0.01);
            }
            case "Deca1500M" -> {
                Deca1500M deca1500M = new Deca1500M();
                deca1500M.calculateResult(score);
                assertEquals(expectedResult, deca1500M.getScore(), 0.01);
            }
            case "DecaDiscusThrow" -> {
                DecaDiscusThrow discusThrow = new DecaDiscusThrow();
                discusThrow.calculateResult(score);
                assertEquals(expectedResult, discusThrow.getScore(), 0.01);
            }
            case "DecaHighJump" -> {
                DecaHighJump highJump = new DecaHighJump();
                highJump.calculateResult(score);
                assertEquals(expectedResult, highJump.getScore(), 0.01);
            }
            case "DecaJavelinThrow" -> {
                DecaJavelinThrow decaJavelinThrow = new DecaJavelinThrow();
                decaJavelinThrow.calculateResult(score);
                assertEquals(expectedResult, decaJavelinThrow.getScore(), 0.01);
            }
            case "DecaLongJump" -> {
                DecaLongJump decaLongJump = new DecaLongJump();
                decaLongJump.calculateResult(score);
                assertEquals(expectedResult, decaLongJump.getScore(), 0.01);
            }
            case "DecaPoleVault" -> {
                DecaPoleVault poleVault = new DecaPoleVault();
                poleVault.calculateResult(score);
                assertEquals(expectedResult, poleVault.getScore(), 0.01);


            }
            case "DecaShotPut" -> {
                DecaShotPut decaShotPut = new DecaShotPut();
                decaShotPut.calculateResult(score);
                assertEquals(expectedResult, decaShotPut.getScore(), 0.01);
            }
            case "Hep100MHurdles" -> {
                Hep100MHurdles hep100MHurdles = new Hep100MHurdles();
                hep100MHurdles.calculateResult(score);
                assertEquals(expectedResult, hep100MHurdles.getScore(), 0.01);

            }
            case "Hep200M" -> {
                Hep200M hep200M = new Hep200M();
                hep200M.calculateResult(score);
                assertEquals(expectedResult, hep200M.getScore(), 0.01);

            }
            case "Hep800M" -> {
                Hep800M hep800M = new Hep800M();
                hep800M.calculateResult(score);
                assertEquals(expectedResult, hep800M.getScore(), 0.01);
            }
            case "HeptHightJump" -> {
                HeptHightJump heptHightJump = new HeptHightJump();
                heptHightJump.calculateResult(score);
                assertEquals(expectedResult, heptHightJump.getScore(), 0.01);
            }
            case "HeptJavelinThrow" -> {
                HeptJavelinThrow heptJavelinThrow = new HeptJavelinThrow();
                heptJavelinThrow.calculateResult(score);
                assertEquals(expectedResult, heptJavelinThrow.getScore(), 0.01);


            }
            case "HeptLongJump" -> {
                HeptLongJump heptLongJump = new HeptLongJump();
                heptLongJump.calculateResult(score);
                assertEquals(expectedResult, heptLongJump.getScore(), 0.01);

            }
            case "HeptShotPut" -> {
                HeptShotPut heptShotPut = new HeptShotPut();
                heptShotPut.calculateResult(score);
                assertEquals(expectedResult, heptShotPut.getScore(), 0.01);

            }
        }
    }
}






